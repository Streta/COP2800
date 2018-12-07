/**
   This program demonstrates a solution to the
   Land Calculation programming challenge.
*/

public class LandCalculation
{
   public static void main(String[] args)
   {
      final int FEET_PER_ACRE = 43560; // Number of feet per acre
      double tract = 389767;           // Feet in a particular tract
      double acres;                    // To hold number of acres
      
      // Calculate the number of acres.
      acres = tract / FEET_PER_ACRE;
      
      // Display the results.
      System.out.println("A tract of land with " +
                         tract + " square feet has " +
                         acres + " acres.");
   }
}
