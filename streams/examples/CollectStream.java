import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectStream {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");

        // Collecting stream elements into a Map (fruit name as key, length as value)
        Map<String, Integer> fruitLengthMap = fruits.stream()
                .collect(Collectors.toMap(fruit -> fruit, String::length));

        // Printing the collected Map
        System.out.println("Collected Map: " + fruitLengthMap);

        List<String> words = Arrays.asList("Definitely", "Certainly", "Unquestionably");


        Set<String> wordSet = words.stream()
                .collect(Collectors.toSet());

        // Printing the collected Set
        System.out.println("Collected Set: " + wordSet);

        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        List<Integer> numberList = ages.stream()
                .collect(Collectors.toList());

        // Printing the collected List
        System.out.println("Collected List: " + numberList);

    }
}
