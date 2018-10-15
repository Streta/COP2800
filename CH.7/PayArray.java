import java.util.Scanner;

public class PayArray
{
  public static void main(String[] args)
  {
    final int EMPLOYEES = 5;
    double payRate, grossPay;
    int[] hours = new int[EMPLOYEES];
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the hours worked by employees");
    
    for(int i = 0; i < EMPLOYEES; i++)
    {
      System.out.println("Employee #" + i + ": ");
      hours[i] = keyboard.nextInt();
    }
    
    System.out.println("Enter hourly for each employee: ");
    payRate = keyboard.nextDouble();

    for(int i = 0; i < EMPLOYEES; i++)
    {
      grossPay = hours[i] * payRate;
      System.out.println("Employee #" + i + ": $" + grossPay);
    }
  }
}
