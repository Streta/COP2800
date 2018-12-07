/**
   InvalidMonthNameExceptions are thrown by Month
   objects when an invalid name is given for the
   month for the Month Class Exceptions programming
   challenge.
*/

public class InvalidMonthNameException extends Exception
{
   /**
      No-arg constructor
   */
      
   public InvalidMonthNameException()
   {
      super("Invalid name given for the month");
   }
   
   /**
      This constructor reports the name that caused
      the exception to be thrown.
      @param name The invalid name.
   */
   
   public InvalidMonthNameException(String name)
   {
      super("Invalid name given for the month: " + name);
   }
}
