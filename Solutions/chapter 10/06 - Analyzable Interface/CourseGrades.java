/**
   The CourseGrades class stores data about a course's 
   graded activities while implementing the Analyzable 
   interface for the Analyzable Interface programming 
   challenge.
*/

public class CourseGrades implements Analyzable
{
   // Constant for the number of grades
   public final int NUM_GRADES = 4;
   
   // Variable to reference a GradedActivity
   // array
   private GradedActivity[] grades;
   
   /**
      Constructor
   */
      
   public CourseGrades()
   {
      // Create the grades array.
      grades = new GradedActivity[NUM_GRADES];
   }
   
   /**
      The setLab method stores a GradedActivity object
      for the lab grade.
      @param aLab Represents the lab grade.
   */
   
   public void setLab(GradedActivity aLab)
   {
      grades[0] = aLab;
   }
   
   /**
      The setPassFailExam method stores a PassFailExam object
      for the pass/fail exam grade.
      @param aPassFailExam Represents the pass/fail exam grade.
   */
   
   public void setPassFailExam(PassFailExam aPassFailExam)
   {
      grades[1] = aPassFailExam;
   }

   /**
      The setEssay method stores an Essay object
      for the essay grade.
      @param anEsay Represents the essay grade.
   */
      
   public void setEssay(Essay anEssay)
   {
      grades[2] = anEssay;
   }

   /**
      The setFinalExam method stores a FinalExam object
      for the final exam grade.
      @param aFinalExam Represents the final exam grade.
   */
   
   public void setFinalExam(FinalExam aFinalExam)
   {
      grades[3] = aFinalExam;
   }

   /**
      The getAverage method returns the average of
      the object's numeric scores. This method is
      specified by the Analyzable interface.
      @return The average numeric score for this object.
   */
   
   public double getAverage()
   {
      double total = 0.0,     // Accumulator
             average;         // Average score
      
      // Accumulate the total of the scores.
      for (int i = 0; i < grades.length; i++)
      {
         total += grades[i].getScore();
      }
      
      // Calculate the average score.
      average = total / grades.length;
      
      // Return the average.
      return average;
   }

   /**
      The getHighest method returns the GradedActivity
      object with the highest score. This method is
      specified by the Analyzable interface.
      @return The GradedActivity object with the highest score.
   */
      
   public GradedActivity getHighest()
   {
      double highScore; // To hold the high score
      int index;        // The subscript of the high score item
      
      // Save the score at the first element.
      highScore = grades[0].getScore();
      index = 0;
      
      // Compare to all the other elements.
      for (int i = 1; i < grades.length; i++)
      {
         if (grades[i].getScore() > highScore)
         {
            highScore = grades[i].getScore();
            index = i;
         }
      }
      
      // Return the item with the highest score.
      return grades[index];
   }

   /**
      The getLowest method returns the GradedActivity
      object with the lowest score. This method is
      specified by the Analyzable interface.
      @return The GradedActivity object with the lowest score.
   */
      
   public GradedActivity getLowest()
   {
      double lowScore;  // To hold the low score
      int index;        // The subscript of the low score item
      
      // Save the score at the first element.
      lowScore = grades[0].getScore();
      index = 0;
      
      // Compare to all the other elements.
      for (int i = 1; i < grades.length; i++)
      {
         if (grades[i].getScore() < lowScore)
         {
            lowScore = grades[i].getScore();
            index = i;
         }
      }
      
      // Return the item with the lowest score.
      return grades[index];
   }

   /**
      The toString method returns a string representation
      of the object.
      @return A string representation of the object.
   */
   
   public String toString()
   {
      String str = "Lab Score: " + grades[0].getScore() +
                   "\tGrade: " + grades[0].getGrade() +
                   "\nPass/Fail Exam Score: " + grades[1].getScore() +
                   "\tGrade: " + grades[1].getGrade() +
                   "\nEssay Score: " + grades[2].getScore() +
                   "\tGrade: " + grades[2].getGrade() +
                   "\nFinal Exam Score: " + grades[3].getScore() +
                   "\tGrade: " + grades[3].getGrade();
      
      return str;
   }
}
