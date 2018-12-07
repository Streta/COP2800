import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Grade Book programming challenge.
*/

public class GradeBookDemo2
{
   public static void main(String[] args) 
   {
      // Create a GradeBook object.
      GradeBook gb = new GradeBook();

      // Get the data from the user.
      getData(gb);
      
      // Display the student data.
      System.out.println("STUDENT DATA");
      for (int i = 1; i <= 5; i++)
      {
         System.out.printf("Name: %s \t" +
                           "Average score: %.2f \t" +
                           "Grade: %s \n", gb.getName(i), 
                           gb.getAverage(i), gb.getLetterGrade(i));
      }
   }

   /**
      The getData method gets student data from the user
      and populates a GradeBook object.
      @param gb The GradeBook object.
   */
   
   public static void getData(GradeBook gb) 
   {
      String name;                        // To hold a name
      double[] scores = new double[4];    // An array of scores

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get info for each student.
      for (int student = 1; student <= 5; student++)
      {
         // Get the name.
         System.out.print("Enter student " + student +
                            "'s name: ");
         name = keyboard.nextLine();
         gb.setName(student, name);
         
         // Read the 4 test scores.
         System.out.println("Now enter student " + student +
                            "'s four test scores.");
         for (int i = 0; i < 4; i++)
         {
            System.out.print("Test score #" + (i + 1) + ": ");
            scores[i] = keyboard.nextDouble();
            gb.setScores(student, scores);
         }
         
         // Consume the remaining newline.
         keyboard.nextLine();
      }
      
      System.out.println();
   }
}
