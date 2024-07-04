import java.time.*;
import java.util.Scanner;

public class BirthDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
        String birth = sc.nextLine();

        LocalDate date;
        date = LocalDate.parse(birth);

        System.out.println("Age is :- " + calcAge(date));
    }

    static int calcAge(LocalDate date) {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(date, currentDate).getYears();
        return age;
    }
}