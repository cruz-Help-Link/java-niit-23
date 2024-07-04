import java.util.Optional;
import java.util.OptionalLong;
import java.util.Scanner;

public class OptionalDemo {
    public void broads() {
        OptionalLong opLong = OptionalLong.of(163252382159472124L);

        // get value as stream
        LongStream out = opLong.stream();

        System.out.print("Value: ");
        out.forEach(System.out::print);

        // OptionalLong opLong = OptionalLong.empty();
  
        // // get value as stream
        // LongStream out = opLong.stream();
  
        // print value
        System.out.print("length of Long Stream: "+ out.count());
    }

    public void brokeo() {
        OptionalLong right = OptionalLong.of(54782926);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your batch No:");
        Long BNo = sc.nextLong();
        OptionalLong longa = OptionalLong.of(BNo);
        if (longa.equals(right)) {
            System.out.println("Matching.....");
        } else System.out.println("Nah...");

    }
    public void ding() {
        OptionalLong opLong1 = OptionalLong.of(317946492);
  
        System.out.println("OptionalLong 1: "+ opLong1.toString());
  
        OptionalLong opLong2 = OptionalLong.of(45213246);
  
        System.out.println("OptionalLong 2: " + opLong2.toString());
  
        // Check if these two objects are equal
        // using equals(Object obj)
        System.out.println("Are both objects equal: " + opLong1.equals(opLong2));
    }

    public void checkMe() {
        OptionalLong opLong = OptionalLong.of(894763545123L);
  
        // apply orElseThrow(Supplier)..
        long value = opLong.orElseThrow(ArithmeticException::new);
  
        System.out.println("value " + value);

        OptionalLong opLong1 = OptionalLong.empty();
  
    
  
        try {
        // apply orElseThrow(Supplier)
            Long values = opLong1.orElseThrow(ArithmeticException::new);
        }
        catch (ArithmeticException e) {
            // TODO Auto-generated catch block
            System.out.println("Exception " + e);
        }
    }

    public void coco() {
        OptionalDouble opDouble = OptionalDouble.of(44356.455);
  
        System.out.println("OptionalDouble: " + " " + opDouble.toString());
  
        // Get value in this instance using getAsDouble()
        System.out.println("Value in OptionalDouble = " + " " + opDouble.getAsDouble());

        OptionalDouble opDouble1 = OptionalDouble.of(134.1);
 
        // get value using orElseThrow()
        System.out.println("double Value extracted using" + " orElseThrow() = "
            + opDouble1.orElseThrow());

            OptionalDouble opDouble2 = OptionalDouble.empty();
 
        try {
 // try to get value from empty OptionalDouble
            Double value = opDouble2.orElseThrow();
        }
        catch (Exception e) {
            System.out.println("Exception thrown : "+ e);
        }
    }

    public void celly() {
        Optional<Integer> op = Optional.empty();
  
        System.out.println("Optional: "+ " "+ op);
  
        try {
         // orElseGet value/supplier..
            System.out.println("Value by orElseGet"
                + "(Supplier) method: "+ op.orElseGet(
                    () -> (int)(Math.random() * 10)));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void onDeck() {
        Optional<Integer> op = Optional.of(9455);
  
        System.out.println("Optional: " + op);
  
        // orElseGet Value..
        System.out.println("Value by orElseGet"
                        + "(Value) method: " + op.orElseGet(() -> (int)(Math.random() * 10)));
    }

    public void skyHigh() {
        Optional<Integer> op = Optional.of(9456);
  
        System.out.println("Optional: " + " " + op);
  
        // filter the value..
        System.out.println("Filtered value " + "for odd or even: " + op.filter(num-> num % 2 == 0));
    }

    public void nachos() {
        String[] str = new String[5];
 
        // Setting value for 2nd index
        str[2] = "Muni Bold";
        str[1] = "";
 
        // It returns an empty instance of Optional class
        Optional<String> empty1 = Optional.empty();
        System.out.println(empty1);
 
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        Optional<String> values = Optional.of(str[1]);

        System.out.println(values.get());
 
        // It returns hashCode of the value
        System.out.println(value.hashCode());
 
        // It returns true if value is present, otherwise false
        System.out.println(value.isPresent());
    }
    public static void main(String[] args) {
        OptionalDemo od = new OptionalDemo();
        od.skyHigh();
        od.nachos();
        Optional<String> op2 = Optional.ofNullable(null);

        System.out.println("Optional 2: "+ " "+ op2);
        String[] words = new String[10];
        Optional<String> optNull = Optional.ofNullable(words[5]);
        if (optNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("word is null");
            od.onDeck();
    }
}
