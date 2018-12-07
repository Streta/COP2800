import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Budget Analysis programming challenge.
*/

public class BudgetAnalysis
{
   public static void main(String[] args)
   {
      double budget;        // Budget for the month
      double expense;       // To hold an expense amount
      double totalExpenses; // To hold the total expenses
      double diff;          // Amount over or under budget

      // Initialize the accumulator to 0.
      totalExpenses = 0.0;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the budget amount.
      System.out.print("Enter your budget for the month: ");
      budget = keyboard.nextDouble();
      
      // Get each expense and keep a running total.
      do
      {
         // Get an expense amount. 
         System.out.print("Enter an expense, or a negative " +
                          "number to quit: ");
         expense = keyboard.nextDouble();

         // Add the expense to the accumulator.
         if (expense > 0)
            totalExpenses += expense;

      } while (expense >= 0);

      // Calculate the amount over or under budget.
      diff = budget - totalExpenses;

      // Display the amount over or under.
      if (diff < 0)
      {
         // diff is negative, so make it positive for
         // display purposes and then display the status.
         diff = -(diff);
         System.out.printf("You are OVER budget by $%,.2f", diff);
      }
      else if (diff > 0)
      {
         System.out.printf("You are UNDER budget by $%,.2f", diff);
      }
      else
      {
         System.out.println("You spent the budget amount exactly.");
      }
   }
}