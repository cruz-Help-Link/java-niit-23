import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailGridBag implements ActionListener {
    JButton button = new JButton("Register");
    JTextField field = new JTextField(5);
    JFrame frame = new JFrame("Layout");
    JPanel panel = new JPanel();
    GridBagLayout layout = new GridBagLayout();

    public EmailGridBag() {
        gridBadger();
        setListener();
        // actionPerformed(this);
    }

    public void gridBadger() {
        // Create and set up a frame window..
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setVisible(true);

        // Define the panel to hold the components..
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        // Put constraints on different buttons..
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("EMAIL:"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(field, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        panel.add(button, gbc);
        // Set the window visibility..
        frame.add(panel);
        frame.pack();
    }

    public void setListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String name;
            name = field.getText();

            if (name.equalsIgnoreCase("Munirat")) {
                JOptionPane.showMessageDialog(this, "Hello" + name);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        }

    }

    public static void main(String[] args) {
        EmailGridBag egb = new EmailGridBag();
    }


    // LocalDate date = LocalDate.now(); // Create a date object
    // System.out.println(date); // Display the current date
    // LocalTime time = LocalTime.now();
    // System.out.println(time);
    // LocalDateTime dateTime = LocalDateTime.now();
    // System.out.println(dateTime);
    // DateTimeFormatter change = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    // String formattedDate = dateTime.format(change);
    // System.out.println("After formatting: " + change);

}
