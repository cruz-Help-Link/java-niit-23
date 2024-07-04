public class NumberThrow {
    static void checkNumber(int a, int b) {
        if (b == 0) {
            //Used to throw an exception for a method.. throw is followed by an object (new type) used inside the method
            throw new ArithmeticException("Unable to Solve");
        } else {
            System.out.println("The Numbers entered are : " + a + ", " + b);
        }
    }

  public static void main(String[] args) {
    // checkNumber(2,4); // Set b as 0
    checkValue(34);
  }
    static void checkValue(int weightInKG) {
        if (weightInKG < 50) {
            throw new ArithmeticException("Access denied - You must weigh least 50kg to get on the ferry.");
        }
        else {
            System.out.println("Access granted - You weigh enough!");
        }
    }
}