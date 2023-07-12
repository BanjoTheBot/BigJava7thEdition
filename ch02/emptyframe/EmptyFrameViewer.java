package ch02.emptyframe;

import javax.swing.JFrame;

public class EmptyFrameViewer {

    public static void main(String[] args){
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("The Void");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        // Self Check: How can a program display two frames at once?
        JFrame frame1 = new JFrame();

        frame1.setSize(400, 300);
        frame1.setTitle("The Void, again");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setVisible(true);

    }
}
