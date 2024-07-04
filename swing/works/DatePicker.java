import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DatePicker extends JFrame {
    Container container = getContentPane();
    Calendar calender = new Calendar();
    int month = calender.getInstance().get(calender.MONTH);
    int year = calender.getInstance().get(calender.YEAR);;
    JLabel l = new JLabel("", JLabel.CENTER);
    String day = "";
    JDialog d;
    JButton[] button = new JButton[49];
    JLabel label = new JLabel("Selected Date:");
    final JTextField text = new JTextField(20);
    JButton b = new JButton("popup");
    JPanel p = new JPanel();
    JFrame frame = new JFrame();

    public DatePicker() {
        name();
        addComponentsToContainer();
        displayDate();
        setPickedDate();

    }
    public void setLayoutManager() {
        container.setLayout(null);
    }
		
    public void name() {
        d = new JDialog();
		d.setModal(true);
		String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
		JPanel p1 = new JPanel(new GridLayout(7, 7));
		p1.setPreferredSize(new Dimension(430, 120));

		for (int x = 0; x <= 6; x++) {
				button[x].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						day = button[selection].getActionCommand();
						d.dispose();
					}
				});
			if (x < 7) {
				button[x].setText(header[x]);
				button[x].setForeground(Color.red);
			}
			p1.add(button[x]);
		}
		JPanel p2 = new JPanel(new GridLayout(1, 3));
		JButton previous = new JButton("<>");
		next.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent ae) {
        month++;
        displayDate();
    }

    });
    p2.add(next);
    d.add(p1,BorderLayout.CENTER);d.add(p2,BorderLayout.SOUTH);
    d.pack();
    // d.setLocationRelativeTo(parent);
    displayDate();d.setVisible(true);

    }
    
    public void addComponentsToContainer() {
        p.add(label);
        p.add(text);
        p.add(b);
        final JFrame f = new JFrame();
        f.getContentPane().add(p);
        f.pack();
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setText(new DatePicker(f).setPickedDate());
            }
        });
    }

    public void displayDate() {
        for (int x = 7; x < button.length; x++)
            button[x].setText("");
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "MMMM yyyy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month, 1);
        int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
            button[x].setText("" + day);
        l.setText(sdf.format(cal.getTime()));
        d.setTitle("Date Picker");
    }

    public String setPickedDate() {
        if (day.equals(""))
            return day;
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "dd-MM-yyyy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month, Integer.parseInt(day));
        return sdf.format(cal.getTime());
    }

    public static void main(String[] args) {
        DatePicker dp = new DatePicker();
        // frame.setTitle("Dtae Picker");
        // p1.setVisible(true);
        // frame.setBounds(10, 10, 370, 600);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
    }
}