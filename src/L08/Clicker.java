package L08;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Clicker extends JPanel implements MouseListener {

    private int myWindowWidth = 300;
    private int myWindowHeight = 400;
    private int offset = 15;

    public Clicker() {
        JFrame myFrame = new JFrame();
        myFrame.setSize(myWindowWidth, myWindowHeight);
        myFrame.add(this);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        offset = offset + 15;
        repaint();
    }

    public void paintComponent(Graphics g) {
        for (int o = 15; o <= offset; o += 15) {
            g.drawString("You're tickling me!", 10, o);
        }
    }

    public void mouseReleased(MouseEvent event) {
    }

    public void mousePressed(MouseEvent event) {
    }

    public void mouseEntered(MouseEvent event) {
    }

    public void mouseExited(MouseEvent event) {
    }

    public static void main(String[] args) {
        new Clicker();
    }

}
