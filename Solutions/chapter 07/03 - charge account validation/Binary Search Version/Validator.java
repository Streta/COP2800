/**
   The Validator class stores data about valid account numbers
   for the Charge Account Validation programming challenge.
   This version of the class uses a binary search.
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
      Constructor
   */
   
   public Validator()
   {
      // The values in the array must be sorted in
      // ascending order to perform a binary search.
      selectionSort(valid);
   }  
   
   /**
      The isValid method uses a binary search to
      determine whether a number appears in the
      array of valid numbers.
      @param number The number to search for.
      @return true if the number is found, false
              otherwise.
   */
   
   public boolean isValid(int number)
   {
      int first;       // First array element
      int last;        // Last array element
      int middle;      // Mid point of search
      boolean found;   // Flag
      
      // Set the inital values.
      first = 0;
      last = valid.length - 1;
      found = false;

      // Search for the value.
      while (!found && first <= last)
      {
         middle = (first + last) / 2;    // Calculate mid point
         if (valid[middle] == number)    // If value is found at mid
            found = true;
         else if (valid[middle] > number)// If value is in lower half
            last = middle - 1;
         else
            first = middle + 1;          // If value is in upper half
      }

      return found;
   }

   /**
      The selectionSort method performs a selection sort on an
      integer array. The array is sorted in ascending order.
      @param array The array to sort.
   */

   public static void selectionSort(int[] array)
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
             }
          }
          array[minIndex] = array[startScan];
          array[startScan] = minValue;
      }
   }
}
