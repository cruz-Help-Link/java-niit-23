import java.util.*;

public class ExceptionR {
	public static void main(String[] args) {
		int num1, num2;
		double result;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("Enter 1st number");
			num1 = sc.nextInt();
			System.out.println("Enter 2nd number");
			num2 = sc.nextInt();
			result = num1 / num2;
			System.out.println("The result is " + result);
		}
		catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("Goodbye, visit soon");
		}
	}
}