package L07;

import java.awt.*;
import javax.swing.*;

public class Target extends JPanel {
    // instance variables - replace the example below with your own
    private int myWindowWidth = 408;
    private int myWindowHeight = 430;
    static Color red = new Color(220, 10, 40);
    static Color black = new Color(0, 0, 40);


    public Target() {
        // initialise instance variables
        JFrame easel = new JFrame();
        easel.setSize(myWindowWidth, myWindowHeight);
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.setResizable(false);
        easel.add(this);
        easel.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        int xStepSize = (myWindowWidth - 8) / 9;
        int yStepSize = (myWindowHeight - 30) / 9;
        int xPoint = 0;
        int yPoint = 0;
        int width = myWindowWidth - 8;
        int height = myWindowHeight - 30;

        for (int i = 0; i < 5; i++) {
            switchColor(g);
            g.fillOval(xPoint, yPoint, width, height);
            xPoint += xStepSize;
            yPoint += yStepSize;
            width -= 2 * xStepSize;
            height -= 2 * yStepSize;
        }

    }

    private void switchColor(Graphics g) {
        g.setColor(g.getColor().equals(red) ? black : red);
    }

    public static void main(String[] args) {
        new Target();
    }
}
