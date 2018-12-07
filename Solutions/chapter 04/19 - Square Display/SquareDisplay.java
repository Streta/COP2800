import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Square Display programming challenge.
*/

public class SquareDisplay
{
   public static void main(String[] args)
   {
      // Variable for user input
      int number;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a number from the user.
      System.out.print("Enter an integer in the range of 1-15: ");
      number = keyboard.nextInt();
      
      // Validate the input.
      while (number < 1 || number > 15)
      {
         // Get a number from the user.
         System.out.println("Sorry, that's an invalid number.");
         System.out.print("Enter an integer in the range of 1-15: ");
         number = keyboard.nextInt();
      }

      // Display the square made of Xs.
      // The outer loop displays the rows.
      for (int row = 0; row < number; row++)
      {
         // The inner loop displays each
         // X in the row.
         for (int column = 0; column < number; column++)
         {
            System.out.print("X");
         }

         // Advance to the next line.
         System.out.println();
      }
   }
}