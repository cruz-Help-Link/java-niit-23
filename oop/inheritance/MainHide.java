class ParentHide {
    public static void goFirst() {
        System.out.println("First method of the ParentHide class is executed.");
    }

    public void goSecond() {
        System.out.println("Second method of the ParentHide class is executed.");
    }
}

// class child extend Parent class
class Extendo extends ParentHide {
// HIDDING
    public static void goFirst() {
        System.out.println("First of the Extendo class is executed.");
    }
// OVERRIDDING
    public void goSecond() {
        System.out.println("Second method of the Extendo class is executed.");
    }
}

public class MainHide {

    public static void main(String args[]) {
        ParentHide parent = new ParentHide();

        // child is the reference variable of class Parent that
        // points to object of class Extendo
        ParentHide child = new Extendo();

        // But here method will be called using type of
        // reference
        parent.goFirst();
        child.goFirst();

        // ***** Function overriding in java *****//
        // overriding.
        parent.goSecond();
        child.goSecond();
    }
}
