import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Properties;
import java.util.Set;
import java.util.Hashtable;
import java.util.Iterator;

public class OptLongDemo {

    public static void main(String[] args) {
        //the of() method gets an OptionalLong object with value 1
        OptionalLong optional = OptionalLong.of(1);
        
        OptionalDouble opTd = OptionalDouble.of(64893.098);
        //getAsLong() method returns the value present in optional.
        System.out.println("L14 Value of the optional object is: " + optional.getAsLong());

        OptionalLong optLong = OptionalLong.of(21438999);
        
        long value = optLong.orElse(13421);

        // Get value of this OptionalLong instance
        System.out.println("L19 OptionalLong: " + " "+ value);

        OptionalLong opLong = OptionalLong.empty();   //No value is present 
                
                       // print OptionalLong
        System.out.println("OptionalLong: L24 " + " "+ opLong.toString());

//OPTIONAL DOUBLE

        OptionalDouble opDouble = OptionalDouble.empty();
 
        // get value using orElse
        double valueD = opDouble.orElse(13421);
 
        // print double value
        System.out.println("value: " + valueD + " " +opDouble.isPresent());

    //OPTIONAL

        String[] words = {"mag", "ni", "fi", "ci", "ent", null};
        Optional<String> checkNull = Optional.ofNullable(words[5]); //if it can potentially be null

        if (checkNull.isPresent()) {  
            String word = words[5].toUpperCase();
            System.out.println("L46 " +word);
            // System.out.println();
        }
        else
        System.out.println("word is null");

//2 
        String names = "spellman";
        Optional<String> optname = Optional.of(names);
        System.out.println(optname); //prints spellman




        Optional<String> opt = Optional.of("spellman"); 
        opt.isPresent(); //true or false
        opt.ifPresent(name -> System.out.println("Line 31 " + name.length())); //8
        // opt.empty(); //empty
        // opt.isPresent(); //true or false

      

        int len = opt.map(String::length).orElse(0); // mapping string to length
        System.out.println("L46 " + len);  //8

        if (len >= 8) {
            System.out.println("Nice");
        }else System.out.println("Not up to 8 characters");

    
//3
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow(); //value is not present, it throws NoSuchElementException: No value present

        Properties tokens = new Properties(); //maps keys to values
        Set id;
        String str;
        tokens.put("101", "SpringXO9L");
        tokens.put("201", "TY67City");
        tokens.put("301", "OlyWEX5");
        tokens.put("401", "6THUramen");
        tokens.put("501", "FVR5diana");
        // Show all id and tokens in .
        id = tokens.keySet(); // get set-view of keys
        Iterator itr = id.iterator();
        while(itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The token of " + str + " is " + tokens.getProperty(str) + ".");
        }
    }
}
