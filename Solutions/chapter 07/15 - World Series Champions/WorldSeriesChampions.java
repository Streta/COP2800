import java.util.Scanner;
import java.io.*;

/**
   This program demonstrates a solution to the
   World Series Champions programming challenge.
*/

public class WorldSeriesChampions
{
   public static void main(String[] args) throws IOException
   {
      // Get the total number of items in the file.
      int arraySize = getNumberOfItemsInFile("WorldSeriesWinners.txt");
      
      // Create an array to hold the data.
      String[] champions = new String[arraySize];
      
      // Get the data from the file and store it in the array.
      getDataFromFile(champions, "WorldSeriesWinners.txt");
      
      // Get the name of a team from the user.
      String teamName = getTeamName();
      
      // Get the number of times the specified team has won.
      int wins = getTotalWins(teamName, champions);
      
      // Display the result
      System.out.println("The " + teamName + 
                         " have won the World Series " + 
                         wins + " times.");
   }
   
   /**
      The getNumberOfItemsInFile method returns the
      total number of items in the file.
      @param filename The name of a file containing data.
      @return The number of items in the file.
   */ 

   public static int getNumberOfItemsInFile(String filename) throws IOException
   {
      int total = 0; // The number of items in the file.
   
      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
   
      // Read the file contents and keep a running total of each item.
      while (inputFile.hasNext())
      {
         inputFile.nextLine();
         total++;
      }
   
      // Close the file.
      inputFile.close();
      
      // Return the total number of items in the file.
      return total;
   }     
   
   /**
      The getDataFromFile method populates an array of 
      integers with the values read from a file.
      @param array The array to reference the data.
      @param filename The name of a file containing data.
   */ 

   public static void getDataFromFile(String[] array, 
                        String filename) throws IOException
   {
      int index = 0; // Loop control variable
   
      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
   
      // Read the file contents into the array.
      while (inputFile.hasNext() && index < array.length)
      {
         array[index] = inputFile.nextLine();
         index++;
      }
   
      // Close the file.
      inputFile.close();
   }     
   
   /**
      The getTeamName method returns the name
      of the baseball team entered by the user.
      @return The name of a baseball team.
   */    
   
   public static String getTeamName()
   {
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      // Get input from the user.
      System.out.println("World Series Champions");
      System.out.print("Enter the name of a team: ");
      
      // Return the name input by the user.
      return keyboard.nextLine();
   }
   
   /**
      The getTotalWins method returns the
      total number of wins by the team specified.
      @param team The name of a baseball team.
      @param array An array containing the names of winning teams.
      @return The number of wins by the specified team.
   */    
   
   public static int getTotalWins(String team, String[] array)
   {
      int total = 0; // The total number of wins.
      
      // Step through the array and keep a running 
      // total of the number of wins for the specified 
      // team.
      for(int i = 0; i < array.length; i++)
      {
         // Determine if the name is in the array.
         if(team.equalsIgnoreCase(array[i]))
            total++; // Increment the number of wins.
      }
      
      // Return the total number of wins.
      return total;
   }
}