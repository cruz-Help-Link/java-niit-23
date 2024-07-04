import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class StopWatchTimer implements ActionListener {
    JTextfield txf, txf1, txf2;
    JButton start = new JButton("START");
    JButton reset = new JButton("RESET");
    JButton lap = new JButton("LAP");
    JLabel label = new JLabel();
    JFrame frame = new JFrame("StopWatchTimer");
    int elapsed = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean state = false;
    String sSeconds =String.format("%02d", seconds); //to display two zeros 00:00:00
    String sMinutes =String.format("%02d", minutes);
    String sHours =String.format("%02d", hours); 

    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            elapsed = (elapsed + 1000);
            hours = (elapsed/3600000);
            minutes = (elapsed/60000) % 60;
            minutes = (elapsed/1000) % 60;


            sSeconds =String.format("%02d", seconds);
            sMinutes =String.format("%02d", minutes);
            sHours =String.format("%02d", hours); 
            label.setText(sHours+ ":" + sMinutes+ ":" + sSeconds);

        }
    });

    StopWatchTimer () {
        label.setText(sHours+ ":" + sMinutes+ ":" + sSeconds);
        label.setBounds(100, 100, 2150, 100);
        label.setFont(new Font("Verdana", Font.PLAIN, 45));
        label.setBorder(BorderFactory.createBevelBorder(1));
        label.setOpaque(true);
        label.setHorizontalAlignment(JTextField.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 250);
        frame.setLayout(null);
        frame.setVisible(true);

        start.setBounds(100, 200, 100, 60);
        start.setFont(new Font("New Times Roman",Font.PLAIN, 25));
        start.setFocusable(false);
        start.addActionListener(this);


        reset.setBounds(200, 200, 100, 60);
        reset.setFont(new Font("New Times Roman",Font.PLAIN, 25));
        reset.setFocusable(false);
        reset.addActionListener(this);

        lap.setEnabled(false);


        frame.add(label);
        frame.add(start);
        frame.add(reset);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            start();
            if (state == false) {
                state = true;
                start.setText("STOPS");
                start();
            }
            else {
                state = false;
                start.setText("START");
                stop();
            }
        }
        if (e.getSource() == reset) {
            state = false;
            start.setText("START");
            reset();
        }
    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();

    }

    void reset() {
        timer.stop();
        elapsed = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;

        sSeconds =String.format("%02d", seconds);
        sMinutes =String.format("%02d", minutes);
        sHours =String.format("%02d", hours); 
        label.setText(sHours+ ":" + sMinutes+ ":" + sSeconds);
    }

    public static void main(String args[]) {
        StopWatchTimer obj = new StopWatchTimer();
        // Thread StopWatchTimer = new Thread(obj); //Initialize thread
        // StopWatchTimer.start();
        }
    
}
    
