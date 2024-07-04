public class ThreadLoot implements Runnable {
    private String name;

    public ThreadLoot(String s) 
	{ 
		name = s; 
	}
    public void run() {
        Thread.sleep(500);
    }
}


public class ThreadLock{
    static final int MAX_T = 3;
    public static void main(String[] args) {
        Runnable tl = new ThreadLoot("Task 1");  //ONE

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
    }
}