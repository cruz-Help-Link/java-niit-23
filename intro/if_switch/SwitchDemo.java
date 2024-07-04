import java.util.Scanner;

class SwitchDemo {
    static void switchOption(int option) {

        switch (option) {
            case 1 -> System.out.println("Price 20$");
            case 2,3 -> System.out.println("Get One Free");
            case 4,5 -> System.out.println("Get Two Free");
            default -> System.out.println("Not 1,3,4,5,6");
        }
        System.out.println(" "+"User Option:" + option);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switchOption(option);
    }
}
