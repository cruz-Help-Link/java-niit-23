import java.util.function.BiFunction;

public class FunctionalDa {
    // Runnable runnable = new Runnable() { 
    //     @Override public void run() { 
    //     System.out.println("Hello!"); 
    //     } 
    //     };
    Runnable runnable = () -> System.out.println("Hello!"); //USING LAMDA

    public void getRun() {
        // runnable.run();
        // BiFunction<Double, Integer, Double> f = (@NotNull var x, @NotNull var y) -> x / y;

        BiFunction<Double, Integer, Double> f = (x,y) -> x / y;
        System.out.println(f.apply(4, 2));      //2

        BiFunction<Integer, Integer, Integer> h = (@NotNull var x, @NotNull var y) -> x+y;
        System.out.println(h.apply(4, 2));

    }

    public static void main(String[] args) {
        FunctionalDa fd = new FunctionalDa();
        fd.getRun();
        // System.out.println(runnable);

    }
}
