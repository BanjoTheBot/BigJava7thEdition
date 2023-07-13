package ch02.exercises;

import java.util.Random;

public class LotteryPrinter {

    public static void main(String[] args) {
        Random lottery = new Random();
        System.out.println("If you put this in the lottery, I'm sure it'll work!");
        // Using a for loop because I'm fancy
        for (int i=0; i<6; i++){
            System.out.println(lottery.nextInt(0, 50));
        }
    }
}
