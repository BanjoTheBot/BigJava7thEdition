package ch02.exercises;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/*
* Ellipse width = Boundaries for JFrame
* Repaint constantly*/
public class EllipseBoundaryComponent extends JComponent {


    public void paintComponent(Graphics g){

        int fat = EllipseBoundaryViewer.getSize();

        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double circle = new Ellipse2D.Double(0, 200, fat, 200);

        g2.setColor(Color.BLUE);
        g2.fill(circle);
    }
}
