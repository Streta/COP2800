import java.util.Scanner;

public class fallingDistance
{
  public static void main(String[] args)
  {
    for (int i = 0; i <= 10; i++)
    {
      System.out.println("Meter # " + i + ": " + fallingDistance(i));
    }
  }
  public static double fallingDistance(int seconds)
  {
    double distance = ((0.5 * 9.8) * Math.pow(seconds, 2));
    return distance;
  }
}
