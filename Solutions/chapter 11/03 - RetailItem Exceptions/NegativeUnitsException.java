/**
   NegativeUnitsExceptions are thrown by
   RetailItem objects when a negative number is
   given for the item units for the RetailItem 
   Exceptions programming challenge.
*/

public class NegativeUnitsException extends Exception
{
   /**
      No-arg constructor
   */
   
   public NegativeUnitsException()
   {
      super("Negative number given for units.");
   }
   
   /**
      This constructor reports the units value that caused
      the exception to be thrown.
      @param u The invalid units value.
   */
      
   public NegativeUnitsException(double u)
   {
      super("Negative number given for untis: " + u);
   }
}
