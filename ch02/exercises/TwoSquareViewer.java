package ch02.exercises;

import javax.swing.JFrame;

public class TwoSquareViewer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("GRAAAAAAHAHAHAHAHA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
