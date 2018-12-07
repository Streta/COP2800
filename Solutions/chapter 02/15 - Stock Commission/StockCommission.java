/**
   This program demonstrates a solution to the
   Stock Commission programming challenge.
*/

public class StockCommission
{
   public static void main(String[] args)
   {
      // Constants
      final int NUM_SHARES = 600;        // Number of shares
      final double STOCK_PRICE = 21.77;  // Price per share
      final double COMM_PERCENT = 0.02;  // Commission percentage
      
      // Variables
      double stockCost;  // Cost of stock
      double commission; // Commission
      double total;      // Total of the transaction
            
      // Calculate the stock cost.
      stockCost = STOCK_PRICE * NUM_SHARES;
      
      // Calculate the commission.
      commission = stockCost * COMM_PERCENT;
      
      // Calculate the total.
      total = stockCost + commission;
      
      // Display the results.
      System.out.println("Stock cost: $" + stockCost);
      System.out.println("Commission: $" + commission);
      System.out.println("Total:      $" + total);
   }
}
