import java.util.concurrent.*;

class ScheduledTask implements Callable<String> {
    private String taskName;

    public ScheduledTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Task " + taskName + " is running on thread " + Thread.currentThread().getName());
        return "Task " + taskName + " completed";
    }
}

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        // Create a ScheduledThreadPool with a fixed number of threads
        int poolSize = 3;
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(poolSize);

        // Schedule tasks to run after a delay
        for (int i = 1; i <= 5; i++) {
            Callable<String> task = new ScheduledTask("Task " + i);
            ScheduledFuture<String> future = scheduledExecutorService.schedule(task, i, TimeUnit.SECONDS);

            try {
                // get method is used to wait for the task to complete and retrieve its result.
                String result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the ScheduledThreadPool when done
        scheduledExecutorService.shutdown();
    }
}
