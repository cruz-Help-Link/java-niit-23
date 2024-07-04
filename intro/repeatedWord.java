import java.util.Scanner;

class repeatedWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.println("Type your favorite word:");
		word=sc.next();
		int x= word.length();
		System.out.println("The length of the word, "+ word+ " is " + x);
	}
}