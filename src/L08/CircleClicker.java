package L08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CircleClicker extends JPanel implements MouseListener {

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;
    private MouseEvent latestClick;
    private Color[] rainbow = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
    private int colorIndex = 0;
    private long mouseDownTime;


    public CircleClicker() {
        JFrame myFrame = new JFrame();
        myFrame.setSize(myWindowWidth, myWindowHeight);
        myFrame.add(this);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void paintComponent(Graphics g) {
        if (latestClick != null) {
            updateColor(g);
            int x = latestClick.getX();
            int y = latestClick.getY();

            int size = (int) (System.currentTimeMillis() / 10L - mouseDownTime);
            g.fillOval(x - size / 2, y - size / 2, size, size);

        }
    }

    public void mouseReleased(MouseEvent event) {
        latestClick = event;
        repaint();
    }

    public void mousePressed(MouseEvent event) {
        mouseDownTime = System.currentTimeMillis() / 10L;
    }

    public void mouseEntered(MouseEvent event) {
    }

    public void mouseExited(MouseEvent event) {
    }

    private void updateColor(Graphics g) {
        colorIndex = (colorIndex + 1) % rainbow.length;
        g.setColor(rainbow[colorIndex]);
    }

    public static void main(String[] args) {
        new CircleClicker();
    }

}
