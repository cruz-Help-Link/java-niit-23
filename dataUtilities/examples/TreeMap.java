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
	public class TreeMap {
		public static void main(String[] args) {
			TreeMap<Integer, Contact> tm = new TreeMap<Integer, Contact>();
			Contact ctm1 = new Contact(001,"Tobenna", "234567895", "ertujb@ess.com", "No 3 close 2");
			Contact ctm2 = new Contact(003,"obenna", "234563495", "wrfhujb@ess.com", "No 3 close 2");
			Contact ctm3 = new Contact(002, "benna", "234567995", "jhyrtfujb@ess.com", "No 3 close 2");
			Contact ctm4 = new Contact(004,"enna", "234561395", "seegujb@ess.com", "No 3 close 2");

			System.out.println("It contains " + tm.size()+ " values");
			System.out.println("It contains " + ctm1 + " values");

			tm.put(010, ctm1);
			tm.put(011, ctm2);
			tm.put(012, ctm3);
			tm.put(013, ctm4);

			System.out.println("\nTreeMap after using put: " + tm );
			System.out.println("It contains  " + tm.size()+ " values after using put");

			tm.remove(010);
			tm.remove(012);


			System.out.println("\nTreeMap after using remove: " + tm );
			System.out.println("It contains  " + tm.size()+ " values after using remove");

				for (Map.Entry<Integer, Contact> me: tm.entrySet()) {
				Contact c = me.getValue();
				System.out.println(+ c.id + "\t" + c.name);
				}

			// Contact ct = new Contact();
			// System.out.println(ct.Display());
		}
	}

