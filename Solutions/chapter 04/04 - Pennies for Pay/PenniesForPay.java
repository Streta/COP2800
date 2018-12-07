import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Pennies for Pay programming challenge.
*/

public class PenniesForPay
{
   public static void main(String[] args)
   {
      int pennies;      // Penny accumulator
      int totalPay;     // Total pay accumulator
      int maxDays;      // Max number of days
      int day;          // Day counter

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
   
      // Get the maximum number of days.
      System.out.print("For how many days will " +
                       "you work? ");
      maxDays = keyboard.nextInt();
   
      // Validate the input.
      while (maxDays < 1)
      {
         System.out.print("The number of days " +
                          "must be at least 1.\n" +
                          "Enter the number of days: ");
         maxDays = keyboard.nextInt();
      }
   
      // Initialize the day counter to day 1.
      day = 1;
   
      // Initialize the penny accumulator for
      // the first day at work.
      pennies = 1;
      
      // Initialize the total pay accumulator.
      totalPay = 0;
   
      // Display the report header.
      System.out.println("Day\t\tPennies Earned");
   
      // Display the income report.
      while (day <= maxDays)
      {
         // Display the day number and pennies earned.
         System.out.println(day + "\t\t" + pennies);
         
         // Accumulate the total pay.
         totalPay += pennies;
         
         // Increment for the next day.
         day++;
         
         // Double the number of pennies.
         pennies *= 2;
      }
   
      // Display the total pay.
      System.out.printf("Total pay: $%,.2f\n", (totalPay / 100.0));
   }
}
