import java.util.Scanner; 

/**
   This program demonstrates a solution to the
   Freezing and Boiling Points programming challenge.
*/

public class FreezeBoilDemo
{
   public static void main(String[] args)
   {
      double temp;         // To hold a temperature

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a temperature.
      System.out.print("Enter a temperature: ");
      temp = keyboard.nextDouble();

      // Create a FreezeBoil object.
      FreezeBoil fb = new FreezeBoil(temp);
      
      // Display the substances that will freeze.
      if (fb.isEthylFreezing())
         System.out.println("Ethyl alcohol will freeze.");
      if (fb.isOxygenFreezing())
         System.out.println("Oxygen will freeze.");
      if (fb.isWaterFreezing())
         System.out.println("Water will freeze.");

      // Display the substances that will boil.
      if (fb.isEthylBoiling())
         System.out.println("Ethyl alcohol will boil.");
      if (fb.isOxygenBoiling())
         System.out.println("Oxygen will boil.");
      if (fb.isWaterBoiling())
         System.out.println("Water will boil.");
   }
}

