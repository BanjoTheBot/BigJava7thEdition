package ch02.exercises;

public class ReplaceTester {

    public static void main(String[] args) {

        String miss = "Mississippi";

        // Reassign miss everytime a character is encrypted
        miss = miss.replace('i', '!');
        miss = miss.replace('s', '$');
        System.out.print("Gettin' born in the state of ");
        System.out.print(miss);
        System.out.println(", Papa was a copper and her Mama was a hippy");
    }
}
