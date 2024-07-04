import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingCallable {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed pool of 1 thread
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Create a Callable task that returns a String
        Callable<String> task = () -> {
            // Simulate some time-consuming computation
            Thread.sleep(2000);
            return "Task completed!";
        };

        // Submit the task to the ExecutorService
        Future<String> futureResult = executor.submit(task);

        // Do other stuff while the task is running...

        try {
            // Get the result from the Future (this will block until the result is
            // available)
            String result = futureResult.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the ExecutorService
        executor.shutdown();
    }
}
