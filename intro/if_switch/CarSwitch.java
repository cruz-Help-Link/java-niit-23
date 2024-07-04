import java.util.Scanner;

public class CarSwitch {

    Scanner sc = new Scanner(System.in);
    int carType;

    void carType() {
        System.out.println("Choose the type of Car you would love to buy: ");
        System.out.println("1.Lamborghini    2.Maybach   3.Ferrari");
        carType = sc.nextInt();
        switch (carType) {
            case 1:
                System.out.println("Lamborghini");
                // lambo();
                break;
            case 2:
                System.out.println("Maybach");
                // may();
                break;
            case 3:
                System.out.println("Ferrari");
                // ferr();
                break;
            default: System.out.println("Invalid Input");
        }
    }



    public static void main(String[] args) {
        CarSwitch cs = new CarSwitch();
        cs.carType();

    }
}
