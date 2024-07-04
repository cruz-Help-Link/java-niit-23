import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockD implements Runnable {
	final Lock lock = new ReentrantLock();
	String name;
	Thread t;

	public void createThreads(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("Creating New Thread: " + t.getName());
		t.start();
	}

	public static void main(String[] args) {
		ReentrantLockD obj = new ReentrantLockD();
		obj.createThreads("Thread 1");
		obj.createThreads("Thread 2");
		obj.createThreads("Thread 3");
	}

	public void run() {
		do{
			try{
				if (lock.tryLock(400, TimeUnit.MILLISECONDS)) {
					try{
						System.out.println(Thread.currentThread().getName() + " acquired the lock");
						Thread.sleep(1000);
					} finally {
						lock.unlock();
						System.out.println(Thread.currentThread().getName() + " released the lock");
					}
					break;
				}
				else{
					System.out.println(Thread.currentThread().getName() + " could not acquire a lock. Try again later.");
				}
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
		} while(true);
	}
}

