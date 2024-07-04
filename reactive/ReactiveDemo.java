import io.reactivex.Observable;
import java.util.stream.IntStream;
public class ReactiveDemo {
    public static void main(String[] args) {
        double value= IntStream.rangeClosed(1,5).filter(i->i%2==0)
        .mapToDouble(Double::valueOf).map(Math::sqrt).sum();
        System.out.println(value);
        Observable.range(1,5).filter(i->i%2==0).map(Math::sqrt)
        .reduce((r, d)->r+d).subscribe(System.out::println);
    }
}