import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStreamed {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Definitely", "Certainly", "Unquestionably","Irrefutably", "Categorically", "without/" +"beyond doubt"); 
        // The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty. 
        Optional<String> longestString = words.stream() //ternary operator condition ? value_if_true : value_if_false
//compare(o1, o2)
            .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2); 
  
        // Displaying the longest String 
        longestString.ifPresent(System.out::println); 


        List<String> joinArr = Arrays.asList("Definitely", "the", "best",
                                           "album", "of", "the " +"year"); 
  
        // The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty. 
        Optional<String> sentence = joinArr.stream() 
                                           .reduce((join1, join2) -> join1 + " " + join2); 
        if (sentence.isPresent()) { 
            System.out.println(sentence.get()); 
        } 
    }
}
