/**
   This program demonstrates a solution to the
   BankAccount Class Copy Constructor
   programming challenge.
*/

public class BankAccountDemo
{
   public static void main(String[] args)
   {
      // Create a BankAccount object with a
      // balance of $1200.00.
      BankAccount account1 = new BankAccount(1200.0);

      // Create another BankAccount object as a
      // copy of the first.
      BankAccount account2 = new BankAccount(account1);

      // Display the balance in each account.
      System.out.printf("The balance in account #1 is $%,.2f\n",
                        account1.getBalance());
      System.out.printf("The balance in account #2 is $%,.2f\n",
                        account2.getBalance());
   }
}