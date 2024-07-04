
// Java Program to show the demonstration of
// Collection.stream().forEach()
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.ListIterator;

class StreamList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(32);
        list.add(41);
        list.add(19);
        list.add(25);
        // printing each element of list using forEach loop
        list.stream().forEach(System.out::print);

        LinkedList<String> facts = new LinkedList<>();

        // Add elements in LinkedList
        facts.add("Name");
        facts.add("Status");
        facts.add("Position");

        // Create an object of ListIterator
        ListIterator<String> listIterate = facts.listIterator(); // connecting the list to the cursor
        System.out.print("LinkedList: ");

        while (listIterate.hasNext()) { // forward iteration
            System.out.print(listIterate.next());
            System.out.print(", ");
        }

        // Iterate backward
        System.out.print("\nReverse LinkedList: ");

        while (listIterate.hasPrevious()) { // backward iteration
            System.out.print(listIterate.previous());
            System.out.print(", ");
        }

        List<String> order = new ArrayList<String>();
        order.add("a");
        order.add("b");
        order.add("c");

        List<String> fix = new ArrayList<String>();

        fix.addAll(order);
        fix.addAll(facts);

        // List<String> fix = ListUtils.union(order, facts); //using union
        // List<String> fix2 = Stream.concat(order.stream(),
        // facts.stream()).collect(Collectors.toList()); //using Stream..

        System.out.println("Order List-------- " + order);

    }
}
