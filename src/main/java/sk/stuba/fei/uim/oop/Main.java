package sk.stuba.fei.uim.oop;


import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        File myFile = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"myTextFile");
        FileReader fileReader;
        try {
             fileReader = new FileReader(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        BufferedReader reader = new BufferedReader(fileReader);

        try {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
