package ch02.exercises;

public class HollePrinter {

    public static void main(String[] args) {
        String holly = "Hello World!";

        /*
        The point of this program is to swap around the E's and O's in "Hello World"
        The replacement is achieved by first changing one letter to a completely unrelated one,
        stopping it from getting rid of one particular letter.
        If not for the third letter, it would only output "Hollo World" or "Helle Werld"
         */

        holly = holly.replace('o', 'q');
        holly = holly.replace('e', 'o');
        holly = holly.replace('q', 'e');

        System.out.println(holly);
    }
}
