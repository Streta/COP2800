/**
   This program demonstrates a solution to the
   Car Instrument Simulator programming challenge.
*/

public class CarInstrumentSimulator
{
   public static void main(String[] args)
   {
      // Create a FuelGuage object.
      FuelGauge fuel = new FuelGauge();
      
      // Create an Odometer object to work with the FuelGauge object.
      Odometer odometer = new Odometer(0, fuel);
      
      // Fill the car up with gas.
      for (int i = 0; i < fuel.MAX_GALLONS; i++)
         fuel.incrementGallons();
         
      // Drive the car until it runs out of gas.
      while (fuel.getGallons() > 0)
      {
         // Drive a mile.
         odometer.incrementMileage();

         // Display the mileage.
         System.out.println("Mileage: " + odometer.getMileage());

         // Display the amount of fuel.
         System.out.println("Fuel level: " + fuel.getGallons() + 
                            " gallons");
         System.out.println("------------------------------");
      }
   }
}