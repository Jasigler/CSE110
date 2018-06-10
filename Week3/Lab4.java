//**************************************************
// Name: Jason Sigler
// Title: Lab4.java
// Description: A program that reads input integers
//              and terminates a loop on a sentinel value.
// Time spent: 45 minutes
// Date: 6/3/2018
//**************************************************

import java.util.Scanner;


public class Lab4 {


    public static void main(String[] args){

        //Invoke a scanner and declare variables:
        Scanner input = new Scanner(System.in);

        int totalCount = 0;
        int evenCount = 0, oddCount = 0;
        int sum = 0;
        int currentInt;

        //Prompt user for first input and assign value to min & max

        System.out.println("Enter a series of values (0 to quit) ");
        currentInt = input.nextInt();
        int maxValue = currentInt;
        int minValue = currentInt;

        //Loop through input and check for sentinel value:

        while (currentInt !=0) {
            if (currentInt > maxValue) {
                maxValue = currentInt;
            }

            if (currentInt % 2 == 0) {
                evenCount++;
            }
            else
                oddCount++;

            sum += currentInt;
            totalCount++;
            currentInt = input.nextInt();


        }//End of while loop

        //Return data to the user
        System.out.println("The largest integer is: " + maxValue);
        System.out.println("The smallest integer is: " + minValue);
        System.out.println("Total number of integers entered: " + totalCount);
        System.out.println("The even numbers entered is: " + evenCount);
        System.out.println("The odd numbers entered is: " + oddCount);
        System.out.println("The average value is: " + (double)(sum / totalCount));


    }//End of main method
}//End of class









