import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class RaceThread extends Thread {
    // String ThreadName;
    JLabel label;
    JPanel square1, square2, square3;
    JFrame fr;

    public RaceThread() { // CLASS CONSTRUCTOR
        buildGUI();
    }

    public void run() { // OVERRIDEN RUN METHOD
        if (Thread.currentThread().getName().equals("Obstacle I")) {
            runObstacleA();
        }
        if (Thread.currentThread().getName().equals("Obstacle II")) {
            runObstacleB();
        }
        if (Thread.currentThread().getName().equals("Obstacle III")) {
            runObstacleC();
        }
    }

    public void buildGUI() {
        fr = new JFrame("Java Race"); // INITIALIZATION
        fr.setVisible(true);
        fr.setSize(700, 1000);

        label = new JLabel(""); // INITIALIZATION
        label.setBounds(10, 10, 700, 50);

        square1 = new JPanel(); // INITIALIZATION
        // square1.setSize(30, 30);
        square1.setBounds(10, 50, 30, 30);
        square1.setBackground(Color.GREEN);
        fr.add(square1);

        square2 = new JPanel(); // INITIALIZATION
        square2.setBounds(10, 30, 30, 30);
        square2.setBackground(Color.RED);
        fr.add(square2);

        square3 = new JPanel(); // INITIALIZATION
        square3.setBounds(10, 70, 30, 30);
        square3.setBackground(Color.MAGENTA);
        fr.add(square3);
    }

    public void runObstacleA() { // OBSTACLE METHOD
        Random ran = new Random();
        int r = ran.nextInt(1000);
        for (int i = -5; i < 700; i++) {
            square1.setBounds(i, r, 30, 30);
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        runObstacleC();
    }

    public void runObstacleB() { // OBSTACLE METHOD
        Random ran = new Random();
        int r = ran.nextInt(200);
        for (int i = -5; i < 700; i++) {
            square2.setBounds(i, r, 30, 30);
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        runObstacleA();
    }

    public void runObstacleC() { // OBSTACLE METHOD
        Random ran = new Random();
        int r = ran.nextInt(700);
        for (int i = -5; i < 700; i++) {
            square3.setBounds(i, r, 30, 30);
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        runObstacleB();
    }

    public static void main(String args[]) {
        RaceThread obj = new RaceThread();
        // RaceThread obj1 = new RaceThread();
        // obj.start();
        // obj1.start();
        // obj.setName(null);

        Thread Obstacle1 = new Thread(obj); // CREATING REF OF THREAD CLASS
        Thread Obstacle2 = new Thread(obj); // CREATING REF OF THREAD CLASS
        Thread Obstacle3 = new Thread(obj); // CREATING REF OF THREAD CLASS

        // SETTING NAME OF THREADS
        Obstacle1.setName("Obstacle I");
        Obstacle2.setName("Obstacle II");
        Obstacle3.setName("Obstacle III");

        // STARTING THE THREADS
        Obstacle1.start();
        Obstacle2.start();
        Obstacle3.start();
    }
}