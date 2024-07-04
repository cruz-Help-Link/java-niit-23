import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is running on thread " + Thread.currentThread().getName());
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a ThreadPool with a fixed number of threads
        int poolSize = 3;
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorServices = Executors.
            newFixedThreadPool(poolSize); //2ND


        // submit five tasks to the ThreadPool
        for (int i = 1; i <= 10; i++) {
            Runnable task = new Task("Task " + i);
            executorServices.submit(task); // using executorService.submit(task)
        }

        // to shut down the ThreadPool
        executorService.shutdown();
        executorService.isShutdown(); //boolean
        executorService.isTerminated(); // boolean
    }
}
