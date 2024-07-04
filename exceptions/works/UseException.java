import java.util.Scanner;

public class UseException {
    static void throwsMet() throws IllegalAccessException{
        System.out.println("Inside throwsMet. ");
        throw new IllegalAccessException("exception");
    }
    public static void main(String[] args) {
        String guess = "tyejtye7q#rc";
        int lenghtS = guess.length(); 
        
        System.out.println(lenghtS); //get the lenght of the String

        System.out.println(guess.isEmpty()); //false
        System.out.println(guess.lastIndexOf("tye")); //the last index 4
        System.out.println(guess.indexOf("tye")); // the first index 0

        // ACCEPT USER INPUT, AND DISPLAY THE LENGHT OF THE INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String input = sc.nextLine();
        boolean right = input.matches("[a-z]+"); // checking if input is all alphabets

        UseException ue = new UseException();
        try {
            ue.throwsMet(); //illegal access
            throw new NotAvailableException(); // throw statement
        } catch (NotAvailableException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
            e.getMessage();
        }catch (IllegalAccessException e) {
            System.out.println("Illegal Exception caught");
        }
    }
}