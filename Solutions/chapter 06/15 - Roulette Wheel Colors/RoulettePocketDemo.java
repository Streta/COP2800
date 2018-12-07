import java.util.Scanner;  // Needed for the Scanner class

/**
   This program demonstrates a solution to the
   Roulette Wheel Colors programming challenge.
*/

public class RoulettePocketDemo
{
   public static void main(String[] args)
   {
      int number; // To hold the pocket number

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the pocket number from the user.
      System.out.print("Enter a pocket number from 0 to 36: ");
      number = keyboard.nextInt();

      // Determine if the pocket number is valid.
      if (number < 0 || number > 36)
      {
         // Display an error message.
         System.out.println("Error: Invalid pocket number");
      }
      else
      {
         // Create an instance of the RoulettePocket class.
         RoulettePocket roulettePocket = new RoulettePocket(number);

         // Display the color of the pocket number.
         System.out.println(roulettePocket.getPocketColor());
      }
   }
}