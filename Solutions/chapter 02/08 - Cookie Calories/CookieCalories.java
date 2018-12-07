import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a solution to the
   Cookie Calories programming challenge.
*/

public class CookieCalories
{
   public static void main(String[] args)
   {
      final int COOKIES_PER_BAG = 40;        // The number of cookies per bag
      final int SERVINGS_PER_BAG = 10;       // The number of servings per bag
      final int CALORIES_PER_SERVING = 300;  // The number of calories per serving
      
      // Calculate the number of cookies per serving.
      final int COOKIES_PER_SERVING = COOKIES_PER_BAG / SERVINGS_PER_BAG;
      
      // Calculate the number of calories per cookie.
      final int CALORIES_PER_COOKIE = CALORIES_PER_SERVING / COOKIES_PER_SERVING;

      int cookiesEaten = 0;   // To hold the number of cookies eaten
      int totalCalories = 0;  // To hold the total calories consumed

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
     
      // Get the number of cookies eaten.
      System.out.print("Enter the number of cookies eaten: ");
      cookiesEaten = keyboard.nextInt();
      
      // Calculate the number of total calories consumed.
      totalCalories = cookiesEaten * CALORIES_PER_COOKIE;
      
      // Display the number of total calories consumed.
      System.out.println("Number of total calories consumed: " + totalCalories);
   }
}
