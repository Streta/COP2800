import java.util.Scanner;

public class SavingsAccountTest
{
 public static void main(String[] args)
 {
   double changeRate,
	  newBalance,
	  depositIn,
	  withdrawOut,
	  totalDeposit  = 0,
	  totalWithdraw = 0,
	  totalInterest = 0;

   int    userMonths;
   Scanner keyboard = new Scanner(System.in);

   System.out.println("Enter interest: " );
   changeRate = keyboard.nextDouble();

   System.out.println("Enter balance: ");
   newBalance = keyboard.nextDouble();
   
   System.out.println("Enter months: ");
   userMonths = keyboard.nextInt();
   
   SavingsAccount profile1 = new SavingsAccount(newBalance);
   profile1.setInterest(changeRate);

   for(int foo = 1; foo <= userMonths; foo++)
   {
     System.out.println("Deposits in month: " + foo);
     depositIn = keyboard.nextDouble();
     totalDeposit += depositIn;
     profile1.deposit(depositIn);
     
     System.out.println("Withdraw in month: " + foo);
     withdrawOut = keyboard.nextDouble();
     totalWithdraw += withdrawOut;
     profile1.withdraw(withdrawOut);

     totalInterest += profile1.interest();
   }

   System.out.printf("Ending balance is %f\nAll deposits: %f\nAll withdrawals: %f\nTotal interest: %f", 
		     profile1.getBalance(),totalDeposit,totalWithdraw,totalInterest);
 }
}
