import java.util.concurrent.TimeUnit;

public class EmployeePaySimulation {
    private static volatile double pay = 0.0; // Volatile to ensure visibility between threads..
    // volatile to ensure that changes to it are visible to both threads.

    public static void main(String[] args) {
        // Thread to update the employee's pay..
        Thread payUpdaterThread = new Thread(() -> {
            while (true) {
                pay += 0.10; // Increase pay by 10 cents per second..
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Thread to access and display the employee's pay
        Thread payDisplayThread = new Thread(() -> {
            while (true) {
                System.out.println("Employee's pay: $" + pay);
                try {
                    TimeUnit.MINUTES.sleep(1); // Display pay every minute
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start both threads
        payUpdaterThread.start();
        payDisplayThread.start();
    }
}
