// Interface
interface Age {
    int x = 21;

    void getAge();
}

// Main class
class AnonymousDemo{

    public static void main(String[] args) {

        // Anonymous...
        Age oj1 = new Age() {

            @Override
            public void getAge() {
                // printing age
                System.out.print("Age is " + x);
            }
        };

        oj1.getAge();
    }
}
