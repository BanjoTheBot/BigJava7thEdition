package ch02.exercises;

import java.awt.Rectangle;

public class FourRectanglePrinter {

    public static void main(String[] args){

        Rectangle circle = new Rectangle(10, 20);

        // Top Left
        System.out.println(circle);
        circle.translate(10, 0);
        // Top Right
        System.out.println(circle);
        circle.translate(-10, 20);
        // Bottom Left
        System.out.println(circle);
        circle.translate(10, 0);
        // Bottom Right
        System.out.println(circle);
    }
}
