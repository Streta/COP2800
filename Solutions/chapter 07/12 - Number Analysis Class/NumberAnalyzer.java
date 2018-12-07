import java.io.*;
import java.util.Scanner;

/**
   The NumberAnalyzer class stores data about a number
   for the Number Analysis Class programming challenge.
*/

public class NumberAnalyzer
{
   private double[] numbers;
   private int count;
   
   /**
      The constructor initializes an object with the values
      read from a file.
      @param filename The name of a file containing numbers.
   */

   public NumberAnalyzer(String filename) throws IOException
   {
      getNumbers(filename);
   }
   
   /**
      getLowest method
      @return The lowest number in the object's array.
   */
   
   public double getLowest()
   {
      double lowest = numbers[0];
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] < lowest)
            lowest = numbers[i];
      }
      
      return lowest;
   }

   /**
      getHighest method
      @return The highest number in the object's array.
   */
   
   public double getHighest()
   {
      double highest = numbers[0];
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] > highest)
            highest = numbers[i];
      }
      
      return highest;
   }
   
   /**
      getTotal method
      @return The total of the numbers in the object's array.
   */
   
   public double getTotal()
   {
      double total = 0.0;
      
      for (int i = 0; i < numbers.length; i++)
         total += numbers[i];
      
      return total;
   }

   /**
      getAverage method
      @return The average of the numbers in the object's array.
   */
      
   public double getAverage()
   {
      return ( getTotal() / numbers.length );
   }
   
   /**
      The getNumbers method populates an object's array with
      the values read from a file.
      @param filename The name of a file containing numbers.
   */
   
   private int getNumbers(String filename) throws IOException
   {
      // Get the number of values in the file.
      count = getNumberOfValues(filename);

      // Create the necessary objects for file input.
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      // Create an array to hold the numbers.
      numbers = new double[count];
      
      // Read the numbers from the file.
      for (int i = 0; i < count; i++)
      {
         numbers[i] = inFile.nextDouble();;
      }
      
      // Close the file.
      inFile.close();
      
      return count;
   }

   /**
      The getNumberOfValues method counts the number of entries
      in a file.
      @param filename The name of a file containing numbers.
   */
   
   private int getNumberOfValues(String filename) throws IOException
   {
      // Create the necessary objects for file input.
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      // Initialize the counter variable.
      count = 0;
      
      // Count the number of values in the file.
      while (inFile.hasNext())
      {
         // Read the next value, but don't do
         // anything with it.
         inFile.nextDouble();
         
         // Increment count.
         count++;
      }
      
      // Close the file.
      inFile.close();
      
      // Return the number of items read from the file.
      return count;
   }
}
