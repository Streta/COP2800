import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Time Calculator programming challenge.
*/

public class TimeCalculator
{
   public static void main(String[] args)
   {
      double seconds;   // The number of seconds
      String input;     // To hold keyboard input
      
      // Get the number of seconds.
      input = JOptionPane.showInputDialog("Enter the number of seconds.");
      seconds = Double.parseDouble(input);
      
      // If seconds is less than 60, that's all we have... just seconds.
      if (seconds < 60)
      {
         JOptionPane.showMessageDialog(null, "That's less than a minute, " +
                                "an hour, or a day.");
      }
      
      // Display the number of minutes, if any.
      if (seconds >= 60)
      {
         JOptionPane.showMessageDialog(null, "There are " +
                     (seconds / 60) + " minutes in " + seconds +
                     " seconds.");
      }
      
      // Display the number of hours, if any.
      if (seconds >= 3600)
      {
         JOptionPane.showMessageDialog(null, "There are " +
                     (seconds / 3600) + " hours in " + seconds +
                     " seconds.");
      }

      // Display the number of days, if any.
      if (seconds >= 86400)
      {
         JOptionPane.showMessageDialog(null, "There are " +
                     (seconds / 86400) + " days in " + seconds +
                     " seconds.");
      }
      
      // Exit the applicaton.
      System.exit(0);
   }
}
