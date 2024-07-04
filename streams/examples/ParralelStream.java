import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

//By default, any stream operation in Java is processed sequentially, unless explicitly specified as parallel.

//Sequential streams use a single thread to process the pipeline
public class ParralelStream {
    public static void main(String[] args) {
        

        List<Integer> listOfNumbers = Arrays.asList(67, 45, 89, 34);
        listOfNumbers.parallelStream().forEach(number ->
            System.out.println(number + " " + Thread.currentThread().getName()));

            List<Integer> listOfNumber = Arrays.asList(67, 45, 89, 34);
        int sum = listOfNumber.parallelStream().reduce(0, Integer::sum);
        try {
            List<Integer> listOfNumbes = Arrays.asList(67, 45, 89, 34);
            ForkJoinPool customThreadPool = new ForkJoinPool(4);
            int sumResult = customThreadPool.submit(() -> listOfNumbes.parallelStream().reduce(0, Integer::sum)).get();
            System.out.println(sumResult);
            int ste = IntStream.rangeClosed(1, 100).reduce(0, Integer::sum);
            int stre = IntStream.rangeClosed(1, 100)
                                .parallel().reduce(0, Integer::sum);
            System.out.println(stre + " " + ste);
            customThreadPool.shutdown();
        } catch (Exception e) {
            // TODO: handle exception
        }

      

      
    
    }
}
