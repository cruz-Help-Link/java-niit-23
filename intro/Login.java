import java.util.*;

public class Login {
	private static String password = "Enichi@74";
	private static String repassword;

	
	static class validatePassword {
		Scanner sc = new Scanner(System.in);
		Login l = new Login();
		void validate() {
			System.out.println("Input your password: ");
			l.repassword =sc.nextLine();
			boolean result = l.password.equals(repassword);
			if (result==true) {
				System.out.println("Password match");
			}
			if (result==false) {
				System.out.println("Incorrect Password");
			}
			
		}
	}
	public static void main(String[] args) {
		Login.validatePassword validator = new Login.validatePassword();
		validator.validate();
	}
}