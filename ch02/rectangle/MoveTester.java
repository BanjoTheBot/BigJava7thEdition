package ch02.rectangle;

import java.awt.Rectangle;

public class MoveTester {

    public static void main(String[] args){
        Rectangle box = new Rectangle(5, 10, 20, 30); // X, Y, Width, Height

        // Move the rectangle by adding to it's x and y values
        box.translate(15, 25);

        // Print information about the moved rectangle
        System.out.print("X: ");
        System.out.println(box.getX()); // getX is an accessor method for Rectangle
        System.out.println("Should be 20?");

        System.out.print("Y: ");
        System.out.println(box.getY()); // getY is an accessor method for Rectangle
        System.out.println("Should be 35?");
    }

}
