import java.util.Scanner;

public class GraderTest
{
  public static void main(String[] args)
  {
    int numScores;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("How many test grades do you have?: ");
    numScores = keyboard.nextInt();
    double[] scores = new double[numScores];
    
    for(int i = 0; i < scores.length; i++)
    {
      System.out.println("Enter score #" + (i + 1) + ": ");
      scores[i] = keyboard.nextDouble();
    }
    
    Grader myGrader = new Grader(scores);

    System.out.println("Average: " + myGrader.getAverage() + "\n" +
		       "Lowest: "  + myGrader.getLowestScore()  + "\n" + 
		       "Highest: " + myGrader.getHighestScore());
  }
}
