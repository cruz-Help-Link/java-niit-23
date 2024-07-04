import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.text.*;

class StopWatch extends Thread{
	boolean isCounting = true;
	int sec = 0;
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
		while(isCounting){
			count();
		}
	}

	void count(){
		try{
			++sec;

			if(sec >= 60){
				sec = 0;
				min++;
			}
			if (min >= 60){
				min = 0;
				hour++;
			}

			Thread.sleep(1000);
			HOUR.setText("Hour: "+Integer.toString(hour));
			MIN.setText("Min: "+Integer.toString(min));
			SEC.setText("Sec: "+Integer.toString(sec));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
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