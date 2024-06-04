package cpts;

import gui.Window;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Montre {
    private LocalTime time = LocalTime.now();

    private Etat etatCourant;

    //Constructors
    public Montre(){}
    public Montre(Window window) {
        this.etatCourant = new Affichage();

        Timer timer = new Timer(1000, e -> {
            time = time.plusSeconds(1);
            updateTime(window);
        });
        timer.start();
    }

    public void updateTime(Window window) {
        window.getHourLabel().setText(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    //Getters & Setters

    public LocalTime getTime() {
        return time;
    }
    public Etat getEtatCourant() {
        return etatCourant;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    public void setEtatCourant(Etat etatCourant) {
        this.etatCourant = etatCourant;
    }
}
