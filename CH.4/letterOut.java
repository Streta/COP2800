import java.util.Scanner;
import java.io.*;

public class letterOut
{
 public static void main(String[] args) throws IOException
 {
   Scanner keyboard = new Scanner(System.in);
   PrintWriter outputFile = new PrintWriter("outputletter.txt");

   String file;
   char letter;
   int count = 0;

   System.out.printf("Enter string: ");
   file = keyboard.nextLine();
   outputFile.println(file);
   outputFile.close();

   System.out.printf("Enter letter: ");
   letter = keyboard.nextLine().charAt(0);
   
   for (int i = 0; i < file.length(); i++)
   {
     if(file.charAt(i) == letter)
     {
       count += 1;
     }
   }
   System.out.println("The char appears " + count + " times in file");
 }
}
