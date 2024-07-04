// Java program to Remove an Element from
// Collection using Iterator

import java.util.ArrayList;
import java.util.Iterator;

class RetrieveList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i <= 1000; i = i + 5) {
            if (i%3 == 2) {
                l.add(i);
            }
        }

        Iterator<Integer> itr = l.iterator(); //cursor

        System.out.println("List before removal");

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }

        while (itr.hasNext()) {  //iterator method hasNext() to iterate over the elements of the list
            if (itr.next() % 2 == 1)
                itr.remove();
        }

        System.out.println("\nList after removal");

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }

}
