import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;


public class StartLogin {
    JFrame frame = new JFrame("Login");

    JLabel usernameLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    // JLabel usernameLabel = new JLabel("USERNAME");
    
    JTextField userNameField = new JTextField();
    JTextField passwordField = new JTextField();

    JButton loginButton = new JButton("LOG IN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    //Constructor..
    StartLogin() {
        setLocationSize();
        addWidgetsToFrame();
    }

    // Location and size of the widgets
    public void setLocationSize() {
        usernameLabel.setBounds(50, 150, 30, 10);
        passwordLabel.setBounds(50, 220, 30, 10);
        userNameField.setBounds(140, 150, 30, 20);
        passwordField.setBounds(140, 220, 30, 20);
        showPassword.setBounds(120, 250, 20, 30);
        loginButton.setBounds(70, 300, 30, 10);
        resetButton.setBounds(100, 300, 30, 30);
        
        loginButton.setForeground(Color.GRAY);
        loginButton.setBackground(Color.GREEN);
        resetButton.setForeground(Color.ORANGE);
        resetButton.setBackground(Color.RED);
    }
    // Adding the widgets to the JFrame
    public void addWidgetsToFrame() {
    frame.setVisible(true);
    frame.setBounds(50, 100, 350, 600);
    frame.setResizable(false);;

        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(userNameField);
        frame.add(passwordField);
        frame.add(showPassword);
        frame.add(loginButton);
        frame.add(resetButton);
        
    }
    // Setting the Layouts
    public void setLayout() {
        
    }
    public static void main(String[] args) {
        StartLogin sl = new StartLogin();
    }
}
