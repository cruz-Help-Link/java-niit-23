import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalStream {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 3, 4, 5); 
 
        // demonstration of map method
        List<Integer> square 
            = number.stream()
            .map(x -> x * x)
            .collect(Collectors.toList());

        square.forEach(System.out::print); //4, 9, 16, 25
        System.out.println(" ");

        System.out.println(square); // [4, 9, 16, 25]
 
        // create a list of String
        List<String> names = Arrays.asList("Friday", "Papa", "Nicki", "Nice");

         // demonstration of filter method
        List<String> result
          = names.stream()
            .filter(s -> s.endsWith("e"))
            .collect(Collectors.toList());
       
        System.out.print(result); // Nicki, Nice //Nice
                System.out.println(" ");

 
        // demonstration of sorted method
        List<String> show 
          = names.stream()
            .sorted( )
            .collect(Collectors.toList());
       
        System.out.print(show); // Friday, Nice, Nicki, Papa
                System.out.println(" ");

 
        // create a list of integers
        List<Integer> numbers
            = Arrays.asList(2, 3, 4, 5, 2);
 
        // collect method returns a set
        Set<Integer> squareSet
          = numbers.stream()
            .map(x -> x * x)
            .collect(Collectors.toSet());
       
        System.out.print(squareSet);
                System.out.println(" ");

 
        // demonstration of forEach method
        number.stream()
            .map(x -> x * x)
            .forEach(y -> System.out.print(y));
                    System.out.println(" ");

 
        // demonstration of reduce method
        int even 
          = number.stream()
            .filter(x -> x % 5 != 0)
            .reduce(0, (ans, i) -> i - ans);
 
        System.out.print(even);
                System.out.println(" Even");

        TerminalStream ts = new TerminalStream();
        ts.getOut();

    }

    public void getOut() {
        System.out.println(" ");
        List<Integer> integerValues= Arrays.asList(10,20,30,40,50,60,70);
        integerValues.stream().map(value->value*5).forEach(System.out::println);
        System.out.println(" ");
        Integer intr=integerValues.stream().map(value->value*5).reduce((x,y)->x+y).get();
        System.out.println(intr.intValue());
    }
}
