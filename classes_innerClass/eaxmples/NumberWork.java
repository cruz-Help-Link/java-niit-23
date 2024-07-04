public class NumberWork {
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];
	public NumberWork() {
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i; //fill the array
		}
	}
	private class InnerEvenIterator {
		private int next = 0; // Begin at the start of the array.
		public boolean hasNext() {
			return (next <= SIZE - 1);
		}
		public int getNext() {
			int retValue = arrayOfInts[next];
			next += 2;
			return retValue;
		}
	}
	public static void main(String s[]) {
		NumberWork nw = new NumberWork();
		InnerEvenIterator iterator = nw.new InnerEvenIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext() + " ");
		}
	}
}