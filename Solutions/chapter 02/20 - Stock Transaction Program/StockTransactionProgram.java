/**
   This program demonstrates a solution to the 
   Stock Transaction Program programming exercise.
*/

public class StockTransactionProgram
{
   public static void main(String[] args)
   {
      // Named constants
      final int NUM_SHARES = 1000;          // Number of shares
      final double PURCHASE_PRICE = 32.87;  // Purchase price per share
      final double SELLING_PRICE = 33.92;   // Selling price per share
      final double BROKER_COMM_RATE = 0.02; // Broker commission rate
      
      // Calculate the cost of the stock (without the
      // broker's commission) and store the result
      // in stockPurchase.
      double stockPurchase = (NUM_SHARES * PURCHASE_PRICE);
      
      // Calculate the broker's commission on the purchase and
      // store the result in purchaseComm.
      double purchaseComm = stockPurchase * BROKER_COMM_RATE;
      
      // Calculate the total amount Joe paid for the stock plus the
      // broker's commission and store the result in amountPaid.
      double amountPaid = stockPurchase + purchaseComm;
      
      // Calculate the amount Joe sold the stock for and store
      // the result in stockSale.
      double stockSale = NUM_SHARES * SELLING_PRICE;
      
      // Calculate the broker's commission on the sale and
      // store the result in sellingComm.
      double sellingComm = (NUM_SHARES * SELLING_PRICE) *
                           BROKER_COMM_RATE;
      
      // Calculate the amount that Joe actually recieved after
      // selling the stock and paying his broker the sales
      // commission, and store the result in amountRecieved.
      double amountRecieved = stockSale - sellingComm;
      
      // Calculate the amount of profit or loss, and store the
      // result in profitOrLoss. If a profit was made, the amount
      // will be positive. If a loss was incurred, the amount
      // will be negative.
      double profitOrLoss = amountRecieved - amountPaid;
      
      // Display the results.
      System.out.println("Joe paid $" + stockPurchase + 
                         " for the stock.");
      System.out.println("Joe paid his broker a commission of $" +
                         purchaseComm + " on the purchase.");
      System.out.println("So, Joe paid a total of $" +
                         amountPaid + "\n");
                         
      System.out.println("Joe sold the stock for $" +
                         stockSale);
      System.out.println("Joe paid his broker a commission of $" +
                         sellingComm + " on the sale.");
      System.out.println("So, Joe recieved a total of $" +
                         amountRecieved + "\n");
      System.out.println("Joe's profit or loss: $" +
                         profitOrLoss);
   }
}