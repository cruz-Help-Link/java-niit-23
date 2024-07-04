import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ReentrantLockss implements Runnable{
    final Lock lock = new ReentrantLockImplementations();
    String name;
    Thread t;

    public void createThreads(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("creating new thread:" + t.getName());
        t.start();
    }
    public static void main(String args []){
     ReentrantLockss rli = new ReentrantLockss();
        rli.createThreads("ThreadA") ;
        rli.createThreads("ThreadB") ;
        rli.createThreads("ThreadC") ;

    }
    public void run(){
        do{

            try{
                if(lock.tryLock(400,TimeUnit.MILLISECONDS)){
                    try{
                        System.out.println(Thread.currentThread().getName() +"acquired the lock");
                        Thread.sleep(1000);
            
                    } finally{
                        lock.unlock();
                        System.out.println(Thread.currentThread().getName() +"released the lock");
                    }
                    break;
                }else{
                    System.out.println(Thread.currentThread().getName() + "could not acquire the lock.need to try for the lock again");
                }
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }while(true);
    }
}
