import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class TextRegex{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "Simply Simi";
		// String textSplit[] = text.split("");
		Pattern pattern = Pattern.compile("Sim.+");
		if (Pattern.compile("Sim.+")) {
			Matcher matcher = pattern.matcher(pattern);
			boolean myBoolean = matcher.matches();
			System.out.println("myBoolean");
		}

	}
// 	// Pattern pattern = Pattern.compile("\\b(.*)(\\d+)(.*)\\b");
// 	Pattern pattern = Pattern.compile("0{2}+");

	
// 	Matcher matcher = pattern.matcher("5abc 6m00hgb8m ds4adad cto000pi serth63 f00f j000");
// 	boolean eMatch = matcher.matches();

// 	int count = 0;

// 	while(matcher.find ()){
// 		count++;
// 		System.out.println("start" +matcher.start());
// 		System.out.println("end" +matcher.end());
// 		System.out.println("count" +count);
// 		System.out.println(matcher.group(0));
// 		// System.out.println(matcher.group(1));
// 		// System.out.println(matcher.group(2));

// 		}
	}
// }

