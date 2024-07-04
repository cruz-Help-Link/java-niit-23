import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;



import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class MyThreads extends Thread{
    JFrame fr = new JFrame("Countown Timer");
    JPanel p = new JPanel();
    JLabel l = new JLabel(" ");
    JTextField tf = new JTextField(15);
    
    void display() {
        for (int i = 60; i >= 0; i--)
        {
        try {
        Thread.sleep(1000);
        // String s = Integer.toString(i);
        tf.setText("    "+ i + " seconds to go..");
        } catch (Exception e) {
        System.out.println(e);
        }
        }
        JOptionPane.showMessageDialog(fr, "Time Up !!!!");
        tf.setText(" ");
        tf.setEnabled(false);
        }
    
@Override
    public void run() {
        System.out.println("Great");
        buildGUI();
    }
    public void buildGUI() {
        tf.setEnabled(false);
        Font f = new Font("Verdana", 0, 18);
        tf.setFont(f);
        tf.setBackground(Color.BLACK);
        p.setBackground(Color.blue);
        fr.add(p);
        p.add(tf);
        p.add(l);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setDefaultLookAndFeelDecorated(true);
        fr.setSize(300, 100);
        fr.setResizable(false);
        display();
    }
    public static void main(String[] args) {
        MyThreads thread = new MyThreads(); // creating 
        thread.start();
    }
}