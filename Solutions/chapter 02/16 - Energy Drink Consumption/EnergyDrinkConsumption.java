/**
   This program demonstrates a solution to the
   Energy Drink Consumption programming challenge.
*/

public class EnergyDrinkConsumption
{
   public static void main(String[] args)
   {
      // Constant for the number surveyed
      final int NUM_SURVEYED = 12467;
      
      // Constant for the percentage who purchase
      // energy drinks
      final double ENERGY_DRINKERS_PCT = 0.14; 
      
      // Constant for the percentage of energy drinkers
      // who prefer citrus flavor
      final double PREFER_CITRUS_PCT = 0.64;
      
      // Variables
      double energyDrinkers; // Number of energy drinkers
      double preferCitrus;   // Number that prefer citrus
            
      // Calculate the number of energy drinkers.
      energyDrinkers = NUM_SURVEYED * ENERGY_DRINKERS_PCT;
      
      // Calculate the number of energy drinkers that
      // prefer citrus flavor.
      preferCitrus = energyDrinkers * PREFER_CITRUS_PCT;
      
      // Display the results.
      System.out.println("We surveyed " + NUM_SURVEYED + " people.");
      System.out.println("Out of those surveyed, approximately " +
                         energyDrinkers + " purchase at least one " +
                         "energy drink per year.");
      System.out.println("Approximtely " + preferCitrus + " of those " +
                         "prefer citrus flavored energy drinks.");
   }
}
