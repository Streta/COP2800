import java.util.Scanner;        // For Scanner class

/**
   This program demonstrates a solution to the
   Internet Service Provider programming challenge.
*/

public class InternetServiceProvider
{
   public static void main(String[] args)
   {
      char ispPackage;        // Customer package
      double hours,           // Hours used
             charges = 0.0;   // Charges
      String input;           // To hold keyboard input

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the package.
      System.out.print("Enter the customer's package (A, B, or C): ");
      input = keyboard.nextLine();
      ispPackage = input.charAt(0);
      ispPackage = Character.toUpperCase(ispPackage);
      
      // Validate the package.
      if (ispPackage < 'A' || ispPackage > 'C')
      {
         System.out.print("Invalid package. Enter A, B, or C.");
      }
      else
      {
         // Get the number of hours.
         System.out.print("Enter the number of hours used: ");
         hours = keyboard.nextDouble();

         // Determine the charges.
         switch(ispPackage)
         {
            case 'A' :
               charges = 9.95;
               if (hours > 10.0)
                  charges += (hours - 10.0) * 2.0;
               break;
            case 'B' :
               charges = 14.95;
               if (hours > 20.0)
                  charges += (hours - 20.0);
               break;
            case 'C' :
               charges = 19.95;
         }
      
         // Display the charges.
         System.out.printf("The charges are $%,.2f\n", charges);
      }
   }
}
