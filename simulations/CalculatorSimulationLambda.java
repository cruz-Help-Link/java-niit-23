import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorSimulationLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda expressions for different operations
        BiFunction<Double, Double, Double> addition = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtraction = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiplication = (a, b) -> a * b;
        BiFunction<Double, Double, Double> division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: Division by zero");
                return Double.NaN; // Not-a-Number as a result
            }
        };

        // User input for numbers and operation
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = calculate(num1, num2, addition);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calculate(num1, num2, subtraction);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calculate(num1, num2, multiplication);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = calculate(num1, num2, division);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    // Method to perform calculation using the selected operation
    private static double calculate(double a, double b, BiFunction<Double, Double, Double> operation) {
        return operation.apply(a, b);
    }
}
