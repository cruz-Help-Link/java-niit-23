public class GenericClassDemo <W> {
	private W din;

	public void setValue (W din) {
		this.din = din;
	}
	public W getValue() {
		return din;
	}
	public static void main(String[] args) {
		GenericClassDemo<Integer> obj = new GenericClassDemo<>();
		System.out.println(obj.setValue(100));
	}
}