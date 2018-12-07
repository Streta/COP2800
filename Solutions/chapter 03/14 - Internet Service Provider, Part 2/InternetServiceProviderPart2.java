import java.util.Scanner;        // For Scanner class

/**
   This program demonstrates a solution to the
   Internet Service Provider, Part 2 programming challenge.
*/

public class InternetServiceProviderPart2
{
   public static void main(String[] args)
   {
      final double PACKAGE_A = 9.95,       // Package A base charge
                   PACKAGE_B = 13.95,      // Package B base charge
                   PACKAGE_C = 19.95,      // Package C base charge
                   PACKAGE_A_HOURS = 10.0, // Package A hour threshold
                   PACKAGE_B_HOURS = 20.0; // Package B hour threshold
      char ispPackage;                     // Customer package
      double hours,                        // Hours used
             charges = 0.0,                // Calculated charges
             compCharges,                  // Comparison charges
             savings;                      // Amount saved under another package
      String input;                        // To hold keyboard input

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
               charges = PACKAGE_A;
               if (hours > PACKAGE_A_HOURS)
                  charges += (hours - PACKAGE_A_HOURS) * 2.0;
               break;
            case 'B' :
               charges = PACKAGE_B;
               if (hours > PACKAGE_B_HOURS)
                  charges += (hours - PACKAGE_B_HOURS);
               break;
            case 'C' :
               charges = PACKAGE_C;
         }
      
         // Display the charges.
         System.out.printf("The charges are $%,.2f\n", charges);
         
         // Calculate and display the savings.
         switch (ispPackage)
         {
            case 'A' :
               // Calculate the charges if package B were used.
               compCharges = PACKAGE_B;
               if (hours > PACKAGE_B_HOURS)
                  compCharges += (hours - PACKAGE_B_HOURS);
               // Calculate the savings, if any.
               savings = charges - compCharges;
               // Display the savings if there are any.
               if (savings > 0.0)
               {
                  System.out.printf("With package B you " +
                                    "would have saved $%,.2f\n", savings);
               }
               // No break... fall through to next case.
            case 'B' :
               // Determine the charges if package C were used.
               compCharges = PACKAGE_C;
               // Calculate the savings, if any.
               savings = charges - compCharges;
               // Display the savings if there are any.
               if (savings > 0.0)
               {
                  System.out.printf("With package C you " +
                                    "would have saved $%,.2f\n", savings);
               }
         }
      }
   }
}
