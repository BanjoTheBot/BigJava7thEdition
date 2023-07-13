package ch02.exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class ColorNameComponent extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.RED);
        g2.drawString("Red", 20, 10);

        g2.setColor(Color.ORANGE);
        g2.drawString("Orange", 20, 20);

        g2.setColor(Color.YELLOW);
        g2.drawString("Yellow", 20, 30);

        g2.setColor(Color.GREEN);
        g2.drawString("Green", 20, 40);

        g2.setColor(Color.CYAN);
        g2.drawString("Cyan", 20, 50);

        g2.setColor(Color.BLUE);
        g2.drawString("Blue", 20, 60);

        g2.setColor(Color.MAGENTA);
        g2.drawString("Magenta", 20, 70);

        g2.setColor(Color.PINK);
        g2.drawString("Pink", 20, 80);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString("Light Gray", 20, 90);

        g2.setColor(Color.GRAY);
        g2.drawString("Gray", 20, 100);

        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Dark Gray", 20, 110);

        g2.setColor(Color.BLACK);
        g2.drawString("Black", 20, 120);
    }
}
