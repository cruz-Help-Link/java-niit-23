import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DisturbedExecutor implements Runnable{
    String name;
    DisturbedExecutor(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
         ExecutorService service = Executors.newFixedThreadPool(10);//10 Threads

        for (int i = 0; i <100; i++) { //count 0- 99 100 numbers
            service.execute(new DisturbedExecutor());
        }
        System.out.println("This thread ----->>" + Thread.currentThread().getName());

        service.shutdown();
        service.isShutdown();
        service.isTerminated();
        try {
            service.awaitTermination(200, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        service.shutdownNow();

        List<Runnable> list = service.shutdownNow();
    }    
}