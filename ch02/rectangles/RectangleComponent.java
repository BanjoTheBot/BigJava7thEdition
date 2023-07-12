package ch02.rectangles; // Why have a rectangle folder AND a rectangles folder?

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent {

    public void paintComponent(Graphics g){

        // Recovers Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct and draw a rectangle
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);

        // Move the rectangle
        box.translate(15, 25);

        // Draw the moved rectangle
        g2.draw(box);
    }
}
