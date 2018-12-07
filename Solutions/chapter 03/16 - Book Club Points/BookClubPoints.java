import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Book Club Points programming challenge.
*/

public class BookClubPoints
{
   public static void main(String[] args)
   {
      // Variables
      int books;     // Number of books purchased
      int points;    // Points awarded
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the number of books purchased this month.
      System.out.print("How many books have you purchased " +
                       "this month? ");
      books = keyboard.nextInt();
      
      // Determine the number of points to award.
      if (books < 1)
         points = 0;
      else if (books == 1)
         points = 5;
      else if (books == 2)
         points = 15;
      else if (books == 3)
         points = 30;
      else
         points = 60;
         
      // Display the points earned.
      System.out.println("You've earned " + points +
                         " points.");
   }
}