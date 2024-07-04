class Test {

    public void silly() {
        int intArray[] = { 1, 2, 3 };
 
        int cloneArray[] = intArray.clone();
 
        // will print false as deep copy/ clone array is a copy of the one-dimensional array
        System.out.println(intArray == cloneArray);
 
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }

        // int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };
 
        // int cloneArray[][] = intArray.clone();
 
        // // will print false
        // System.out.println(intArray == cloneArray);
 
        // // will print true as shallow copy is created
        // // i.e. sub-arrays are shared
        // System.out.println(intArray[0] == cloneArray[0]);
        // System.out.println(intArray[1] == cloneArray[1]);
    }
    public static void main(String args[]) {
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];

        // array of Strings
        String[] strArray = new String[3];
        // the run-time type signature for the class object in int
        System.out.println(intArray.getClass());
        // THIS will give us The only direct superclass of an array type is java.lang.Object.
        System.out.println(intArray.getClass().getSuperclass());
        // the run-time type signature for the class object “array with component type byte.”
        System.out.println(byteArray.getClass());
        // the run-time type signature for the class object in short
        System.out.println(shortsArray.getClass());
        // the run-time type signature for the class object “array with component type of a Class.”
        System.out.println(strArray.getClass());
    }
}