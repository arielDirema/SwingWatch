import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalWatch {
    private JFrame frame;
    private JLabel timeLabel;
    private LocalTime currentTime;

    public DigitalWatch() {
        frame = new JFrame("Digital Watch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        currentTime = LocalTime.now();
        timeLabel = new JLabel(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")), SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 48));
        frame.add(timeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton hourButton = new JButton("Add 1 Hour");
        JButton minuteButton = new JButton("Add 1 Minute");

        hourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentTime = currentTime.plusHours(1);
                updateTimeDisplay();
            }
        });

        minuteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentTime = currentTime.plusMinutes(1);
                updateTimeDisplay();
            }
        });

        buttonPanel.add(hourButton);
        buttonPanel.add(minuteButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentTime = currentTime.plusSeconds(1);
                updateTimeDisplay();
            }
        });
        timer.start();

        frame.setVisible(true);
    }

    private void updateTimeDisplay() {
        timeLabel.setText(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DigitalWatch();
            }
        });
    }
}