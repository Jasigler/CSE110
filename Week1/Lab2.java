//-------------------------------------------------------------
// AUTHOR: Jason Sigler
// FILENAME: Lab2.java
// SPECIFICATION: Prompts the user for three test scores, 
//                averages them, and returns result to user.
// FOR: CSE 110 - Lab #2
// TIME SPENT: 30 minutes
//-------------------------------------------------------------

import java.util.*; 

public class Lab2 {

	public static void main(String[] args) {
		
		//Invoke a new scanner object
		Scanner scan = new Scanner (System.in);
		
		//Initialize the variables and declare the constant
		int gradeOne, gradeTwo, gradeThree;
		double testAverage;
		final int TEST_COUNT = 3;
		
		//Gather test scores from the user
		System.out.print("Enter the first test score:");
		gradeOne = scan.nextInt();
		System.out.print("Enter the second test score:");
		gradeTwo = scan.nextInt();
		System.out.print("Enter the final test score:");
		gradeThree = scan.nextInt();
		
		//Calculate the average and return the result to the user
		testAverage = (gradeOne + gradeTwo + gradeThree) / (double)TEST_COUNT;
		System.out.print("Your test average is: " +  testAverage);
		
		
		
		

	}

}
