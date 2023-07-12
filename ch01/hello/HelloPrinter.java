package ch01.hello; // For some reason this has to be a thing
public class HelloPrinter
{
    // Apprently this is being simplified in Java 21, I'll do it like this for now though
    // Everything in main is executed with the program run
    public static void main (String[] args)
    {
        // Method Calls: object.methodName(parameters)

        // Golly gee I wonder what this does...
        System.out.println("Hello, World!");
        System.out.println(4 + 5);

        // Using print without the ln prints an item without creating a second line
        System.out.print("00");
        System.out.println(3 + 4);
    }
}