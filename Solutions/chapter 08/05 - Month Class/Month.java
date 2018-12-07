/**
   The Month class stores data about a calendar month
   for the Month Class programming challenge.
*/

public class Month
{
   private int monthNumber;

   /**
      The No-arg constructor initializes the object to
      month #1.
   */

   public Month()
   {
      monthNumber = 1;
   }

   /**
      Constructor
      @param m The month number to initialize the object to.
   */

   public Month(int m)
   {
      if (m < 1 || m > 12)
         monthNumber = 1;
      else
         monthNumber = m;
   }

   /**
      Constructor
      @param name The name of the month to initialize the object to.
   */

   public Month(String name)
   {
      if (name.equalsIgnoreCase("january"))
         monthNumber = 1;
      else if (name.equalsIgnoreCase("february"))
         monthNumber = 2;
      else if (name.equalsIgnoreCase("march"))
         monthNumber = 3;
      else if (name.equalsIgnoreCase("april"))
         monthNumber = 4;
      else if (name.equalsIgnoreCase("may"))
         monthNumber = 5;
      else if (name.equalsIgnoreCase("june"))
         monthNumber = 6;
      else if (name.equalsIgnoreCase("july"))
         monthNumber = 7;
      else if (name.equalsIgnoreCase("august"))
         monthNumber = 8;
      else if (name.equalsIgnoreCase("september"))
         monthNumber = 9;
      else if (name.equalsIgnoreCase("october"))
         monthNumber = 10;
      else if (name.equalsIgnoreCase("november"))
         monthNumber = 11;
      else if (name.equalsIgnoreCase("december"))
         monthNumber = 12;
      else
         monthNumber = 1;
   }

   /**
      The setMonthNumber method sets the month.
      @param m The number of the month.
   */

   public void setMonthNumber(int m)
   {
      if (m < 1 || m > 12)
         monthNumber = 1;
      else
         monthNumber = m;
   }

   /**
      The getMonthNumber method gets the month number.
      @return The number of the month.
   */

   public int getMonthNumber()
   {
      return monthNumber;
   }

   /**
      The getMonthName method gets the name of the month.
      @return The name of the month.
   */

   public String getMonthName()
   {
      String name;
      
      switch (monthNumber)
      {
         case 1:  name = "January";
                  break;
         case 2:  name = "February";
                  break;
         case 3:  name = "March";
                  break;
         case 4:  name = "April";
                  break;
         case 5:  name = "May";
                  break;
         case 6:  name = "June";
                  break;
         case 7:  name = "July";
                  break;
         case 8:  name = "August";
                  break;
         case 9:  name = "September";
                  break;
         case 10: name = "October";
                  break;
         case 11: name = "November";
                  break;
         case 12: name = "December";
                  break;
         default: name = "Unknown";
      }
      
      return name;
   }

   /**
      toString method
      @return A reference to a String representation of
              the object.
   */
   
   public String toString()
   {
      return getMonthName();
   }
   
   /**
      equals method
      @param month2 Another Month object.
      @return true if the two Month objects contain
              the same month, false otherwise.
   */
   public boolean equals(Month month2)
   {
      boolean status;
      
      if (month2.getMonthNumber() == monthNumber)
         status = true;
      else
         status = false;
      
      return status;
   }

   /**
      greaterThan method
      @param month2 Another Month object.
      @return true if the calling objects is greater
              than the argument, false otherwise.
   */
   
   public boolean greaterThan(Month month2)
   {
      boolean status;
      
      if (monthNumber > month2.getMonthNumber())
         status = true;
      else
         status = false;
      
      return status;
   }
   
   /**
      lessThan method
      @param month2 Another Month object.
      @return true if the calling objects is less
              than the argument, false otherwise.
   */
   
   public boolean lessThan(Month month2)
   {
      boolean status;
      
      if (monthNumber < month2.getMonthNumber())
         status = true;
      else
         status = false;
      
      return status;
   }
}
