import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Lottery Application programming challenge.
*/

public class LotteryDemo
{
   public static void main(String[] args)
   {
      String input;                    // To hold keyboard input
      int[] userPicks = new int[5];    // User-picked lottery numbers
      int matching;                    // Number of matching digits
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create a Lottery object.
      Lottery lotto = new Lottery();
      
      // Get the user's picks.
      for (int digit = 1; digit <= 5; digit++)
      {
         System.out.print("Enter digit " + digit + ": ");
         userPicks[digit-1] = keyboard.nextInt();
         while (userPicks[digit-1] < 0 || userPicks[digit-1] > 9)
         {
            System.out.print("ERROR. Enter a single digit (0 - 9): ");
            userPicks[digit-1] = keyboard.nextInt();
         }
      }
      
      // Compare.
      matching = lotto.numMatching(userPicks);
      
      // Display the results.
      int[] lottoNums = lotto.copy();
      System.out.print("Lottery numbers: ");
      for (int i = 0; i < lottoNums.length; i++)
         System.out.print(lottoNums[i] + " ");
      System.out.println();
   
      System.out.println("Number of matching digits: " +
                         matching);
      if (matching == 5)
         System.out.println("GRAND PRIZE WINNER!!!!");
   }
}