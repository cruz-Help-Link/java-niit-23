public class MultiArray {
    public static void main(String[] args) {
        Integer[] a1 = { 1, 2, 3, 4, 5 };
        Integer[] a2 = { 6, 7, 8, 9, 10 };
        Integer[][] multiA = { a1, a2 };
        
        System.out.println("Using Arrays.toString(): "
                           + Arrays.toString(multiA));
        
        System.out.println("Using Arrays.deepToString(): "
                           + Arrays.deepToString(multiA));
            //    Arrays.deepToString() does not work on Primitives. Therefore whe working with it out data types will start with upper case letters. e.g int will be Integer 
    }
}
