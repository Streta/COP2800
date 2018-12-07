import java.io.*;
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Word Counter programming challenge.
*/

public class WordCounter
{
   public static void main(String[] args) throws IOException
   {
      String input;        // To hold a line from the file
      String filename;     // The name of the file
      int words = 0;       // Accumulator

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the name of the file.
      System.out.print("Enter the name of a file: ");
      filename = keyboard.nextLine();

      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      // Process the file contents.
      while (inputFile.hasNext())
      {
         // Read a line from the file.
         input = inputFile.nextLine();

         // Accumulate the number of words in the line.
         words += wordCount(input);
       }

      // Close the file.
      inputFile.close();

      // Display the number of words.
      System.out.printf("That file has %d words in it.\n", words);
   }

   /**
      The wordCount method counts the number of words in
      a string.
      @param str The string to count.
      @return The number of words.
   */

   public static int wordCount(String str)
   {
      // Get the tokens, using a space delimiter.
      String[] tokens = str.split(" ");

      // Return the number of tokens.
      return tokens.length;
   }
}