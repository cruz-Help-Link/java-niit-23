public class ShadowTin {

    public int x = 0;

    class FirstClass {

        public int x = 1;

        void methodInFirst(int x) {
            System.out.println("x = " + x);
            //refer to the member variable of the inner class..
            System.out.println("this.x = " + this.x);
            //refer to the member variable of the outer class..
            System.out.println("ShadowTest.this.x = " + ShadowTin.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTin st = new ShadowTin();
        ShadowTin.FirstClass fl = st.new FirstClass();
        fl.methodInFirst(23);
    }
}