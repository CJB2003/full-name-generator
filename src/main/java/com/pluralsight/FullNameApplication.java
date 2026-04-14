package com.pluralsight;
import java.util.*;

public class FullNameApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Asking for names, first, middle, last, suffix
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = myScanner.nextLine().trim();
        System.out.print("Middle initial: ");
        String middleInitial = myScanner.nextLine().trim();
        System.out.print("Last name: ");
        String lastName = myScanner.nextLine().trim();
        System.out.print("Suffix: \n");
        String suffix = myScanner.nextLine().trim();

        //create variable for full name so I can concat them later
        String fullName = firstName;

        //checks if middle name is not empty
        if (!middleInitial.isEmpty()) {
            fullName += " " + middleInitial + ".";
        }
        //last name is always added to the full name
        fullName += " " + lastName;

        //checks is suffix is not empty
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        //print out full name
        System.out.print("Full name: " + fullName );

    }
}
