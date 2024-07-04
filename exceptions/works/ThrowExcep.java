// The throw keyword is mainly used to throw custom exceptions. it helps check errors at compile time instead of runtime, and create custom exceptions that make debugging and recovery easier

import java.io.FileNotFoundException;
import java.util.Scanner;

class ThrowExcep {
    static void throwMethod() {
        try {
            throw new NullPointerException("exception"); //The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
        } catch (NullPointerException e) {
            System.out.println("Exception in throwMethod.");
            throw e; // rethrowing the exception
        }
    }
    
    static void throwsMet() throws IllegalAccessException{ //TRY
        System.out.println("Inside throwsMet. ");
        throw new IllegalAccessException("exception IN LINE 16"); //CATCH
    }


    static void customExce() throws AccessRestrictedException{

        System.out.println("Custom Exception Demo "); 
        throw new AccessRestrictedException("Access Restricted");  
    }
// ThrowExcep te = new ThrowExcep();
// te.customExce();

// customExce();



    public void nameCow() throws ArithmeticException{
        throw new NotAvailableException("Exception");
    }
 
    public static void main(String args[])
    {
        ThrowExcep te = new ThrowExcep();
        try {
            // te.throwsMet(); //illegal access
            te.customExce();
        }
        // catch (IllegalAccessException e) {
        //     System.out.println("exception caught in main.");
        // }
        catch (AccessRestrictedException e) {
            System.out.println("Custom exception caught");
        }
    }

    // public static void main(String args[]) {
    //     try {
    //         throwMethod();
    //     } catch (NullPointerException e) {
    //         System.out.println("Exception in Main");
    //     }
    // }
void liveMethod() {
    // a resource is both declared and initialized inside the try
    try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
        writer.println("Hello World");
    }catch (FileNotFoundException e) {
        e.printStackTrace();
        e.getCause();
        e.getMessage();
    }

    // try (Scanner scanner = new Scanner(new File("test.txt"))) {
    Scanner scanner = null;
    try {
        scanner = new Scanner(new File("test.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } finally {
        if (scanner != null) {
            scanner.close();
        }
    }
}
   
}
