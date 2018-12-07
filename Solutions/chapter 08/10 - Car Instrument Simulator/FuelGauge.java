/**
   The FuelGauge class stores data about a car's fuel gauge
   for the Car Instrument Simulator programming challenge.
*/

public class FuelGauge
{
   // Constant for the maximum number of gallons
   final int MAX_GALLONS = 15;
   
   // Field for the amount of fuel, in gallons
   private int gallons;
   
   /**
      No-arg constructor
   */
   public FuelGauge()
   {
      gallons = 0;
   }
   
   /**
      Constructor
      @param g The initial number of gallons.
   */
   public FuelGauge(int g)
   {
      // Set gallons to g, but no more than
      // the maximum amount.
      if (g <= MAX_GALLONS)
         gallons = g;
      else
         gallons = MAX_GALLONS;
   }
   
   /**
      getGallons method
      @return The number of gallons of fuel.
   */
   public int getGallons()
   {
      return gallons;
   }
   
   /**
      The incrementGallons method increments
      the value of gallons. If gallons exceeds
      the maximum amount, a message is displayed
      incicating the fuel is overflowing.
   */
   public void incrementGallons()
   { 
      if (gallons < MAX_GALLONS)
         gallons++; 
      else
         System.out.println("FUEL OVERFLOWING!!!");
   }
   
   /**
      The decrementGallons method decrements
      the value of gallons. If gallons is at 0
      then a message is displayed indicating we
      are out of fuel.
   */
   public void decrementGallons()
   { 
      if (gallons > 0)
         gallons--; 
      else
         System.out.println("OUT OF FUEL!!!");
   }
}