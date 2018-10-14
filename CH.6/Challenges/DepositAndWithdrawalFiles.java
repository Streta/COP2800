import java.io.*;
import java.util.Scanner;

public class DepositAndWithdrawalFiles
{
  public static void main(String[] args) throws IOException
  {
    double totalInterestEarned = 0;
	  
    SavingsAccount savings = new SavingsAccount(500);
    savings.setInterest(10);
    File depositsFile = new File("Deposits.txt");
    File withdrawalsFile = new File("Withdrawals.txt");
    Scanner inputFile = new Scanner(depositsFile);

    while(inputFile.hasNext())
    {
      savings.deposit(inputFile.nextDouble());
    }
    inputFile.close();
    inputFile = new Scanner(withdrawalsFile);
    while(inputFile.hasNext())
    {
      savings.withdraw(inputFile.nextDouble());
    }
    inputFile.close();

    totalInterestEarned = savings.interest();

    System.out.printf("Ending balance: %f\nTotal Interest earned: %f",savings.getBalance(), totalInterestEarned);
  }
}
