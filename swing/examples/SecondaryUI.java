import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//the class extends JFrame class
public class SecondaryUI extends JFrame{
    // this is a container in the JFrame
    Container container = new getContentPane();
    
    JLabel userNameLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");

    JTextField userNameField = new JTextField();
    JTextField passwordField = new JTextField();

    JButton loginButton = new JButton("LOG IN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");

    //Constructor fro class SecondaryUI
    // public SecondaryUI() {
    //     setLocationSize();
    //     addWidgetsToContainer();
    // }

    public void setLocationSize() {
        userNameLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userNameField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
    }

    public void addWidgetsToContainer() {
        container.setLayout(null);
        container.add(userNameLabel);
        container.add(passwordLabel);
        container.add(userNameField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);

    }
    public static void main(String[] args) {
        SecondaryUI sui = new SecondaryUI();
        sui.setLocationSize();
        sui.addWidgetsToContainer();

        sui.setTitle("Authenticate");
        sui.setVisible(true);
        sui.setBounds(30, 30, 350, 580);
        sui.setResizable(false);
        sui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
