import java.util.Scanner;

public class DriverExamTest
{
  public static void main(String[] args)
  {
    final int NUM_ANSWERS = 20;
    char[] answers = new char[NUM_ANSWERS];
    String input;
    Scanner keyboard = new Scanner(System.in);
    
    for(int i = 0; i < answers.length; i++)
    {
      System.out.print("Enter int for element " + (i + 1) + ": ");
      input = keyboard.nextLine();
      answers[i] = input.charAt(0);
    }
    
    DriverExam exam = new DriverExam(answers);
    System.out.println("Total Correct: "    + exam.totalCorrect(answers));
    System.out.println("Total incorrect: "  + exam.totalIncorrect(answers));
    System.out.println("Passed exam (T/F) " + exam.passed());
  }
}
