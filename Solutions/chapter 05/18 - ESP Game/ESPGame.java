import javax.swing.JOptionPane;
import java.util.Random;

/**
   This program demonstrates a solution to the
   ESP Game programming challenge.
*/

public class ESPGame
{
   public static void main(String[] args)
   {
      String computer;  // To hold the computer's choice
      String user;      // To hold the user's choice
      int correct = 0;  // Tp hold the number of correct guesses
      
      // Play the game for 10 rounds.
      for(int round = 1; round <= 10; round++)
      {
         // Get the computer's choice.
         computer = computerChoice();
         
         // Get the user's choice.
         user = userChoice();
         
         // Display the computer's choice.
         JOptionPane.showMessageDialog(null, computer);
         
         // Determine if the user's guess was correct.
         if (user.equalsIgnoreCase(computer))
            correct++;
      }
      
      // Display the results.
      JOptionPane.showMessageDialog(null, 
                           "Number of correct guesses: " 
                           + correct);
                           
      // Exit the program.
      System.exit(0);
   }
   
   /**
      computerChoice method
      @return The computer's choice of "red",
              "green", "blue", "orange", or 
              "yellow".
   */
   
   public static String computerChoice()
   {
      // Variable to hold the computer's choice.
      String choice;
      
      // Create a Random object.
      Random rand = new Random();
      
      // Generate a random number in the range of
      // 1 through 5.
      int num = rand.nextInt(5) + 1;
      
      // Determine the computer's choice where
      // 1=red, 2=green, 3=blue, 4=orange, and 5=yellow.
      switch (num)
      {
         case 1:
            choice = "RED";
            break;
         case 2:
            choice = "GREEN";
            break;
         case 3:
            choice = "BLUE";
            break;
         case 4:
            choice = "ORANGE";
            break;
         default:
            choice = "YELLOW";
      }
         
      // Return the computer's choice.
      return choice;
   }
   
   /**
      userChoice method
      @return The user's choice of "red",
              "green", "blue", "orange", or 
              "yellow".
   */
   
   public static String userChoice()
   {
      // Variable to hold the user's input.
      String input;
      
      // Get the user's choice.
      input = JOptionPane.showInputDialog(
          "I'm thinking of a color." +
          "\nIs it red, green, " + 
          "blue, orange, or yellow?");
      
      // Validate the choice.
      while (!isValidChoice(input))
      {
         // Get the user's choice.
         input = JOptionPane.showInputDialog(
             "Please enter red, blue, green, " + 
             "orange, or yellow.");
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
      
      // Covert the choice to uppercase and compare.
      switch (choice.toUpperCase())
      {
         case "RED":
            break;
         case "GREEN":
            break;
         case "BLUE":
            break;
         case "ORANGE":
            break;
         case "YELLOW":
            break;            
         default:
            valid = false;
      }
      
      // Return the validation result.
      return valid;
   }
}