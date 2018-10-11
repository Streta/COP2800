import java.util.Scanner;

public class DistanceTraveled
{
 public static void main(String[] args)
 {
   int hour      = 0,
       mph      = 0,
       distance = 0,
       loop     = 0;

   Scanner keyboard = new Scanner(System.in);
   
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
    System.out.println("Hour" + "\t"  + "Distance Traveled");
    System.out.println("-------------------------");    
    for(int i = 1; i <= hour; i++)
    {
      System.out.println(i + "\t" + (i * mph));
    }
   }
 }
}
