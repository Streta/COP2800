import java.util.Scanner;  // Needed for keyboard input

/**
   This program demonstrates a solution to the
   Largest and Smallest programming challenge.
*/


public class LargestAndSmallest
{
   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      int num;             // A number
      int largest;         // The largest number
      int smallest;        // The smallest number

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the first number.
      System.out.print("Enter an integer, or -99 to quit: ");
      num = keyboard.nextInt();
      
      // Since this is the only number we have, it is the both the
      // largest and the smallest... so far.
      largest = num;
      smallest = num;
      
      // Get the rest of the numbers.
      while (num != -99)
      {
         // Ask for another number.
         System.out.print("Enter an integer, or -99 to quit: ");
         num = keyboard.nextInt();

         // Determine whether this is now the largest.
         if (num != -99 && num > largest)
            largest = num;
         
         // Determine whether this is now the smallest.
         if (num != -99 && num < smallest)
            smallest = num;
      }
      
      // Display the largest and smallest numbers.
      if (largest == -99)
         System.out.println("You did not enter any numbers.");
      else
      {
         System.out.println("Largest: " + largest);
         System.out.println("Smallest: " + smallest);
      }
   }
}
