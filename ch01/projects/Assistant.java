package ch01.projects;

import java.util.Scanner;

public class Assistant {
    
    public static void main (String[] args){
        // This is supposedly meant to be done like DialogViewer, but that doesn't work in codespaces
        // That's where I am right now so :(

        Scanner name = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What's ya name? ");

        String yaName = name.nextLine();  // Read user input
        System.out.print("Hello, " + yaName);
        
        Scanner demand = new Scanner(System.in);
        System.out.println(", what would you like me to do? ");
        String yaDemand = demand.nextLine(); 

        System.out.println("I'm sorry, " + yaName + ", I can't " + yaDemand + " for you :(");
        // This is to stop it complaining
        name.close();
        demand.close();
    }
}
