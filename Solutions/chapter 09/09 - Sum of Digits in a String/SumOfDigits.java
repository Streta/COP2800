import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Sum of Digits in a String programming challenge.
*/

public class SumOfDigits
{
   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      int sum = 0;         // Accumulator
      int num;             // To hold a number
      int highest = 0;     // The highest digit
      int lowest = 0;      // The lowest digit
      char[] array;        // Array to hold the characters
      String numAsString;  // To hold a number as a string
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get a string of digits.
      System.out.print("Enter a string of digits: ");
      input = keyboard.nextLine();
      
      // Convert the string to a char array.
      array = input.toCharArray();
      
      // Get the digits and sum them.
      for (int i = 0; i < array.length; i++)
      {
         // Convert an element to a String.
         numAsString = String.valueOf(array[i]);
         
         // Accumulate the numeric value.
         num = Integer.parseInt(numAsString);
         sum += num;
         
         // Find the highest and lowest.
         if (i == 0)
         {
            highest = num;
            lowest = num;
         }
         else
         {
            // Is this the highest so far?
            if (num > highest)
               highest = num;
            
            // Is this the lowest so far?
            if (num < lowest)
               lowest = num;
         }
      }
      
      // Display the output.
      System.out.printf("The sum of those numbers is %d.\n", sum);
      System.out.printf("The highest digit is %d.\n", highest);
      System.out.printf("The lowest digit is %d.\n", lowest);
   }  
}