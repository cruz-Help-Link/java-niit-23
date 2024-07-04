// A sample Java code with a try catch block
// where the try block has only one catch block
// to handle all possible exceptions

// importing class Random to generate a random number as input
import java.util.Random;

class RandomTry {
    void numb(int n) {
        try {

            // this will throw ArithmeticException if n is 0
            int x = 10 / n;
            
            int y[] = new int[n];
            //n is the arraysize

            // this will throw ArrayIndexOutOfBoundsException
            // if the value of x surpasses
            // the highest index of this array
            // x is the idex 

            //... let's say n is 5; 10/5 = 2; x is 2, 2 is smaller than 5 so no exception
            y[x] = 10;
        } 
        catch (Exception e) {
            System.out.println("Exception occurred");

            if (e instanceof ArithmeticException)
                System.out.println("Can't divide by 0");
            if (e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("This index doesn't exist in this array");
        }
        
        // catch (ArithmeticException e) {
        //     System.out.println("Dividing by 0");
        // }
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("That index doesn't exist");
        // }
        finally {
            System.out.println(n);
        }
    }

    public static void main(String a[]) {
        RandomTry rt = new RandomTry();
        rt.numb(new Random().nextInt(10));
        //give the range for random as 10, so n will be random input from 0-9
    }
}
