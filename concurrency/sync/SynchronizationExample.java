class SharedResource {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        int oldValue = counter;
        counter = oldValue + 1;
        System.out.println(Thread.currentThread().getName() + " incremented the counter to: " + counter);
    }
}

class CounterIncrementer implements Runnable {
    private SharedResource sharedResource;

    public CounterIncrementer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 5; i++) {
                sharedResource.increment();
                Thread.sleep(1000);
            }
        } catch(Exception e) {
             System.out.println(e.getMessage());
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        // Create a shared resource
        SharedResource sharedResource = new SharedResource();

        // Create two threads that share the same resource
        Thread thread1 = new Thread(new CounterIncrementer(sharedResource), "Thread 1");
        Thread thread2 = new Thread(new CounterIncrementer(sharedResource), "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final counter value: " + sharedResource);
    }
}
