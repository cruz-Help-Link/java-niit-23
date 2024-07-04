import java.util.*;

public class TryMe {
    Scanner sc = new Scanner(System.in);
    int num1, num2, result;
    String name;

    public void calculateSum() {
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        result = num1 /num2;   
        System.out.println(result);
    }

    public void handler() {
        try {
            System.out.println("Enter Name :" + " ");
            name = sc.next();
            calculateSum();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("IMPOSSIBLE!!!");
        }
    }

    public static void main(String[] args) {
        TryMe tm = new TryMe();
        // tm.calculateSum();
        tm.handler();
    }
}



// Error: An Error indicates a serious problem that a reasonable application should not try to catch.
// Exception: Exception indicates conditions that a reasonable application might try to catch.