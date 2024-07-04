public class nonGen {
	public <w> w display(w value){
		return value;
	}
	public static void main(String[] args) {
		nonGen n = new nonGen();
		
		System.out.println(n.display(200));
		System.out.println(n.display("Yes"));
		System.out.println(n.display(true));
		System.out.println(n.display(17.5));



	}
}