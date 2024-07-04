import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableDemo {
    AtomicInteger value = new AtomicInteger(5);
    int getValue() {
        return value.get();
    }
    
    void increment() {
        value.incrementAndGet();
    }

    public static void main(String a[]){

    }
}