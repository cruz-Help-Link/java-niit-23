import java.util.Scanner;

public class WordGame {
	Scanner sc = new Scanner(System.in);

	void gameOptions() {
		int option;

		System.out.println("-----------Menu------------");
		System.out.println("1. Start Game    2. Instructions    3. Exit Game");
		option = sc.nextInt();
		switch (option) {
			case 1: playGame(); break;
			case 2: instructionsGame(); break;
			case 3: exitGame(); break;
		}
	}

	public void playGame() {
		int i; int flag = 0; String guess, input;
		String word = "Belligerent";

		do{
			System.out.println("\n Enter your guess");
			guess = sc.nextLine();

			for (i=0; word.length() < i; i++ ) {
				if (word.charAt(i) == guess.charAt(0)) {
					flag =1;
					System.out.println("Right guess");
				} else {
					System.out.println("Wrong guess");
				}
			} 
			System.out.println("Guess again?");
			System.out.println("\nYes or no");
			input = sc.nextLine();
		} 
		while(input.equals("Yes") || input.equals("yes"));
	}

	public void instructionsGame() {
		System.out.println("Instructions are provided in the link below");
	}
	public void exitGame() {
		System.out.println("Exit Complete");
	}

	public static void main(String[] args) {
		WordGame wg = new WordGame();
		wg.gameOptions();
	}
}