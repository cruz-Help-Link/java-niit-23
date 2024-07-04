import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Systems {
    public static void main(String[] args) {
        // String s;
        // // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Nehland, 'N' is a trigger so watch out");
        do {
            String s;
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your favorite words:");
            s = sc.nextLine();

            if (s.contains("n")) {
                System.out.println("Say Bye Bye");
                break;
            }

            // int id = Integer.parseInt(s);

        } while (true);

    }
}
