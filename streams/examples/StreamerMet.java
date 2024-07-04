import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamerMet {
    public static void main(String[] args) {
        System.out.println("Empty Stream");
        Stream.empty().forEach(System.out::println); // empty()
        System.out.println("Empty OK");

        Stream<String> stringStream = Stream.of("1 ", "2"); // of()
        stringStream.forEach(System.out::print); // foreach()
        // System.out.println(stringStream);

        Stream<Integer> value1 = Stream.of(13, 26);
        Stream<Integer> value2 = Stream.of(72, 90);
        Stream<Integer> value3 = Stream.of(56, 76);
        Stream<Integer> value4 = Stream.of(96, 35);

        Stream.of(value1, value2, value3, value4).forEach(System.out::println);

        // //because each element of the stream is a stream, returning an element as the
        // result of the flatMap() operation, we tell the pipeline to treat the return
        // value as a Stream object.

        Stream.of(value1, value2, value3, value4).flatMap(e -> e).forEach(System.out::println);

        StreamerMet sm = new StreamerMet();
        // sm.printList(null);
        List<String> list = new ArrayList<String>();
        list.add("null");
        list.add("full");
        list.add("hull");

        sm.printList(list);

        // int[] arr = {1, 2, 3, 4, 5};
        // Arrays.stream(arr, 1, 5).forEach(System.out::print);

        // List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // // demonstration of map method
        List<Integer> square = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        // System.out.println(square);

        Observable<Integer> observable = Observable.range(1, 5);

        // Transform the emitted numbers by squaring them
        Observable<Integer> transformedObservable = observable.map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        });
        

        // Subscribe to the transformed Observable and define actions for onNext and
        // onComplete events
        transformedObservable.subscribe(
                transformedValue -> System.out.println("Transformed Value: " + transformedValue),
                throwable -> System.err.println("onError: " + throwable.getMessage()),
                () -> System.out.println("Transformation complete"));


    Observable<Integer> observabless = Observable.range(1, 5);

    // Subscribe to the Observable and obtain a Disposable
    Disposable disposable = observable.subscribe(
                // onNext
                number -> System.out.println("Received: " + number),
                // onError
                throwable -> System.err.println("onError: " + throwable.getMessage()),
                // onComplete
                () -> System.out.println("onComplete")
        );

    // Simulate some other work or waiting
    try
    {
        Thread.sleep(2000);
    }catch(
    InterruptedException e)
    {
        e.printStackTrace();
    }

    // Dispose of the subscription to release resources
    disposable.dispose();

    System.out.println("Subscription disposed.");
}

    // No

    void printList(List<String> list) {
        Stream.ofNullable(list).forEach(System.out::println); // list object
        Stream.ofNullable(list).flatMap(l -> l.stream()).forEach(System.out::println);
    }

}
