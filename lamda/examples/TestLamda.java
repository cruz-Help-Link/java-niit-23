//Java lambda functions can be only used with functional interfaces.

public class TestLamda {
    // interface operation using lambda expressions..
    interface FuncInter1 {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions
    // above
    interface FuncInter2 {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String args[]) {
        // lambda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'FuncInter1' interface
        FuncInter1 add = (int x, int y) -> x + y;

        // lambda expression multiplication.. This expression also implements'FuncInter1' interface
        FuncInter1 multiply = (int x, int y) -> x * y;

        // Creating an object of class to call operate using
        // different implementations using lambda
        // Expressions
        TestLamda tobj = new TestLamda();

        // Add two numbers using lambda expression
        System.out.println("Addition is " + tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is "+ tobj.operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        FuncInter2 fobj = message -> System.out.println("Hello " + message);
        fobj.sayMessage("DumbSss");
    }
}
