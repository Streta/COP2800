import java.util.Scanner;  // Needed for keyboard input

/**
   This program demonstrates a solution to the
   Sum of Numbers programming challenge.
*/

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      int maxNum;    // To hold the upper limit
      int num;       // To hold a number
      int total = 0; // Accumulator
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a number from the user.
      System.out.print("Enter a positive nonzero number: ");
      maxNum = keyboard.nextInt();
      
      // Validate the number.
      while(maxNum <= 0)
      {
         System.out.print("Invalid. Enter a positive " +
                          "nonzero number: ");
         maxNum = keyboard.nextInt();
      }
      
      // Accumulate the sum of the numbers.
      num = 1; // The number series starts at 1.
      while (num <= maxNum)
      {
         // Add num to total.
         total += num;
         
         // Increment num.
         num++;
      }
      
      // Display the sum.
      System.out.println("The sum of all the integers " +
                         "from 1 through " + maxNum +
                         " is " + total);
   }
}
