package L08;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SimpleClicker extends JPanel implements MouseListener {

    private Color backgroundColor = Color.BLACK;
    private long mouseDownTime;

    public SimpleClicker() {
        JFrame myFrame = new JFrame();
        myFrame.setSize(300, 300);
        myFrame.add(this);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent event) {
        if (mouseDownTime + 100 > System.currentTimeMillis()) // check if it was a short click, or a click-and-hold
            respondWithColor(Color.BLACK);
    }

    public void mouseReleased(MouseEvent event) {
        respondWithColor(Color.RED);
    }

    public void mousePressed(MouseEvent event) {
        mouseDownTime = System.currentTimeMillis();
        respondWithColor(Color.GREEN);
    }

    public void mouseEntered(MouseEvent event) {
    }

    public void mouseExited(MouseEvent event) {
    }

    public void paintComponent(Graphics g) {
        g.setColor(backgroundColor);
        g.fillRect(0, 0, 300, 300);
    }

    private void respondWithColor(Color c) {
        backgroundColor = c;
        repaint();
    }

    public static void main(String[] args) {
        new SimpleClicker();
    }
}
