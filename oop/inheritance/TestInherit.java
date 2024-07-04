class JeepInherit {
    // the Jeep class has two fields
    public int gear;
    public int speed;

    // the Jeep class has one constructor
    public JeepInherit(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Jeep class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Jeep
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of Jeep is " + speed);
    }
}

// derived class
class Pajero extends Jeep {

    // the Pajero subclass adds one more field
    public int seatHeight;

    // the Pajero subclass has one constructor
    public Pajero(int gear, int speed, int noSeats) {
        // invoking base-class(Jeep) constructor
        super(gear, speed);
        seatHeight = noSeats;
    }
    public void noSeats(int newValue) {
        noSeats = newValue;
    }

    // overriding toString() method of Jeep to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + noSeats);
    }
}

public class TestInherit {
    public static void main(String args[]) {
        JeepInherit p = new Pajero(3, 100, 5);
        p.toString();
    }
}
