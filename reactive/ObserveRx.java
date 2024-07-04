import java.util.Observable;

public class ObserveRx {
    public static void main(String[] args) {
//         String[] letters = {"a", "b", "c"};
//         Observable.from(letters)
//   .scan(new StringBuilder(), StringBuilder::append)
//   .subscribe(total -> result += total.toString());
// assertTrue(result.equals("aababc"));

        Observable.from(numbers)
  .groupBy(i -> 0 == (i % 2) ? "EVEN" : "ODD")
  .subscribe(group ->
    group.subscribe((number) -> {
        if (group.getKey().toString().equals("EVEN")) {
            EVEN[0] += number;
        } else {
            ODD[0] += number;
        }
    })
  );
assertTrue(EVEN[0].equals("0246810"));
assertTrue(ODD[0].equals("13579"));

Subscriber<String> mySubscriber = new Subscriber<String>() {
    @Override
    public void onCompleted() {
    System.out.println("I'm done");
    }
    @Override
    public void onError(Throwable e) {
    }
    
            Observable myObservable = Observable.create(new Observable.OnSubscribe() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("Blue Factory");
            subscriber.onCompleted();
        }
    });
}
    }
}
