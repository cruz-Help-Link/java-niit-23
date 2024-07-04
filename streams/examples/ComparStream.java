import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ComparStream {
    public static void main(String[] args) {
        int [] num = {34, 56,23, 99, 27, 50};
        IntStream nums = Arrays.stream(num); 
        nums.forEach(n -> System.out.print(n + " "));
        System.out.printf("    ");

        long[] numL = { 50L, 67L, 89L, 90L, 234L }; 
        LongStream numsL = Arrays.stream(numL); 
        numsL.forEach(l -> System.out.print(l + " "));
  
        System.out.println(); 
  
        // Converting double array to stream 
        double[] numD = { 22.3, 23.2, 64.3, 46.8, 85.0 }; 
        DoubleStream numsD = Arrays.stream(numD); 
        numsD.forEach(d -> System.out.print(d + " ")); 
        // int max = IntStream.of(nums).max(Comparator.naturalOrder()).orElse(0);
        //MAX AND MIN
            int mxx = Stream.of(42, 77, 33) 
            .max(Comparator.naturalOrder()) 
            .orElse(0); System.out.println(mxx);
        int mnx = Stream.of(42, 77, 33)
            .min(Comparator.naturalOrder()) 
            .orElse(0); System.out.println(mnx);

        List<String> list = List.of("m", "c", "f"); 
        Object[] obj = list.stream().toArray(); //  the toArray() of the Stream interface accepts a function
        Arrays.stream(obj).forEach(System.out::print); 
                System.out.println("  ");

        String[] str = list.stream().toArray(String[]::new); 
        Arrays.stream(str).forEach(System.out::print); 

        System.out.println("  ");

        List<String> listL = List.of("m", "c", "f"); 
        String[] strL = listL.toArray(new String[listL.size()]);  //takes an array
        Arrays.stream(strL).forEach(System.out::print); 
    }
}
