/**
   This program demonstrates a solution to the
   Month Class Exceptions programming challenge.
*/

public class MonthDemo2
{
   public static void main(String[] args)
   {
      // Use the 2nd constructor to create an object with
      // an invalid month number.
      try
      {
         Month m = new Month(25);
         System.out.println("The month you just created is " + m);
      }
      catch (InvalidMonthNumberException e)
      {
         System.out.println("Error - " + e.getMessage());
      }
   }
}
