import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Mass and Weight programming challenge.
*/

public class MassAndWeight
{
   public static void main(String[] args)
   {
      double mass,      // The object's mass
             weight;    // The object's weight
      String input;     // To hold keyboard input
      
      // Get the object's mass.
      input = JOptionPane.showInputDialog("Enter the object's mass.");
      mass = Double.parseDouble(input);
      
      // Calculate the object's weight.
      weight = mass * 9.8;
      
      // Display the object's weight.
      JOptionPane.showMessageDialog(null, "The object's weight is " +
                                    weight + " Newtons.");
      
      // Determine whether the object is too heavy or too light.
      if (weight > 1000)
         JOptionPane.showMessageDialog(null, "The object is too heavy.");
      else if (weight < 10)
         JOptionPane.showMessageDialog(null, "The object is too light.");
      
      // Exit the applicaton.
      System.exit(0);
   }
}
