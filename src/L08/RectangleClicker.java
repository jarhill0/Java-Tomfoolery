package L08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RectangleClicker extends JPanel implements MouseListener {

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;
    private MouseEvent mouseDown;
    private MouseEvent mouseUp;
    private Color[] rainbow = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
    private int colorIndex = -1; // So when it's updated, it will start at 0

    public RectangleClicker() {
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
        if (mouseUp != null && mouseDown != null) {
            int downX = mouseDown.getX();
            int downY = mouseDown.getY();
            int width = mouseUp.getX() - downX;
            int height = mouseUp.getY() - downY;

            if (width < 0) {
                width *= -1;
                downX -= width;
            }

            if (height < 0) {
                height *= -1;
                downY -= height;
            }

            updateColor(g);
            g.fillRect(downX, downY, width, height);
        }
    }

    public void mouseReleased(MouseEvent event) {
        mouseUp = event;
        repaint();
    }

    public void mousePressed(MouseEvent event) {
        mouseDown = event;
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
        new RectangleClicker();
    }

}
