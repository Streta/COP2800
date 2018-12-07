/**
   This program demonstrates a solution to the
   Recursive Power Method programming challenge.
*/

public class PowDemo
{
   public static void main(String[] args)
   {
      double x = 2.0, y = 10.0;
      
      System.out.println(x + " raised to the power of " + y +
                         " is " + pow(x, y));
   }
   
   /**
      The pow method raises a number to a power.
      @param x The number to raise.
      @param y The power to raise x to.
      @return The value of x raised to the power of y.
   */
   
   public static double pow(double x, double y)
   {
      if (y > 0)
         return x * pow(x, y-1);
      else
         return 1;
   }
}