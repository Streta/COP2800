import java.util.Scanner;

public class ArrayLoop 
{
  public static void main(String[] args)
  {
    final int EMPLOYEES = 3;
    int[] hours = new int[EMPLOYEES];
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the hours worked by  employees.");

    for (int foo = 0; foo < EMPLOYEES; foo++)
    {
       System.out.println("Employee " + foo + ": ");
       hours[foo] = keyboard.nextInt();
    }
    System.out.println("The hours you entered are: ");
    for (int foo = 0; foo < EMPLOYEES; foo++)
    {
      System.out.println(hours[foo]);
    }
  }
}
