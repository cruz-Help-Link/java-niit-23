import java.io.FileInputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Java\\words.txt")) {
            byte buff1[] = new byte[150];
            fis.read(buff1, 0, 150);
            String bufferString = new String(buff1);
            System.out.println(bufferString);
        } catch (Exception e) {
            System.out.println("Exception Occured:::" + e.getMessage());
        }
    }
}
