import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Software Sales programming challenge.
*/

public class SoftwareSales
{
   public static void main(String[] args) 
   {
      final double UNIT_PRICE = 99.0;  // Unit price
      int units;                       // Units sold
      double discPercent,              // Discount percentage
             discount,                 // Discount amount
             cost;                     // Total cost

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the units sold.
      System.out.print("Enter the units sold: ");
      units = keyboard.nextInt();
      
      // Determine the discount percentage
      if (units >= 100)
         discPercent = 0.5;   // 50% discount
      else if (units >= 50)
         discPercent = 0.4;   // 40% discount
      else if (units >= 20)
         discPercent = 0.3;   // 30% discount
      else if (units >= 10)
         discPercent = 0.2;   // 20% discount
      else
         discPercent = 0.0;   // No discount

      // Calculate the discount amount.
      discount = (units * UNIT_PRICE) * discPercent;
      
      // Calculate the total cost.
      cost = (units * UNIT_PRICE) - discount;

      // Display purchase info.
      System.out.println("Units sold: " + units);
      System.out.printf("Discount: $%,.2f\n", discount);
      System.out.printf("Cost: $%,.2f\n", cost);
   }
}
