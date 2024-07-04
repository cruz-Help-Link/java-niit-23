enum FarmObjects {
    Primary("Shovels"),
    Secondary("Sprinklers"),
    Tertiary("Tractors");

    private String object;
    private String name;

    private FarmObjects(String object) { // ENUM CONSTRUTOR
        this.object = object; // INITALIZATION
        this.name = name;
        object.toString(); // byte to string
    }

    @Override
    public String toString() {
        return "We are" + " " + object + ".";
    }
}
public class EnumJest {
    public static void main(String[] args) {
        String pri = FarmObjects.Primary.toString();
        System.out.println(pri);
        // PRINT OUT ALL THE VALUES OF THE ENUM
        for (FarmObjects fObj : FarmObjects.values()) {
            System.out.println(fObj);
        }
    }
}
