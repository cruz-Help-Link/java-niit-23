public class CharacterThread implements Runnable {
    private char[] characters;

    public CharacterThread(char[] characters) {
        this.characters = characters;
    }

    @Override
    public void run() {
        for (char c : characters) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        char[] array1 = { 'A', 'B', 'C', 'D', 'E' };
        char[] array2 = { '1', '2', '3', '4', '5' };
        char[] array3 = { 'X', 'Y', 'Z' };

        Runnable runnable1 = new CharacterThread(array1);
        Runnable runnable2 = new CharacterThread(array2);
        Runnable runnable3 = new CharacterThread(array3);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> "Hello World");
        
        // some operations
        String result = future.get();
    }
}
