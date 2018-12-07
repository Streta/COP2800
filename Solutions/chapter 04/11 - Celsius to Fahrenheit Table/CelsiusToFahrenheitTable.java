import java.text.DecimalFormat;

/**
   This program demonstrates a solution to the
   Celsius to Fahrenheit Table programming challenge.
*/

public class CelsiusToFahrenheitTable
{
   public static void main(String[] args)
   {
      double fahrenheit;   // The Fahrenheit temperature
      double celsius;      // The Celsius temperature
      
      // Create a DecimalFormat class to format output.
      DecimalFormat fmt = new DecimalFormat(" 0.0");
             
      // Display the table headings.
      System.out.println("Celsius\t\tFahrenheit");
      System.out.println("------------------------------");
      
      // Display the table.
      for (celsius = 0; celsius <= 20; celsius++)
      {
         fahrenheit = (9.0 / 5.0) * celsius + 32;
         System.out.println(fmt.format(celsius) +
                            "\t\t" + 
                            fmt.format(fahrenheit));
      }
   }
}
