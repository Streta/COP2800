import java.util.Scanner;

public class testAverage
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double S1 = 0, S2 = 0, S3 = 0, S4 = 0, S5 = 0, avg;
    System.out.printf("Enter 5 scores: ");
    S1 = keyboard.nextDouble();
    S2 = keyboard.nextDouble();
    S3 = keyboard.nextDouble();
    S4 = keyboard.nextDouble();
    S5 = keyboard.nextDouble();
    avg = calcAverage(S1,S2,S3,S4,S5);
    System.out.println("Average: " + avg + " Grade: " + determineGrade(avg));
  }

  public static double calcAverage(double testOne,double testTwo,double testThree,double testFour,double testFive)
  {
    double average = ((testOne + testTwo + testThree + testFour + testFive) / 5);
    return average;
  }

  public static String determineGrade(double testGrade)
  {
    String letterGrade = "";
    if (testGrade < 60)
    {
      letterGrade = "F";
    }
    else if (testGrade < 70)
    {
      letterGrade = "D";
    }
    else if (testGrade < 80)
    {
      letterGrade = "C";
    }
    else if (testGrade < 90)
    {
      letterGrade = "B";
    }
    else
    {
      letterGrade = "A";
    }
    return letterGrade;
  }
}
