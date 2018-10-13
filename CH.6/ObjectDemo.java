import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ObjectDemo
{
  public static void main(String[] args) throws IOException
  {
    int maxNumbers,number;
    
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    
    PrintWriter outputFile = new PrintWriter("numbers.txt","UTF-8");
    System.out.print("How many random numbers should I write? ");
    maxNumbers = keyboard.nextInt();

    for(int count = 0; count < maxNumbers; count++)
    {
      number = rand.nextInt();
      outputFile.println(number);
    }

    outputFile.close();
    System.out.println("Done");
  }
}
