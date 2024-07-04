import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompleteFuture {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> javaFt = CompletableFuture.supplyAsync(() -> "Java");
        CompletableFuture<String> proFt = CompletableFuture.supplyAsync(() -> "Programming");

        CompletableFuture<String> combinedFuture = javaFt.thenCombine(
                proFt, (m1, m2) -> m1 + " " + m2);

        System.out.println(combinedFuture.get());

        CompletableFuture<Integer> resultFuture 
            = CompletableFuture.supplyAsync(() -> 100 / 10); 
        
        System.out.println(resultFuture.get()); 


        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<String> future = completableFuture
        .thenApply(s -> s + " World");

        System.out.println(future.get());

        CompletableFuture<String> completableFutureS
  = CompletableFuture.supplyAsync(() -> "Hello");

CompletableFuture<Void> futureS = completableFuture
  .thenAccept(s -> System.out.println("Computation returned: " + s));

futureS.get();

CompletableFuture<String> completableFutureZ 
= CompletableFuture.supplyAsync(() -> "Hello");

CompletableFuture<Void> futureZ = completableFuture
.thenRun(() -> System.out.println("Computation finished."));

futureZ.get();

//combine CompletableFuture instances in a chain of computation steps.

CompletableFuture<String> completableFutureD = CompletableFuture.supplyAsync(() -> "Hello")
    .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));

assertEquals("Hello World", completableFutureD.get());
    }




    CompletableFuture<Integer> finalResult = compute().thenApply(s-> s + 1);

    CompletableFuture<Integer> computeAnother(Integer i){
        return CompletableFuture.supplyAsync(() -> 10 + i);
    }
    CompletableFuture<Integer> finalResultC = compute().thenCompose(this::computeAnother);


}
