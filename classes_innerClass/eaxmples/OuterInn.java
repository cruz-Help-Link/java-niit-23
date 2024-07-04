class Outers {
   
    class Inners {
        void show() {
            System.out.println("inner show");
        }
    }

    class OuterInn {

        public static void main(String[] args) {
    
            // Note how inner class object is created inside
            // main()
            Outers.Inners in = new Outers().new Inners();
            // Outers outer = new Outers();
            // outer.show();
    
            // Calling show() method over above object created
            in.show();
        }
    }
}