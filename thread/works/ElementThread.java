public class ElementThread implements Runnable {
    private char[] array;
    private int startIndex;
    private int endIndex;

    public ElementThread(char[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + array[i]);
        }
    }

    public static void main(String[] args) {
        char[] sharedArray = { 'e', 't', 'r', 'c', 'f', 'y', 's', 'm', 'j', 'v', 'l', 'x'};
        int chunkSize = sharedArray.length / 3;

        Runnable runnable1 = new ElementThread(sharedArray, 0, chunkSize);
        Runnable runnable2 = new ElementThread(sharedArray, chunkSize, 2 * chunkSize);
        Runnable runnable3 = new ElementThread(sharedArray, 2 * chunkSize, sharedArray.length);

        Thread thread1 = new Thread(runnable1, "Thread 1");
        Thread thread2 = new Thread(runnable2, "Thread 2");
        Thread thread3 = new Thread(runnable3, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
