package ch02.exercises;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

// Creates an ellipse that is always touching the sides of the frame

public class EllipseBoundaryViewer {

    private static int fat = 500;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(fat, 600);
        frame.setTitle("Forever Wide");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EllipseBoundaryComponent component = new EllipseBoundaryComponent();
        frame.add(component);

        // Listens for when the window is resized
        frame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                fat = frame.getWidth();
                component.repaint();
                frame.repaint();
            }
        });

        frame.setVisible(true);
    }

    // Returns fat, so it can be found by the component file
    public static int getSize() {
        return fat;
    }
}
