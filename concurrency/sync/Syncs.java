class Me {
	public synchronized void doSth() {
		try {
			for (int i =1;i <=5 ;i++ ) {
				System.out.println("Stand" +i);
				Thread.sleep(100);
			}
			}catch (InterruptedException ie) {
				System.out.println("Who woke me?");
			}
		}
	}

class Test extends Thread {
	Me m;
	Test(Me m) {
		this.m= m;

	}

	@Override
	public void run() {
		m.doSth();
	}
}

class Syncs {
	public static void main(String[] args) {
		Me m = new Me();
		Test t = new Test(m);
		Test t1 = new Test(m);
		t.start();
		t1.start();
	}
}