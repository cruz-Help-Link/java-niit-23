class SyncObj {
    synchronized void printNum(int n) { // synchronized method lock int n for any shared resource.
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

class NuberoUno extends Thread {
    SyncObj t; // object of class of sync method

    NuberoUno(SyncObj t) {
        this.t = t;
    }

    public void run() {
        t.printNum(10); // locks and releases to next thread
    }

}

class NuberoDuo extends Thread {
    SyncObj t;

    NuberoDuo(SyncObj t) {
        this.t = t;
    }

    public void run() {
        t.printNum(100); // locks
    }
}

public class SyncOutput {
    public static void main(String args[]) {
        SyncObj obj = new SyncObj();// only one object
        NuberoUno nu = new NuberoUno(obj);
        NuberoDuo nd = new NuberoDuo(obj);
        nu.start();
        nd.start();
    }
}