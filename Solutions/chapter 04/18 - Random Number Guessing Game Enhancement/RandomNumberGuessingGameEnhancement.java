import java.util.Random;
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Random Number Guessing Game Enhancement programming challenge.
*/

public class RandomNumberGuessingGameEnhancement
{
   public static void main(String[] args)
   {
      // Constant for the maximum random number
      final int MAX_NUMBER = 10;
      
      // Variables
      int guess;     // To hold the user's guess
      int randNum;   // To hold a random number
      int count;     // To hold the count of guesses
      
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
      
      // Set count to 1 because the user just made
      // his or her first guess.
      count = 1;
      
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
         
         // Increment the guess counter.
         count++;
      }

      // Congratulate the user.
      System.out.println("Congratulations! You guessed it!");
      System.out.println("I was thinking of the number " +
                         randNum + ".");
      System.out.println("You got it right in " + count +
                         " guesses.");
   }
}