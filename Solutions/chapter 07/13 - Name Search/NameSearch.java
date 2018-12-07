import java.util.Scanner;  // Needed for Scanner
import java.io.*;          // Needed for File and IOException

/**
   This program demonstrates a solution to the
   Name Search programming challenge.
*/

public class NameSearch
{
   public static void main(String[] args) throws IOException
   {
      String boyName;   // To hold the name of a boy
      String girlName;  // To hold the name of a girl

      // Create an array filled with boy names from the file.
      String[] boyNames = getArray("BoyNames.txt");

      // Create an array filled with girl names from the file.
      String[] girlNames = getArray("GirlNames.txt");

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the boy's name as input from the user.
      System.out.print("Enter a boy's name, or N if you " +
                       "do not wish to enter a boy's name: ");
      boyName = keyboard.nextLine();

      // Get the girl's name as input from the user.
      System.out.print("Enter a girl's name, or N if you " +
                       "do not wish to enter a girl's name: ");
      girlName = keyboard.nextLine();

      // Display the result for the boy's name entered by user.
      if (boyName.equalsIgnoreCase("N"))
      {
         System.out.println("You chose not to enter a boy's name.");
      }
      else if (isFound(boyName, boyNames))
      {
         System.out.printf("%s is one of the most popular " +
                           "boy's names.\n", boyName);
      }
      else
      {
         System.out.printf("%s is not one of the most popular " +
                           "boy's names.\n", boyName);
      }

      // Display the result for the girl's name entered by user.
      if (girlName.equalsIgnoreCase("N"))
      {
         System.out.println("You chose not to enter a girl's name.");
      }
      else if (isFound(girlName, girlNames))
      {
         System.out.printf("%s is one of the most popular " +
                           "girl's names.\n", girlName);
      }
      else
      {
         System.out.printf("%s is not one of the most popular " +
                           "girl's names.\n", girlName);
      }
   }

   /**
      The getNumItems method returns the number of items in the file.
      @param filename The name of the file.
      @return The number of items.
    */

   private static int getNumItems(String filename) throws IOException
   {
      // Create the necessary objects for file input.
      FileReader freader = new FileReader(filename);
      BufferedReader inFile = new BufferedReader(freader);

      // Initialize the counter variable.
      int count = 0;

      // Count the number of items in the file.
      String input = inFile.readLine();
      while (input != null)
      {
         count++;
         input = inFile.readLine();
      }

      // Close the file.
      inFile.close();

      return count;
   }

   /**
      The getArray method returns an array filled with the items in the file.
      @param filename The name of the file.
      @return The array of names.
    */

   private static String[] getArray(String filename) throws IOException
   {
      // Get the number of items in the file.
      int arraySize = getNumItems(filename);

      // Create an array the size of the number of items in the file.
      String[] array = new String[arraySize];

      // Create the necessary objects for file input.
      FileReader freader = new FileReader(filename);
      BufferedReader inFile = new BufferedReader(freader);

      // Read the items from the file.
      for (int i = 0; i < arraySize; i++)
      {
         array[i] = inFile.readLine();
      }

      // Close the file.
      inFile.close();

      return array;
   }

   /**
      The isFound method returns true if the item is found in
      the array. Otherwise, it returns false.
      @param item The item to search for.
      @param array The array of names.
      @return True if the item is found.
    */

   private static boolean isFound(String item, String[] array)
   {
      boolean status = false; // Set the status to false.

      // Search the array for the item.
      for (String items : array)
      {
         // If the item is found, set status to true.
         if (items.equalsIgnoreCase(item))
         {
            status = true;
         }
      }

      // Return the status.
      return status;
   }
}