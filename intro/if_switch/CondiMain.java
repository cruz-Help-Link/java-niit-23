import java.util.*;
public class CondiMain {
    Scanner sc = new Scanner(System.in);
    public void name() {
        int x=5, y;
        System.out.println("Enter a number: " + " ");
        y = sc.nextInt();
        if (x == y) {
            System.out.println("They are equal");
        }
        else if (x > y) 
            System.out.println("x is greater than y");
        else if (x > y) 
            System.out.println("y is greater than x");
        else if (x != y) 
            System.out.println("x is not equal to y");
        else System.out.println(" error");
    }
    public static void main(String[] args) {
        CondiMain cm = new CondiMain();
        cm.name();
    }
}
