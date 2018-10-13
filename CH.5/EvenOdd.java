import java.util.Scanner;
import java.util.*;
import java.io.*;

public class EvenOdd
{
  public static void main(String[] args) throws IOException
  {
    int totalOdd  = 0, 
	totalEven = 0;
    
    PrintWriter outEven = new PrintWriter("even.txt", "UTF-8");
    PrintWriter outOdd  = new PrintWriter("odd.txt", "UTF-8");
    
    for(int i = 1; i <= 100; i++)
    {
      isEven(i);
      if ((isEven(i) == true))
      {
	totalEven++;
        outEven.println("Even Numbers: " + i);
      }
      else 
      {
	totalOdd++;
        outOdd.println("Odd Numbers: " + i);
      }
    }
    outEven.close();
    outOdd.close();

    System.out.println("Total Even: " + totalEven);
    System.out.println("Total Odd: "  + totalOdd);
  }

  public static boolean isEven(int num)
  {
    if (num % 2 == 0)
    {
      return true;
    }
    else 
    {
      return false;
    }
  }
}
