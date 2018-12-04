public class Rainfall
{
  private double [] rainfallStats;
  
  public double getTotalRainfall()
  {
    double totalRainfall = 0;
    for(int i = 0; i < rainfallStats.length; i++)
    {
      totalRainfall += rainfallStats[i];
    }
    return totalRainfall;
  }

  public double getAvgRainfall()
  {
    return getTotalRainfall() / 12.0;
  }
  
  public double getMostRain()
  {
    double mostRain = rainfallStats[0];
    for (int i = 1; i < rainfallStats.length; i++)
    {
      if (rainfallStats[i] > mostRain)
      {
        mostRain = rainfallStats[i];
      }
    }
    return mostRain;
  }

  public double getLeastRain()
  {
    double leastRain = rainfallStats[0];
    for (int i = 1; i < rainfallStats.length; i++)
    {
      if (rainfallStats[i] < leastRain)
      {
        leastRain = rainfallStats[i];
      }
    }
    return leastRain;
  }
  
  public Rainfall(double[] arrayGiven)
  {
    rainfallStats = new double[arrayGiven.length];
    for(int i = 0; i < arrayGiven.length; i++)
    {
      arrayGiven[i] = rainfallStats[i];
    }
  }
}
