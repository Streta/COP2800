import java.util.Scanner;

public class rainfall
{
  public static void main(String[] args)
  {
    int total = 0,
	rain;
    int average = (total / 12.0);

    String[] months = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec" };
    for(int i = 0; i < months.length; i++)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter the amount of rain for month: " + months[i]);
      rain = keyboard.nextInt();
      while(rain < 0)
      {
        System.out.println("Positive numbers please: ");
	rain = keyboard.nextInt();
      }
      total += rain;
    }
    System.out.println("Average Rainfall: " + average);
  }
}
