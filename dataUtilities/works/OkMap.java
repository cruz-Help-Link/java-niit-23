import java.util.Map;
import java.util.HashMap;

class Contact{
	String name;
	String phoneNo;
	String email;

	 Contact(String name, String phoneNo, String email){
	 	this.name = name;
	 	this.phoneNo = phoneNo;
	 	this.email = email;
	}
}

public class OkMap {
	public static void main(String[] args) {
		HashMap<Integer, Contact> hm = new HashMap<Integer, Contact>();
		Contact chm1 = new Contact("Celestine", "234567895", "ertujb@ess.com");
		Contact chm2 = new Contact("Elestine", "234563495", "wrfhujb@ess.com");
		Contact chm3 = new Contact("Lestine", "234567995", "jhyrtfujb@ess.com");
		Contact chm4 = new Contact("Stiness ", "234561395", "seegujb@ess.com");

		System.out.println("It contains " + hm.size()+ " values");
		hm.put(12, chm1);
		hm.put(9, chm2);
		hm.put(3, chm3);
		hm.put(21, chm4);

		System.out.println("It contains " + hm.size()+ " values");
		
		System.out.println("The Objects are: " + hm);
		System.out.println("==========================");
		System.out.println(hm.size());


		for (Map.Entry<Integer, Contact> me: hm.entrySet()) {
			Contact c = me.getValue();
			System.out.println(c.name + " \t" + c.phoneNo + " \t");
		}



	}
}