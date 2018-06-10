//**********************************************************
//NAME: Jason Sigler
//TITLE: Assignment1.java
//DESCRIPTION:
//TIME SPENT: 30 Minutes
//DATE: 05/17/2018
//**********************************************************


// PART #1:
//
// (a): True
// (b): False
// (c): True
// (d): True


//  String userName;
//
//  Scanner input = new Scanner(System.in);
//  System.out.println("What is your name?");
//  userName = input.nextLine();
//  System.out.println("Hello, " + userName + "!");

//
//  The statement sequence prints: Hy
//
//
//****************************************************************


import java.util.Scanner;
import java.text.NumberFormat;


public class Assignment2 {

    public static void main (String[] args){

        //Declare the variables:
        int hamburgerQuantity, cheeseburgerQuantity, friesQuantity, drinksQuantity, itemsOrdered;
        double hamburgerTotal, cheeseburgerTotal, friesTotal, drinksTotal, orderTotal;
        final double HAMBURGER_COST = 2.75, CHEESEBURGER_COST = 3.25, FRIES_COST = 2.50, DRINK_COST = 1.50 ;
        String highestItem = "";

        //Invoke a scanner and currency format object
        Scanner input = new Scanner(System.in);
        NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();

        //print the menu
        System.out.println("\tWelcome to the In-N-Out Menu:");
        System.out.println("  --------------------------------");
        System.out.println("\tHamburger: $2.75");
        System.out.println("\tCheeseburger: $3.25");
        System.out.println("\tFrench Fries: $2.50");
        System.out.println("\tShakes & Beverages: $1.50\n");

        //Get user input and assign values to corresponding variables
        System.out.print("How many hamburgers would you like?  ");
        hamburgerQuantity = input.nextInt();

        System.out.print("How many cheeseburgers would you like?  ");
        cheeseburgerQuantity = input.nextInt();

        System.out.print("How many orders of fries would you like?  ");
        friesQuantity = input.nextInt();

        System.out.print("How many drinks would you like?  ");
        drinksQuantity = input.nextInt();

        itemsOrdered = hamburgerQuantity + cheeseburgerQuantity + friesQuantity + drinksQuantity;

        //Find the order totals by item
        hamburgerTotal = hamburgerQuantity * HAMBURGER_COST;
        cheeseburgerTotal = cheeseburgerQuantity * CHEESEBURGER_COST;
        friesTotal = friesQuantity * FRIES_COST;
        drinksTotal = drinksQuantity * DRINK_COST;

        //calculate the order total
        orderTotal = hamburgerTotal + cheeseburgerTotal + friesTotal + drinksTotal;
        itemsOrdered = hamburgerQuantity + cheeseburgerQuantity + friesQuantity + drinksQuantity;

        //Determine the most expensive category
        if (hamburgerTotal > cheeseburgerTotal &&  hamburgerTotal > friesTotal &&  hamburgerTotal > drinksTotal )
        {
            highestItem = "Hamburgers";
        }
        else if (cheeseburgerTotal > hamburgerTotal && cheeseburgerTotal > friesTotal && cheeseburgerTotal > drinksTotal)
        {
            highestItem = "Cheeseburgers";
        }
        else if (friesTotal > hamburgerTotal && friesTotal > cheeseburgerTotal && friesTotal > drinksTotal)
        {
            highestItem = "French Fries";
        }
        else {
            highestItem = "Drinks";
        }//End if loop

        //Final output to the user
        System.out.println("\nThe total cost for the hamburger(s): " + fmtCurrency.format(hamburgerTotal) );
        System.out.println("The total cost for the cheesesburger(s): " + fmtCurrency.format(cheeseburgerTotal));
        System.out.println(("The total cost for the fries: " + fmtCurrency.format(friesTotal)));
        System.out.println("The totalk cost for the drink(s): " + fmtCurrency.format(drinksTotal));
        System.out.println(highestItem + " had the highest total cost.\n");

        System.out.println("Total cost of your order: " + fmtCurrency.format(orderTotal));
        System.out.println("Total number of items ordered: " + itemsOrdered);










    }//End of main method
}//End of class