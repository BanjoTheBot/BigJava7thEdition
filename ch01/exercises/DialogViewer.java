package ch01.exercises;

import javax.swing.JOptionPane;

public class DialogViewer {
    // This program not working might be a problem out of my control?
    // It seems to be a problem with codespaces
    
    public static void main (String args[]){
        String name = JOptionPane.showInputDialog("What is your name? ");
        // This produces errors when using println
        // It might be a difference between the current java and the book's?
        System.out.println("Hello, " + name + "!");
        System.exit(0);
    }
}
