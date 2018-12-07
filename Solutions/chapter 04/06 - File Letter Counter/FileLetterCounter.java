import javax.swing.JOptionPane;
import java.io.*;

/**
   This program demonstrates a solution to the
   File Letter Counter programming challenge.
*/

public class FileLetterCounter
{
   public static void main(String[] args) throws IOException
   {
      String filename;  // The file to read
      String output;    // To hold the output
      String input;     // To hold file input
      char letter;      // The letter to count
      int num = 0;      // Number of times the letter appears

      // Get the file name from the user.
      filename = JOptionPane.showInputDialog(
                  "Enter the name of a file.");

      // Get the letter to count.
      input = JOptionPane.showInputDialog(
                  "Enter a letter contained in " +
                  "the string.");

      // Make sure the letter is uppercase.
      input = input.toUpperCase();

      // Retrieve the letter.
      letter = input.charAt(0);

      // Open the file.
      FileReader fr = new FileReader(filename);
      BufferedReader inFile = new BufferedReader(fr);

      // Read the first line from the file.
      input = inFile.readLine();

      // Process the entire file.
      while (input != null)
      {
         // Get the uppercase equivalent of the line.
         input = input.toUpperCase();

         // Count the number of times the letter appears
         // in the line.
         for (int i = 0; i < input.length(); i++)
         {
            if (input.charAt(i) == letter)
               num++;
         }

         // Read the next line.
         input = inFile.readLine();
      }

      // Close the file.
      inFile.close();

      // Format and display the count.
      output = String.format("The letter %s " +
                             "appears %d times in " +
                             "the file.\n", letter, num);

      JOptionPane.showMessageDialog(null, output);

      System.exit(0);
   }
}
