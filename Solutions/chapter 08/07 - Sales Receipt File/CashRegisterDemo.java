import java.io.*;
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Sales Receipt File programming challenge.
*/

public class CashRegisterDemo
{
   public static void main(String[] args) throws IOException
   {
      final int STARTING_UNITS = 50;   // Starting number of items
      final double ITEM_PRICE = 0.75;  // The price of the item
      String product = "Candy Bar";    // The item being purchased
      int quantity;                    // Quantity being purchased

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a RetailItem object.
      RetailItem item = new RetailItem("Candy bar", STARTING_UNITS,
                                       ITEM_PRICE);
      
      // Display the starting data for this item.
      System.out.println("Item being purchased: " + item.getDescription());
      System.out.println("Units on hand: " + item.getUnitsOnHand());
      System.out.printf("Price: $%,.2f\n", item.getPrice());
      
      // Get the quantity.
      System.out.print("How many candy bars are you buying? ");
      quantity = keyboard.nextInt();
      
      // Is the customer trying to buy more than we have?
      if (quantity > item.getUnitsOnHand())
      {
         System.out.println("Sorry, we only have " +
                            item.getUnitsOnHand() +
                            " in stock.");
      }
      else
      {
         // Create a CashRegister object.
         CashRegister reg = new CashRegister(item, quantity);
      
         // Create the necessary objects for file output.
         PrintWriter outputFile = new PrintWriter("Receipt.txt");
         
         // Write the sales data.
         outputFile.println("SALES RECEIPT");
         outputFile.printf("Unit Price: $%,.2f\r\n", item.getPrice());
         outputFile.printf("Quantity: %d\r\n", quantity);
         outputFile.printf("Subtotal: $%,.2f\r\n", reg.getSubtotal());
         outputFile.printf("Sales tax: $%,.2f\r\n",reg.getTax());
         outputFile.printf("Total: $%,.2f\r\n", reg.getTotal());
                         
         // Close the file.
         outputFile.close();
         System.out.println("Sales receipt written to Receipt.txt.");
         
         // Update the units on hand to account for the quantity
         // just purchased.
         item.setUnitsOnHand(item.getUnitsOnHand() - quantity);
      
         // Display the ending units on hand.
         System.out.println("Units on hand: " + item.getUnitsOnHand());
      }
   }
}
