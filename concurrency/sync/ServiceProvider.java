class HelpSync {
    int d;

    synchronized void acceptCall() {
        System.out.println("Calling:" + d);
    }

    synchronized void receiveCall(int d) {
        this.d = d;
        System.out.println("Receiving:" + d);
    }
}

class Caller extends Thread {
    HelpSync t;

    public Caller(HelpSync t) {
        this.t = t;
    }

    public void run() {
        int number = 24568231;
        while (true) {
            // if(true) {
            System.out.println("Calling receiver");
            t.receiveCall(number);
        }
    }
}

class Receiver extends Thread {
    HelpSync t;

    public Receiver(HelpSync t) {
        this.t = t;
    }

    public void run() {
        while (true) {
            // if(true) {

            System.out.println("Receiving caller");
            t.acceptCall();
        }
    }
}

public class ServiceProvider {
    public static void main(String args[]) {
        HelpSync help = new HelpSync();
        Caller c = new Caller(help);
        Receiver r = new Receiver(help);
        c.start();
        r.start();
    }
}