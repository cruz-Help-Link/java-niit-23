// import java.io.FileInputStream;

// public class FileReadingDemo {
// public static void main(String[] args) {
// try {
// FileInputStream fis = new FileInputStream("c:\\java12\\Demo.txt");
// int available = fis.available();
// System.out.println("Available Bytes"+available);
// byte buff[] = new byte[available];
// fis.read(buff,0,available);
// String word=new String(buff);
// System.out.println(word);
// fis.close();
// }catch(Exception e){
// System.out.println(e.getMessage());
// }
// }

import java.io.FileInputStream;
import java.io.IOException;

// the FileInputStream class to read data from a file
public class FileInputStreamExample {
    public static void main(String[] args) {
        // Specify the path to the file you want to read
        String filePath = "C:\\Java\\write.txt";
        int data;

        // Create a FileInputStream
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int availableT = fileInputStream.available(); //counting the number bytes that can be read from this input stream
            System.out.println("Available Bytes " + availableT);
            // Read and print the contents of the file
            // int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data); 
            }

            System.out.println(" ");
            FileInputStream fis = new FileInputStream("C:\\Java\\write.txt");

            int availableBty = fis.available(); //counting the number bytes that can be read from this input stream 120
            System.out.println("Available Bytes"+availableBty);
            byte buff[] = new byte[availableBty]; //holds bytes

            fis.read(buff,0,availableBty); //reads the bytes of data from this input stream into an array of bytes
            String str = new String(buff); //converting byte to string
            System.out.println(str);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
