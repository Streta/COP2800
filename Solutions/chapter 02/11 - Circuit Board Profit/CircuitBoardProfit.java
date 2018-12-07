import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the 
   Circuit Board Profit programming challenge.
*/

public class CircuitBoardProfit
{
   public static void main(String[] args)
   {
      final double PROFIT_PERCENTAGE = 0.4;  // Percentage of profit
      double retailPrice;                    // Retail price
      double profit;                         // Amount of profit
      String input;                          // To hold keyboard input
      
      // Get the retail price.
      input = JOptionPane.showInputDialog(
                "Enter the circuit board's retail price: ");
      retailPrice = Double.parseDouble(input);
      
      // Calculate the amount of profit.
      profit = retailPrice * PROFIT_PERCENTAGE;
      
      // Display the amount of profit.
      JOptionPane.showMessageDialog(null, 
                           "Amount of profit: $" + profit);
      
      // Exit the applicaton.
      System.exit(0);
   }
}
