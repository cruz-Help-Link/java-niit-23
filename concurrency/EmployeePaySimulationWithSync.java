import java.util.concurrent.TimeUnit;

public class EmployeePaySimulationWithSync {
    private static double pay = 0.0;

    public static void main(String[] args) {
        // Thread to update the Emmanuel's pay
        Thread payUpdateThread = new Thread(() -> {
            while (true) {
                synchronized (EmployeePaySimulationWithSync.class) {
                    pay += 0.10; // Increase pay by 10 cents per second
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Thread to access and display the Emmanuel's pay
        Thread payDisplayThread = new Thread(() -> { // using a lambda expression.. anonymous method
            while (true) {
                synchronized (EmployeePaySimulationWithSync.class) { // ensuring that only one thread can access the class..synchronized block or method at a time.
                    // Class object -> EmployeePaySimulationWithSync.class.. so that only one thread
                    // can run the synchronized block of code in class
                    System.out.println("Emmanuel's pay: $" + pay);
                }
                try {
                    TimeUnit.MINUTES.sleep(1); // Display pay every minute
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start both threads
        payUpdateThread.start();
        payDisplayThread.start();
    }
}
