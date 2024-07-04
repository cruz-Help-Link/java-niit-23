import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalStreams {
    public static void main(String[] args) {
        Stream<String> streamGenerated = Stream.generate(() -> "Pink").limit(10); //The generate() method accepts a Supplier<T> for element generation.
        streamGenerated.forEach(System.out::println);
        Stream<String> streamBuilder = Stream.<String>builder().add("Pink ").add("is ").add("Black").build();
        streamBuilder.forEach(System.out::print);

        Stream<Integer> iterated = Stream.iterate(10, n -> n + 5).limit(10);
        iterated.forEach(System.out::println);

        List<String> list = List.of("P", "I", "N", "K", "F");
        list.stream().map(s -> s + s) .forEach(System.out::print); 
             System.out.println(" ");

        list.stream().sorted().forEach(System.out::print);  
        System.out.println(" ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
