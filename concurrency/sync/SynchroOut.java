class SynNot {
    synchronized void printNum(double n) { // synchronized method lock int n for any shared resource.
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class First {

}

class Second {

}

public class SynchroOut {
    public static void main(String args[]) {
    }
}
