import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class BorderLayout {

    public static void main(String[] args) {
        // Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Layout");
        BorderLayout border = new BorderLayout();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define new buttons with different regions
        JButton first = new JButton("NORTH");
        JButton second = new JButton("SOUTH");
        JButton third = new JButton("WEST");
        JButton fourth = new JButton("EAST");
        JButton fifth = new JButton("CENTER");

        // Define the panel to hold the buttons
        JPanel panel = new JPanel();
        panel.setLayout(border);
        panel.add(first, BorderLayout.NORTH);
        panel.add(second, BorderLayout.SOUTH);
        panel.add(third, BorderLayout.WEST);
        panel.add(fourth, BorderLayout.EASR);
        panel.add(fifth, BorderLayout.CENTER);

        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}
