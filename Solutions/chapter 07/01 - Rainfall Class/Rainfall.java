/**
   The Rainfall class stores data about a rainfall
   for the Rainfall Class programming challenge.
*/

public class Rainfall
{
   private double[] rain; // Array to hold rainfall data
   
   /**
      Constructor
      @param r An array of rainfall figures.
   */
      
   public Rainfall(double r[])
   {
      // Create a new array.
      rain = new double[r.length];
      
      // Copy the argument's elements to the
      // new array.
      for (int i = 0; i < r.length; i++)
         rain[i] = r[i];
   }
   
   /**
      The getTotalRainFall method calculates the total
      rainfall.
      @return The total amount of rainfall.
   */
   
   public double getTotalRainFall()
   {
      double total = 0.0;  // Accumulator
      
      // Accumulate the sum of the rain array elements.
      for (int i = 0; i < rain.length; i++)
         total += rain[i];

      // Return the sum.
      return total;
   }
   
   /**
      The getAverageRainfall method calculates the
      average amount of rainfall.
      @return The average amount of rainfall.
   */
   
   public double getAverageRainFall()
   {
      return getTotalRainFall() / rain.length;
   }

   /**
      The getHighestMonth method determines the month
      with the highest amount of rainfall.
      @return The number of the month with the highest
              amount of rainfall.
   */
   
   public int getHighestMonth()
   {
      int highest = 0;
      
      // Find the element with the highest value.
      for (int i = 1; i < rain.length; i++)
      {
         if (rain[i] > rain[highest])
            highest = i;
      }
      // Return the element number.
      return highest;
   }

   /**
      The getLowstMonth method determines the month
      with the lowest amount of rainfall.
      @return The number of the month with the lowest
              amount of rainfall.
   */
   
   public int getLowestMonth()
   {
      int lowest = 0;
      
      // Find the element with the lowest value.
      for (int i = 1; i < rain.length; i++)
      {
         if (rain[i] < rain[lowest])
            lowest = i;
      }
      // Return the element number.
      return lowest;
   }

   /**
      The getRainAt method returns a specified value
      in the array.
      @param e The element number to return.
      @return The value stored in the specified element.
   */
   
   public double getRainAt(int e)
   {
      return rain[e];
   }
}
