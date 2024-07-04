import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChineduGrid {
    JFrame frame = new JFrame("null");
    JPanel panel = new JPanel();
    JButton button = new JButton("Register");
    JTextField field = new JTextField(5);
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    public ChineduGrid() {

    }

    public void uiComponents() {
        //LABEL
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(new JLabel("NAME"));
        
        //TEXTFIELD
        gbc.gridx =0;
        gbc.gridy = 1;
        panel.add(button);

        //BUTTON
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 1;
        gbc.gridy = 1;

    }
    public static void main(String[] args) {
        ChineduGrid cg = new ChineduGrid();
    }
}

