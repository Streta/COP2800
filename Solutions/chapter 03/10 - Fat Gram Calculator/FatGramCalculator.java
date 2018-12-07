import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Fat Gram Calculator programming challenge.
*/

public class FatGramCalculator
{
   public static void main(String[] args)
   {
      double calories,        // Number of calories
             fatGrams,        // Number of fat grams
             fatCalories,     // Calories from fat
             fatPercentage;   // Percentage of fat calories

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of calories.
      System.out.print("How many calories does " +
                       "the food have? ");
      calories = keyboard.nextDouble();
      
      // Get the number of fat grams.
      System.out.print("How many fat grams does " +
                       "the food have? ");
      fatGrams = keyboard.nextDouble();

      // Calculate calories from fat.
      fatCalories = fatGrams * 9;
      
      // Calculate percentage of calories from fat.
      fatPercentage = fatCalories / calories;

      // Validate the data.
      if (fatCalories > calories)
      {
         System.out.println("Invalid data.");
      }
      else
      {
         // Display the results.
         System.out.println("The percentage of calories " +
                            "from fat is " + 
                            (fatPercentage * 100) + "%.");
         if (fatPercentage < 0.3)
            System.out.println("The food is low in fat.");
         else
            System.out.println("The food is NOT low in fat.");
      }
   }
}
