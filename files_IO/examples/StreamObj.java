import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StreamObj {
    public static void main(String[] args) {
		try {
        // create a new file with an ObjectOutputStream and ObjectInputStream
		FileOutputStream file = new FileOutputStream("write.txt");
		
		ObjectOutputStream output = new ObjectOutputStream(file);
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("write.txt"));

		// Methods covered in later
		output.writeBoolean(true);
		output.writeUTF("Java is an OOP");
		output.flush(); //outputs write

		System.out.println("Boolean value ---> " + input.readBoolean());
		System.out.print("Read value--->  ");
        byte[] buffer = new byte[30]; //byte array
 
        // Use of read(byte[] buffer, int offset, int maxlen)
        // input.read(buffer, 0, 30);
        input.read(buffer, 0, 30);
        
        System.out.print("Use of read ---> ");
        for (int i = 0; i < 29; i++)
        {
            System.out.print((char)buffer[i]);
        }

        output.writeChar('J');
        output.writeByte('J');
        output.writeDouble(00436754746);
        output.writeFloat(43.78917f);
        output.writeInt(3576);
        output.writeLong(674993729);
 
        output.flush();
 
        // Use of readChar()
        System.out.println("Use of readChar() : " + input.readChar());
        // Use of readByte() :
        System.out.println("Use of readByte() : " + input.readByte());
        // Use of readDouble() :
        System.out.println("Use of readDouble() : " + input.readDouble());
        // Use of readFloat() :
        System.out.println("Use of readFloat() : " + input.readFloat());
        // Use of readInt() :
        System.out.println("Use of readInt() : " + input.readInt());
        // Use of readLong() :
        System.out.println("Use of readLong() : " + input.readLong());

        output.writeByte(111);
        output.writeShort(121212);
        output.flush();
 
        // Use of readUnsignedByte()
        System.out.println("readUnsignedByte() : " + input.readUnsignedByte());
 
        // Use of readUnsignedShort() :
        System.out.println("readUnsignedShort() : " + input.readUnsignedShort());

        
    }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}
