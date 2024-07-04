import java.util.ArrayDeque;

public class Students {
    String name;
    String email;

    Students(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

public class CloudChaser {

    public static void main(String[] args) {
        ArrayDeque<Students> deque = new ArrayDeque<>();
        Students std = new Students("Franklyn", "frank4real@niit.com");
        Students std1 = new Students("Marylyn", "mary4real@niit.com");
        Students std2 = new Students("Joselyn", "jose4real@niit.com");
        Students std3 = new Students("Evelyn", "eve4real@niit.com");

        deque.add(std3);
        deque.addFirst(std);
        deque.add(std2);
        deque.add(std1);
        System.out.println(deque);

    }

}
