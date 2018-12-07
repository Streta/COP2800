import java.util.Scanner;
import java.io.*;

/**
   This program demonstrates a solution to the
   File Head Display programming challenge.
*/

public class FileHeadDisplay
{
   public static void main(String[] args) throws IOException
   {
      String filename;     // The name of the file
      String input;        // To hold file input
      int lineCount;       // To count lines

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
             
      // Get the file name.
      System.out.print("Enter the file name: ");
      filename = keyboard.nextLine();
      
      // Open the file.
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      // Initialize the line counter to 1.
      lineCount = 1;
      
      // Display the first five lines.
      while (inFile.hasNext() && lineCount <= 5)
      {
         input = inFile.nextLine();
         System.out.println(input);
         lineCount++;
      }
      
      // Close the file.
      inFile.close();
   }
}
