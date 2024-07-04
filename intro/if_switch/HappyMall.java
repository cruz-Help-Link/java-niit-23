import java.util.Scanner;

public class HappyMall {
    int option;

    public int getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void acceptOption() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Welcome to Happy Mall-----");
        System.out.println("What Section will you like to visit?");
        System.out.println("---1. CLOTHING ---");
        System.out.println("---2. KITCHEN ---");
        System.out.println("---3. ELECTRONICS ---");
        System.out.println("---4. BABY ITEMS ---");

        System.out.println("Enter Section: _______");
        option = input.nextInt();
        System.out.println( "The Customer vits section" + " " + getOption());


        

        visitSection(option);
    }
    public void visitSection(int option) {
        switch (option) {
            case 1->
                System.out.println("Welcome to Clothing");
            case 2->
                System.out.println("Welcome to Kitchen");
            case 3->
                System.out.println("Welcome to Electronics");
            case 4->
                System.out.println("Welcome to Baby Items");
        
            default-> System.out.println("Invalid Option");
        }
    }

    public static void main(String[] args) {
        HappyMall hm = new HappyMall();
        hm.acceptOption();
    }


}
