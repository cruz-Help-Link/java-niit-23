class MainThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("The current Thread: " + t);
		t.setName("MainThread");
		System.out.println("The current Thread name has been changed " + t);

		System.out.println("The current Thread is going to sleep for 10 seconds");
		try{
			t.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		boolean c;
		c =t.isAlive();
		System.out.println("The current Thread: " + c);

		System.out.println("After 10 seconds .......... " + t + " is existing now");

	}
}