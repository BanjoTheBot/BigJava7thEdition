package ch02.exercises;

import java.awt.Rectangle;

public class AreaTester {

    public static void main(String[] args){

        Rectangle wrecky = new Rectangle(20, 40);

        System.out.print("The area of the rectangle is: ");
        System.out.println(wrecky.getWidth() * wrecky.getHeight());
    }
}
