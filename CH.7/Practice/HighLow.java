import java.util.Scanner;

public class HighLow
{
  public static void main(String[] args)
  {
    int[] numbers = new int[10];
    int highest, lowest;

    for(int i = 0; i < numbers.length; i++)
    {
      Scanner keyboard = new Scanner(System.in);
      numbers[i] = keyboard.nextInt();
    }
    
    highest = numbers[0];
    lowest  = numbers[0];
    for(int i = 1; i < numbers.length; i++)
    {
      if(numbers[i] > highest)
      {
        highest = numbers[i];
      }
      else if(numbers[i] < lowest)
      {
        lowest = numbers[i];
      }
    }

    System.out.println("Highest: " + highest + "\n" + "Lowest: " + lowest);
  }
}
