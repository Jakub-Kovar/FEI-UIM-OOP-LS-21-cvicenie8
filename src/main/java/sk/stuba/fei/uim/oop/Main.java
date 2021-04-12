package sk.stuba.fei.uim.oop;


import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        InputStream is = Main.class.getClassLoader().getResourceAsStream("myTextFile");

        if(is == null) {
            System.out.println("'myTextFile' nie je v resourceoch");
            return;
        }

        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader reader = new BufferedReader(isr);

        try {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
