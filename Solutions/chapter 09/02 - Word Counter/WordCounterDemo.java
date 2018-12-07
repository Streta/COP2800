import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Word Counter programming challenge.
*/

public class WordCounterDemo
{
   public static void main(String[] args)
   {
      String input;  // To hold keyboard input
      String output; // To hold the output

      // Get input from the user.
      input = JOptionPane.showInputDialog("Enter a string.");

      // Format the output.
      output = String.format("That string has %d word(s) in it.",
                             wordCount(input));

      // Display the output.
      JOptionPane.showMessageDialog(null, output);

      // Exit the applicaton.
      System.exit(0);
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
      String[] tokens = str.split(" ");;

      // Return the number of tokens.
      return tokens.length;
   }
}