import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.text.*;

class Timing extends Thread{
	Scanner sc = new Scanner(System.in);
	boolean isCounting = true;
	int sec = 60;
	int min = 0;
	int hour = 0;
	JLabel HOUR = new JLabel("Hour: "+hour);
	JLabel MIN = new JLabel("Min: "+min);
	JLabel SEC = new JLabel("Sec: "+sec);



	public void run() {
		init();
		counting();
	}

	public void counting() {
		System.out.println("Enter minutes: ");
		min=sc.nextInt();
		if (min >= 60) {
			min=min % 60;
		}
		while(isCounting){
			count();
		}
	}

	void count(){

		try{
			--sec;

			if(min >= 60){
				min = 0;
				sec--;
			}
			if (min >= 0){
				hour = 0;
				min--;
			}

			Thread.sleep(1000);
			HOUR.setText("Hour: "+Integer.toString(hour));
			MIN.setText("Min: "+Integer.toString(min));
			SEC.setText("Sec: "+Integer.toString(sec));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Timing tm = new Timing();
		tm.start();
	}

	void init(){

		
		HOUR.setBounds(75,170,150,50);
		HOUR.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		MIN.setBounds(175,170,150,50);
		MIN.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		SEC.setBounds(275,170,150,50);
		SEC.setFont(new Font("Baskerville Old Face",Font.BOLD,20));


		JFrame f = new JFrame("Stop Watch");
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setVisible(true);
		f.add(HOUR);
		f.add(MIN);
		f.add(SEC);
	}
}