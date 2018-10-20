public class Grader
{
  private double[] testScores;
  
  public Grader(double[] scoreArray)
  {
    testScores = scoreArray;
  }

  public double getLowestScore()
  {
    double lowest;
    lowest = testScores[0];
    for(int i = 0; i < testScores.length; i++)
    {
      if(testScores[i] < lowest)
      {
        lowest = testScores[i];
      }
    }
    return lowest;
  }
  
  public double getHighestScore()
  {
    double highest;
    highest = testScores[0];
    for(int i = 0; i < testScores.length; i++)
    {
      if(testScores[i] > highest)
      {
        highest = testScores[i];
      }
    }
    return highest;
  }
  
  public double getAverage()
  {
    double total   = 0,
    	   average = 0;
    
    for(int i = 0; i < testScores.length; i++)
    {
      total += testScores[i];
      average = (total/testScores.length);
    }
    return average;
  }
}
