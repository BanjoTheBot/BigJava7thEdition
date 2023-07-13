package ch02.exercises;

import javax.swing.JFrame;

public class ColorNameViewer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200, 1000);
        frame.setTitle("A talkative rainbow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorNameComponent component = new ColorNameComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
