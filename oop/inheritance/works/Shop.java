public class Shop extends MarketPlace {
    String item;
    int price;
    String[] items = { "Scarf", "Purse", "Bracelets", "Earings", "Necklace", "Sea Shells", "Confetti", "Sun Shades",
            "Hats", "Swim Suits" };

    public String getItemName() {
        return item;
    }

    public void setItemName(String itemName) {
        this.item = itemName;
        listItems();
    }

    public void listItems() {
        // Scanner sc = new Scanner(System.in);
        System.out.println("What item would you like?" + " ");
        for (String i : items) {
            System.out.println(i);
        }
        item = sc.next();
        boolean input = false;
        for (String i : items) {
            if (item.equalsIgnoreCase(i)) {
                input = true;
            }
        }
        if (input) {
            System.out.println("You hava chosen" + " " + item);
            getItemPrice();
        } else
            System.out.println("Invalid Input");
        System.out.println(getItemName());

    }

    public int getItemPrice() {
        return price;
    }

    public static void main(String[] args) {
        Shop sp = new Shop();
        sp.startMarket();
        sp.listItems();

    }
}
