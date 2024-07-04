import java.io.*;

public class ObjectStreamExample {
    public static void main(String[] args) {
        // Create some Person objects
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Serialize the objects to a file
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("people.ser"))) {
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the objects from the file
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("people.ser"))) {
            Person deserializedPerson1 = (Person) objectInputStream.readObject();
            Person deserializedPerson2 = (Person) objectInputStream.readObject();

            System.out.println("Deserialized Person 1: " + deserializedPerson1);
            System.out.println("Deserialized Person 2: " + deserializedPerson2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
