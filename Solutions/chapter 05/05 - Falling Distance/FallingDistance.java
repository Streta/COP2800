/**
   This program demonstrates a solution to the
   Falling Distance programming challenge.
*/

public class FallingDistance
{
   public static void main(String[] args)
   {
      // Display the table header.
      System.out.println("Time\tDistance");
      System.out.println("====================");

      // Display the table of falling times and
      // distances.
      for (int s = 1; s <= 10; s++)
      {
         System.out.printf("%2d %12.2f\n",
                           s, fallingDistance(s));
      }
   }

   /**
      The fallingDistance method calculates the distance
      an object falls due to the force of gravity.
      @param seconds The amount of time, in seconds, that
                     the object has fallen.
      @return The distance the object falls in the specified
              time.
   */
   public static double fallingDistance(double seconds)
   {
      final double GRAV = 9.8;      // Gravitational acceleration

      // return the distance, 1/2gt^2.
      return (0.5 * GRAV * seconds * seconds);
   }
}