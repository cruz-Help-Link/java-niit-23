import java.util.ArrayDeque;

public class ArrayDequeDemo{
	public static void main(String[] args) {
		ArrayDeque<Double> ad = new ArrayDeque<>();
		Double dad1 = new Double(7.5);
		Double dad2 = new Double(8.5);
		Double dad3 = new Double(9.5);
		Double dad4 = new Double(10.5);
		System.out.println("Size of the ArrayDeque is : " + ad.size());

		ad.add(dad3);
		ad.add(dad1);
		System.out.println("\n ArrayDeque after adding the objects: " + ad);
		System.out.println("Size of ArrayDeque after adding the objects: " + ad.size());

		ad.addFirst(dad4);
		ad.addFirst(dad2);

		System.out.println("\n ArrayDeque after adding the objects at first and last: " + ad);
		System.out.println("\n ArrayDeque after adding the objects at first and last: " + ad.size());

		ad.removeFirst();

		System.out.println("\n ArrayDeque after removing the objects at first and last: " + ad);
		System.out.println("\n ArrayDeque after removing the objects at first and last: " + ad.size());


// tghrjjx yueuj thhe rhjdf uwegdj the boy was fine until his sister shot him and now she lies about knowing anything about it



	}
}