import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private int num1;
    private int num2;
    private int[] arr;

    public MyCallable(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public MyCallable(int[] arr){
        this.arr = arr;
    }

    // @Override
    // public Integer call() throws Exception {
    //     // Perform some computation
    //     int result = num1 + num2;
    //     return result;
    // }

    public Integer call() throws Exception {
        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
