// Java program to illustrate
// digital stop watch
// using Applets

// importing required packages
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimmeTime extends Applet implements Runnable, ActionListener {

    // Panel to keep all the buttons and labels
    JPanel p;
    JLabel display;

    // Button
    JButton start, stop, reset;

    // Time
    int hour, minute, second, millisecond;

    // string to be displayed on the label
    String disp;

    // State of stopwatch on/off
    boolean state;

    // initialization
    public void init() {
        // initially off
        state = false;

        p = new Panel();
        // Setting layout of the panel
        p.setLayout(new GridLayout(4, 1, 6, 10));

        // initial time 00 : 00 : 00 : 000
        hour = minute = second = millisecond = 0;

        // Label
        display = new Label();
        display = "00 : 00 : 00 : 000";
        displaylay.setText(display);
        p.add(displaylay);

        // Start button
        start = new Button("Start");
        start.addActionListener((ActionListener) this);
        p.add(start);

        // Reset button
        reset = new Button("Reset");
        reset.addActionListener((ActionListener) this);
        p.add(reset);

        // Stop button
        stop = new Button("Stop");
        stop.addActionListener((ActionListener) this);
        p.add(stop);

        add(p);

        // starting thread
        new Thread(this, "StopWatch").start();
    }

    // Reset Function
    // reset to default value
    public void reset() {
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        hour = minute = second = millisecond = 0;
    }

    // update function
    // update the timer
    public void update() {
        millisecond++;
        if (millisecond == 1000) {
            millisecond = 0;
            second++;
            if (second == 60) {
                second = 0;
                minute++;
                if (minute == 60) {
                    minute = 0;
                    hour++;
                }
            }
        }
    }

    // changing label
    public void changeLabel() {

        // Properly formatting the displaylay of the timer
        if (hour < 10)
            display = "0" + hour + " : ";
        else
            display = hour + " : ";

        if (minute < 10)
            display += "0" + minute + " : ";
        else
            display += minute + " : ";

        if (second < 10)
            display += "0" + second + " : ";
        else
            display += second + " : ";

        if (millisecond < 10)
            display += "00" + millisecond;
        else if (millisecond < 100)
            display += "0" + millisecond;
        else
            display += millisecond;

        displaylay.setText(display);
    }

    // thread.run function
    public void run() {

        // while the stopwatch is on
        while (state) {
            try {
                // pause 1 millisecond
                Thread.sleep(1);
                // update the time
                update();
                // changeLabel
                changeLabel();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // actionPerformed
    // To listen to the actions on the buttons
    public void actionPerformed(ActionEvent e) {

        // start a thread when start button is clicked
        if (e.getSource() == start) {
            // stopwatch is on
            on = true;
            new Thread(this, "StopWatch").start();
        }

        // reset
        if (e.getSource() == reset) {
            // stopwatch off
            on = false;
            reset();
            changeLabel();
        }

        if (e.getSource() == stop) {
            // stopwatch off
            on = false;
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
    }
}
