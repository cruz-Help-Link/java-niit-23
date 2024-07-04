import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CompComparator {
    public static void main(String[] args) {
        List<String> list = List.of("solve", "glove", "plove");
        ListIterator<String> it = list.listIterator();


        while (it.hasNext()) {
            System.out.print(it.next() + " \n");
        }
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }

        
        List list1 = Arrays.asList("s1","s2", "r4");  

        List list2 = Arrays.asList("s3", "s4", "s5", "s7"); 
        
        Collections.copy(list2, list1);  //copy list1 into list2
        System.out.println(list2); // "s1","s2", "r4", "s7"
        Collections.sort(list2); 
        System.out.println(list2); 

        // USING COMPARABLE - compareTo() // comparing itself with another

        String str_Sample = "a";
        System.out.println("\nCompared to 'a' z is : " + str_Sample.compareTo("z")); // 1 - 26
        str_Sample = "b";
        System.out.println("Compared to 'b' a is : " + str_Sample.compareTo("a")); // 2 -1
        str_Sample = "b";
        System.out.println("Compared to 'b' b is : " + str_Sample.compareTo("b"));  // 2  - 2

        String see = "the", now = "con";  // t = 20, c = 3; 20 -3 = -
        System.out.println("compared " + now.compareTo(see));

        // USING COMPARARTOR - Compare()  //comapering 2
        int x = 20;
        int y = 30;
        // as 20 less than 30,
        // Output will be a value less than zero
        System.out.println("Value comparing x and y " + 
        Integer.compare(x, y)); // 20 -30 = -
        int p = 40;
        int q = 40;
        // as 30 equals 30,
        // Output will be zero
        System.out.println("Value comparing p and q " + Integer.compare(p, q));  // 20 - 7 = +
        int r = 20;
        int s = 7;
        // as 15 is greater than 8,
        // Output will be a value greater than zero
        System.out.println("Value comparing r and s " + Integer.compare(r, s));
    }
}
