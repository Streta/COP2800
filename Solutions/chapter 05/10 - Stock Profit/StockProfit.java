import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Stock Profit programming challenge.
*/

public class StockProfit
{
   public static void main(String[] args)
   {
      String input;  // To hold keyboard input
      double ns;     // Number of shares
      double pp;     // Purchase price per share
      double pc;     // Purchase commission
      double sp;     // Sale price per share
      double sc;     // Sale commission

      // Get the number of shares.
      input = JOptionPane.showInputDialog(
                        "Enter the number of shares.");
      ns = Double.parseDouble(input);

      // Get the purchase price per share.
      input = JOptionPane.showInputDialog(
                  "Enter the purchase price per share.");
      pp = Double.parseDouble(input);

      // Get the purchase commission.
      input = JOptionPane.showInputDialog(
                     "Enter the purchase commission paid.");
      pc = Double.parseDouble(input);

      // Get the sale price per share.
      input = JOptionPane.showInputDialog(
                      "Enter the sale price per share.");
      sp = Double.parseDouble(input);

      // Get the sale commission.
      input = JOptionPane.showInputDialog(
                      "Enter the sale commission paid.");
      sc = Double.parseDouble(input);

      // Display the retail price.
      JOptionPane.showMessageDialog(null, String.format(
                       "The profit is $%,.2f",
                       profit(ns, pp, pc, sp, sc)));

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