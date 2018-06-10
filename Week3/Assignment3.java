//**********************************************************
//NAME: Jason Sigler
//TITLE: Assignment3.java
//DESCRIPTION: Answers to part 1 - 2, and a program that computes
//             the GCD of two integers
//TIME SPENT: 1 hour
//DATE: 06/03/2018
//**********************************************************


// PART #1:
//
// (a). 10 9 8 7 6 5 4 3 2
// (b). 5 15
//

// PART #2:
//
//    for (int i = str.length() -1; i >= 0; i--){
//            System.out.print(str.charAt(i));
//        }
//

//***************************************************************
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args){


        //Declare the variables
        int intX, intY, int1, int2;


        //Invoke the scanner
        Scanner input = new Scanner(System.in);

        //Prompt for and assign X value. Check for pos. integer.
        System.out.print("Enter the first integer: ");
        intX = input.nextInt();
        int1 = intX;//Maintains value for output
        while (intX <= 0){
            System.out.println("Please enter a positive integer: ");
            intX = input.nextInt();
        }//End of while loop

        //Prompt for and assign Y value. Check for pos. integer.
        System.out.print("Enter the second integer: ");
        intY = input.nextInt();
        int2 = intY; //Maintains value for output
        while (intY <= 0){
            System.out.println("Please enter a positive integer: ");
            intY = input.nextInt();
        }//End of while loop


        //Apply the Euclidean algorithm to intX and intY
        while (intX != intY){
            if (intX > intY)
                intX -= intY;
            else
                intY -= intX;
        }//End of while loop

        //Return the results
        System.out.println("\nThe GCD of " + int1 + " and " +  int2 + " is: " + intY);



    }//End of main method
}//End of class
