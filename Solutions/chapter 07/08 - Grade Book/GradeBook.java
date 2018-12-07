/**
   The GradeBook class stores data about student grades
   for the Grade Book programming challenge.
*/

public class GradeBook
{
   // Constant for the number of students
   private final int NUM_STUDENTS = 5;
   
   // Constant for the number of tests
   private final int NUM_TESTS = 4;
   
   // Array to hold student names
   private String[] names = new String[NUM_STUDENTS];
   
   // Array to hold student grades
   private char[] grades = new char[NUM_STUDENTS];
   
   // Create arrays of scores, one for each student.
   private double[] scores1 = new double[NUM_TESTS];
   private double[] scores2 = new double[NUM_TESTS];
   private double[] scores3 = new double[NUM_TESTS];
   private double[] scores4 = new double[NUM_TESTS];
   private double[] scores5 = new double[NUM_TESTS];

   /**
      The setName method assigns a student's name.
      @param studentNumber The student's number.
      @param name The student's name.
   */
   
   public void setName(int studentNumber, String name)
   {
      names[studentNumber - 1] = name;
   }
   
   /**
      The setScores method copies an array of test scores
      to a student's array of scores.
      @param studentNumber The student's number.
      @param scores An array of test scores.
   */
   
   public void setScores(int studentNumber, double[] scores)
   {
      if (studentNumber == 1)
         copyArray(scores1, scores);
      else if (studentNumber == 2)
         copyArray(scores2, scores);
      else if (studentNumber == 3)
         copyArray(scores3, scores);
      else if (studentNumber == 4)
         copyArray(scores4, scores);
      else if (studentNumber == 5)
         copyArray(scores5, scores);
      assignGrade(studentNumber);
   }
   
   /**
      The getName method returns a student's name.
      @param studentNumber The specified student's number.
      @return The student's name.
   */
   
   public String getName(int studentNumber)
   {
      return names[studentNumber - 1];
   }
   
   /**
      The getAverage method returns a student's average
      test score.
      @param studentNumber The specified student's number.
      @return The student's average test score.
   */
   
   public double getAverage(int studentNumber)
   {
      double average;
      
      if (studentNumber == 1)
         average = calcAverage(scores1);
      else if (studentNumber == 2)
         average = calcAverage(scores2);
      else if (studentNumber == 3)
         average = calcAverage(scores3);
      else if (studentNumber == 4)
         average = calcAverage(scores4);
      else if (studentNumber == 5)
         average = calcAverage(scores5);
      else
         average = 0.0;
      
      return average;
   }
   
   /**
      The getLetterGrade method returns a student's
      letter grade.
      @param studentNumber The specified student's number.
      @return The student's letter grade.
   */
   
   public char getLetterGrade(int studentNumber)
   {
      return grades[studentNumber - 1];
   }

   /**
      copyArray is a private method that copies the contents
      of one array to another.
      @param to The array to copy to.
      @param from The array to copy from.
   */
   
   private void copyArray(double[] to, double[] from)
   {
      for (int i = 0; i < to.length; i++)
         to[i] = from[i];
   }
   
   /**
      calcAverage is a private method that calculates
      the average of the values in an array of test scores.
      @param scores The array with the test scores.
   */
   
   private double calcAverage(double[] scores)
   {
      double total = 0.0, average, lowest;
      
      // Find the lowest score.
      lowest = scores[0];
      for (int i = 1; i < scores.length; i++)
      {
         if (scores[i] < lowest)
            lowest = scores[i];
      }
      
      // Calculate the total of the scores.
      for (int i = 0; i < scores.length; i++)
         total += scores[i];
      
      // Drop the lowest score.
      total -= lowest;
      
      // Calculate the average.
      average = total / (scores.length - 1);
      
      return average;
   }
   
   /**
      assignGrade is a private method that determines and
      assigns a letter grade to a specific student.
      @param studentNumber The specified student's number.
   */
   
   private void assignGrade(int studentNumber)
   {
      double average = getAverage(studentNumber);
      grades[studentNumber-1] = determineGrade(average);
   }

   /**
      determineGrade is a private method that determines
      a letter grade for a test average.
      @param average The test average.
      @return The letter grade.
   */
   
   private char determineGrade(double average)
   {
      char grade;
      
      if (average >= 90 && average <= 100)
         grade = 'A';
      else if (average >= 80 && average < 90)
         grade = 'B';
      else if (average >= 70 && average < 80)
         grade = 'C';
      else if (average >= 60 && average < 70)
         grade = 'D';
      else if (average >= 0 && average < 60)
         grade = 'F';
      else
         grade = '?';
      
      return grade;
   }
}
