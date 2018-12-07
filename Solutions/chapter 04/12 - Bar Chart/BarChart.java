import java.util.Scanner;  // Needed for keyboard input

/**
   This program demonstrates a solution to the
   Bar Chart programming challenge.
*/

public class BarChart
{
   public static void main(String[] args)
   {
      String bar;    // To hold a line in the bar chart
      int numStars;  // The number of stars to display
      double sales1; // To hold a store 1's sales
      double sales2; // To hold a store 2's sales
      double sales3; // To hold a store 3's sales
      double sales4; // To hold a store 4's sales
      double sales5; // To hold a store 5's sales
                  
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
            
      // Get the sales for store 1.
      System.out.print("Enter today's sales for store 1: ");
      sales1 = keyboard.nextDouble();

      // Get the sales for store 2.
      System.out.print("Enter today's sales for store 2: ");
      sales2 = keyboard.nextDouble();

      // Get the sales for store 3.
      System.out.print("Enter today's sales for store 3: ");
      sales3 = keyboard.nextDouble();

      // Get the sales for store 4.
      System.out.print("Enter today's sales for store 4: ");
      sales4 = keyboard.nextDouble();

      // Get the sales for store 5.
      System.out.print("Enter today's sales for store 5: ");
      sales5 = keyboard.nextDouble();

      // Display the bar chart heading.
      System.out.println("\nSALES BAR CHART");
      
      // Display the chart for store 1.
      bar = "";
      numStars = (int) (sales1 / 100);
      for (int i = 0; i < numStars; i++)
         bar = bar + "*";
      System.out.println(bar);
      
      // Display the chart for store 2.
      bar = "";
      numStars = (int) (sales2 / 100);
      for (int i = 0; i < numStars; i++)
         bar = bar + "*";
      System.out.println(bar);

      // Display the chart for store 3.
      bar = "";
      numStars = (int) (sales3 / 100);
      for (int i = 0; i < numStars; i++)
         bar = bar + "*";
      System.out.println(bar);
      
      // Display the chart for store 4.
      bar = "";
      numStars = (int) (sales4 / 100);
      for (int i = 0; i < numStars; i++)
         bar = bar + "*";
      System.out.println(bar);

      // Display the chart for store 5.
      bar = "";
      numStars = (int) (sales5 / 100);
      for (int i = 0; i < numStars; i++)
         bar = bar + "*";
      System.out.println(bar);
   }
}
