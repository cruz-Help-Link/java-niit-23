import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.Random;
import java.util.concurrent.*;

class Processor implements Runnable {

    private CountDownLatch latch; //door or lid to help with synchronization

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            Thread.sleep(3000);
        } 
        catch (InterruptedException ignored){
            System.out.println(ignored.getMessage());
        }
        // latch.countDown();
        //releases all waiting threads if the count reaches zero
    }
}

public class CountDownApp {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);  // count is 3 so it is decremented
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.submit(new Processor(latch));
        }
        executor.shutdown();

        try {
            // Application’s main thread waits, till other service threads which are
            // as an example responsible for starting framework services have completed
            // started all services.
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed.");
    ExecutorService executors = Executors.newCachedThreadPool();

        //anonymous call of Callable
        Future<Integer> future = executors.submit(new Callable<Integer>() {
            // A Future represents the result of an asynchronous computation, to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation. 
            //The duration can only be retrieved using method get when the computation has completed, blocking if necessary until it is ready.

            @Override
            //return value is Integer
            public Integer call() throws TimeoutException {
                Random random = new Random();
                int duration = random.nextInt(5000);
                if (duration > 4000) {
                    throw new TimeoutException ("Sleeping for too long.");
                }

                System.out.println("Starting ...");
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException ignored) {}
                System.out.println("Finished.");
                return duration;
            }
        });
        executors.shutdown();

        try {
            //get returned value from call()
            System.out.println("Result is: " + future.get());

        } catch (InterruptedException ignored) {
        } catch (ExecutionException e) {
            TimeoutException ex = (TimeoutException) e.getCause();
            System.out.println(ex.getMessage());
        }
        executors.shutdown();

    }

}