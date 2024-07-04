public class FirstClass {
    public static void main(String[] args) {
        float f = 34.6f;
        System.out.println(Float.MIN_VALUE); //prints: 1.4E-45 
        System.out.println(Float.MAX_VALUE); //prints: 3.4028235E38 
        System.out.println(Double.MIN_VALUE); //prints: 4.9E-324 
        System.out.println(Double.MAX_VALUE);
        System.out.println(f);


// double type. But we were able to cast them to the float type
double n = 356.893d;
        float x = (float)n; 
        System.out.println(x);
        float y = (float)42.3D;

        // System.out.println("Hi people, welcome to \"Java 12\".");
        // System.out.println("Good Morning! \n How are you all?  ");

    // This \r escape sequence is a carriage return character 
// It moves the output point back to the beginning of the line without moving down a line (usually).
    System.out.println("Good Morning! \r How are you all?  ");

        // It is an old technique and used to indicate a page break.
    System.out.println("Good Morning! \f How are you all?  ");

    System.out.println("Good Morning \'Peeps!\' How are you all?  ");

    // for printing a backslash
    System.out.println("\\- this is a backslash. ");
   
    }
}
