/**
   InvalidEmployeeNumber class
   This is an exception that is thrown by the Employee class
   when it receives an employee number that is invalid for the
   Exception Project programming challenge.
*/

public class InvalidEmployeeNumber extends Exception
{
   /**
      Constructor
   */
   public InvalidEmployeeNumber()
   {
      super("ERROR: Invalid employee number.");
   }
}