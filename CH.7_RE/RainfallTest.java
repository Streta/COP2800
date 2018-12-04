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
    double[] userRain = new double[MONTHS_IN_YEAR];
    Scanner keyboard = new Scanner(System.in);
   
    for (int i = 0; i < userRain.length; i++)
    {
      System.out.println("Enter rainfall figure for month: " + (i + 1));
      userRain[i] = keyboard.nextDouble();
    }
    
    Rainfall r = new Rainfall(userRain);    
  
    System.out.println("The total is: " + r.getTotalRainfall());
    System.out.println("The avg is: "   + r.getAvgRainfall());
    System.out.println("The most is: "  + r.getMostRain());
    System.out.println("The least is: " + r.getLeastRain());
  }
}
