import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Heads or Tails Game programming challenge.
 */

 public class HeadsOrTailsGame
 {
   private static int roundNumber = 1;  // The round number

   public static void main(String[] args)
   {
      final int MAX_POINTS = 5;  // Number of points needed to win
      String player1Name;        // First player's name
      String player2Name;        // Second player's name

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the player's names.
      System.out.print("Enter the first player's name: ");
      player1Name = keyboard.nextLine();
      System.out.print("Enter the second player's name: ");
      player2Name = keyboard.nextLine();

      // Create the coin.
      Coin coin = new Coin();

      // Create the two players.
      Player player1 = new Player(player1Name);
      Player player2 = new Player(player2Name);

      // Play the game until a player wins.
      while (player1.getPoints() < MAX_POINTS &&
             player2.getPoints() < MAX_POINTS)
      {
         // Update and display the round number.
         displayRoundNumber();

         // Get the player's guesses.
         makeGuess(player1);
         makeGuess(player2);

         // Toss the coin and display the results.
         tossCoin(coin);

         // Check the player's guesses.
         checkGuess(player1, coin);
         checkGuess(player2, coin);

         // Display the player's points.
         displayPoints(player1);
         displayPoints(player2);
      }

      // Display the winner.
      displayWinner(player1, player2);
   }

   /**
      The displayRoundNumber method updates and
      displays the round number, which is stored
      in the static field named roundNumber.
    */

   public static void displayRoundNumber()
   {
      // Display the round number.
      System.out.println("----------------------------");
      System.out.printf("\nRound %d Start!\n\n", roundNumber);
      System.out.println("----------------------------");

      // Increment the round number.
      roundNumber++;
   }

   /**
      The tossCoin method calls the Coin object's
      toss method and displays the result.
      @param c A reference to a Coin object.
    */

   public static void tossCoin(Coin c)
   {
      // Display a message indicating that the coin was tossed.
      System.out.println("The coin was tossed.");

      // Toss the coin.
      c.toss();

      // Display the result.
      System.out.printf("The coin landed on %s.\n",
                        c.getSideUp());
   }

   /**
      The makeGuess method calls the Player class's
      makeGuess method and displays the result.
      @param p A reference to a Player object.
    */

   public static void makeGuess(Player p)
   {
      // The player makes a guess.
      p.makeGuess();

      // Display the player's guess.
      System.out.printf("%s guessed %s.\n",
                        p.getName(), p.getGuess());
   }

   /**
      The checkGuess method checks the player's guess,
      adjusts the player's points, and displays the result.
      @param p A reference to a Player object.
      @param c A reference to a Coin object.
    */

   public static void checkGuess(Player p, Coin c)
   {
      // Determine if the player guessed correctly.
      if (p.getGuess().equals(c.getSideUp()))
      {
         // Display a message indicating that the player guessed correctly.
         System.out.printf("%s guessed correctly.\n", p.getName());
         System.out.printf("%s was awarded a point.\n", p.getName());

         // Award the player a point.
         p.setPoints(p.getPoints() + 1);

      }
      else
      {
         // Display a message indicating that the player guessed incorrectly.
         System.out.printf("%s guessed incorrectly.\n", p.getName());
         System.out.printf("%s lost a point.\n", p.getName());

         // Subtract a point.
         p.setPoints(p.getPoints() - 1);
      }

   }

   /**
      The displayPoints method displays the player's points.
      @param p A reference to a Player object.
    */

   public static void displayPoints(Player p)
   {
      // Display the player's total number of points.
      System.out.printf("%s has %d point(s).\n",
                        p.getName(), p.getPoints());
   }

   /**
      The displayWinner method determines the winner when
      the game has ended and displays the results.
      @param p1 A reference to the Player object for player 1.
      @param p2 A reference to the Player object for player 2.
    */

   public static void displayWinner(Player p1, Player p2)
   {
      // Display a message indicating that the game has ended.
      System.out.println("----------------------------");
      System.out.println("\nGame Over");

      // Determine if player 1 has more points than player 2.
      if (p1.getPoints() > p2.getPoints())
      {
         // Display a message indicating that player 1 is the winner.
         System.out.printf("%s is the winner!\n\n", p1.getName());
      }
      // Determine if player 2 has more points than player 1.
      else if (p2.getPoints() > p1.getPoints())
      {
         // Display a message indicating that player 2 is the winner.
         System.out.printf("%s is the winner!\n\n", p2.getName());
      }
      // The game is a tie.
      else
      {
         // Display a message indicating that the game is tied.
         System.out.printf("Both players are tied!\n\n");
      }
      System.out.println("----------------------------");
   }
 }