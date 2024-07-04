import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClassGUI implements ActionListener {

    public static void main(String[] args) {
        ClassGUI cg = new ClassGUI();
        JButton b = new JButton("Next");
        JFrame frame = new JFrame("New Frame");
        frame.setBounds(100, 100, 730, 489);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // JOptionPane op = new JOptionPane("Next");

        // Container c = frame.getContentPane(); //Gets the content layer
        JLabel label = new JLabel(); // JLabel Creation
        // label.setIcon(new ImageIcon("C:\\Java\\ClassFile\\me.jpg")); //Sets the image
        // to be displayed as an icon
        // Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(50, 30, 100, 100); // Sets the location of the image

        frame.add(label); // Adds objects to the container
        frame.setVisible(true);

        // ImageIcon img = new ImageIcon("C:\\Java\\ClassFile\\me.jpg");
        // b.setIcon(img);
        JButton bq = new JButton();
        JTextField textField = new JTextField();
        textField.setBounds(60, 50, 180, 25);
        b.setBackground(Color.BLUE);
        b.setForeground(Color.MAGENTA);
        bq.setBackground(Color.RED);
        bq.setForeground(Color.ORANGE);
        // b.setBounds(65, 387, 89, 23);
        b.addMouseListener(null);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Setting text to field
                textField.setText("Anonymous");
            }
        });
        textField.setBounds(180, 220, 150, 30);
        b.setBounds(130, 275, 150, 30);
        bq.setBounds(200, 0275, 150, 30);

        b.addActionListener(cg);
        frame.add(b);
        frame.add(textField);

    }

}
