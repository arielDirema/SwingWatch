import com.formdev.flatlaf.FlatIntelliJLaf;
import gui.Window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());

        Window window = new Window();
        window.setVisible(true);
    }
}