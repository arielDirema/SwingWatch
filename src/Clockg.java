import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clockg extends JFrame {
    private JLabel timeLabel;
    private DateTimeFormatter timeFormatter;

    public Clockg() {
        setTitle("Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();

        updateTime(); // Initial call to set the time immediately

        setVisible(true);
    }

    private void updateTime() {
        LocalTime time = LocalTime.now();
        timeLabel.setText(time.format(timeFormatter));
    }

}
