import java.util.*;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, numOfStars;

        for (row = 1; row <=10; row++) {
            for(numOfStars =1; numOfStars<=row; numOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
// Alphabets A-Z
        char cha;
        for(cha ='a'; cha<= 'z'; cha++) {
            System.out.print(cha);
        }
        System.out.println();

//multiplication..
        int n = 7, c;
        for(c = 1; c <= 15; c++){
            System.out.println(n+ "*" + c+ " = " +(n*c));
        }

        //reverse string
        String input = "Genesis";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        System.out.println(sb);
        
//prime numbers
        int x, status =1; int num = 37;
        System.out.println("enter range");
        n = sc.nextInt();
        if (n>= 1) {
            System.out.println("First " + n + "prime numbers are: ");
            System.out.println(2);
        }
        for(int count = 2; count<=n; ) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i ==0) {
                    status = 0;
                    break;
                }
            }
            if(status != 0) {
                System.out.println(num);
                count++;
            }
            status =1;
            num++;
        }
    }
}
