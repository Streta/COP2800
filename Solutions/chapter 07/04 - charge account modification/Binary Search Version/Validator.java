import java.io.*;
import java.util.Scanner;

/**
   The Validator class stores data about account numbers
   for the Charge Account Modification programming challenge.
   This version of the class uses a binary search.
*/

public class Validator
{
   // Array to hold valid numbers
   private int[] valid = new int[18];
   
   /**
      Constructor
      @param filename The name of the file containing list
                      of charge account numbers.
   */

   public Validator(String filename) throws IOException
   {
      int i = 0;        // Array index
      
      // Open the file.
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      // Read the file contents into the array.
      while (inFile.hasNext())
      {
         valid[i] = inFile.nextInt();
         i++;
      }
      // Close the file.
      inFile.close();
      
      // The values in the array must be sorted in
      // ascending order to perform a binary search.
      selectionSort(valid);   }  
   
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
