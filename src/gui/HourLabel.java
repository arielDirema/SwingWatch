package gui;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HourLabel extends JLabel {
    private DateTimeFormatter timeFormatter;
    private LocalTime time = LocalTime.now();

    public HourLabel() {
        timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        setFont(new Font("Arial", Font.BOLD, 40));
        setHorizontalAlignment(JLabel.CENTER);

        Timer timer = new Timer(1000, e -> {
            time = time.plusSeconds(1);
            updateTime();
        });
        timer.start();

        updateTime();
    }

    private void updateTime() {
        setText(time.format(timeFormatter));
    }

    public void updateTimeDisplay(){
        setText(time.format(timeFormatter));
    }

    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
}
