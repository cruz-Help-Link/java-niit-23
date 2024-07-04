import java.io.*;
import java.util.*;

class CollectionDemo {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector(); // initailisation of Vector
        Hashtable<Integer, String> h = new Hashtable();

        // Adding the elements into the
        // vector
        v.addElement(1);
        v.addElement(2);
        Collection<Integer> cll = List.of(2, 23, 34);
        Iterable<String> it = List.of("354", "tyuj");

        cll.add(null);
        // Adding the element into the
        // hashtable
        h.put(100, "Java");
        h.put(200, "Python");

        // Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accessing the first element of the
        // array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()
    }
}
