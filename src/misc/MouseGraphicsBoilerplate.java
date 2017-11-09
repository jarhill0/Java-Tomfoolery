package misc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseGraphicsBoilerplate extends JPanel implements MouseListener {
    int window_width = 0;
    int window_height = 0;

    public MouseGraphicsBoilerplate() {
        JFrame easel = new JFrame();
        easel.setSize(window_width, window_height);
        easel.add(this);
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.setVisible(true);

        addMouseListener(this);  // new
    }

    public void mouseClicked(MouseEvent e) {
        // statements that handle a mouse click
        // e.getX ( ) and e.getY ( ) return the coordinates of the click.
        repaint();  // results in callback to paintComponent
    }

    public void paintComponent(Graphics g) {
        // statements that draw on the window
    }

    public void mouseReleased(MouseEvent event) {
    }

    public void mousePressed(MouseEvent event) {
    }

    public void mouseEntered(MouseEvent event) {
    }

    public void mouseExited(MouseEvent event) {
    }
}