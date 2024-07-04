import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class NewThread implements Runnable {
        String ThreadName;
        JLabel l;
        JPanel l1,l2,l3;
        JFrame fr;

        public NewThread() {
                buildGUI();
        }
        public void run() {
                if (Thread.currentThread().getName().equals("ObstacleA")) {
                        runObstacleA();
                }
                 if (Thread.currentThread().getName().equals("ObstacleB")) {
                        runObstacleB();
                }
                 if (Thread.currentThread().getName().equals("ObstacleC")) {
                        runObstacleC();
                }
        }

        public  void runObstacleA() {
                Random ran = new Random();
                int s = ran.nextInt(1000);
                for (int i=-10;i<400;i++) {
                        l1.setBounds(i, s, 25, 25);
                        try{
                                Thread.sleep(5);
                        }
                        catch(Exception e)
                        {
                                System.err.println(e);
                        }
                }
                runObstacleC();
        }

        public  void runObstacleB() {
                Random ran = new Random();
                int z = ran.nextInt(180);
                for (int i=-10;i<400;i++) {
                        l2.setBounds(i, z, 25, 25);
                        try{
                                Thread.sleep(15);
                        }
                        catch(Exception e)
                        {
                                System.out.println(e);
                        }
                }
                runObstacleA();
        }

        public  void runObstacleC() {
                Random ran = new Random();
                int r = ran.nextInt(10);
                for (int i=-10;i<400;i++) {
                        l3.setBounds(i, r, 25,25);
                        try{
                                Thread.sleep(5);
                        }
                        catch(Exception e)
                        {
                                System.out.println(e);
                        }
                }
                runObstacleB();
        }

        public void buildGUI() {
                fr = new JFrame("Moving Squares!!!");
                fr.setVisible(true);
                fr.setSize(400,400);
                fr.setLayout(null);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fr.setResizable(false);
                fr.setPosition();

                l = new JLabel("");
                l.setBounds(10,10,400,20);
                fr.add(l);

                l1 = new JPanel();
                l1.setSize(25,25);
                l1.setBackground(Color.red);
                l1.setBounds(10,40,20,20);
                fr.add(l1);

                l2 = new JPanel();
                l2.setSize(25,25);
                l2.setBackground(Color.blue);
                l2.setBounds(10,80,20,20);
                fr.add(l2);

                l3 = new JPanel();
                l3.setSize(25,25);
                l3.setBackground(Color.green);
                l3.setBounds(10,120,20,20);
                fr.add(l3);
        }

        public static void main(String[] args) {
                NewThread nt = new NewThread();
                Thread Obstacle1 = new Thread(nt);
                Thread Obstacle2 = new Thread(nt);
                Thread Obstacle3 = new Thread(nt);

                Obstacle1.setName("ObstacleA");
                Obstacle2.setName("ObstacleB");
                Obstacle3.setName("ObstacleC");

                Obstacle1.start();
                Obstacle2.start();
                Obstacle3.start();
        }
}

