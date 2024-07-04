// Java program to create Stream from Collections 

import java.util.*;
import java.util.stream.Stream;

class GetStreams {

    // Function convert a List into Stream
    private static <T> void getStream(List<T> list) {

        // Create stream object with the List
        Stream<T> stream = list.stream();

        // Iterate list first to last element
        Iterator<T> it = stream.iterator();

        // Iterate stream object
        while (it.hasNext()) {
            System.out.print(" yo" + it.next() + " " );
            

        }
        
    }

    private static <T> void getArray(T[] arr) {
        // Create stream from an array 
        // using Stream.of() 
        Stream<T> streamOfArray = Stream.of(arr); 
    
        // Iterate list first to last element 
        Iterator<T> it = streamOfArray.iterator(); 
    
        // Iterate stream object 
        while (it.hasNext()) { 
            System.out.print(it.next() + " "); 
        } 
        
    }

    private static <T> void getBuiildStream() 
    { 
  
        // Create stream using Stream builder() 
        Stream.Builder<String> builder = Stream.builder(); 
  
        // Adding elements in the stream of Strings 
        Stream<String> stream = builder
                                    .add("m") 
                                    .add("c") 
                                    .add("f") 
                                    .build(); 
  
        // Iterate list first to last element 
        Iterator<String> it = stream.iterator(); 
  
        // Iterate stream object 
        while (it.hasNext()) { 
            System.out.print(it.next() + " "); 
        } 
    } 

    private static <T> voidgetItStream(int seedValue, int limitValue) 
    { 
        // using Stream.iterate() method 
        Stream.iterate(seedValue, (Integer n) -> n * n) 
            .limit(limitValue) 
            .forEach(System.out::println); 
    } 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        String first = sc.nextLine();
        System.out.println("Enter second value: ");
        String sec = sc.nextLine();
        System.out.println("Enter third value: ");
        String third = sc.nextLine();

         // Create ArrayList of String
        List<String> list = new ArrayList<>();

        // Add element in list
        list.add(first);
        list.add(sec);
        list.add(third);

        // Get the Stream from the List
        getStream(list);
        String[] arr = new String[] { "m", "c", "f" }; 

        // Get the Stream from the Array 
        getArray(arr);
        getBuiildStream();

        int seedV = 2; 
        int limitV = 5; 
        // Get the Stream from the function 
        getStream(seedV, limitV); 
    }
}
