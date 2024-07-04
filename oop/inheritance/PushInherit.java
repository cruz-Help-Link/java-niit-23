class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }
    public String outputName() {
        return "name";
    }
}
class Subject extends Person{
    private String name;
    private int id;
    Subject(int id, String name) {
        // super keyword refers to super class
        super("name");
        this.id = id;
    }
    @Override
    public String outputName() {
        return "The name is " + name;
    }
}
public class PushInherit {
    public static void main(String[] args) {
        // Person p = new Subject();
        // p.outputName();

        // Person myObj = new Person();
        // myObj.setProperty("Java Class"); // Set the value of the property variable
        // System.out.println(myObj.getProperty());
    }
}
