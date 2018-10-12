import java.util.Scanner;
import java.io.*;
import java.util.*;

public class prime
{
  public static void main(String[] args) throws IOException
  {
    PrintWriter file = new PrintWriter("file.txt", "UTF-8");
    for(int i = 1; i <= 100; i++)
    {
      isPrime(i);
      if (isPrime(i) == true)
      {
        file.println(i);
      }
      else 
      {
        continue;
      }
    }
    file.close();
  }

  public static boolean isPrime(int num)
  {
    if (num < 2) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
    for (int i = 3; i * i <= num; i += 2)
	if (num % i == 0) return false;
    return true;
  }
}
