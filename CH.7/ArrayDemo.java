import java.util.Scanner;

public class ArrayDemo
{
  public static void main(String[] args)
  {
    final int EMPLOYEES = 3;
    int[] hours = new int[EMPLOYEES];

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter hours worked by Employee 1: ");
    hours[0] = keyboard.nextInt();

    System.out.println("Enter hours worked by Employee 2: ");
    hours[1] = keyboard.nextInt();

    System.out.println("Enter hours worked by Employee 3: ");
    hours[2] = keyboard.nextInt();
    
    System.out.println("The hours you entered are: ");
    System.out.println(hours[0] + "\n" + hours[1] + "\n" + hours[2]);
  }
}
