import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Test Average and Grade programming challenge.
*/

public class TestAverageAndGrade
{
   public static void main(String[] args)
   {
      double score1;       // The 1st test score
      double score2;       // The 2nd test score
      double score3;       // The 3rd test score
      double score4;       // The 4th test score
      double score5;       // The 5th test score
      double average;      // The average test score
             
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
                  
      // Get the first test score.
      System.out.print("Enter the first test score: ");
      score1 = keyboard.nextDouble();

      // Get the second test score.
      System.out.print("Enter the second test score: ");
      score2 = keyboard.nextDouble();

      // Get the third test score.
      System.out.print("Enter the third test score: ");
      score3 = keyboard.nextDouble();

      // Get the fourth test score.
      System.out.print("Enter the fourth test score: ");
      score4 = keyboard.nextDouble();

      // Get the fifth test score.
      System.out.print("Enter the fifth test score: ");
      score5 = keyboard.nextDouble();
      
      // Get the average.
      average = calcAverage(score1, score2, score3, score4, score5);
      
      // Display the letter grades.
      System.out.println("Here are the grades and the average:");
      System.out.println("Test 1: " + determineGrade(score1));
      System.out.println("Test 2: " + determineGrade(score2));
      System.out.println("Test 3: " + determineGrade(score3));
      System.out.println("Test 4: " + determineGrade(score4));
      System.out.println("Test 5: " + determineGrade(score5));
      System.out.printf("Average score: %.2f\n", average);
      System.out.printf("Average Letter Grade: %s\n",  
                        determineGrade(average));
   }
   
   /**
      The calcAverage method calculates the average of five
      test scores.
      @param score1 The first test score.
      @param score2 The second test score.
      @param score3 The third test score.
      @param score4 The fourth test score.
      @param score5 The fifth test score.
      @return The average of the five scores.
   */
   
   public static double calcAverage(double score1, double score2,
                                    double score3, double score4,
                                    double score5)
   {
      return (score1 + score2 + score3 + score4 + score5) / 5.0;
   }
   
   /**
      The determineGrade method determines the letter grade
      for a numeric test score.
      @param score The numeric test score.
      @return The letter grade.
   */
   
   public static char determineGrade(double score)
   {
      char grade;    // To hold the letter grade
      
      // Determine the grade.
      if (score >= 90)
         grade = 'A';
      else if (score >= 80)
         grade = 'B';
      else if (score >= 70)
         grade = 'C';
      else if (score >= 60)
         grade = 'D';
      else
         grade = 'F';
         
      return grade;
   }
}