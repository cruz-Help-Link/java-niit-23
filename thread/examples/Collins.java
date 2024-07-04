public class Collins extends Thread{
    public void run() {
        for (int i=2; i<=50; i+=2) {
            System.out.println(i);
        }
            try {
                Tread.sleep();
            }catch (InterruptedException e) {
                e.printStackTrace();
        }
    
    }

    public static void main(String[] args) {
        Collins c = new Collins();
        c.start();
        
    }
}

