import java.util.Scanner;

public class Substitute {
    static String name = "Munirat";
    // int, char, long, short, boolean, byte, double, float (PRIMITIVE DATATYPES)
    // 5,67, 'm', 'y', 537726267271, true or false, 45.67, 546772.987
    // String, Arrays, Numbers (REFERENCE TYPE)
    // "648833", "Promise", {34, 788, 782, 6783}, {"Promise", "Munirat"}
    
    public void printLog() {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Welcome " + name + " to Java Class");
    }
    public static void main(String[] args) {
        Substitute bjikl = new Substitute();
        bjikl.printLog();
        System.out.println("Welcome to Java Class");
        System.out.println(name);
    }
}
