import java.util.*;

public abstract class MarketPlace {
    abstract void setItemName();
    abstract String getItemName();
    abstract int getItemPrice();
    abstract void taxDeduction();

    public void startMarket(String name) {
        String message = "Welcome to Market Place";
        System.out.println("Creating your stall...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Stall:");
        name = sc.nextLine();
    }
    public void startMarket() {
        String message = "Welcome to Market Place";
        System.out.println("Opening the shop");
    }
}
