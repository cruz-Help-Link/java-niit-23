import java.util.*;

public class Outer{
	private String name = "Mary";
	private int age;
	Scanner sc = new Scanner(System.in);

	class inner {
		String value;
		void validate() {
			System.out.println("Is your name " + name +" ?");
			value=sc.next();
			if (value.equals ("yes")) {
				System.out.println("Name: Mary");
			}
			else {
				System.out.println("No name");
			}
			System.out.println("Input Age:");
			age=sc.nextInt();
			if (age < 13 && age > 35) {
				System.out.println("Not allowed");
			}
			else
				System.out.println("Don!!!");
		}
	}
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.inner in = out.new inner();
	}
} 