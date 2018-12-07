import java.util.Scanner;
import java.io.*;

/**
   This program demonstrates a solution to the
   Population Data programming challenge.
*/

public class PopulationData
{
   public static void main(String[] args) throws IOException
   {
      // Constants for the array size.
      final int YEAR_START = 1950;
      final int YEAR_END = 1990;
      final int SIZE = YEAR_END - YEAR_START;
      
      // Create an array to hold the population data.
      int[] population = new int[SIZE];
      
      // Get the population data from the file.
      getDataFromFile(population, "USPopulation.txt");
      
		int average = getAverageChange(population);
		int greatest = getHighestIndex(population) + YEAR_START;
		int smallest = getLowestIndex(population) + YEAR_START;
		
      // Display the average annual 
      // change in population.
      System.out.printf("The average annual change " + 
								 "in population from " + 
								 YEAR_START + " through " + YEAR_END + 
								 " was %,4d.\n", average);
								 
      // Display the year with the 
      // greatest increase in population.
		System.out.println("The year with the greatest increase " + 
							    "in population from " + 
								 YEAR_START + " through " + YEAR_END + 
								 " was " + greatest + ".");
      
      // Calculate and display the year with the 
      // smallest increase in population.
			System.out.println("The year with the smallest increase " + 
							       "in population from " + 
								    YEAR_START + " through " + YEAR_END + 
								    " was " + smallest + ".");	
   }
   
   /**
      The getDataFromFile method populates an array of 
      integers with the values read from a file.
      @param array The array to reference the data.
      @param filename The name of a file containing data.
   */ 

   public static void getDataFromFile(int[] array, 
                        String filename) throws IOException
   {
      int index = 0; // Loop control variable
   
      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
   
      // Read the file contents into the array.
      while (inputFile.hasNext() && index < array.length)
      {
         array[index] = inputFile.nextInt();
         index++;
      }
   
      // Close the file.
      inputFile.close();
   }  

   /**
      getTotalChange method.
      @param array An array of integers.
      @return The total of the change in the
		        values stored in the argument array.
   */
   
   public static int getTotalChange(int[] array)
   {
      int total = 0;
		int difference = 0;
      
      for (int i = 0; i < array.length - 1; i++)
		{
			difference = array[i + 1] - array[i];
         total += difference;
			
		}
      
      return total;
   }
   
   /**
      getAverageChange method
      @param array An array of integers.
      @return The average change of the values 
		        stored in the argument array.
   */
   
   public static int getAverageChange(int[] array)
   {
      return getTotalChange(array) / array.length - 1;
   }
   
   /**
      getHighestIndex method
      @param array An array of integers.
      @return The index of the element with the 
		        greatest increase in the argument 
				  array.
   */
   
   public static int getHighestIndex(int[] array)
   {
      int highest = array[1] - array[0];
		int difference = 0;
		int index = 0;
      
      for (int i = 1; i < array.length - 1; i++)
      {
			difference = array[i + 1] - array[i];
			
         if (difference > highest)
			{
            highest = difference;
				index = i + 1;
			}
      }
      
      return index;
   }
   
   /**
      getHighestIndex method
      @param array An array of integers.
      @return The index of the element with the 
		        greatest increase in the argument 
				  array.
   */
   
   public static int getLowestIndex(int[] array)
   {
      int lowest = array[1] - array[0];
		int difference = 0;
		int index = 0;
      
      for (int i = 1; i < array.length - 1; i++)
      {
			difference = array[i + 1] - array[i];
			
         if (difference < lowest)
			{
            lowest = difference;
				index = i + 1;
			}
      }
      
      return index;
   }       
}