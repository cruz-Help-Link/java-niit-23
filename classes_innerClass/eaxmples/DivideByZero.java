public class DivideByZero { //Outer Class --non-static

        String msg = "Get Out of Here Now";

        static void getHelp() { //Static method
            System.out.println("Get Help");
        }
        void getNeed() {
            System.out.println("Get Need");
        }

    public class InnerDivideByZero { //Inner class 1 non-static
        void getOut() {
            System.out.println("GET OUT" + msg);
        }
        
    }
    public static class InnerStatic { // Static Inner class 2
        void getIn() {
            // System.out.println(msg);
            getHelp();
            // getNeed();
        }
        

    }
    public static void main(String[] args) { //  Main Driver --static method
        int up = 10;
        int down = 0;
        int result = up / down;

        System.out.println(result);

        DivideByZero dzz = new DivideByZero();
        dzz.getNeed();
        DivideByZero.InnerDivideByZero ret = dzz.new InnerDivideByZero(); // non-static
        DivideByZero.InnerStatic tst = new DivideByZero.InnerStatic(); //static
        getHelp();
        tst.getIn(); // static
        ret.getOut(); // non-static
    }
}

