import java.util.Scanner;

public class RainfallTest
{
  public static void userInput(double[] userArray)
  {
   String userInputString;
   double userMonthlyRainfall;
   Scanner keyboard = new Scanner(System.in);

    for(int i = 0; i < userArray.length; i++)
    {
      System.out.print("Enter monthly rainfall figure for month " + (i + 1));
      userInputString = keyboard.nextLine();
      userMonthlyRainfall = Double.parseDouble(userInputString);
      userArray[i] = userMonthlyRainfall;
      
    }
  }

  public static void main(String[] args)
  {
    final int MONTHS_IN_YEAR = 12;
    double[] rainfallStats = new double[MONTHS_IN_YEAR];
    String userOutputString;

    
    userInput(rainfallStats);
    Rainfall rainfallStats = new Rainfall(rainfallStats);
    userOutputString = String.format( "Total rainfall: %f\nAverage rainfall: %f\n" + 
                                      "Most rain: %f\nLeast rain: %f", 
                                       rainfallData.getTotalRainfall(),
                                       rainfallData.getAvgRainfall(),
                                       rainfallData.getMostRain(),
                                       rainfallData.getLeastRain() )
  }
}
