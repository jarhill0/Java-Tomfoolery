package L07;

import java.awt.*;
import javax.swing.*;

public class Greetings2 extends JPanel {

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;

    public Greetings2() {
        JFrame easel = new JFrame();
        easel.setSize(myWindowWidth, myWindowHeight);
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.setResizable(false);
        easel.add(this);
        easel.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        newDrawRect(g, 10, 10, 100, 50);
        newDrawRect2(g, 100, 50, 30, 30);

    }


    // Step 25 Write newDrawRect2 here, which calls drawLine four times.
    public void newDrawRect2(Graphics g, int tlx, int tly, int width, int height) {
        newDrawRect(g, tlx, tly, tlx + width, tly + height);
    }

    // Step 26 This method takes top-left x, top-left y, bottom-right x, bottom-right y to define
    //  a rectangle.  It should take drawRect.
    public void newDrawRect(Graphics g, int tlx, int tly, int brx, int bry) {
        g.drawLine(tlx, tly, brx, tly);
        g.drawLine(brx, tly, brx, bry);
        g.drawLine(brx, bry, tlx, bry);
        g.drawLine(tlx, bry, tlx, tly);

    }

    public static void main(String[] args) {
        new Greetings2();
    }
}
