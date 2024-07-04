public class ThreadDemo {
    public static void main(String[] args) {
        // final Object lock = new Object(); // A shared lock object

        //1ST THREAD
        Thread thread1 = new Thread(new Runnable() {  
            @Override
            public void run() {
                // synchronized (lock) {
                    try {
                        System.out.println("Thread 1 is waiting...");
                        // lock.wait(); // Thread 1 waits for a notification
                        System.out.println("Thread 1 is awake!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            public void run(String name) {
                System.out.println(name);
            }
            // }
        });

        // Thread thread2 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         synchronized (lock) {
        //             try {
        //                 System.out.println("Thread 2 is sleeping...");
        //                 Thread.sleep(2000); // Thread 2 sleeps for 2 seconds
        //                 System.out.println("Thread 2 is awake!");
        //                 lock.notify(); // Notify one waiting thread
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // });

        // Thread thread3 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         synchronized (lock) {
        //             try {
        //                 System.out.println("Thread 3 is waiting...");
        //                 lock.wait(); // Thread 3 waits for a notification
        //                 System.out.println("Thread 3 is awake!");
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // });

        thread1.start();
        // thread1.start("Name");
        // thread1.run("Name");
        // thread2.start();
        // thread3.start();
    }
}
