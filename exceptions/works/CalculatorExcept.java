import java.util.Scanner;

public class CalculatorExcept {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter an operation (+, -, *, /) or 'c' to close calculator: ");
                String operation = scanner.nextLine();

                if (operation.equals("c")) {
                    break;
                }
                System.out.println("Enter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine()); // parse input to double

                System.out.println("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result = 0;

                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operation. Please enter +, -, *, or /.");
                        continue;
                }

                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
