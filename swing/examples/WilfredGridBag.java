import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WilfredGridBag {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel willy = new JLabel("NAME");
        JLabel jos = new JLabel("NAME");

        frame.add(panel);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        // panel.add(new JLabel())
        panel.add(willy, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        // panel.add(new JLabel())
        panel.add(jos, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JTextField(), gbc);

        frame.setVisible(true);

    }
}
