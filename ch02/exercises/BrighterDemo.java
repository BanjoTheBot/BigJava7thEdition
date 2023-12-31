package ch02.exercises;

import java.awt.Color;

public class BrighterDemo {

    public static void main(String[] args) {
        Color bright = new Color(50, 100, 150);
        System.out.print("Before Brightening: ");
        System.out.println(bright);

        // Apply the brighter method
        // As it turns out, before I was doing it in a way that it wasn't saving the new value
        // This could be fixed by reassignment, but just printing it straight out works
        System.out.print("After: ");
        System.out.println(bright.brighter());
    }
}
