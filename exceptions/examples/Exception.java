import java.util.*;

public class Exception{
	public static void main(String[] args) {
		int menu;
		String emId;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Accounting      " + "2.Sciences   " + "3.Engineering");
		menu = sc.nextInt();
		if (menu>3 || menu<1) {
			try{
				throw new MenuInputException();
			}
			catch(MenuInputException me) {
				System.out.println(me);
			}
		}
		else{
			System.out.println("Enter Employee ID:");
			emId = sc.next();
			if (emId.startsWith("e")) {
				System.out.println("Goood");
			}
			else {
				try{
					throw new IDInputException();
				}
				catch(IDInputException ie) {
					System.out.println(ie);
				}
			}
		}
	}
}