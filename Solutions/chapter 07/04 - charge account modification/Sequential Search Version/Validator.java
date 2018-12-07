import java.io.*;
import java.util.Scanner;

/**
   The Validator class stores data about account numbers
   for the Charge Account Modification programming challenge.
   This version of the class uses a sequential search.
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
      String input;     // To hold file input
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
   }  

   /**
      The isValid method uses a sequential search to
      determine whether a number appears in the
      array of valid numbers.
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
