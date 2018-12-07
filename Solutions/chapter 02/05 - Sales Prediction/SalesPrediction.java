/**
   This program demonstrates a solution to the
   Sales Prediction programming challenge.
*/

public class SalesPrediction
{
   public static void main(String[] args)
   {
      double totalSales = 4600000.0;   // Total sales
      double eastCoastSales;           // East coast sales
      
      // Calculate east coast sales.
      eastCoastSales = totalSales * 0.62;
      
      // Display the prediction.
      System.out.println("East coast sales prediction: $" +
                         eastCoastSales);
   }
}
