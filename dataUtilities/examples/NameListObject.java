import java.util.ArrayList;

public class NameListObject {

    private String firstName;

    public NameListObject(String property) {
        this.firstName = property;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public static void main(String[] args) {

        ArrayList<NameListObject> list = new ArrayList<>();
        list.add(new NameListObject("Zulu"));
        list.add(new NameListObject("Swahili"));
        list.add(new NameListObject("Cantonese"));
        list.add(new NameListObject("Greenlandic"));
        list.add(new NameListObject("Irish"));

        list.sort((obj1, obj2) -> obj1.getFirstName().compareTo(obj2.getFirstName()));

        for (NameListObject obj : list) {
            System.out.println(obj.getFirstName());
        }
    }
}