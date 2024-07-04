import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadFileIntoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("C:\\Java\\ClassFile\\word.txt"));
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("WORKING!!!");
        }
    }
}
