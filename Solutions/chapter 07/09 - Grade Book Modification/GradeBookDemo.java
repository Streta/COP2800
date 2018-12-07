import java.io.*;

/**
   This program demonstrates a solution to the
   Grade Book Modification programming challenge.
   This program uses the data stored in the
   StudentInfo.txt file.
*/


public class GradeBookDemo
{
   public static void main(String[] args) throws IOException
   {
      // Create a GradeBook object.
      GradeBook gb = new GradeBook();

      // Read the data from the file.
      readFromFile(gb);

      // Display the student data.
      for (int i = 1; i <= 5; i++)
      {
         System.out.printf("Name: %s \t" +
                           "Average score: %.2f \t" +
                           "Grade: %s \n", gb.getName(i),
                           gb.getAverage(i), gb.getLetterGrade(i));
      }
   }

   /**
      The readFromFile method reads test scores from a
      file into a GradeBook object.
      @param gb The GradeBook object.
   */

   public static void readFromFile(GradeBook gb)
                       throws IOException
   {
      String input;
      double[] scores = new double[4];

      // Create the necessary objects for file input.
      FileReader freader = new FileReader("StudentInfo.txt");
      BufferedReader inFile = new BufferedReader(freader);

      // Read the contents of the file.
      for (int student = 1; student <= 5; student++)
      {
         // Read the name.
         input = inFile.readLine();
         gb.setName(student, input);

         // Read the 4 test scores.
         for (int i = 0; i < 4; i++)
         {
            input = inFile.readLine();
            scores[i] = Double.parseDouble(input);
            gb.setScores(student, scores);
         }
      }

      // Close the file.
      inFile.close();
   }
}
