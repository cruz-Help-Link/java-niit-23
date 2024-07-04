import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private Lock lock = new ReentrantLock();

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is accessing the shared resource.");
            // Perform some operations on the shared resource
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName() + " has released the lock.");
        }
    }
}

public class LockExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Runnable task = () -> {
            sharedResource.accessResource();
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
