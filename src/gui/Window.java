package gui;

import cpts.Montre;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;

public class Window extends JFrame {
    //private HourLabel hourLabel;
    private JLabel hourLabel;
    private ButtonPanel btnPanel;
    private Montre montre;

    public Window() {
        montre = new Montre(this);

        setTitle("Montre");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel container = (JPanel) getContentPane();

        hourLabel = new JLabel(montre.getTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        hourLabel.setPreferredSize(new Dimension(300, 150));
        hourLabel.setFont(new Font("Arial", Font.BOLD, 40));
        hourLabel.setHorizontalAlignment(JLabel.CENTER);
        container.add(hourLabel, BorderLayout.CENTER);

        btnPanel = new ButtonPanel(this);
        btnPanel.setPreferredSize(new Dimension(300, 50));
        container.add(btnPanel, BorderLayout.SOUTH);


    }

    //Getters & Setters
    public Montre getMontre() {
        return montre;
    }
    public ButtonPanel getBtnPanel() {
        return btnPanel;
    }
    public JLabel getHourLabel() {
        return hourLabel;
    }
}
