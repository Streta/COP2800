import java.util.Random;   // Needed for Random class

/**
   This program demonstrates a solution to the
   Dice Game programming challenge.
*/

public class DiceGame
{
   public static void main(String[] args)
   {
      // Variables
      int compValue = 0;   // To hold the computer's dice value
      int userValue = 0;   // To hold the user's dice value
      int compGames = 0;   // To hold the number of games won by the computer
      int userGames = 0;   // To hold the number of games won by the user
      int tiedGames = 0;   // To hold the number of tied games
      
      // Create a Random object.
      Random randValue = new Random();

      // Play ten rounds of the dice game.
      for (int round = 1; round <= 10; round++)
      {

         // Generate a random number between 1 and 6,
         // and assign it to the computer's dice value.
         compValue = randValue.nextInt(6) + 1;
         
         // Generate a random number between 1 and 6,
         // and assign it to the user's dice value.
         userValue = randValue.nextInt(6) + 1;
         
         // Determine the winner of this round.
         if (compValue != userValue)
         {
            if (compValue > userValue)
               // The computer wins this round.
               compGames++;
            else
               // The user wins this round.
               userGames++;
         }
         else
            // This round has ended in a tie.
            tiedGames++;
      }
      
      // Display the results.
      System.out.println("Computer...." + compGames);
      System.out.println("User........" + userGames);
      System.out.println("Ties........" + tiedGames);
      
      // Determine the grand winner.
      if (compGames > userGames)
         // The computer won the most games.
         System.out.println("The computer is the grand winner!");
      else if (compGames < userGames)
         // The user won the most games.
         System.out.println("The user is the grand winner!");
      else
         // The game was a tie.
         System.out.println("The game has ended in a tie!");
   }
}