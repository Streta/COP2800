import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Paint Job Estimator programming challenge.
*/

public class PaintJobEstimator
{
   public static void main(String[] args)
   {
      int numRooms;           // Number of rooms
      int squareFeet;         // Total square feet
      double gallons;         // Gallons of paint needed
      double pricePerGallon;  // Paint price per gallon
      double hours;           // Hours of labor
      double paintCost;       // Total cost of paint
      double labor;           // Labor charges
      double total;           // Total job cost

      // Get the number of rooms.
      numRooms = getRooms();

      // Get the total square feet.
      squareFeet = getSquareFeet(numRooms);

      // Get the total cost.
      total = getTotal(squareFeet);

      // Display the total cost.
      JOptionPane.showMessageDialog(null, String.format(
                     "The total estimated cost is $%,.2f",
                     total));

      System.exit(0);
   }

   /**
      The getRooms method prompts the user for the number
      of rooms.
      @return The value entered by the user.
   */

   public static int getRooms()
   {
      String input;        // To hold keyboard input

      input = JOptionPane.showInputDialog(
                       "How many rooms to paint?");
      return Integer.parseInt(input);
   }

   /**
      The getSquareFeet method calculates the total square feet.
      @param rooms The number of rooms.
      @return The total square feet.
   */

   public static int getSquareFeet(int rooms)
   {
      String input;        // To hold keyboard input
      int total = 0;       // Accumulator for square feet

      for (int i = 1; i <= rooms; i++)
      {
         input = JOptionPane.showInputDialog(
                     "Enter the square feet for " +
                     "room number " + i);
         total += Double.parseDouble(input);
      }
      return total;
   }

   /**
      The getTotal method calculates the total job estimate.
      @param sqFeet The total square feet.
      @return The estimated total.
   */

   public static double getTotal(double squareFeet)
   {
      double pricePerGallon;     // Price of paint per gallon
      double paintCost;          // Total cost of paint
      double hours;              // Hours of labor
      double labor;              // Labor cost

      // Get the cost of a gallon of paint.
      pricePerGallon = getPricePerGallon();

      // Get the total paint cost.
      paintCost = getPaintCost(squareFeet, pricePerGallon);

      // Get the hours of labor.
      hours = getHours(squareFeet);

      // Get the labor cost.
      labor = getLabor(hours);

      return (paintCost + labor);
   }

   /**
      The getPricePerGallon method prompts the user for the price
      of a gallon of paint.
      @return The value entered by the user.
   */

   public static double getPricePerGallon()
   {
      String input;        // To hold keyboard input

      input = JOptionPane.showInputDialog(
                   "Enter the price of paint per gallon.");
      return Double.parseDouble(input);
   }

   /**
      The getPaintCost method calculates the total cost of paint.
      @param sqFeet The total square feet.
      @param galPrice The price of a gallon of paint.
      @return The estimated total paint cost.
   */

   public static double getPaintCost(double sqFeet, double galPrice)
   {
      double gallons;   // Number of gallons needed

      // Get the number of gallons.
      gallons = getGallons(sqFeet);

      return (gallons * galPrice);
   }

   /**
      The getGallons method calculates the gallons of paint.
      @param sqFeet The total square feet.
      @return The estimated number of gallons.
   */

   public static double getGallons(double sqFeet)
   {
      final double SQ_UNIT = 115.0;

      return (sqFeet / SQ_UNIT);
   }

   /**
      The getHours method calculates the number of labor hours.
      @param sqFeet The total square feet.
      @return The estimated number of labor hours.
   */

   public static double getHours(double sqFeet)
   {
      final double SQ_UNIT = 115.0;

      return ((sqFeet / SQ_UNIT) * 8.0);
   }

   /**
      The getLabor method calculates the total labor cost.
      @param hours The number of labor hours.
      @return The estimated cost of labor.
   */

   public static double getLabor(double hours)
   {
      final double HOURLY_CHARGE = 18.0;

      return (hours * HOURLY_CHARGE);
   }
}

