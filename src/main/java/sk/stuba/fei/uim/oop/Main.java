package sk.stuba.fei.uim.oop;


import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 200);
        this.setVisible(true);
        this.add(new MyFakeCanvas());
    }
}
