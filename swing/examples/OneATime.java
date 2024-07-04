import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

import java.awt.Frame;

public class OneATime {
    JFrame frame = new JFrame("FRAME");

    JLabel label = new JLabel("NAME");
    JTextField field = new JTextField();

    OneATime() {
        setLayout();
        setThemStraight();
        nameField();
        nameMenu();
    }

    public void setLayout() {
        frame.setLayout(null);
    }

    public void setThemStraight() {
        frame.setVisible(true);
        // frame.setSize(300, 500);
        frame.setBounds(500, 120, 300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void nameField() {
        label.setBounds(50, 200, 50, 10);
        field.setBounds(100, 200, 50, 20);
        // frame.setResizable(false);

        frame.add(label);
        frame.add(field);
    }

    public void nameMenu() {
        JMenuBar menu = new JMenuBar();
        // set.JMenuBar(menu);
        // menu.setJMenuBar(menu);
        JMenu loginMenu = new JMenu("LOG IN");
        JMenu signupMenu = new JMenu("SIGN UP");
        signupMenu.setSize(50, 40);
        loginMenu.setSize(50, 40);
        JMenu ghost = new JMenu("SIGN UP");
        
        ghost.setSize(50, 40);
        JMenu smash = new JMenu("SIGN UP");
        smash.setSize(50, 40);

        menu.add(loginMenu);
        menu.add(signupMenu);
        menu.add(smash);
        menu.add(ghost);
        frame.add(menu);
        menu.setVisible(true);
        menu.setSize(180, 50);
    }

    public static void main(String[] args) {
        OneATime one = new OneATime();
        // one.setThemStraight();
    }
}
