import java.util.*;

public class ExceptionT {
	
	public static void main(String[] args) {
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		name= sc.next();
		System.out.println("Enter age:");
		age= sc.nextInt();
		if (age<20) {
			try{
				throw new AgeException();
			}
			catch(AgeException ae) {
				System.out.println(ae);
			}
		}
		
	}
}