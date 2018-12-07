import java.util.Scanner;

/**
   This program demonstrates a solution to the
   The Speed of Sound programming challenge.
*/

public class TheSpeedOfSound
{
   public static void main(String[] args)
   {
      double distance = 0.0;  // Distance
      String medium;          // To hold "air", "water", or "steel"
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the user's medium of choice.
      System.out.print("Enter one of the following: air, water, or steel: ");
      medium = keyboard.nextLine();

      // Validate the input
      if ((medium.compareToIgnoreCase("air") != 0) &&
          (medium.compareToIgnoreCase("water") != 0) &&
          (medium.compareToIgnoreCase("steel") != 0))
      {
         System.out.println("Sorry, you must enter air, water, or steel.");
      }
      else
      {
         // Get the distance.
         System.out.print("Enter the distance the " +
                          "sound wave will travel: ");
         distance = keyboard.nextDouble();
            
         // Calculate the time it will take the wave to travel
         // that distance in the selected medium.
         if (medium.compareToIgnoreCase("air") == 0)
         {
            System.out.println("It will take " +
                                (distance / 1100.0) +
                                " seconds.");
         }
         else if (medium.compareToIgnoreCase("water") == 0)
         {
            System.out.println("It will take " +
                               (distance / 4900.0) +
                               " seconds.");
         }
                        
         else if (medium.compareToIgnoreCase("steel") == 0)
         {
            System.out.println("It will take " +
                               (distance / 16400.0) +
                               " seconds.");
         }
      }
   }
}
