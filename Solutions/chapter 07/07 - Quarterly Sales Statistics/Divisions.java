/**
   The Divisions class stores data about a company's sales
   for the Quarterly Sales Statistics programming challenge.
*/

public class Divisions
{
   // Constants
   private final int DIVISIONS = 6;    // Number of divisions
   private final int QUARTERS = 4;     // Number of quarters
   
   // Array to hold division sales by quarter
   private double[][] sales = new double[DIVISIONS][QUARTERS];
   
   /**
      The setSales method sets a division's amount of sales
      for a specified quarter.
      @param div The division.
      @param quarter The quarter.
      @param amount The amount of sales.
   */
   
   public void setSales(int div, int quarter, double amount)
   {
      // Convert negative values to 0.
      if (amount < 0)
         amount = 0;
      // The array subscripts are zero-based, so subtract 1
      // from div and quarter to get the correct subscript.
      sales[div - 1][quarter - 1] = amount;
   }
   
   /**
      The getSales method returns a division's sales for a
      specified quarter.
      @param div The division.
      @param quarter The quarter.
   */
   
   public double getSales(int div, int quarter)
   {
      // The array subscripts are zero-based, so subtract 1
      // from div and quarter to get the correct subscript.
      return sales[div - 1][quarter - 1];
   }
   
   //********************************************************
   // totalQuarterSales method                              *
   // Returns the total sales for the specified quarter.    *
   //********************************************************

   public double totalQuarterSales(int quarter)
   {
      double total = 0.0;  // Accumulator
      
      for (int row = 0; row < DIVISIONS; row++)
         total += sales[row][quarter-1];
      return total;
   }
   
   /**
      The getQuarterlyIncrease method determines the quarterly 
      increase for a specified quarter, for a specified
      division.
      @param div The specified division.
      @param atr The specified quarter.
      @return The division's increase for the quarter. If the
              quarter is 1, or if an invalid value is passed 
              for the quarter or the division, the method
              returns 0.0.
   */
   
   public double getQuarterlyIncrease(int div, int qtr)
   {
      double increase;
      
      if (qtr < 2 || qtr > 4 || div < 1 || div > 6)
         increase = 0.0;
      else
         increase = sales[div-1][qtr-1] - sales[div-1][qtr-2];
      
      return increase;
   }
}
