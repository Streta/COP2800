import java.util.Scanner;
import java.io.*;

/**
   This program demonstrates a solution to the
   Prime Number List programming challenge.
*/

public class PrimeNumberList
{
   public static void main(String[] args) throws IOException
   {
      int number;          // Number to check for prime
      
      // Open a file.
      PrintWriter outFile = new PrintWriter("PrimeList.txt");
      
      // Write the prime number list.
      for (int i = 1; i <= 100; i++)
      {
         if (isPrime(i))
            outFile.println(i);
      }
      
      // Close the file.
      outFile.close();
   }
   
   /**
      The isPrime method determines whether a number is prime.
      @param num The number to check.
      @return true if the number is prime, false otherwise.
   */
   public static boolean isPrime(int num)
   {
      boolean divisorFound = false;
      int div = 2;
      
      while(div < num && !divisorFound)
      {
         if ((num % div) == 0)
            divisorFound = true;
         div++;
      }
      
      return !divisorFound;
   }
}