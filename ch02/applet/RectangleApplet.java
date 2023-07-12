package ch02.applet;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;

// This book is severely outdated lmao

public class RectangleApplet extends JApplet{

    public void paint(Graphics g){

        // Prepare for extended graphics
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);
    }
}
