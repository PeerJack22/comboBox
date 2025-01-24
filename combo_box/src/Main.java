import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo box");
        frame.setContentPane(new boxVentana().boxPanel);
        frame.setSize(1200,720);
        frame.setPreferredSize(new Dimension(1200,720));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}