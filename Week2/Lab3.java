//**************************************************
// Name: Jason Sigler                              
// Title: Lab3.java
// Description: Compares the equivalence and length of
//              two strings using if statements.
// Time spent: 20 minutes
// Date: 5/27/2018
//**************************************************

import java.util.Scanner;

public class Lab3 {
	
	public static void main(String[] args) {
		//Initialize the strings:
        String stringOne, stringTwo;

        //Invoke a new scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user for input and assign values to stringOne and stringTwo
        System.out.println("This will determine if two strings are the same");
        System.out.print("Enter the first string:");
        stringOne = input.nextLine();
        System.out.print("Enter the second string:");
        stringTwo = input.nextLine();

        //compare the two strings and return the comparison
        if (stringOne.equals(stringTwo))
        {
            System.out.println("\nThe strings are the same");
        }
        else
        {
            System.out.println("\nThe strings are not the same");

        } // End of if loop

        //Compare the length of two strings and return the results
        if (stringOne.length() == stringTwo.length())
        {
            System.out.println("The strings are the same length");
        }
        else
        {
            System.out.println("The strings are not the same length");
        }//end of if loop


	} // End of main method
} // End of Lab3 class