import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AnonymousListener {

  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame();
    frame.setTitle("Login Form");
    frame.setVisible(true);
    frame.setBounds(10, 10, 370, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("NAME:");
    JTextField field = new JTextField(10);
    JButton button = new JButton("Click");

    // field.getInsets();
        frame.setLayout(null);
        label.setBounds(50, 150, 100, 30);
        field.setBounds(150, 150, 150, 30);
        button.setBounds(100, 200, 100, 30);
        frame.add(button);
        frame.add(field);
        frame.add(label);

//anoymous class
    button.addActionListener(new ActionListener() {
        //method of the anonymous class
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                String userName;
                userName = field.getText();
                //authenitication of username and password
                // if (userName.equalsIgnoreCase("Munirat")) {
                //     System.out.println("EXCELLENT!!!");
                // }
                if(userName.equals("")) {
                    System.out.println("EMPTY");                    
                    // JOptionPane.showMessageDialog(this, "---Input a Name---");
                }
                else {
                    // System.out.println("INCORRECT!!!");
                
                    System.out.println("Welcome" + " " + userName);
                }
            }
        }
    });

    frame.add(button);
    frame.pack();
    frame.setVisible(true);

    Thread t = new Thread(new Runnable() {
        public void run() {
            System.out.println("2nd Thread");
        }
    }); t.run(); //t.start();
    System.out.println("1st Thread");
  }
}