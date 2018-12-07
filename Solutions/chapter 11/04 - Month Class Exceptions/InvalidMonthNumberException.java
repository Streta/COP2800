/**
   InvalidMonthNumberExceptions are thrown by Month
   objects when an invalid number is given for the
   month for the Month Class Exceptions programming
   challenge.
*/

public class InvalidMonthNumberException extends Exception
{
   /**
      No-arg constructor
   */
      
   public InvalidMonthNumberException()
   {
      super("Invalid number given for the month");
   }
   
   /**
      This constructor reports the month number that
      caused the exception to be thrown.
      @param number The invalid number.
   */
      
   public InvalidMonthNumberException(int number)
   {
      super("Invalid number given for the month: " + number);
   }
}
