import java.util.*;
import javax.swing.*;
import java.awt.*;

class Sync extends Thread {
	Sync() {
		start();
	}

	@Override

	public void run() {
		dosth();
		dosthAgain();
	}


	public synchronized  void dosth() {
		try {
			for (int i=1;i <= 5 ;i++ ) {
				System.out.println("stand" + i);
				Thread.sleep(200);
			}
		}catch (InterruptedException ie) {
			System.out.println("who woke me?");
		}
	
	}

	public synchronized  void dosthAgain() {
		try {
			for (int i=1;i <= 10 ;i++ ) {
				System.out.println("sit" + i);
				Thread.sleep(200);
			}
		}catch (InterruptedException ie) {
			System.out.println("who woke me?");
		}
	}


	public static void main(String[] args) {
		Sync s1 = new Sync();
		Sync s2 = new Sync();
		Sync s3 = new Sync();

	}

}