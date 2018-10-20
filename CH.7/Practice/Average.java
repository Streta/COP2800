import java.util.Scanner;

public class Average
{
  public static void main(String[] args)
  {
    int[] numbers = new int[5];
    double total = 0, average = 0;
    for(int i = 0; i < numbers.length; i++)
    {
      Scanner keyboard = new Scanner(System.in);
      numbers[i] = keyboard.nextInt();
      total += numbers[i];
      average = (total/numbers.length);
    }
    System.out.println("Average: " + average);
  }
}
