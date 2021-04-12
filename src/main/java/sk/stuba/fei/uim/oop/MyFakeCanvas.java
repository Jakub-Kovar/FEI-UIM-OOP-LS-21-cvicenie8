package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class MyFakeCanvas extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(50, 50, 100, 100);
    }
}
