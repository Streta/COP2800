import java.util.Scanner;
import java.io.*;

public class MonthDaysTest
{
  public static void main(String[] args)
  {
    int monthUser,yearUser;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a month: ");
    monthUser = keyboard.nextInt();
    
    System.out.print("Enter a year: ");
    yearUser = keyboard.nextInt();
    MonthDays date   = new MonthDays(monthUser,yearUser);
    System.out.println(date.getNumberOfDays() + " days");
    date.determineLeapYear();
  }
}
