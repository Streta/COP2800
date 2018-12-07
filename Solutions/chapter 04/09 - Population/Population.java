import java.util.Scanner;  // Needed for keyboard input

/**
   This program demonstrates a solution to the
   Population programming challenge.
*/

public class Population
{
   public static void main(String[] args)
   {
      double starting;  // Starting number of organisms
      double increase;  // Daily increase percentage
      double organisms; // To count organisms
      int days;         // Number of days to multiply
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
            
      // Get the starting number of organisms.
      System.out.print("Enter the starting number " +
                       "organisms: ");
      starting = keyboard.nextDouble();
      
      // Validate the input.
      while (starting < 2)
      {
         System.out.print("Invalid. Must be at least 2. " +
                          "Re-enter: ");
         starting = keyboard.nextDouble();
      }
      
      // Get the daily increase.
      System.out.print("Enter the daily increase: ");
      increase = keyboard.nextDouble();
      
      // Validate the input.
      while (increase < 0)
      {
         System.out.print("Invalid. Enter a non-negative " +
                          "number: ");
         increase = keyboard.nextDouble();
      }

      // Get the number of days to multiply.
      System.out.print("Enter the number of days " +
                       "the organisms will multiply: ");
      days = keyboard.nextInt();
      
      // Validate the input.
      while (days < 1)
      {
         System.out.print("Invalid. Enter 1 or more: ");
         days = keyboard.nextInt();
      }

      // Calculate and display the daily population.
      organisms = starting;
      System.out.println("Day\t\tOrganisms");
      System.out.println("-----------------------------");

      for (int i = 1; i <= days; i++)
      {
         System.out.println(i + "\t\t" + organisms);
         organisms += (organisms * increase);
      }
   }
}