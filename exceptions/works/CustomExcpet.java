
class MyException extends Exception {
    public MyException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

public class CustomExcpet {

    static void throwsMet() throws IllegalAccessException{
        System.out.println("Inside throwsMet. ");
        throw new IllegalAccessException("exception");
    }
    // Driver Program
    public static void main(String args[]) {
        try {
            // Throw an object of user defined exception
            throw new MyException("My Exception");
        } catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
