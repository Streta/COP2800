import java.util.Scanner;

class DisplayArray
{
  public static void main(String[] args)
  {
    int numTests;
    int[] tests;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many tests do you have? ");
    numTests = keyboard.nextInt();

    tests = new int[numTests];

    for(int i = 0; i < tests.length; i++)
    {
      System.out.print("Enter test score " + i + " ");
      tests[i] = keyboard.nextInt();
    }

    System.out.println("Here are the scores you entered:");
    for(int i = 0; i < tests.length; i++)
    {
      System.out.print(tests[i] + " ");
    }
  }
}
