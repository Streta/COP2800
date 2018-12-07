import java.util.Random;

/**
   The Lottery class stores data about a lottery
   for the Lottery Application programming challenge.
*/

public class Lottery
{
   // Constant for the number of digits
   private final int NUM_DIGITS = 5;
   
   // Array to hold the lottery numbers
   private int[] lotteryNumbers = new int[NUM_DIGITS];
   
   /**
      The constructor initializes the object with
      a random lottery number.
   */
      
   public Lottery()
   {
      // Create a Random object to generate random
      // numbers.
      Random rand = new Random();
      
      // Generate the random digits.
      for (int i = 0; i < NUM_DIGITS; i++)
         lotteryNumbers[i] = rand.nextInt(9);
   }
   
   /**
      The numMatching method determines the number
      of digits in the argument array that match the 
      ones in the lotteryNumbers array.
      @param picks The array to compare against the
                   lottteryNumbers array.
      @return The number of matching digits.
   */
   
   public int numMatching(int[] picks)
   {
      int num = 0;
      
      for (int i = 0; i < NUM_DIGITS; i++)
      {
         if (picks[i] == lotteryNumbers[i])
            num++;
      }
      
      return num;
   }

   /**
      The copy method makes a copy of the
      lotteryNumbers array.
      @return A reference to the copy.
   */
   
   public int[] copy()
   {
      int[] temp = new int[NUM_DIGITS];
      
      for (int i = 0; i < temp.length; i++)
         temp[i] = lotteryNumbers[i];
      
      return temp;
   }

}
