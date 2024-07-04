import java.util.Scanner;
public class AgeNow extends AgeException {
	public static void main(String[] args) {
		String name; int ageT;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();

		System.out.println("Enter age");
		int x = sc.nextInt();
		int age = Integer.parseInt(ageT);
            if (age<18) {
                try {
                    throw new AgeException();
                } catch (AgeException ae) {
                    System.out.println("Exception raised");
                }
            }
            else {
                System.out.println("Age entered is " + age);    
        } 

	}

}