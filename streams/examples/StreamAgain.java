import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAgain {
    void printList(List<String> list){ 
        Stream.ofNullable(list).flatMap(l -> l.stream()).forEach(System.out::print); 
        } 
    public static void main(String[] args) {
        List<String> status = Arrays.asList("OK", "NULL", "REDIRECT");
        List<String> statusLow = status.parallelStream().map(s -> s.toLowerCase()).filter(s-> s.contains("ll")).collect(Collectors.toList());
        System.out.println(statusLow);

        List<Integer> number = Arrays.asList(2, 3, 4, 5); 
        List square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        List names = Arrays.asList("Munirat","Joseph","Nicki");
        // List result = names.stream().filter(s->s.startsWith("N")).collect(Collectors.toList());

        List names1 = Arrays.asList("Reflection","Collection","Stream");
        // List result1 = names.stream().sorted().collect(Collectors.toList());


        int[] arr = {1, 2, 3, 4, 5}; 
        Arrays.stream(arr, 1, 4).forEach(System.out::print);


        Stream<String> stringing = Stream.of("Hello ", "there!");
        System.out.println(stringing);
        Stream.of(stringing).flatMap(e ->e).forEach(System.out::print);
        StreamAgain sa = new StreamAgain();
        sa.printList(null);

    }
    
        
}
