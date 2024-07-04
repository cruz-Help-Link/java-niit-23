public class FirstClass {
    String name, laptop_name;
    int id;

    public FirstClass() {
        name = "Prince";
        laptop_name = "Dell";
        id = 1209090;
    }

    public void printInfo() {
        System.out.println("The name is " + name + "using" + laptop_name + "with id " + id);
    }
}

public class SecondClass extends FirstClass{
    
    public void printLine() {
        printInfo();
    }

    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.printLine();
    }
}

// public class ThirdClass extends FirstClass {

// }
