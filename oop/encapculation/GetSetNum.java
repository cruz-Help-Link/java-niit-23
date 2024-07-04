import java.io.*;

class GetSetNum {
    // Member variable of this class
    private int num;

    // Method 1 - Setter
    public void setNumber(int number) {
        // Checking if number is between 1 to 10 exclusive
        if (number < 1 || number > 10) {

            throw new IllegalArgumentException();
        }
        num = number;
    }

    // Method 2 - Getter
    public int getNumber() {
        return num;
    }

    public static void main(String[] args) {
        GetSetNum gs = new GetSetNum();

        // Calling method 1 inside main() method
        gs.setNumber(5);

        // Printing the number as setter above
        System.out.println(gs.getNumber());
    }
}
