import java.util.Scanner;

public class ExceptMath {
    public void runMethod(String input) {
        try {
            if (input.equals("abc")) {
                System.out.println("Equal");
            }
            else {
                System.out.println("Not Equal");
            }
            System.out.println("Input recieved ------------ " + input);
        } catch (Exception e) { // NullPointerException
            System.out.println("Caught Exception");
        }
    }

    public void doMath() {
        Scanner sc = new Scanner(System.in);
        int first, second;
        int result = 0;

        System.out.println("Enter first number");
        first = sc.nextInt();
        System.out.println("Enter second number");
        second = sc.nextInt();

        result = first / second;
        System.out.println(first + " divided by " + second + "= " 
        + result);
    }
    public static void main(String[] args) { 
        ExceptMath em = new ExceptMath();
        em.runMethod(null);
    }
}