import java.util.Scanner;  // Needed for keyboard input

/**
   This program demonstrates a solution to the
   Average Rainfall programming challenge.
*/

public class AverageRainfall
{
   public static void main(String[] args)
   {
      final int NUM_MONTHS = 12; // Months per year
      int years;                 // Number of years
      double monthRain;          // Rain for a month
      double totalRain = 0;      // Rainfall accumulator
      double average;            // Average rainfall

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of years.
      System.out.print("Enter the number of years: ");
      years = keyboard.nextInt();
      
      // Validate the input.
      while (years < 1)
      {
         System.out.print("Invalid. Enter 1 or greater: ");
         years = keyboard.nextInt();
      }
      
      System.out.println("Enter the rainfall, in inches, " +
                         "for each month.");
                         
      for (int y = 1; y <= years; y++)
      {
         for (int m = 1; m <= NUM_MONTHS; m++)
         {
            // Get the rainfall for a month.
            System.out.print("Year " + y + " month " + m + ": ");
            monthRain = keyboard.nextDouble();
            
            // Validate the input.
            while (monthRain < 0)
            {
               System.out.print("Invalid. Enter 0 or greater: ");
               monthRain = keyboard.nextDouble();
            }
            // Accumulate the rainfall.
            totalRain += monthRain;
         }
      }
      
      // Calculate the average rainfall.
      average = totalRain / (years * NUM_MONTHS);
      
      // Display the statistics.
      System.out.println("\nNumber of months: " + (years * NUM_MONTHS));
      System.out.println("Total rainfall: " + totalRain + " inches");
      System.out.printf("Average monthly rainfall: %.2f inches\n", average);
   }
}
