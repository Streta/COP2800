import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Multiple Stock Sales programming challenge.
*/

public class MultipleStockSales
{
   public static void main(String[] args)
   {
      String input;              // To hold keyboard input
      int numSales;              // Number of stock sales
      double ns;                 // Number of shares
      double pp;                 // Purchase price per share
      double pc;                 // Purchase commission
      double sp;                 // Sale price per share
      double sc;                 // Sale commission
      double totalProfit = 0.0;  // Total profit accumulator

      // Get the number of stock sales.
      input = JOptionPane.showInputDialog(
                 "Enter the number of stock sales.");
      numSales = Integer.parseInt(input);

      // Process each sale.
      for (int i = 1; i <= numSales; i++)
      {
         // Get the number of shares.
         input = JOptionPane.showInputDialog(
                         "Enter the number of shares " +
                         "for sale #" + i + ".");
         ns = Double.parseDouble(input);

         // Get the purchase price per share.
         input = JOptionPane.showInputDialog(
                          "Enter the purchase price " +
                          "per share for sale #" + i + ".");
         pp = Double.parseDouble(input);

         // Get the purchase commission.
         input = JOptionPane.showInputDialog(
                          "Enter the purchase commission " +
                          "paid for sale #" + i + ".");
         pc = Double.parseDouble(input);

         // Get the sale price per share.
         input = JOptionPane.showInputDialog(
                          "Enter the sale price " +
                          "per share for sale #" + i + ".");
         sp = Double.parseDouble(input);

         // Get the sale commission.
         input = JOptionPane.showInputDialog(
                           "Enter the sale commission paid " +
                           "for sale #" + i + ".");
         sc = Double.parseDouble(input);

         // Accumulate the profit.
         totalProfit += profit(ns, pp, pc, sp, sc);
      }

      // Display the retail price.
      JOptionPane.showMessageDialog(null, String.format(
                           "The profit is $%,.2f",totalProfit));

      System.exit(0);
   }

   /**
      The profit method calculates the profit (or loss)
      from a stock sale.
      @param ns The number of shares.
      @param pp The purchase price per share.
      @param pc The purchase commission paid.
      @param sp The sale price per share.
      @param sc The sales commission paid.
      @return The profit/loss from the sale.
   */

   public static double profit(double ns, double pp, double pc,
                               double sp, double sc)
   {
      return ((ns * sp) - sc) - ((ns * pp) + pc);
   }
}