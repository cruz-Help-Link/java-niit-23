import java.util.Scanner;

public class Provoked {
    Scanner sc = new Scanner(System.in);
    int num1;

    public void handler() {
        try {
            num1 = sc.nextInt();
            if (num1 == 0) {
                
            } else {
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("IMPOSSIBLE!!!");
        }
    }

    public static void main(String[] args) {
        Provoked p = new Provoked();
        p.handler();
    }
}