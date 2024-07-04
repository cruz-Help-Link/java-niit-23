import java.util.Scanner;

public class Shop2 extends MarketPlace {
    String[] items = { "1. Shoe", "2. Bag", "3. Jacket", "4. Box", "5. Hat", "6. Bracelets" };
    String item;
    int[] price = { 2000, 6000, 8000, 12000, 3500, 3700 };
    int choice, total;

    public String getItemName() {
        return items[choice - 1];
    }

    public void setItemName(String itemName[]) {
        this.items = itemName;
    }

    public void listItem() {
        String item;
        boolean ohk;
        Scanner sc = new Scanner(System.in);
        for (String i : items) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("Input choice from 1-6");
        choice = sc.nextInt();
        for (String i : items) {
            System.out.println(i);
            // getItemPrice();
        }
        if (ohk = true) {
            System.out.println("Accepted");
            String option = items[choice - 1];
            System.out.println("You hava chosen" + " " + option);
            // getItemPrice();
        } else
            System.out.println("Invalid Input");
        System.out.println(getItemName());
    }

    public int getItemPrice() {
        for (int j = 0; j < price.length; j++) {

        }
        total = price[choice - 1];

        // for (int j = 0; j < price.length; j++) {
        // System.out.println();
        // }
        return total;
    }
    // public void itemPriceList() {
    // for (int i = 0; i < items.length; i++) {
    // System.out.println(items[i] + " ");
    // for (int j = 0; j < price.length; j++)
    // System.out.println(price[j]);
    // }
    // }

    public static void main(String[] args) {
        Shop2 shp = new Shop2();
        shp.startMarket();
        shp.listItem();

        shp.getItemPrice();
    }
}
