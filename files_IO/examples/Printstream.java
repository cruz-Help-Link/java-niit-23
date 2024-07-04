import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;

//Java program to demonstrate PrintStream methods 
class Printstream {
    public static void main(String args[]) throws FileNotFoundException {
        try {
        // creating Printstream obj
        PrintStream out = new PrintStream(System.out);
        String s = "Java";
        // writing to file.txt
        char c[] = { 'J', 'A', 'V', 'A' };
        // illustrating print(boolean b) method
        out.print(true);
        // illustrating print(int i) method
        out.print(1);
        // illustrating print(float f) method
        out.print(4.533f);
        // illustrating print(String s) method
        out.print("Java is a Programming Language");
        out.println();
        // illustrating print(Object Obj) method
        // out.print();
        out.println();
        // illustrating append(CharSequence csq) method
        out.append("Java");
        out.println();
        // illustrating checkError() method
        out.println(out.checkError());
        // illustrating format() method
        out.format(Locale.UK, "Welcome to my %s program", s);
        // illustrating flush method
        out.printf("This is %s class", s); 
        out.flush();
        // illustrating close method

        byte b[] = {65, 66, 67, 68, 69, 70, 71}; 
        out.write(b, 0, 3); 
          
        // flush the stream 
        out.flush(); 
          
        out.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
