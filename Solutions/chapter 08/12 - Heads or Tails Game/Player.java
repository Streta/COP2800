import java.util.Random;

/**
   The Player class simulates a player in the
   Heads or Tails Game.
 */

public class Player
{
   // Fields
   private String name;    // The player's name
   private String guess;   // The player's guess
   private int points;     // The player's points

   /**
      The constructor creates a player object.
      @param n The player's name
    */

   Player (String n)
   {
      name = n;
      guess = "";
      points = 0;
   }

   /**
      The makeGuess method causes
      the player to guess
      either "heads" or "tails".
    */

   public void makeGuess()
   {
      // Create a random object.
      Random rand = new Random();

      // Get a random value, 0 or 1.
      int value = rand.nextInt(2);

      // Set the value of guess.
      // 0 = "heads" or 1 = "tails"
      if (value == 0)
         guess = "heads";
      else
         guess = "tails";
   }

   /**
      The getName method returns
      the name of the player.
      @return The player's name.
    */

   public String getName()
   {
      return name;
   }

   /**
      The getGuess method returns the
      player's guess.
      @return The player's guess.
    */

   public String getGuess()
   {
      return guess;
   }

   /**
      The getPoints method returns
      the number of points.
      @return The player's points.
    */

   public int getPoints()
   {
      return points;
   }

   /**
      The setName method sets the
      name of the player.
      @param n The player's name.
    */

   public void setName(String n)
   {
      name = n;
   }

   /**
      The setPoints method sets
      the player's points.
      @param p The player's points.
    */

   public void setPoints(int p)
   {
      points = p;
   }
}