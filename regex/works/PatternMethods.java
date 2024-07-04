import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PatternMethods
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Desired Pattern: ");
		String pattern = sc.nextLine();
		System.out.println("Enter the text: ");
		String matcher = sc.nextLine();
		Pattern myPattern = Pattern.compile(pattern);
		Matcher myMatcher = myPattern.matcher(matcher);
		Boolean myBoolean = myMatcher.matches();
		boolean b = myBoolean;
		if (b == true) {
			System.out.println("I found the text: " + myMatcher.group() + "\n"
				+ "Starting at: " + myMatcher.start() + "\n" + "Ending at index: " 
				+ myMatcher.end());
		}
		else if (b == false)
		{
			System.out.println("No match found");
		}
	}
}
