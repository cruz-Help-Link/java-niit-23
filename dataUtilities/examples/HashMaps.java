import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;

public class HashMap {

	public static void main(String[] args)
	{
		// Create an empty hash map by declaring object
		// of string and integer type
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		Integer i = new Integer(21);
		Integer j = new Integer(21);
		Integer k = new Integer(21);
		Integer l = new Integer(21);

		map.put("AGE", i);
		map.put("AGE", j);
		map.put("AGE", k);
		map.put("AGE", l);

		// Adding elements to the Map
		// using standard put() method
		map.put("Munirat", 18);
		map.put("Chinedu", 30);
		map.put("Chinedu", 20);

		// Print size and content of the Map
		System.out.println("Size of map is:- " + map.size());

		// Printing elements in object of Map
		System.out.println(map);

		// Checking if a key is present and if
		// present, print value by passing
		// random element
		if (map.containsKey("Munirat")) {

			// Mapping
			Integer a = map.get("Munirat");

			// Printing value for the corresponding key
			System.out.println("value for key" + " \"Munirat\" is:- " + a);
		}

		NavigableSet<String> ts = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts.add("A"); 
        ts.add("B"); 
        ts.add("C"); 
        ts.add("B"); 
        ts.add("D"); 
        ts.add("E"); 
  
        System.out.println("Initial TreeSet " + ts); 
  
        // Removing the element b 
        ts.remove("B"); 
  
        System.out.println("After removing element " + ts); 
  
        // Remove the First element of TreeSet 
        ts.pollFirst(); 
  
        System.out.println( 
            "After the removal of First Element " + ts); 
  
        // Remove the Last element of TreeSet 
        ts.pollLast(); 
  
        System.out.println( 
            "After the removal of Last Element " + ts); 
	}

}