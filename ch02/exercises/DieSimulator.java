package ch02.exercises;

import java.util.Random;

public class DieSimulator {

    // Simulates dice rolling
    public static void main(String[] args) {
        Random gen = new Random();
        // Sets it so it can be any number between 0 and 7, but cannot be 0 or 7
        System.out.println(gen.nextInt(0, 7));
    }
}
