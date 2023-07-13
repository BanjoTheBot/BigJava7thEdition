package ch02.exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class TwoSquareComponent extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        // Sets custom RGB to be used afterwards
        Color myColor = new Color(32, 192, 217);
        Rectangle box1 = new Rectangle(20, 20, 50, 60);
        Rectangle box2 = new Rectangle(20, 100, 50, 60);

        // Accidentally trans flag colours lmao
        // Trans Rights btw
        g2.setColor(Color.PINK);
        g2.fill(box1);

        g2.setColor(myColor);
        g2.fill(box2);
    }
}
