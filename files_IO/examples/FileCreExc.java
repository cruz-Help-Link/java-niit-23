import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreExc {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Java\\words.txt");
            if (file.createNewFile()) {
                System.out.println("File created--------- " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Invalid Response");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("C:\\Java\\words.txt");
            myWriter.write("Comments make your code understandable");
            myWriter.close();
            System.out.println("Pen to Paper");
        } catch (Exception e) {
            System.out.println("Invalid Response");
            e.printStackTrace();
        }
    }
}