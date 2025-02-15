import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskThreadPool implements Runnable {
    private String name;

    public TaskThreadPool(String s) 
	{ 
		name = s; 
	}

    // Prints task name and sleeps for 1s
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) { // 5 processes for each task
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"
                            + " task name - " + name + " = " + df.format(d));
                    // prints the initialization time for every task
                } else {
                    Date d = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " +
                            name + " = " + df.format(d));
                    // prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TestThreadPool {
    // Maximum number of threads in thread pool
    static final int MAX_T = 3;
    public static void main(String[] args) {
        // creates five tasks
        Runnable r1 = new TaskThreadPool("task 1");
        Runnable r2 = new TaskThreadPool("task 2");
        Runnable r3 = new TaskThreadPool("task 3");
        Runnable r4 = new TaskThreadPool("task 4");
        Runnable r5 = new TaskThreadPool("task 5");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // pool shutdown ( Step 4)
        pool.shutdown();
    }
}
