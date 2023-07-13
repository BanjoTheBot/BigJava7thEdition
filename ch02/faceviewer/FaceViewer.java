package ch02.faceviewer;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FaceViewer {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500, 220);
        frame.setTitle("An Important Message");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FaceComponent face = new FaceComponent();
        frame.add(face);

        frame.setVisible(true);
    }
}
