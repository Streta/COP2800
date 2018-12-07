/**
   InvalidShift class
   This is an exception that is thrown by the ProductionWorker
   class when it receives an invalid shift number for the
   Exception Project programming challenge.
*/

public class InvalidShift extends Exception
{
   /**
      Constructor
   */
   public InvalidShift()
   {
      super("ERROR: Invalid shift number.");
   }
}