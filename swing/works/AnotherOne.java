import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class AnotherOne extends JFrame implements ActionListener {
    Container container = getContentPane();

    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");

    JTextField userNameField = new JTextField();
    JPasswordField passwordField = new JTextField();
    JButton loginButton = new JButton("LOGIN");

    AnotherOne() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userNameField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userNameField);
        container.add(passwordField);
        container.add(loginButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userName;
            String passwordT;
            userName = userNameField.getText();
            // passwordT = passwordField.getSelectedText();
            passwordT = passwordField.getText();

            // authenitication of username and password
            if (userName.equalsIgnoreCase("llyonubah") && passwordT.equalsIgnoreCase("123ghi@!")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
    }

    public static void main(String[] args) {
        AnotherOne djKhlead = new AnotherOne();
        djKhlead.setTitle("Login Form");
        djKhlead.setVisible(true);
        djKhlead.setBounds(10, 10, 400, 600);
        djKhlead.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}