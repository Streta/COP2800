import java.util.Scanner;

/**
   The Player class stores data about a player
   for the Trivia Game programming challenge.
*/

public class Player
{
   private int playerNumber;  // The player number
   private int points;        // Player's points
   private int currentAnswer; // Current chosen answer
   
   /**
      Constructor
      @param playerNum The player number.
   */
   public Player(int playerNum)
   {
      playerNumber = playerNum;
      points = 0;
   }
   
   /**
      The chooseAnswer method gets the player's chosen
      answer to the current question.
   */
   public void chooseAnswer()
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the user's chosen answer.
      System.out.print("Enter the number of the correct answer: ");
      currentAnswer = keyboard.nextInt();
   }
   
   /**
      getCurrentAnswer method
      @return The current chosen answer.
   */
   public int getCurrentAnswer()
   {
      return currentAnswer;
   }
   
   /**
      The incrementPoints method increments the player's points.
   */
   public void incrementPoints()
   {
      points++;
   }
   
   /**
      getPoints method
      @return The player's points.
   */
   public int getPoints()
   {
      return points;
   }

}