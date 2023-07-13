package ch02.exercises;

import java.awt.Rectangle;

public class PerimeterTester {

    public static void main(String[] args){

        Rectangle fixy = new Rectangle(30, 50);

        System.out.print("The perimeter of the rectangle is: ");
        System.out.println((fixy.getWidth() + fixy.getHeight()) * 2);
    }
}
