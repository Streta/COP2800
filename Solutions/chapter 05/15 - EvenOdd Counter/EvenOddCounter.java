import java.util.Random;   // Needed for Random class
import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Even/Odd Counter programming challenge.
*/

public class EvenOddCounter
{
   public static void main(String[] args)
   {
      int numEven = 0;  // To hold the number of even numbers
      int numOdd = 0;   // To hold the number of odd numbers
      
      // Create a random object.
      Random randomValue = new Random();
      
      // Generate 100 random numbers.
      for (int i = 1; i <= 100; i++)
      {
			// Determine if the number was even or odd.
         if (isEven(randomValue.nextInt(i)))
            numEven++;
         else
            numOdd++;
      }
      
      // Display the results.
      JOptionPane.showMessageDialog(null, "Out of 100 randomly " + 
                                    "generated numbers, " + 
                                    numEven + " were even and " + 
                                    numOdd + " were odd.");
   }
   
   /**
      The isEven method determines whether a number is even or odd.
      @param num The number to check.
      @return true if the number is even, false otherwise.
   */

   public static boolean isEven(int num)
   {
      boolean isEvenNumber = false;
      
      if ((num % 2) == 0)
         isEvenNumber = true;
      
      return isEvenNumber;
   }
}