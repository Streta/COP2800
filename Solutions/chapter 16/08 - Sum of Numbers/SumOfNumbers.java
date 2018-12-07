/**
   This program demonstrates a solution to the
   Sum of Numbers programming challenge.
*/

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      int num = 5;
      
      System.out.println("The sum of the integers 1 through " + num +
                         " is " + sum(5));
   }
   
   /**
      The sum method calculates the sum of the integers from 1
      through a specified maximum number.
      @param max The maximum number.
      @return The sum of 1 through max.
   */
   
   public static int sum(int max)
   {
      if (max > 0)
         return max + sum(max - 1);
      else
         return 0;
   }
}