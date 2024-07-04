import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StopwatchWithLapGUI {
    private JFrame frame;
    private JLabel timeLabel;
    private JButton startButton;
    private JButton lapButton;
    private JButton stopButton;
    private JTextArea lapTextArea;
    private Timer timer;
    private long startTime;
    private ArrayList<Long> lapTimes;

    public StopwatchWithLapGUI() {
        frame = new JFrame("Stopwatch with Lap Feature");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 36));
        timeLabel.setBounds(70, 10, 40, 20);
        frame.add(timeLabel);

        startButton = new JButton("Start");
        lapButton = new JButton("Lap");
        stopButton = new JButton("Stop");

        lapButton.setEnabled(false);
        stopButton.setEnabled(false);

        startButton.setBounds(50, 50, 20, 20);
        stopButton.setBounds(80, 50, 20, 20);
        lapButton.setBounds(110, 50, 20, 20);


        frame.add(startButton);
        frame.add(lapButton);
        frame.add(stopButton);

        lapTextArea = new JTextArea(10, 20);
        lapTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(lapTextArea);
        frame.add(scrollPane);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false);
                lapButton.setEnabled(true);
                stopButton.setEnabled(true);
                startTime = System.currentTimeMillis();
                timer.start();
            }
        });

        lapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    long lapTime = System.currentTimeMillis() - startTime;
                    lapTimes.add(lapTime);
                    lapTextArea.append("Lap " + lapTimes.size() + ": " + formatTime(lapTime) + "\n");
                }
                System.out.println(lapTimes);
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    timer.stop();
                    lapButton.setEnabled(false);
                    startButton.setEnabled(true);
                    stopButton.setEnabled(false);
                }
            }
        });

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long currentTime = System.currentTimeMillis();
                long elapsedTime = currentTime - startTime;
                timeLabel.setText(formatTime(elapsedTime));
            }
        });

        lapTimes = new ArrayList<>();

        frame.pack();
        frame.setVisible(true);
    }

    private String formatTime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        seconds %= 60;
        minutes %= 60;
        hours %= 24;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopwatchWithLapGUI();
            }
        });
    }
}
