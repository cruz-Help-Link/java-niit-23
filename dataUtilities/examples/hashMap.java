import java.util.HashMap;
import java.util.NavigableSet;
import java.util.TreeSet;

// Contact class
class Contact {
	String name;
	String phoneNo;
	String email;

	// Contact constructor
	 Contact(String name, String phoneNo, String email){
	 	this.name = name;
	 	this.phoneNo = phoneNo;
	 	this.email = email;
	}
}

public class hashMap {
	public static void main(String[] args) {
		HashMap<String, Contact> hm = new HashMap<String, Contact>();
	//VALUES
		Contact chm1 = new Contact("Celestine", "234567895", "arm@raid.com");
		Contact chm2 = new Contact("Elestine", "234563495", "ryijyv@raid.com");
		Contact chm3 = new Contact("Lestine", "234567995", "gt6yub@raid.com");
		Contact chm4 = new Contact("Stine", "234561395", "frtyuj@raid.com");

		System.out.println("It contains" + hm.size()+ "values");
		//MAPPING KEY TOO VALUES
			hm.put("arm", chm1);
			hm.put("nice", chm2);
			hm.put("mean", chm3);
			hm.put("cell", chm4);			
		System.out.println("It contains" + hm.size()+ "values");
		
		System.out.println("The Objects are: " + hm);
		System.out.println("==========================");
		System.out.println(hm.size());


		for (HashMap.Entry<String, Contact> me: hm.entrySet()) {
			Contact c = me.getValue();
			System.out.println(c.name + " \t" + c.phoneNo + " \t");
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