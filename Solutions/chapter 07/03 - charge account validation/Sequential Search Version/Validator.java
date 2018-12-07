/**
   The Validator class stores data about valid account numbers
   for the Charge Account Validation programming challenge.
   This version of the class uses a sequential search.
*/

public class Validator
{
   // Array of valid numbers
   private int[] valid = { 5658845, 4520125, 7895122, 8777541, 
                           8451277, 1302850, 8080152, 4562555,
                           5552012, 5050552, 7825877, 1250255,
                           1005231, 6545231, 3852085, 7576651,
                           7881200, 4581002 };
   
   /**
      The isValid method uses a sequential search
      to determine whether a number appears in
      the array of valid numbers.
      @param number The number to search for.
      @return true if the number is found, false
              otherwise.
   */
      
   public boolean isValid(int number)
   {
      boolean found = false;  // Flag
      int index = 0;          // Array index
      
      while (!found && index < valid.length)
      {
         if (valid[index] == number)
            found = true;
         else
            index++;
      }
      
      return found;
   }
}
