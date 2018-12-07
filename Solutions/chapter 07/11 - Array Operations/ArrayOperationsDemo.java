/**
   This program demonstrates a solution to the
   Array Operations programming challenge.
*/

public class ArrayOperationsDemo
{
   public static void main(String[] args)
   {
      // Some arrays of various types.
      int[] iarray = { 2, 1, 9, 7, 3 };
      float[] farray = { 3.5F, 4.6F, 1.7F, 8.9F, 2.1F };
      double[] darray = { 98.7, 89.2, 55.1, 77.6, 99.9 };
      long[] larray = {100, 500, 200, 300, 400 };
      
      // Process the int array.
      System.out.println("Processing the int array.");
      System.out.printf("Total: %d\n",
                        ArrayOperations.getTotal(iarray));
      System.out.printf("Average: %d\n",
                        ArrayOperations.getAverage(iarray));
      System.out.printf("Highest value: %d\n",
                        ArrayOperations.getHighest(iarray));
      System.out.printf("Lowest value: %d\n",
                         ArrayOperations.getLowest(iarray));

      // Process the float array.
      System.out.println("\nProcessing the float array.");
      System.out.printf("Total: %f\n",
                        ArrayOperations.getTotal(farray));
      System.out.printf("Average: %f\n",
                        ArrayOperations.getAverage(farray));
      System.out.printf("Highest value: %f\n",
                        ArrayOperations.getHighest(farray));
      System.out.printf("Lowest value: %f\n",
                        ArrayOperations.getLowest(farray));

      // Process the double array.
      System.out.println("\nProcessing the double array.");
      System.out.printf("Total: %f\n",
                        ArrayOperations.getTotal(darray));
      System.out.printf("Average: %f\n",
                        ArrayOperations.getAverage(darray));
      System.out.printf("Highest value: %f\n",
                        ArrayOperations.getHighest(darray));
      System.out.printf("Lowest value: %f\n",
                        ArrayOperations.getLowest(darray));

      // Process the long array.
      System.out.println("\nProcessing the long array.");
      System.out.printf("Total: %d\n",
                        ArrayOperations.getTotal(larray));
      System.out.printf("Average: %d\n",
                        ArrayOperations.getAverage(larray));
      System.out.printf("Highest value: %d\n",
                        ArrayOperations.getHighest(larray));
      System.out.printf("Lowest value: %d\n",
                        ArrayOperations.getLowest(larray));
   }
}