import java.util.Scanner;

public class RainfallTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    final int MONTHS = 12;
    double[] rainfallStats = new double[MONTHS];

    for(int i = 0; i < rainfallStats.length; i++)
    {
      System.out.println("Enter rainfall figure for month: " + (i + 1) + ": ");
      rainfallStats[i] = keyboard.nextDouble();
    }
    Rainfall rainfall = new Rainfall(rainfallStats);
    System.out.println("Total rainfall: " + rainfall.getTotalRain());
    System.out.println("Average rainfall: " + rainfall.getAverageRain());
    System.out.println("Lowest rain month: " + rainfall.getLeastRain());
    System.out.println("Highest rain month: " + rainfall.getMostRain());
  }
}
