class ThreadClass implements Runnable {

    public void run(){
        try{
            System.out.println("Starting main Thread...");
            Thread.sleep(3000);
            System.out.println("Started Thread............ 100%");
            Thread.sleep(1000);
            System.out.println("In Runnable Thread");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void run(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println("In main Thread");
        Runnable tc = new ThreadClass(); //THREAD 1
        tc.run();
        // tc.run("Name");
        tc.start();
        Runnable tcs = new ThreadClass(); //THREAD 2
        tcs.run();
    }
}