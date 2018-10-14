public class TestScores
{
  private double one,
	         two,
		 three,
		 average;


  public TestScores(double scoreOne, double scoreTwo,double scoreThree)
  {
    double avg = ((scoreOne + scoreTwo + scoreThree)/3.0);
    average    = avg;
  }

  public double getAverage()
  {
    return average;
  }  
}
