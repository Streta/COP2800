/**
   This program demonstrates a solution to the
   Celsius Temperature Table programming challenge.
*/

public class CelsiusTemperatureTable
{
   public static void main(String[] args)
   {
      // Display the table header.
      System.out.println("Fahrenheit\tCelsius");
      System.out.println("=======================");

      // Display the table of temperatures.
      for (int fahr = 0; fahr <= 20; fahr++)
      {
         System.out.printf("%2d %18.2f\n",
                           fahr, celsius(fahr));
      }
   }

   /**
      The celsius method converts a Fahrenheit temperature
      to Celsius.
      @param f The Fahrenheit temperature.
      @return The equivalent Celsius temperature.
   */
   public static double celsius(double f)
   {
      // return 5/9(f - 32)
      return ((5.0 / 9.0) * (f - 32));
   }
}