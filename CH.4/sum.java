import java.util.Scanner;

/*
 * This program is working correctly
 * */

public class sum
{
 public static void main(String[] args)
 {
   int num   = 0,
       total = 0;

   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter positive value: ");
   num = keyboard.nextInt();
   
   while (num < 1)
   {
     System.out.println("Positive numbers only: ");
     num = keyboard.nextInt();
   }

   for(int i = 1; i < num; i++)
   {
     total += i;
   }
   System.out.println(total);
 }
}
