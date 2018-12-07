import java.util.Scanner;

/**
   This program demonstrates a solution to the
   First to One Game programming challenge.
 */

public class FirstToOneGame
{
   public static void main(String[] args)
   {
      final int NUM_SIDES = 6;         // Number of sides on the die
      final int STARTING_POINTS = 50;  // Number of starting points
      String player1Name;              // First player's name
      String player2Name;              // Second player's name

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create the die.
      Die die = new Die(NUM_SIDES);

      // Get the player's names.
      System.out.print("Enter the first player's name: ");
      player1Name = keyboard.nextLine();
      System.out.print("Enter the second player's name: ");
      player2Name = keyboard.nextLine();

      // Create the two players.
      Player player1 = new Player(player1Name, STARTING_POINTS);
      Player player2 = new Player(player2Name, STARTING_POINTS);

      // Play the game until one of the player's wins.
      while (gameInPlay(player1, player2))
      {
         // Player 1 rolls the die and takes the first turn.
         takeTurn(player1, die);

         // If the game is still being played,
         // Player 2 rolls the die and takes a turn.
         if (gameInPlay(player1, player2))
         {
            takeTurn(player2, die);
         }
      }
      // Display the name of the winning player.
      determineWinner(player1, player2);
   }

   /**
      The gameInPlay method determines if the game
      is still in play. The method returns true
      if the game is still being played, or false if
      one of the players has won the game.
      @param p1 A reference to the Player object
             for player 1.
      @param p2 A reference to the Player object
             for player 2.
      @return True if the game is still being played.
    */

   public static boolean gameInPlay(Player p1, Player p2)
   {
      boolean status = false; // Set the flag to false.

      // Determine if the game is still being played.
      if (p1.getPoints() != 1 && p2.getPoints() != 1)
      {
         status = true; // Set the flag to true.
      }

      // Return the status.
      return status;
   }

   /**
      The takeTurn method simulates a player's turn.
      @param p A reference to a Player object.
      @param d A reference to a Die object.
    */

   public static void takeTurn(Player p, Die d)
   {
      // Display information about the player's turn.
      System.out.println("----------------------------");
      System.out.println(p.getName() + "'s turn.");

      d.roll();   // Roll the die.

      // Display the value of the die.
      System.out.println(p.getName() + " rolled a " +
                         d.getValue() + ".");

      // Determine if the player's points are less than the
      // number of points needed to win.
      if (p.getPoints() - d.getValue() < 1)
      {
         // If so, add the value to the player's points.
         p.setPoints(p.getPoints() + d.getValue());
      }
      else
      {
         // Subtract the value from the player's points.
         p.setPoints(p.getPoints() - d.getValue());
      }

      // Display the player's points after the roll.
      System.out.println(p.getName() + " has " +
                         p.getPoints() + " point(s).");
   }

   /**
      The determineWinner method displays the winner
      of the game.
      @param p1 A reference to the Player object
             for player 1.
      @param p2 A reference to the Player object
             for player 2.
    */

   public static void determineWinner(Player p1, Player p2)
   {
      System.out.println("----------------------------");

      // Determine if player 1 has won the game.
      if (p1.getPoints() == 1)
      {
         // If so, display a message declaring player 1
         // as the winner.
         System.out.println(p1.getName() + " is the winner!");
      }
      else
      {
         // Display a message declaring player 2 as the winner.
         System.out.println(p2.getName() + " is the winner!");
      }
      System.out.println("----------------------------");
   }
}