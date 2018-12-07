import java.util.Random;
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Random Number Guessing Game programming challenge.
*/

public class RandomNumberGuessingGame
{
   public static void main(String[] args)
   {
      // Constant for the maximum random number
      final int MAX_NUMBER = 10;
      
      // Variables
      int guess;     // To hold the user's guess
      int randNum;   // To hold a random number
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object.
      Random rand = new Random();
      
      // Generate a random number.
      randNum = rand.nextInt(MAX_NUMBER);
      
      // Get the user's guess.
      System.out.println("I'm thinking of a number.");
      System.out.print("Guess what it is: ");
      guess = keyboard.nextInt();
      
      // Respond to the user's guess.
      while (guess != randNum)
      {
         if (guess < randNum)
         {
            System.out.println("No, that's too low.");
         }
         else if (guess > randNum)
         {
            System.out.println("Sorry, that's too high.");
         }

         // Get another guess.
         System.out.print("Guess again: ");
         guess = keyboard.nextInt();
      }

      // Congratulate the user.
      System.out.println("Congratulations! You guessed it!");
      System.out.println("I was thinking of the number " +
                         randNum + ".");
   }
}