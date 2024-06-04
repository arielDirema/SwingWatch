package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonPanel extends JPanel {

    public ButtonPanel(Window window) {
        setLayout(new FlowLayout());

        JButton btn1 = new JButton("Boutton 1");
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    //JOptionPane.showMessageDialog(window, "Double clic détecté!");
                    window.getMontre().getEtatCourant().appuyer2xBouton1(window.getMontre());
                }else if (e.getClickCount() == 1) {
                    window.getMontre().getEtatCourant().appuyerBouton1(window.getMontre());
                }
            }
        });
        add(btn1);

        JButton btn2 = new JButton("Boutton 2");
        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                window.getMontre().getEtatCourant().appuyerBouton2(window.getMontre());
            }
        });
        add(btn2);
    }
}
