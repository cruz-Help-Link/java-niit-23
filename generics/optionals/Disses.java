import java.util.Optional;
import java.util.OptionalLong;
import java.util.Scanner;

public class Disses {
    public static void main(String[] args) {
        OptionalLong right = OptionalLong.of(54782926);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your batch No:");
        Long BNo = sc.nextLong();
        OptionalLong longa = OptionalLong.of(BNo);
        if (longa.equals(right)) {
            System.out.println("Matching.....");
        } else System.out.println("Nah...");

    }
}
