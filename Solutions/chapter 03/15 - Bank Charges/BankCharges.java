import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Bank Charges programming challenge.
*/

public class BankCharges
{
   public static void main(String[] args)
   {
      // Named constants
      final double BASE_FEE = 10.0;
      final double LEVEL_1_FEE = 0.1;
      final double LEVEL_2_FEE = 0.08;
      final double LEVEL_3_FEE = 0.06;
      final double LEVEL_4_FEE = 0.04;
      
      // Create a Scanner object for keybord input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of checks written.
      System.out.print("Enter the number of checks written " +
                       "this month: ");
      int numChecks = keyboard.nextInt();
      
      // The total fee starts as the base fee.
      double totalFee = BASE_FEE;
      
      // Then, we add the appropriate per-check fees.
      if (numChecks < 20)
         totalFee += numChecks * LEVEL_1_FEE;
      else if (numChecks >= 20 && numChecks <= 39)
         totalFee += numChecks * LEVEL_2_FEE;
      else if (numChecks >= 40 && numChecks <= 59)
         totalFee += numChecks * LEVEL_3_FEE;
      else
         totalFee += numChecks * LEVEL_4_FEE;
      
      // Display the total bank fees.
      System.out.printf("The total fees are $%.2f\n", totalFee);
   }
}