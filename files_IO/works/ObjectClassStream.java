import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectClassStream {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("write.txt");
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("write.txt"));
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeBoolean(false);
            output.writeUTF("Java is an OOP");
            output.writeFloat(23.67478f);
            output.flush(); //output the stream

            System.out.println(input.readBoolean() + " " + input.readUTF() + " " + input.readFloat());

            byte[] buff = new  byte[30]; //array to hold write
            input.read(buff, 0, 25); // to read from write method
            System.out.println("Write values --->");
            for (int i = 0; i < buff.length; i++) {
                System.out.println((char)buff[i]); //casting to char
            }
        } 
        catch (Exception e) {
        }
    }
}
