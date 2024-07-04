import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;
public class CreateFile {
    File file = new File("filename.txt");

    public static void main(String[] args) {
        CreateFile cf = new CreateFile();
        cf.intro();
    }

    void intro() {
        int num = 1, nums = 2, numss = 3;
        int option;
        System.out.print("Would you like to:");
        System.out.println(num + " " + "Read the file");
        System.out.println(nums + " " + "Write in file");
        System.out.println(numss + " " + "Delete the file");

        Scanner sc = new Scanner(System.in);
        option=sc.nextInt();
        switch (option) {
            case 1:
                readFile();
            break;
            case 2:
                writeFile();
            break;
            case 3:
                deleteFile();
            break;
        
            default: System.out.println("Invalid Input");
            addArray();
                break;
        }

    }

    void readFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    void writeFile() {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Files in Java might be tricky, but it is fun enough!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    void deleteFile() {
        if (file.delete()) { 
        System.out.println("Deleted the file: " + file.getName());
        } else {
        System.out.println("Failed to delete the file.");
        } 
    }

    void addArray() {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0; int i; 

// Loop through array elements and store the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("The sum is: " + sum);
    }
}