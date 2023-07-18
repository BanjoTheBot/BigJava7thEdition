package ch02.exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

// This looks nothing like it's meant to, but it looks cool and I'm too lazy to fix it
public class FaceComponent extends JComponent {

    public void paintComponent(Graphics g){

        // I will never remember how to do this off by heart
        Graphics2D g2 = (Graphics2D) g;

        // The face parts
        Ellipse2D.Double head = new Ellipse2D.Double(250, 250, 200, 200);
        Ellipse2D.Double eye1 = new Ellipse2D.Double(250, 270, 100, 100);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(350, 270, 100, 100);
        Line2D.Double mouth = new Line2D.Double(300, 400, 400, 400);

        g2.draw(head);
        g2.draw(eye1);
        g2.draw(eye2);
        g2.draw(mouth);
    }
}
