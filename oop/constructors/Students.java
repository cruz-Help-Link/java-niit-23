
public class Students {
    // THIS has one argument
    Students(String name) {
        System.out.println("Constructor with one "
                + "argument - String : " + name);
    }

    // THIS has two arguments
    Students(String name, int age) {

        System.out.println("Constructor with two arguments : "
                + " String and Integer : " + name + " " + age);
    }

    // THIS has one argument but different parameter than previous..
    Students(long id) {
        System.out.println("Constructor with one argument : "
                + "Long : " + id);
    }
    // }

    public void arrayMethod() {
        // vari-name = new type [size];
        // int intArray[];    //declaring array
        // intArray = new int[20]; //allocation of memory space

        String names [] = {"Jenny", "Zenny", "Lenny", "Benny", "Penny"};

        // String[] names = new String[5]; //initialization
        //giving values
        // names[0] = "Jenny";
        // names[1] = "Zenny";
        // names[2] = "Lenny";
        // names[3] = "Zenny";
        // names[4] = "Zenny";
        System.out.println(names[0]);
        // The index begins with 0 and ends at (total array size)-1 i.e less than array length
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
          }
        //   For Each..
          for (String i : names) {
            System.out.println(i);
          }
        namesPrint(names);

    }
    public void namesPrint(String names []) {
        String one;
        for (int i = 0; i < arr.length; i++)
            one += names[i];
 
        System.out.println("Print names " + one);
    }
    public void arrayMethod(int num) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // WHAT WILL BE THE OUTPUT
// TO LOOP through a multidimensional array.. 
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
          }
    }

    // class GFG {
    public static void main(String[] args) {
        // Creating the objects of the class named 'Students'
        // by passing different arguments
        Student[] arr = new Student[5];
        // Call the constructor with one argument of
        // type 'String'.
        Students Students2 = new Students("Cuberbatch");

        // Call the constructor with two arguments
        Students Students3 = new Students("Hemsworth", 36);

        // Call the constructor with one argument of
        // type 'Long'.
        Students Students4 = new Students(24823198);
    }
}