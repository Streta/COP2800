import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Kinetic Energy programming challenge.
*/

public class KineticEnergy
{
   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      double mass;         // The object's mass
      double velocity;     // The object's velocity.

      // Get the object's mass.
      input = JOptionPane.showInputDialog(
                           "Enter the object's " +
                           "mass (in kilograms).");
      mass = Double.parseDouble(input);

      // Get the object's velocity.
      input = JOptionPane.showInputDialog(
                           "Enter the object's " +
                           "velocity (in meters/second).");
      velocity = Double.parseDouble(input);

      // Display the object's kinetic energy.
      JOptionPane.showMessageDialog(null, String.format(
                           "The object has %.2f Joules " +
                           "of kinetic energy.",
                           kineticEnergy(mass, velocity)));

      System.exit(0);
   }

   /**
      The kineticEnergy method calculates an object's kinetic
      energy.
      @param mass The object's mass in kilograms.
      @param velocity The object's velocity in meters per second.
      @return The object's kinetic energy, in Joules.
   */
   public static double kineticEnergy(double mass, double velocity)
   {
      // return 1.2mv^2
      return (0.5 * mass * velocity * velocity);
   }
}