import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectsExec {
    public static void main(String[] args) {
        int data1 = 5;
        String data2 = "Object Stream";

        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream("file.txt");
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            //Using the readInt() method
            System.out.println("Integer data : " + objStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
    // try (Reader reader = new FileReader("words.txt")) {
    //     int c;
    //     while ((c = reader.read()) != -1) {
    //         System.out.print((char) c);
    //     }
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }
    // try (Writer writer = new FileWriter("words.txt")) {
    //     writer.write("Comments can also make your word look sloppy");
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }
    
    
}
