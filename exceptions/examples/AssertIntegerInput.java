import java.util.Scanner;

public class AssertIntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Use assert to check if the input is positive
        assert userInput > 0 : "Input must be a positive integer";

        System.out.println("You entered: " + userInput);

        System.out.println("Assertion passed. The input is a positive integer.");

        scanner.close();
    }
}
