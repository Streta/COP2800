import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Conversion Program programming challenge.
*/

public class ConversionProgram
{
   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      int selection;       // Menu selection
      double distance;     // Distance in meters
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a distance.
      System.out.print("Enter a distance in meters: ");
      distance = keyboard.nextDouble();
      
      // Display the menu and process the user's
      // selection until 4 is selected.
      do
      {
         // Display the menu.
         menu();

         // Get the user's selection.
         System.out.print("\nEnter your choice: ");
         selection = keyboard.nextInt();

         // Validate the user's selection.
         while (selection < 1 || selection > 4)
         {
            System.out.print("Invalid selection. Enter your choice: ");
            selection = keyboard.nextInt();
         }
         
         // Process the user's selection.
         switch (selection)
         {
            case 1 : showKilometers(distance);
                     break;
            case 2 : showInches(distance);
                     break;
            case 3 : showFeet(distance);
                     break;
            case 4 : System.out.println("Bye!");
         }
         
         System.out.println();
         
      } while (selection != 4);
   }
   
   /**
      The menu method displays the program's menu.
   */
      
   public static void menu()
   {
      System.out.println("1. Convert to kilometers");
      System.out.println("2. Convert to inches");
      System.out.println("3. Convert to feet");
      System.out.println("4. Quit the program");
   }

   /**
      The showKilometers method displays the kilometers that
      are equivalent to a specified number of meters.
      @param meters The number of meters.
   */
   public static void showKilometers(double meters)
   {
      double kilometers = meters * 0.001;
      
      System.out.println(meters + " meters is " +
                         kilometers + " kilometers.");
   }

   /**
      The showInches method displays the inches that
      are equivalent to a specified number of meters.
      @param meters The number of meters.
   */
   public static void showInches(double meters)
   {
      double inches = meters * 39.37;
      
      System.out.println(meters + " meters is " +
                         inches + " inches.");
   }
   
   /**
      The showFeet method displays the feet that
      are equivalent to a specified number of meters.
      @param meters The number of meters.
   */
   public static void showFeet(double meters)
   {
      double feet = meters * 3.281;
      
      System.out.println(meters + " meters is " +
                         feet + " feet.");
   }
}