class local{
	String name ="James";

	void display(){
		class inner{
			void print(){
				System.out.println(name);
			}
		}
		inner i = new inner();
		i.print();
	}
	public static void main(String[] args) {
		local l = new local();
		l.display();
		local.innerB inb = new local.innerB();
		inb.validate();
	}
	private static class innerB {
		int age;
		private void validate(){
			if(age < 13 && age > 35)
				System.out.println("Not allowed");
			else
				System.out.println("Done!!!");
		}
	}
}