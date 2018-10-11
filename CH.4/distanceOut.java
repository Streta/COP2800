import java.util.Scanner;
import java.io.*;

public class distanceOut
{
 public static void main(String[] args) throws IOException
 {
   int hour      = 0,
       mph      = 0,
       distance = 0,
       loop     = 0;

   Scanner keyboard = new Scanner(System.in);
   PrintWriter outputFile = new PrintWriter("output.txt"); 
   System.out.printf("Enter hours: ");
   hour = keyboard.nextInt();
   
   System.out.printf("Enter MPH: ");
   mph = keyboard.nextInt();
   
   if (hour < 1)
   {
     System.out.printf("Hours entered must be positive: ");
     hour = keyboard.nextInt();
   } 
   else if (mph < 1)
   {
     System.out.printf("MPH entered must be positive: ");
     mph = keyboard.nextInt();
   }
   else 
   {
    outputFile.println("Hour" + "\t"  + "Distance Traveled");
    outputFile.println("-------------------------");    
    for(int i = 1; i <= hour; i++)
    {
      outputFile.println(i + "\t" + (i * mph));
    }
    outputFile.close();
    System.out.println("Data written to output.txt");
   }
 }
}

