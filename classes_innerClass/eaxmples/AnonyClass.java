import java.util.*;

class Demo {

    void show() {
        System.out.println("i am in show method of super class");
    }
}

// Main class
class AnonyClass {

    // An anonymous class with Demo as base class
    static Demo d = new Demo() {
        void show() {
            // Calling method show() using super keyword refering to parent class
            super.show();
            System.out.println("i am in AnonyClass class");
        }
    };

    // Main method..
    public static void main(String[] args) {
        // Calling show() method inside main() method
        d.show();
    }
}
