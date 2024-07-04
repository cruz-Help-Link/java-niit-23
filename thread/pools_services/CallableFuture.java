import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {
    public static void main(String[] args) {
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 56; i++) {
                sum += i;
            }
            return sum;
        };
        // Create an ExecutorService with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Submit the task to the executor
        Future<Integer> future = executor.submit(task);
        
        try {
             // Wait for the task to complete and get the result
            int result = future.get();  
            
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception Encountered");
        }
       
        // Shutdown the executor
        executor.shutdown();
    }
}
