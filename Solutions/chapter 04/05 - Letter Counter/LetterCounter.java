import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Letter Counter programming challenge.
*/

public class LetterCounter
{
   public static void main(String[] args)
   {
      String input;     // To hold keyboard input
      String output;    // To hold the output
      String str;       // The string to search
      String strUpper;  // Uppercase equivalent of str
      char letter;      // The letter to count
      int num = 0;      // Number of times the letter appears
      
      // Get a string from the user.
      str = JOptionPane.showInputDialog("Enter a string.");
      
      // Get the uppercase equivalent of the string.
      strUpper = str.toUpperCase();
      
      // Get the letter to count.
      input = JOptionPane.showInputDialog(
                 "Enter a letter contained in " +
                 "the string.");
      // Make sure the letter is uppercase.
      input = input.toUpperCase();
      
      // Retrieve the letter.
      letter = input.charAt(0);
      
      // Count the number of times the letter appears
      // in the string.
      for (int i = 0; i < strUpper.length(); i++)
      {
         if (strUpper.charAt(i) == letter)
            num++;
      }
      
      // Format and display the count.
      output = String.format("The letter %s " +
                             "appears %d times in " +
                             "the string: %s\n", 
                             letter, num, str);
                             
      JOptionPane.showMessageDialog(null, output);
      
      System.exit(0);
   }
}
