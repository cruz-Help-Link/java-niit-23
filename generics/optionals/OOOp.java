import java.util.Optional;

public class OOOp {
    public static void main(String[] args) {
    //     String nullName = null;
    // String name = Optional.ofNullable(nullName).orElse("john");
    // assertEquals("john", name);
    Optional<String> opt = Optional.of("java");
    opt.ifPresent(name -> System.out.println(name.length()));

    String nullName = null;
    //when the wrapped value is not present, it throws an exception
    // String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
      String nullName1 = null;
      //NoSuchElementException: No value present
    // String name1 = Optional.ofNullable(nullName1).orElseThrow();

    Integer year = 2016;
    Optional<Integer> yearOptional = Optional.of(year);
    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
 
    boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
    assert(is2017);
    }
}
