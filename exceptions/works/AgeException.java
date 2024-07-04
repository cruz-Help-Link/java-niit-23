import java.util.*;

public class AgeException extends RuntimeException {
    public AgeException() {
        System.out.println("Invalid value for age");
    }

    AgeException(String msg) {
        super(msg);
    }
    
}