import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args)
  {
    double one,two,three;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter three test scores: ");
    
    one   = keyboard.nextDouble();
    two   = keyboard.nextDouble();
    three = keyboard.nextDouble();
    
    TestScores examOne = new TestScores(one,two,three);
    System.out.println("The average is: " + examOne.getAverage());
  }
}
