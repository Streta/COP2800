import java.io.*;

/**
   This program demonstrates a solution to the
   Quarterly Sales Statistics programming challenge.
*/

public class QuarterlySalesStatistics
{
   public static void main(String[] args) throws IOException
   {
      // Create a Divisions object.
      Divisions d = new Divisions();

      // Read values from the file.
      readValues(d);

      // Display the sales figures by division.
      displaySales(d);

      // Display the quarterly increases or decreases
      // for each division.
      displayQtrDifference(d);

      // Display total sales by quarter.
      displaySalesByQtr(d);

      // Display the quarterly increases or decreases
      // for the company.
      displayCompanyQtrDifference(d);

      // Display the average sales for all divisions
      // per quarter.
      displayAverageSalesPerQtr(d);

      // Displays the division with the highest sales
      // per quarter.
      displayHighestDivisionPerQtr(d);
   }

   /**
      The readValues method reads the values from Sales.txt
      into a Division object.
      @param d The Division object to populate with values.
   */

   public static void readValues(Divisions d) throws IOException
   {
      String input;
      FileReader freader = new FileReader("Sales.txt");
      BufferedReader inFile = new BufferedReader(freader);

      for (int div = 1; div <= 6; div++)
      {
         for (int qtr = 1; qtr <= 4; qtr++)
         {
            input = inFile.readLine();
            d.setSales(div, qtr, Double.parseDouble(input));
         }
      }
   }

   /**
      The displayValues method displays a list of
      sales figures by division.
      @param d The Division object to  use.
   */

   public static void displaySales(Divisions d)
   {
      System.out.println("SALES AMOUNTS BY DIVISION");
      System.out.println("=========================");
      for (int div = 1; div <= 6; div++)
      {
         System.out.println("DIVISION " + div);
         for (int qtr = 1; qtr <= 4; qtr++)
         {
            System.out.printf("Quarter %d: $%,.2f\n",
                              qtr, d.getSales(div, qtr));
         }

         System.out.println();
      }

      System.out.println();
   }

   /**
      The displayQtrDifference method displays the quareterly
      increase or decrease for each division, starting at
      quarter 2.
      @param d The Division object to use.
   */

   public static void displayQtrDifference(Divisions d)
   {
      System.out.println("QUARTERLY INCREASE/DECREASE BY DIVISION");
      System.out.println("=======================================");
      for (int div = 1; div <= 6; div++)
      {
         System.out.println("DIVISION " + div);
         for (int qtr = 2; qtr <= 4; qtr++)
         {
            System.out.printf("Quarter %d: $%,.2f\n", qtr,
                              d.getQuarterlyIncrease(div, qtr));
         }

         System.out.println();
      }

      System.out.println();
   }

   /**
      The displaySalesByQtr method displays total sales
      by quarter.
      @param d The Division object to  use.
   */

   public static void displaySalesByQtr(Divisions d)
   {
      System.out.println("SALES AMOUNTS BY QUARTER");
      System.out.println("========================");
      for (int qtr = 1; qtr <= 4; qtr++)
      {
         System.out.printf("Quarter %d: $%,.2f\n", qtr,
                           d.totalQuarterSales(qtr));
      }
      System.out.println();
   }

   /**
      The displayCompanyQtrDifference method displays the
      quareterly increase or decrease for the company,
      starting at quarter 2.
      @param d The Division object to  use.
   */

   public static void displayCompanyQtrDifference(Divisions d)
   {
      double increase;

      System.out.println("QUARTERLY INCREASE/DECREASE FOR THE COMPANY");
      System.out.println("===========================================");
      for (int qtr = 2; qtr <= 4; qtr++)
      {
         increase = 0.0;

         for (int div = 1; div <= 6; div++)
         {
            increase += d.getQuarterlyIncrease(div, qtr);
         }

         System.out.printf("Quarter %d: $%,.2f\n", qtr, increase);
      }
      System.out.println();
   }

   /**
      The displayAverageSalesPerQuarter method displays
      the average sales for all divisions per quarter.
      @param d The Division object to  use.
   */

   public static void displayAverageSalesPerQtr(Divisions d)
   {
      double total, average;

      System.out.println("AVERAGE SALES PER QUARTER");
      System.out.println("=========================");
      for (int qtr = 1; qtr <= 4; qtr++)
      {
         total = 0.0;
         for (int div = 1; div <= 6; div++)
         {
            total += d.getSales(div, qtr);
         }
         average = total / 6.0;
         System.out.printf("Quarter %d: $%,.2f\n", qtr, average);
      }
      System.out.println();
   }

   /**
      The displayHighestDivisionPerQtr method displays the
      division with the highest sales per quarter.
      @param d The Division object to  use.
   */

   public static void displayHighestDivisionPerQtr(Divisions d)
   {
      System.out.println("DIVISION WITH THE HIGHEST SALES PER QUARTER");
      System.out.println("===========================================");

      for (int qtr = 1; qtr <= 4; qtr++)
      {
         int highDiv = 1;
         double highSales = d.getSales(1, qtr); // Get sales for div 1, this qtr
         for (int div = 2; div <= 6; div++)
         {
            double salesQtr = d.getSales(div, qtr);
            if (salesQtr > highSales)
            {
               highSales = salesQtr;
               highDiv = div;
            }
         }
         System.out.println("Highest division for quarter " + qtr +
                            " is division " + highDiv);
      }
      System.out.println();
   }
}