import java.util.Scanner;

public class ArrayPlays {
    
    public static void main(String[] args) {
        int infoSize = 4;
        Scanner input = new Scanner(System.in);
        String[] userInfo = new String[infoSize];
        // Accept user input for the "names" array
        System.out.println("Enter your ID, Email, PhoneNo, and Password");

        for (int i = 0; i < infoSize; i++) {
            if(input.hasNext()) {
                userInfo[i] = input.next();
            }
            System.out.println(userInfo[i] + "");
        }
        // System.out.println(getUserInfo());

    }
}
