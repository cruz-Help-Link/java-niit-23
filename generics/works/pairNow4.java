public class pairNow4<T1, T2> {
	private T1 first;
	private T2 second;

	public void display(T1 first, T2 second) {
		this.first = first;
		this.second = second;
	}

	public T1 getFirst() {
		return first;
	}

	public T2 getSecond() {
		return second;
	}

	public static void main(String[] args) {
		pairNow4<Integer, String> obj = new pairNow4<>();
		obj.display(10, "Hello");
		System.out.println(obj.getFirst());
		System.out.println(obj.getSecond());
	}
}
