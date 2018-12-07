/**
   This program demonstrates a solution to the
   Month Class Exceptions programming challenge.
*/

public class MonthDemo1
{
   public static void main(String[] args)
   {
      // Use the default constructor.
      Month m = new Month();
      System.out.println("Month " + m.getMonthNumber() +
                         " is " + m + "\n");
      // Set the month number to the values 0 through 13
      // (0 and 13 are invalid), and display the resulting month name.
      for (int i = 0; i <= 13; i++)
      {
         try
         {
            m.setMonthNumber(i);
            System.out.println("Month " + m.getMonthNumber() +
                               " is " + m);
         }
         catch (InvalidMonthNumberException e)
         {
            System.out.println("Error - " + e.getMessage());
         }
      }
   }
}
