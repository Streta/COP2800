import java.util.Random;
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Slot Machine Simulation programming challenge.
*/

public class SlotMachineSimulation
{
   public static void main(String[] args)
   {
      // Constant for the maximum random number
      final int MAX_NUMBER = 5;
      
      // Variables
      String input;     // To hold keyboard input
      String randList;  // To hold a string of characters
      int randNum;      // To hold a random number
      char rand1;       // To hold the first character
      char rand2;       // To hold the second character
      char rand3;       // To hold the third character
      char playAgain;   // To hold 'y' or 'n'
      double amountBet; // To hold the amount bet
      double amountWon; // To hold the amount won
      double totalBet;  // To hold the total bets
      double totalWon;  // To hold total winnings
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object.
      Random rand = new Random();
      
      // Set the bets and winnings to zero.
      amountBet = 0;
      amountWon = 0;
      totalBet = 0;
      totalWon = 0;
      
      // Play the slot machine once, and repeat the game as long 
      // as the user confirms they want to continue to play.
      do 
      {
         System.out.println("Welcome to the Slot Machine Simulation.");
      
         // Set the random character 
         // list to an empty string.
         randList = "";
         
         // Get the amount the user wants to bet.
         System.out.print("\nEnter the amount you would like to bet: $");
         amountBet = keyboard.nextDouble();
         
         // Skip a line.
         System.out.println();
         
         // Increment the total bets.
         totalBet += amountBet;

         // Get three words from the list.
         for (int i = 0; i < 3; i++)
         {
            // Generate a random number.
            randNum = rand.nextInt(MAX_NUMBER);
         
               // Use the value of the random number to
               // select a word from the list.
               switch (randNum)
               {
                  case 0:  System.out.print("- Cherries -");
                           break;
               
                  case 1:  System.out.print("- Oranges -");
                           break;
               
                  case 2:  System.out.print("- Plums -");
                           break;
               
                  case 3:  System.out.print("- Bells -");
                           break;
               
                  case 4:  System.out.print("- Melons -");
                           break;
               
                  case 5:  System.out.print("- Bars -");
                           break;
               }
               
               // Add the random number to 
               // the string of characters.
               randList += randNum;
            }
         
         // Store each of the characters from
         // the list.
         rand1 = randList.charAt(0);
         rand2 = randList.charAt(1);
         rand3 = randList.charAt(2);
         
         // Skip a line.
         System.out.println();
            
         // Determine if all three characters match.
         if (rand1 == rand2 && rand1 == rand3)
         {
            System.out.println("\nWow! All three match!");
            System.out.println("That triples your bet!");
            
            // Triple the amount won.
            amountWon = amountBet * 3;
         }
         // Determine if only two characters match.
         else if (rand1 == rand2 || rand1 == rand3 || rand2 == rand3)
         {
            System.out.println("\nGreat! Two match.");
            System.out.println("That doubles your bet!");
            
            // Triple the amount won.
            amountWon = amountBet * 2;
         }
         // Determine if none of the characters match.
         else
         {
            System.out.println("\nSorry, None match...");
            
            // Set the amount won to zero.
            amountWon = amountBet * 0;
         }
         
         // Display the amount won.       
         System.out.printf("\nYou win $%,.2f\n", amountWon);
         
         // Skip a line.
         System.out.println();
         
         // Increment the total winnings.
         totalWon += amountWon;
         
         // Prompt the user to play again.
         System.out.println("\nWould you like to play again?");
         System.out.print("Enter Y for yes or N for no: ");
         input = keyboard.next();      // Read a string.
         playAgain = input.charAt(0);  // Get the first character.
         
      } while (playAgain == 'Y' || playAgain == 'y');

      // Display the totals.
      System.out.printf("You bet a total of $%,.2f\n", totalBet);
      System.out.printf("You won a total of $%,.2f\n", totalWon);
   }
}