import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Miles-Per-Gallon programming challenge.
*/

public class MilesPerGallon
{
   public static void main(String[] args)
   {
      double miles;        // Miles driven
      double gallons;      // Gallons of fuel
      double mpg;          // Miles-per-gallon
      String input;        // To hold keyboard input
      
      // Get the miles driven.
      input = JOptionPane.showInputDialog("Enter the miles driven: ");
      miles = Double.parseDouble(input);
      
      // Get the number of gallons of fuel.
      input = JOptionPane.showInputDialog("Enter the gallons of fuel used: ");
      gallons = Double.parseDouble(input);
      
      // Calculate the miles-per-gallon.
      mpg = miles / gallons;
      
      // Display the miles-per-gallon.
      JOptionPane.showMessageDialog(null, "The miles-per-gallon is " + mpg);
      
      // Exit the program.
      System.exit(0);
   }
}
