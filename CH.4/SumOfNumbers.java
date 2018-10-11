import java.util.Scanner;

public class SumOfNumbers
{
  public static void main(String[] args)
  {
   int num   = 0,
       total = 0;
   System.out.printf("Enter value: ");
   Scanner keyboard = new Scanner(System.in);
   num = keyboard.nextInt();
   while (num <= 0)
   {
     System.out.printf("Enter value that is greater than 0: ");
     num = keyboard.nextInt();
   } 
   for (int i = 0; i < num; i++)
   {
     total += i;
   } 
   System.out.println(total);
  }
}
