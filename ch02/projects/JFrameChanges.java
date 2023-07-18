package ch02.projects;

import javax.swing.*;
import java.awt.*;

public class JFrameChanges {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200, 200);

        JTextField text = new JTextField("Hello, Mackerel");
        // setBackground doesn't accept raw RGB values, so it has to be a new Color
        text.setBackground(new Color(152, 251, 152));
        frame.add(text);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
