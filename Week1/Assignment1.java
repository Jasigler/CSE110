//**********************************************************
//NAME: Jason Sigler
//TITLE: Assignment1.java
//DESCRIPTION: Answers to part 1 -3, and a tip calculator 
//             class that uses both the scanner and text
//             format classes. 
//TIME SPENT: 1 hour
//DATE: 05/17/2018
//**********************************************************

// PART #2:
// 
// (a): Because java is case sensitive, the compiler is looking for a class called TempConverter because of the filename, but can only find
//      a class called tempConverter. 
//
// (b): With the brackets removed, the compiler treats the expression as a reference to a variable that doesn't exist, and can't compile past
//      that point.
//
// (c): A semicolon indicates to the compiler that an expression has ended. Removing it doesn't separate the expression that follows it, making
//      it look syntactically incorrect.  
//
// (d): With the class bracket removed, the compiler is unable to determine where the class and inside methods begin and/or end.  
//
//
// (e): The compiler thinks that "fahrenheit" is a reference to a variable that has not been declared. 

//************************************************************

// PART #3
//
// 1. (a) mystery has a value of 5
//    (b) mystery now has a value of 3
//    (c) mystery now has a value of 4
//
// 2. (a) 0
//    (b) 3.333
//    (c) 2
//    (d) 4.3
//    (e) 0.24806....
//    (f) 1
//    (g) 1

//****************************************************************
// PART #4
// Tip calculator

import java.util.Scanner;
import java.text.NumberFormat;


public class Assignment1 {
	
	public static void main(String[] arg) {
		
		//Declare the variables:
		int tipPercentage;
		double billAmount, tipAmount, finalCost;
		
		//Invoke the scanner class
		Scanner scan = new Scanner(System.in);
		
		//Invoke the format class 
		NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
		NumberFormat fmtPercent = NumberFormat.getPercentInstance();
		
		
		//Prompt user for input & assign values
		System.out.print("What is the bill amount?");
		billAmount = scan.nextDouble();
		
		System.out.print("Enter the desired tip percentage:");
		tipPercentage = scan.nextInt();
		
		
		//Calculate the tip and final bill cost
		tipAmount = billAmount * ((double)tipPercentage / 100);
		finalCost = tipAmount + billAmount;
		
		
		//Return the results with another type cast
		System.out.println("At " + fmtPercent.format((double)tipPercentage / 100) + ", the tip is: " + fmtCurrency.format(tipAmount )); 
		System.out.println("The total bill is: " + fmtCurrency.format(finalCost));
		
		
		
	}
}





