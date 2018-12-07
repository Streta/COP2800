import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a solution to the
   Sales Tax programming challenge.
*/

public class SalesTax
{
   public static void main(String[] args)
   {
      // Constants
      final double STATE_RATE = 0.04;  // State tax rate
      final double COUNTY_RATE = 0.02; // County tax rate
      
      // Variables
      double purchase;         // Amount of purchase
      double stateTax;         // Amount of state sales tax
      double countyTax;        // Amount of county sales tax
      double totalTax;         // Total sales tax
      double totalCost;        // Total cost of the purchase
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
             
      // Get the amount of the purchase.
      System.out.print("Enter the purchase amount: ");
      purchase = keyboard.nextDouble();
      
      // Calculate the state sales tax.
      stateTax = purchase * STATE_RATE;
      
      // Calculate county sales tax.
      countyTax = purchase * COUNTY_RATE;
      
      // Calculate the total sales tax.
      totalTax = stateTax + countyTax;
      
      // Calculate the total purchase cost.
      totalCost = purchase + totalTax;
      
      // Display the results.
      System.out.println("Purchase amount: $" + purchase);
      System.out.println("State tax: $" + stateTax);
      System.out.println("County tax: $" + countyTax);
      System.out.println("Total tax: $" + totalTax);
      System.out.println("Total cost: $" + totalCost);
   }
}
