import java.util.TreeMap;
import java.util.Map;


	class Contact {
		int id;
		String name;
		private String phoneNo;
		private String email;
		private String address;


		Contact(Integer id,String name, String phoneNo, String email, String address){
		 	this.id = id;
		 	this.name = name;
		 	this.phoneNo = phoneNo;
		 	this.email = email;
		 	this.address = address;
		}

		public void setId(int id) {
			this.id = id;
			}
		public void setName(String name) {
			this.name = name;
		}
		public void setPhoneNo(int id) {
			this.phoneNo = phoneNo;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	}
	public class TreeMapDemo implements Comparable {
		public static void main(String[] args) {
			TreeMap<Contact, Integer> tm = new TreeMap<Contact, Integer>();
			// Contact ctm1 = new Contact(001,"Tobenna", "234567895", "ertujb@ess.com", "No 3 close 2");
			// Contact ctm2 = new Contact(003,"obenna", "234563495", "wrfhujb@ess.com", "No 3 close 2");
			// Contact ctm3 = new Contact(002, "benna", "234567995", "jhyrtfujb@ess.com", "No 3 close 2");
			// Contact ctm4 = new Contact(004,"enna", "234561395", "seegujb@ess.com", "No 3 close 2");

				Integer itm1 = new Integer(001);
				Integer itm2 = new Integer(005);
				Integer itm3 = new Integer(002);
				Integer itm4 = new Integer(006);

			System.out.println("It contains " + tm.size()+ " values");
			System.out.println("It contains " + itm1 + " values");

			tm.put("Tobenna", "234567895", "ertujb@ess.com", "No 3 close 2", itm1);
			tm.put("obenna", "234563495", "wrfhujb@ess.com", "No 3 close 2", itm2);
			tm.put("benna", "234567995", "jhyrtfujb@ess.com", "No 3 close 2", itm3);
			tm.put("enna", "234561395", "seegujb@ess.com", "No 3 close 2", itm4);

			System.out.println("\nTreeMap after using put: " + tm );
			System.out.println("It contains  " + tm.size()+ " values after using put");

			tm.remove("benna", "234567995", "jhyrtfujb@ess.com", "No 3 close 2");
			tm.remove("enna", "234561395", "seegujb@ess.com", "No 3 close 2");


			System.out.println("\nTreeMap after using remove: " + tm );
			System.out.println("It contains  " + tm.size()+ " values after using remove");
			
			


				for (Map.Entry<Contact, Integer> me: tm.entrySet()) {
				Contact c = me.getValue();
				System.out.println(+ c.id + "\t" + c.name);
				}

			// Contact ct = new Contact();
			// System.out.println(ct.Display());
		}
	}

