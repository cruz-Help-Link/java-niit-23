public interface Floatable {
    void floatOnWater();
    // default methods in interfaces
}

public interface Flyable {
    void fly();

    default void repair() {
        System.out.println("Repairing Flyable object");
    }
}

public class Car {
    int wheels;
    String model;

    void start() {
        // statements
    }
}

public class ArmoredCar extends Car implements Floatable, Flyable {
    int bulletProofWindows;

    void remoteStartCar() {
        // this vehicle can be started by using a remote control
    }

    public void floatOnWater() {
        System.out.println("I can float!");
    }

    public void fly() {
        System.out.println("I can fly!");
    }

    repair() {
    	System.out.println("Repairing ArmoredCar");	

    }
}