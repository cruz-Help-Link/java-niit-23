import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;


public class method {
	public static void main(String[] args) {
		// String text = "When compelled, do as you are told";
		System.out.println("Enter a text of at least 5 words long: ");
		// i need to make this part so that a user cannot enter a text that is not
		// at least 5 words long
		
		Scanner sc = new Scanner(System.in);
		Pattern myPattern = Pattern.compile("[mno]mpe");
		Matcher myMatcher = myPattern.matcher("ompe");
		boolean myBoolean = myMatcher.matches();

		if (myBoolean) {
			System.out.println("Expression matched");
			}	
		else
			System.out.println("Expression not matched");
	}
}