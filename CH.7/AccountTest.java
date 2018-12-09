import java.util.Scanner;

public class AccountTest
{
  public static void main(String[] args)
  {
    Account numberSet = new Account();
    int num = 0;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a number for validation: ");
    num = keyboard.nextInt();
     
    System.out.println(numberSet.validation(num));
  }
}
