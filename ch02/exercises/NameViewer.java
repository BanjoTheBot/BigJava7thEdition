package ch02.exercises;

import javax.swing.JFrame;

public class NameViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("ahahaha");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NameComponent component = new NameComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
