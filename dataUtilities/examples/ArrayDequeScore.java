import java.util.ArrayDeque;

class ArrayDequeScore {
	public static void main(String[] args) {
		ArrayDeque<Double> ad = new ArrayDeque<>();
		Double plt = new Double(78.5);
		Double sql = new Double(45.7);
		Double python = new Double(65);
		Double html = new Double(72.3);
		Double junit = new Double(85);

		ad.add(plt);
		ad.add(sql);

		System.out.println("\n ArrayDeque after adding the objects: " + ad);
		System.out.println("Size of ArrayDeque after adding the objects: " + ad.size());

		ad.addFirst(html);
		ad.addLast(python);

		System.out.println("\n ArrayDeque after adding the objects: " + ad);
		System.out.println("Size of ArrayDeque after adding the objects: " + ad.size());

		ad.addLast(java);
		ad.removeFirst();

		System.out.println("\n ArrayDeque after adding the objects: " + ad);
		System.out.println("Size of ArrayDeque after adding the objects: " + ad.size());

	}
}