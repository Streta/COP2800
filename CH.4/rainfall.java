import java.util.Scanner;

public class rainfall
{
 public static void main(String[] args)
 {
   int years   = 0,
       count   = 0,
       total   = 0,
       months  = 0,
       inches  = 0;
   Scanner keyboard = new Scanner(System.in);
   System.out.printf("Enter # of years: ");
   years = keyboard.nextInt();
   while (years < 1)
   {
     System.out.printf("must be greater than one: ");
     years = keyboard.nextInt();
   }
   for (int i = 1; i <= years; i++)
   {
     for (int ii = 0; ii <= 12; ii++)
     {
       System.out.printf("Enter rainfall for year " + i + ": ");
       count = keyboard.nextInt();
       inches += count;
       total++;
       months++;
     }
   }
   System.out.println("Average rainfall is: " + (total / years));
   System.out.println("Total months is: " + months);
   System.out.println("Total rainfall is: " + inches);
 }
}
