package ch02.exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class NameComponent extends JComponent {

    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        // Worst class name ever, don't make stupid ones like this
        Rectangle daBaDeeDaBaDi = new Rectangle(10, 10, 55, 40);

        g2.setColor(Color.BLUE);
        g2.fill(daBaDeeDaBaDi);

        g2.setColor(Color.RED);
        g2.drawString("Lachalini", 10, 32);
    }
}
