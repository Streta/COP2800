import java.io.*;    // Needed for IOException

/**
   This program demonstrates a solution to the
   Number Analysis Class programming challenge.
*/

public class NumberAnalyzerDemo
{
   public static void main(String[] args) throws IOException
   {
      // Create a NumberAnalyzer object.
      NumberAnalyzer na = new NumberAnalyzer("Numbers.txt");
      
      // Display data about the numbers in the file.
      System.out.println("The lowest number in the file is " +
                         na.getLowest());
      System.out.println("The highest number in the file is " +
                         na.getHighest());
      System.out.println("The total of the numbers in the file is " +
                         na.getTotal());
      System.out.println("The average of the numbers in the file is " +
                         na.getAverage());
   }
}