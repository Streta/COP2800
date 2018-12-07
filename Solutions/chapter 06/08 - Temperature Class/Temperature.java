/**
   The Temperature class stores data about a temperature
   for the Temperature Class programming challenge.
*/

public class Temperature
{
   // Fields
   private double ftemp;   // Fahrenheit temperature

   /**
      The constructor accepts a Fahrenheit temperature
      and stores it in the ftemp field.
      @param f The temperature in Fahrenheit.
    */

   public Temperature(double f)
   {
      ftemp = f;
   }

   /**
      The setFahrenheit method accepts a Fahrenheit
      temperature and stores it in the ftemp field.
      @param f The temperature in Fahrenheit.
    */

   public void setFahrenheit(double f)
   {
      ftemp = f;
   }

   /**
      The getFahrenheit method returns the value
      of the ftemp field as a Fahrenheit temperature.
      @return The temperature in Fahrenheit.
    */

   public double getFahrenheit()
   {
      return ftemp;
   }

   /**
      The getCelsius method returns the converted value
      of the ftemp field as a Celsius temperature.
      @return The temperature in Celsius.
    */

   public double getCelsius()
   {
      return (5.0 / 9.0) * (ftemp - 32.0);
   }

   /**
      The getKelvin method returns the converted value
      of the ftemp field as a Kelvin temperature.
      @return The temperature in Kelvin.
    */

   public double getKelvin()
   {
      return ((5.0 / 9.0) * (ftemp - 32.0)) + 273.0;
   }
}