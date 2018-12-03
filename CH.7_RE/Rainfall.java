public class Rainfall
{
  double [] rainfallStats;
  
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
  
  public int getMostRain()
  {
    double mostRain = rainfallStats[0];
    int mostRainMonth = 1;
    
    for(int i = 0; i < rainfallStats.length; i++)
    {
      if (rainfallStats[i] > mostRain)
      {
        mostRain = rainfallStats[i];
        mostRainMonth = i + 1;
      }
    }
    return mostRainMonth;
  }

  public int getLeastRain()
  {
    double leastRain = rainfallStats[0];
    int leastRainMonth = 1;
    
    for(int i = 0; i < rainfallStats.length; i++)
    {
      if (rainfallStats[i] < leastRain)
      {
        leastRain = rainfallStats[i];
        leastRainMonth = i + 1;
      }
    }
    return leastRainMonth;
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
