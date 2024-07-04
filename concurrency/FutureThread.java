import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FutureThread {

    public static void main(String[] args) {
        
        CountDownLatch lock = new CountDownLatch(3);
        try {
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
                ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
                    System.out.println("Hello World");
                    lock.countDown();
                }, 500, 100, TimeUnit.MILLISECONDS);

                lock.await(1000, TimeUnit.MILLISECONDS);
                future.cancel(true);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
       
    }
}
