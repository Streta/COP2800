import java.util.Random;   // Needed for Random class

/**
   This program demonstrates a solution to the
   Dice Game programming challenge.
*/

public class DiceGame
{
   public static void main(String[] args)
   {
      // Named constants
      final int NUM_SIDES = 6;   // The number of sides on the die
      
      // Variables
      int compValue = 0;   // To hold the computer's dice value
      int userValue = 0;   // To hold the user's dice value
      int compGames = 0;   // To hold the number of games won by the computer
      int userGames = 0;   // To hold the number of games won by the user
      int tiedGames = 0;   // To hold the number of tied games
      
      // Create a Die object for the computer.
      Die computerDie = new Die(NUM_SIDES);
      
      // Create a Die object for the user.
      Die userDie = new Die(NUM_SIDES);
      
      // Play ten rounds of the dice game.
      for (int round = 1; round <= 10; round++)
      {

         // Get the computer's die value.
         computerDie.roll();
         compValue = computerDie.getValue();
         
         // Get the user's die value.
         userDie.roll();
         userValue = userDie.getValue();
         
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