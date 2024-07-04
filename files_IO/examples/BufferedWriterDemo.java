import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class BufferedWriterDemo extends Thread{
	JButton but;
	JTextField tf;
	JLabel l;
	JFrame fr;

	public void run() {
		buildGUI();
	}

	public void postText() {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Put some content: ");
		input=sc.next();

		Path file = Paths.get("write.txt");
		Charset cs = Charset.forName("US-ASCII");
		// byte buf[] = input.getBytes();

		try (BufferedWriter writer = Files.newBufferedWriter(file, cs, StandardOpenOption.WRITE)) {
			writer.write(input);
		} catch (Exception e){
			System.out.println(e);
		}
	}

	public void buildGUI() {
		fr = new JFrame("Tweet");
		JPanel p = new JPanel();
		l = new JLabel("");
		tf = new JTextField(20);
		tf.setEnabled(true);
		Font f = new Font("Times New Roman", 0, 20);
		tf.setFont(f);
		but = new JButton("Post");
		tf.setBackground(Color.WHITE);
		p.setBackground(Color.BLUE);
		fr.add(p);
		p.add(tf);
		p.add(l);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(500,150);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
		postText();
	}

	public static void main(String[] args) {
		BufferedWriterDemo bwd = new BufferedWriterDemo();
		bwd.start();
	}
}
