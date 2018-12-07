import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Sum of Numbers in a String programming challenge.
*/

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      String input;        // User input
      double sum = 0.0;    // Accumulator

      // Get a list of numbers.
      input = JOptionPane.showInputDialog("Enter a series of " +
                                          "numbers separated " +
                                          "only by commas: ");

      // Trim leading and trailing whitespace.
      input.trim();

      // Tokenize the string using the comma as a delimiter.
      String[] tokens = input.split(",");

      // Get the numbers and sum them.
      for (String s : tokens)
      {
         sum += Double.parseDouble(s);
      }

      // Display the sum.
      JOptionPane.showMessageDialog(null, String.format(
                                    "The sum of those " +
                                    "numbers is %,.2f",sum));

      // Exit the applicaton.
      System.exit(0);
   }
}