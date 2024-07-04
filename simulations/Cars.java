import java.util.Scanner;

public class Cars {
	Scanner sc = new Scanner(System.in);
	int type;

	String ok;
	String buy = "buy";

	void carType() {
		System.out.println("Choose the type of Car you would love to buy: ");
		System.out.println("1.Lamborghini    2.Maybach   3.Ferrari");
		type = sc.nextInt();
		switch (type) {
			case 1:
				System.out.println("Lamborghini");
				lambo();
				break;
			case 2:
				System.out.println("Maybach");
				may();
				break;
			case 3:
				System.out.println("Ferrari");
				ferr();
				break;
		}
	}

	void lambo() {
		System.out.println("I am a Lamborghini Custom. Red in color, speed 270kh.");
		System.out.println("To Buy me... Please Enter BUY");
		buy = sc.nextLine();

		if (buy.equalsIgnoreCase(buy)) {
			System.out.println("I am worth $1,800,000");
			System.out.println("Enter 'ok' to continue");
			ok = sc.nextLine();
			if (ok.equals("ok")) {
				paymentDetails();
			} else {
				System.out.println("No input given");
				return;
			}
		}
	}

	void may() {
		System.out.println("I am a Maybach X30. Black in color, speed 175kh.");
		System.out.println("Buy me");
		buy = sc.nextLine();

		if (buy.equalsIgnoreCase(buy)) {
			System.out.println("I am worth $600,000");
			System.out.println("Enter 'ok' to continue");
			ok = sc.nextLine();
			if (ok.equals("ok")) {
				paymentDetails();
			} else {
				System.out.println("No input given");
				return;
			}
		}
	}

	void ferr() {
		System.out.println("I am a Ferrari Avatar. Blue in color, speed 285kh.");
		System.out.println("Buy me");
		buy = sc.nextLine();

		if (buy.equalsIgnoreCase(buy)) {
			System.out.println("I am worth $1,200,000");
			System.out.println("Enter 'ok' to continue");
			ok = sc.nextLine();
			if (ok.equals("ok")) {
				paymentDetails();
			} else {
				System.out.println("No input given");
				return;
			}
		}
	}

	void paymentDetails() {
		System.out.print("Loading payment page...");
	}

	public static void main(String[] args) {
		Cars c = new Cars();
		c.carType();  
	}
}