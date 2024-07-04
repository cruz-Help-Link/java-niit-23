import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceStream {
    public static void main(String[] args) {
        List<Integer> time = new ArrayList<>();
        time.add(45);
        time.add(23);
        time.add(45);
        time.add(36);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
        .stream()
        .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result); //21
        int resul = numbers.stream().reduce(0, Integer::sum);
        System.out.println(resul); //21

        List<String> letters = Arrays.asList("Name:", "Munirat", "; ", "Location:", "Canada");
        String resultS = letters
        .stream()
        .reduce("", (partialString, element) -> partialString + element);
        System.out.println(resultS);
        String resulS = letters.stream().reduce("", String::concat);
                System.out.println(resulS);

        String resultU = letters
        .stream()
        .reduce(
            "", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
                        System.out.println(resultU);

        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
        System.out.println(computedAges + " TOTAL");

        maxOp();
        List<Integer> nums = Arrays.asList(25, 30, 45, 20, 35);

        divideListElements(nums, 5);

               
    }

    private static int divide(int value, int factor) {
        int result = 0;
        try {
            result = value / factor;
            System.out.println(result + " " );
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by Zero");
        }
        return result;
    }
    public static void divideListElements(List<Integer> values, int divider) {
        int red = values.stream().reduce(0, (a, b) -> divide(a, divider) + divide(b, divider));
        System.out.print(red);
        List<String> list = List.of("a", "b", "c", "c", "g"); 
        String min = list.stream() 
            .min(Comparator.naturalOrder()) 
            .orElse("0"); System.out.println(min); //prints: a 
        int mn = Stream.of(42, 77, 33).min(Comparator.naturalOrder()) 
            .orElse(0); System.out.println(mn);

            List<String> listz = List.of("a", "b", "c"); 
            Object[] obj = listz.stream().toArray();  //object to aray
            Arrays.stream(obj).forEach(System.out::print); 
            //
            String[] str = listz.stream().toArray(String[]::new); 
            Arrays.stream(str).forEach(System.out::print); 
    }
    
    public static void maxOp() {
        List<Integer> numbers = Arrays.asList(25, 30, 45, 28, 32);

        // Using Stream.reduce() to find the maximum value
        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max); // BinaryOperator.max() used as the accumulator

        if (max.isPresent()) {
            System.out.println("Maximum value----->>> " + max.get());
        } else {
            System.out.println("No maximum value found (empty collection)");
        }
    }
    
}
