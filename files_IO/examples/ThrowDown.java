// Java Program to Illustrate Checked Exceptions
// Where FileNotFoundException does not occur

// Importing I/O classes
import java.io.*;
import java.io.FileInputStream;


// Main class
class ThrowDown {
    // String names = "C:\\Java\\ClassFile\\word.txt";

    public static void writeToFile() 
    // Optional<FileInputStream> fis =
    //      names.stream().filter(name -> !isProcessedYet(name))
    //                    .findFirst()
    //                    .map(name -> new FileInputStream(name));
 
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Java\\ClassFile\\word.txt"));
            bw.write("Test me oh lord");
            bw.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("well well");
        }
        //    new ThrowThrowsDemo().myMethod();
    }
    // Main driver method
    public static void main(String[] args)
            throws IOException {
                writeToFile();

        // Creating a file and reading from local repository
        FileReader file = new FileReader("C:\\Java\\ClassFile\\word.txt");

        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file
        for (int counter = 1; counter < 2; counter++)
            System.out.println(fileInput.readLine());

        // Closing all file connections
        // using close() method
        // Good practice to avoid any memory leakage
        fileInput.close();
        
    }
    // public void name() {
    //     try(FileInputStream fis = new FileInputStream("C:\\Java\\ClassFile\\word.txt")){
    //         byte buff[] = new byte[150];
    //         fis.read(buff,0,150);
    //         String bufferString = new String(buff);
    //         System.out.println(bufferString);
    //         }
    //         catch(Exception e){
    //         System.out.println("Exception Occured:::"+e.getMessage());
    //         }
    //  }

}
