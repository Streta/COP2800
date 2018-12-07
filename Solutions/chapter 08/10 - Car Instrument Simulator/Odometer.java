/**
   The Odometer class stores data about a car's odometer
   for the Car Instrument Simulator programming challenge.
*/

public class Odometer
{
   // Constant for the maximum mileage
   public final int MAX_MILEAGE = 999999;
   
   // Constant for the miles-per-gallon
   public final int MPG = 24;
   
   // Field for the current mileage
   private int mileage;

   // Field for the mileage set-point to
   // remember when the FuelGuage gallons
   // were decremented.
   private int setPoint;

   // Field to reference a FuelGauge object
   private FuelGauge fuelGauge;
   
   /**
      Constructor
      @param m Initial mileage.
      @param fg A reference to a FuelGauge object.
   */
   public Odometer(int m, FuelGauge fg)
   { 
      mileage = m;
      setPoint = m;
      fuelGauge = fg;
   }
   
   /**
      getMileage method
      @returns The mileage.
   */
   public int getMileage()
   {
      return mileage;
   }
   
   /**
      The incrementMileage method increments
      the mileage field. If mileage exceeds the
      maximum amount, it rolls over to 0.
   */
   public void incrementMileage()
   {
      // Increment the mileage, but rollover
      // if we go past the maximum amount.
      if (mileage < MAX_MILEAGE)
         mileage++;
      else
         mileage = 0;
         
      // See if we have burned a gallon of gas. This
      // happens every MPG miles.
      //
      // If setPoint is greater than mileage, then
      // the odometer has rolled over.
      if (setPoint > mileage)
      {
         // Add MAX_MILEAGE + 1 to get the actual mileage.
         int falseMileage = mileage + MAX_MILEAGE + 1;

         if ( (falseMileage - setPoint) >= MPG )
         {
            fuelGauge.decrementGallons();
            setPoint = mileage;
         }
      }
      else
      {
         if ( (mileage - setPoint) >= MPG )
         {
            fuelGauge.decrementGallons();
            setPoint = mileage;
         }
      }
   }
}
   