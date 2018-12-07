import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Retail Price Calculator programming challenge.
*/

public class RetailPriceCalculator
{
   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      String output;       // To hold the output
      double wholesale;    // An item's wholesale cost
      double markup;       // The item's markup percentage
      
      // Get the item's wholesale cost.
      input = JOptionPane.showInputDialog("Enter the item's " +
                                          "wholesale cost.");
      wholesale = Double.parseDouble(input);
   
      // Get the item's markup percentage.
      input = JOptionPane.showInputDialog("Enter the item's " +
                                          "markup percantage.");
      markup = Double.parseDouble(input) / 100.0;

      // Format and display the retail price.
      output = String.format("The item's retail price is $%,.2f", 
                             calculateRetail(wholesale, markup));
      
      JOptionPane.showMessageDialog(null, output);

      System.exit(0);
   }
   
   /**
      The calculateRetail method calculates an item's
      retail price.
      @param wholesale The item's wholesale price.
      @param markupPercent The item's markup percentage.
      @return The item's retail price.
   */
   
   public static double calculateRetail(double wholesale,
                                        double markupPercent)
   {
      return wholesale + (wholesale * markupPercent);
   }
}