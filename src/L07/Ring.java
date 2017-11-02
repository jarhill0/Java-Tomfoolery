package L07;

import java.awt.*;
import javax.swing.*;

public class Ring extends JPanel {
    // instance variables - replace the example below with your own
    private int myWindowWidth = 400;
    private int myWindowHeight = 300;


    public Ring() {
        // initialise instance variables
        JFrame easel = new JFrame();
        easel.setSize(myWindowWidth, myWindowHeight);
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.add(this);
        easel.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        drawRings(g);
    }

    private void drawRings(Graphics g) {
        int startX = 10;
        int startY = 10;
        int size = 100;
        g.setColor(Color.blue);
        g.drawOval(startX, startY, size, size);
        g.setColor(Color.gray);
        g.drawOval(startX + size, startY, size, size);
        g.setColor(Color.red);
        g.drawOval(startX + 2 * size, startY, size, size);
        g.setColor(Color.yellow);
        g.drawOval(startX + size / 2, startY + size / 2, size, size);
        g.setColor(Color.green);
        g.drawOval(startX + 3 * size / 2, startY + size / 2, size, size);
    }

    public static void main(String[] args) {
        new Ring();
    }
}
