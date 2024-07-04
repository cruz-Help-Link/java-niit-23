import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class CollectionsListDemo {
	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
		myList.add("Smith");
		myList.add("Harry");
		// myList.add(new Integer(100))
		myList.add("Hadil");
		// Iterator iterator=myList.iterator();
		// while(iterator.hasNext()){
		// System.out.println(iterator.next());
		// }
		// for(String eachObject:myList){
		// System.out.println(eachObject);
		// }
		// myList.forEach(eachObject->System.out.println(eachObject));
		List<String> myList2=new ArrayList<String>();
		myList2.add("Peter");
		myList2.addAll(myList);
		myList2.forEach(eachObject->System.out.println(eachObject));

		Collection<String> c = List.of("name", "age");
		System.out.println(c);

		Collection<String> co = Set.of("name", "age");
		System.out.println(co);

		}
}
