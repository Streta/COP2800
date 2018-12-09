import java.util.Scanner;

public class AccountValidTest
{
  public static void main(String[] args)
  {
    int num = 0;

    AccountValid accountNum = new AccountValid();
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a num: ");
    num = keyboard.nextInt();
    System.out.println("In array validation: " + accountNum.searchArray(num));
  }
}
