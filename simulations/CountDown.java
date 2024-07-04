import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class CountDown extends Thread {
	JTextField tf;
	JLabel l;
	JFrame fr;

	public void run() {
		buildGUI();
	}

	void display() {
		for (int i = 60;i >=0;i-- ) {
			try{
				Thread.sleep(1000);
				String s= Integer.toString(i);

				tf.setText("   " + s + " seconds to go...");
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		JOptionPane.showMessageDialog(fr, "Time Up!!!");
		tf.setText("");
		tf.setEnabled(false);
	}

	public void buildGUI() {
		fr = new JFrame("CountDown Timer");
		JPanel p = new JPanel();
		l = new JLabel("");
		tf = new JTextField(20);
		tf.setEnabled(false);
		Font f = new Font("Times New Roman", 0, 20);
		tf.setFont(f);
		tf.setBackground(Color.BLACK);
		p.setBackground(Color.BLUE);
		fr.add(p);
		p.add(tf);
		p.add(l);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(500,150);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
		display();
	}
	public static void main(String[] args) {
		CountDown cd = new CountDown();
		cd.start();
	}
}