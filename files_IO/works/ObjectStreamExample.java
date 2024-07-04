import java.io.*;
import java.util.Scanner;

// Create a simple class to be serialized
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
       

        // Create a Student object
        Student student = new Student("Promise", 20);

        // Serialize the object to a file
//         try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(student))) {
//             objectOutputStream.writeObject(student);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // Deserialize the object from the file
//         try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(student))) {
//             Student deserializedStudent = (Student) objectInputStream.readObject();

//             System.out.println("Deserialized Student: " + deserializedStudent);
//         } catch (IOException | ClassNotFoundException e) {
//             e.printStackTrace();
//         }
    }
}
