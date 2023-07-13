package ch02.exercises;

import java.awt.Color;

public class BrighterDemo {

    public static void main(String[] args) {
        Color bright = new Color(50, 100, 150);
        System.out.print("Before Brightening: ");
        System.out.println(bright);

        // Apply the brighter method
        bright.brighter();
        System.out.print("After: ");
        System.out.println(bright);
    }
}
