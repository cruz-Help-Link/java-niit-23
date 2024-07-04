// Define a functional interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); //ABSTRACT METHOD
    default void getHelp(){} //DEFAULT METHOD
    private void summarize(){} // PRIVATE METHOD
}

//

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        FunctionalInterfaceEx ex = new FunctionalInterfaceEx();
        FunctionalInterfaceEx re = new FunctionalInterfaceEx();
        // Using a lambda expression with the functional interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        // Performing calculations using the functional interface implementations
        System.out.println("Addition: " + performOperation(addition, 5, 3)); // Output: Addition: 8
        System.out.println("Subtraction: " + performOperation(subtraction, 10, 4)); // Output: Subtraction: 6
        System.out.println("Multiplication: " + performOperation(multiplication, 7, 2)); // Output: Multiplication: 14
    }

    // Method that accepts the functional interface as an argument
    private static int performOperation(Calculator calculator, int a, int b) {
        return calculator.calculate(a, b);
    }
}
