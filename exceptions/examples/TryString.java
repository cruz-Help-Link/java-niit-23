import  java.util.*;

public class TryString {
    Scanner sc = new Scanner(System.in);
    String sn1, sn2;
    int num1, num2, sum;

    calcualte() {
        try {
            System.out.println("Enter first number");
            sn1 = sc.next();
            System.out.println("Enter second number");
            sn2 = sc.next();
            num1 = Integer.parseInt(sn1);
            num2 = Integer.parseInt(sn2);
            result = num1 /num2;   
       System.out.printf(result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("IMPOSSIBLW!!");
        }
    }

    public static void main(String[] args) {
        
    }
}
