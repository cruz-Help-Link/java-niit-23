import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class CallMain implements Callable<String> {

    public static void main(String[] args) {
        // File file = new File();
        ExecutorService service = Executors.newFixedThreadPool(5); // thread pool
        // list to hold objects of future
        List<Future<String>> list = new ArrayList<Future<String>>();

        Callable<String> callable = new CallMain();
        for (int i = 0; i < 20; i++) {
            // service.execute();
            Future<String> future = service.submit(new CallMain());
            list.add(future);
        }
        for (Future<String> future : list) {
            try {
                System.out.println(new Date() + "---> " + future.get());
            } catch (ExecutionException e) {
                System.out.println("Exception in Thread");
            } catch (InterruptedException e) {
                System.out.println("Exception in Thread");
            }
        }
        // System.out.println("Thread ----> " + Thread.currentThread().getName()); //
        // main thread
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return Thread.currentThread().getName();
    }
}