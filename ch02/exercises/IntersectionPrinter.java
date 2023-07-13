package ch02.exercises;

import java.awt.Rectangle;

public class IntersectionPrinter {

    public static void main(String[] args){

        Rectangle rect = new Rectangle(5, 10);
        Rectangle angle = new Rectangle(10, 5);

        // The rectangle representing the intersect
        Rectangle sect = rect.intersection(angle);

        System.out.println(sect);

        // You can tell if the result is empty if all it's values equal 0
    }
}
