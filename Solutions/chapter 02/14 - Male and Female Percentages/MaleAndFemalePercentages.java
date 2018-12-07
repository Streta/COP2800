import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a solution to the 
   Male and Female Percentages programming challenge.
*/

public class MaleAndFemalePercentages
{
   public static void main(String[] args)
   {
      int male;               // To hold the number of male students
      int female;             // To hold the number of female students
      
      double total;           // Total number of students
      double percentMale;     // Percentage of male students
      double percentFemale;   // Percentage of female students

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of male students.
      System.out.print("Enter the number of male students: ");
      male = keyboard.nextInt();
      
      // Get the number of female students.
      System.out.print("Enter the number of female students: ");
      female = keyboard.nextInt();
      
      // Calculate the total number of students.
      total = male + female;
      
      // Calculate the percentage of male students.
      percentMale = male / total * 100;
      
      // Calculate the percentage of female students.
      percentFemale = female / total * 100;
      
      // Display the percentage of male students.
      System.out.println("Male: " + percentMale + "%");
      
      // Display the percentage of female students.
      System.out.println("Female: " + percentFemale + "%");      
   }
}
