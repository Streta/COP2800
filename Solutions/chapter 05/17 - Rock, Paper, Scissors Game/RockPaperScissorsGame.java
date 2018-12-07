import javax.swing.JOptionPane;
import java.util.Random;

/**
   This program demonstrates a solution to the
   Rock, Paper, Scissors Game programming challenge.
*/

public class RockPaperScissorsGame
{
   public static void main(String[] args)
   {
      String computer;
      String user;
      
      // Play the game as long as there is a tie.
      do
      {
         // Get the computer's choice.
         computer = computerChoice();
         
         // Get the user's choice.
         user = userChoice();
         
         // Determine the winner.
         determineWinner(computer, user);
      }while(user.equalsIgnoreCase(computer));
      
      // Exit the program.
      System.exit(0);
   }
   
   /**
      computerChoice method
      @return The computer's choice of "rock",
              "paper", or "scissors".
   */
   public static String computerChoice()
   {
      // Variable to hold the computer's choice.
      String choice;
      
      // Create a Random object.
      Random rand = new Random();
      
      // Generate a random number in the range of
      // 1 through 3.
      int num = rand.nextInt(3) + 1;
      
      // Determine the computer's choice where
      // 1=rock, 2=paper, or 3=scissors.
      switch (num)
      {
         case 1:
            choice = "rock";
            break;
         case 2:
            choice = "paper";
            break;
         default:
            choice = "scissors";
      }
         
      // Return the computer's choice.
      return choice;
   }
   
   /**
      userChoice method
      @return The user's choice of "rock",
              "paper", or "scissors".
   */
   public static String userChoice()
   {
      // Variable to hold the user's input.
      String input;
      
      // Get the user's choice.
      input = JOptionPane.showInputDialog(
          "Enter rock, paper, or scissors.");
      
      // Validate the choice.
      while (!isValidChoice(input))
      {
         // Get the user's choice.
         input = JOptionPane.showInputDialog(
             "Please enter rock, paper, or scissors");
      }
      
      // Return the user's choice.
      return input;
   }
   
   /**
      isValidChoice method
      @param choice A string holding the user's choice.
      @return true if the choice is valid, false otherwise.
   */
   public static boolean isValidChoice(String choice)
   {
      // Variable to hold the validation result.
      boolean valid = true;
      
      // Covert the choice to lowercase and compare.
      switch (choice.toLowerCase())
      {
         case "rock":
            break;
         case "paper":
            break;
         case "scissors":
            break;         
         default:
            valid = false;
      }
      
      // Return the validation result.
      return valid;
   }
   
   /**
      The determineWinner method displays the winner.
      @param computer The computer's choice.
      @param user The user's choice.
   */
   public static void determineWinner(String computer, String user)
   {
      // String to hold the output.
      String output;
      
      // Start building the output string with the computer's
      // and the user's choices.
      output =  "The computer's choice was " + computer + ".\n";
      output += "The user's choice was " + user + ".\n\n";
      
      // Determine the winner and continue building the
      // output string.
      if (user.equalsIgnoreCase("rock"))
      {
        if (computer.equalsIgnoreCase("scissors"))
            output += "Rock smashes scissors.\nThe user wins!";
        else if (computer.equalsIgnoreCase("paper"))
            output += "Paper wraps rock.\nThe computer wins!";
        else
            output += "The game is tied!\nGet ready to play again...";
      }
      else if (user.equalsIgnoreCase("paper"))
      {
         if (computer.equalsIgnoreCase("scissors"))
            output += "Scissors cut paper.\nThe computer wins!";
         else if (computer.equalsIgnoreCase("rock"))
            output += "Paper wraps rock.\nThe user wins!";
        else
            output += "The game is tied!\nGet ready to play again...";
      }
      else if (user.equalsIgnoreCase("scissors"))
      {
         if (computer.equalsIgnoreCase("rock"))
            output += "Rock smashes scissors.\nThe computer wins!";
        else if (computer.equalsIgnoreCase("paper"))
            output += "Scissors cut paper.\nThe user wins!";
        else
            output += "The game is tied!\nGet ready to play again...";
      }
      
      // Display the game results.
      JOptionPane.showMessageDialog(null, output);
   }
}