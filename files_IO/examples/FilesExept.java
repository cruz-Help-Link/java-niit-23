
// Main class

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FilesExept {

    // Main driver method
    public static void main(String[] args) 
        throws IOException{

        // Reading file from path in local directory
        // try {
        FileReader file = new FileReader("C:\\Java\\words.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++){
            System.out.println(fileInput.readLine());
         } //catch (Exception e) {
        //     // TODO: handle exception
        // }

        // Closing file connections
        // using close() method
        fileInput.close();
    }
}
