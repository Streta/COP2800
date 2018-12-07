import java.util.Scanner;

/**
   This program demonstrates a solution to the
   SavingsAccount Class programming challenge.
*/

public class SavingsAccountDemo
{
   public static void main(String args[])
   {
      double interestRate;       // Annual interest rate
      double balance;            // Starting balance
      double deposits;           // Amount of deposits for a month
      double withdrawn;          // Amount withdrawn in a month
      double intEarned = 0.0;    // Interest earned
      double totalDeposits = 0;  // Deposit accumulator
      double totalWithdrawn = 0; // Withdrawal accumulator
      int months;                // Months that have passed

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the starting balance.
      System.out.print("Enter the savings account's " +
                       "starting balance: ");
      balance = keyboard.nextDouble();

      // Get the annual interest rate.
      System.out.print("Enter the savings account's " +
                       "annual interest rate: ");
      interestRate = keyboard.nextDouble();

      // Create a SavingsAccount object.
      SavingsAccount savings =
             new SavingsAccount(balance, interestRate);

      // Get the number of months that have passed.
      System.out.print("How many months have passed since " +
                       "the account was opened? ");
      months = keyboard.nextInt();

      // Get the deposits and withdrawals for each month.
      for (int i = 1; i <= months; i++)
      {
         // Get the deposits.
         System.out.print("Enter the amount deposited " +
                          "during month " + i + ": ");
         deposits = keyboard.nextDouble();
         totalDeposits += deposits;

         // Get the withdrawals.
         System.out.print("Enter the amount withdrawn " +
                          "during month " + i + ": ");
         withdrawn = keyboard.nextDouble();
         totalWithdrawn += withdrawn;

         // Add the deposits to the account.
         savings.deposit(deposits);

         // Subtract the withdrawals.
         savings.withdraw(withdrawn);

         // Add the monthly interest.
         savings.addInterest();

         // Accumulate the amount of interest earned.
         intEarned += savings.getLastInterest();
      }

      // Display the totals and the balance.
      System.out.printf("Total deposited: $%,.2f\n",
                        totalDeposits);
      System.out.printf("Total withdrawn: $%,.2f\n",
                        totalWithdrawn);
      System.out.printf("Interest earned: $%,.2f\n",
                        intEarned);
      System.out.printf("Ending balance: $%,.2f\n",
                        savings.getBalance());
   }
}
