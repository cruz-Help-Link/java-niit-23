/**
 * InnerInheritVehicle
 */
public interface InnerInheritVehicle {

    public void getName();
    
}

class Vehicle {
    int powerOfEngine;
    int weight;

    int calculateSpeed(int powerOfEngine, int weight) {
        int speed = weight/powerOfEngine;
        return speed;
    }
}
class Car extends Vehicle{
    int numberOfSeats;
    int calculateSpeed() {
        int speed = numberOfSeats/powerOfEngine;
        return speed;
    }
    softShockAbsorbtion() {
        System.out.println("Shock Absorption");
    }
}
class Truck extends Vehicle{
    int payload;
    calculateSpeed() {
        int speed = payload/powerOfEngine;
        return speed;
    }
    hardShockAbsorbtion() {
        System.out.println("Shock Absorption");
    }
}

class InheritVehicle {
    public static void main(String[] args) { 
        Vehicle c = new Car();
        c.softShockAbsorbtion();
        Vehicle v = new Vehicle();
        v.calculateSpeed(10, 90);  
    }
}