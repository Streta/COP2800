/**
   The FreezeBoil class stores data about a substance
   for the Freezing and Boiling Points programming challenge.
*/

public class FreezeBoil
{
   private double temperature;   // Substance temperature

   /**
      The constructor initializes an object with
      a temperature.
      @param t The temperature.
   */

   public FreezeBoil(double t)
   {
      temperature = t;
   }
   
   /**
      The setTemperature method sets the
      substance temperature.
      @param t The temperature.
   */

   public void setTemperature(double t)
   {
      temperature = t;
   }

   /**
      The getTemperature method returns the
      substance temperature.
      @return The substance temperature.
   */
   
   public double getTemperature()
   {
      return temperature;
   }

   /**
      The isEthylFreezing method determines
      whether the temperature is at or below the
      freezing point of ethyl alchol.
      @return true if the temperature is at or below
              the freezing point of ethyl alchol,
              false otherwise.
   */
   
   public boolean isEthylFreezing()
   {
      boolean status;
      
      if (temperature <= -173.0)
         status = true;
      else
         status = false;
         
      return status;
   }

   /**
      The isEthylBoilinging method determines
      whether the temperature is at or above the
      boiling point of ethyl alchol.
      @return true if the temperature is at or above
              the boiling point of ethyl alchol,
              false otherwise.
   */

   public boolean isEthylBoiling()
   {
      boolean status;
      
      if (temperature >= 172.0)
         status = true;
      else
         status = false;
         
      return status;
   }

   /**
      The isOxygenFreezing method determines
      whether the temperature is at or below the
      freezing point of oxygen.
      @return true if the temperature is at or below
              the freezing point of oxygen,
              false otherwise.
   */

   public boolean isOxygenFreezing()
   {
      boolean status;
      
      if (temperature <= -362.0)
         status = true;
      else
         status = false;
         
      return status;
   }

   /**
      The isOxygenBoiling method determines
      whether the temperature is at or above the
      boiling point of oxygen.
      @return true if the temperature is at or above
              the boiling point of oxygen,
              false otherwise.
   */

   public boolean isOxygenBoiling()
   {
      boolean status;
      
      if (temperature >= -306.0)
         status = true;
      else
         status = false;
         
      return status;
   }

   /**
      The isWaterFreezing method determines
      whether the temperature is at or below the
      freezing point of water.
      @return true if the temperature is at or below
              the freezing point of water,
              false otherwise.
   */

   public boolean isWaterFreezing()
   {
      boolean status;
      
      if (temperature <= 32.0)
         status = true;
      else
         status = false;
         
      return status;
   }

   /**
      The isWaterBoiling method determines
      whether the temperature is at or above the
      boiling point of water.
      @return true if the temperature is at or above
              the boiling point of water,
              false otherwise.
   */
   
   public boolean isWaterBoiling()
   {
      boolean status;
      
      if (temperature >= 212.0)
         status = true;
      else
         status = false;
         
      return status;
   }
}
