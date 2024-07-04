/**
 * InnerMainAnimal
 */
public interface InnerMainAnimal {
    void getAnimal();
}

class Animal implements InnerMainAnimal{ // Superclass (parent)
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal { // Subclass (child) INHERITANCE
    public void animalSound() {
        super.animalSound(); // Call the superclass method OVERRIDDING
        System.out.println("The dog says: rah rah"); 
    }
}
// MAIN CLASS
public class MainAnimal {
    public static void main(String args[]) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.animalSound();
    }
}