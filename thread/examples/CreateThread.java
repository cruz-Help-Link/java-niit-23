public class CreateThread {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CreateThread3 thread1 = new CreateThread3("Captin");
        thread1.start();
        CreateThread3 thread2 = new CreateThread3("Widow");
        thread2.start();
        // thread1.run();
        // thread2.run();
    }
}
class CreateThread3 implements Runnable {
    Thread thread;
    private String threadname;

    CreateThread3(String name) {
        threadname = name;
    }

    @Override
    public void run() {
        System.out.println("Thread running ----->>>> " + threadname);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        } 
        System.out.println("End of "+ threadname + " thread");

    }

    public void start() {
        System.out.println("Thread started");
        if (threadname == null) {
            thread = new Thread(this, threadname);
            thread.start();
        }
    }
}
