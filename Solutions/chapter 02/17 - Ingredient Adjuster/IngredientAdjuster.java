import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a solution to the 
   Ingredient Adjuster programming challenge.
*/
 
public class IngredientAdjuster
{
   public static void main(String[] args)
   {
      // Named constants for the original recipe.
      final int COOKIES_RECIPE   = 48;   // Number of cookies
      final double SUGAR_RECIPE  = 1.5;  // Cups of sugar
      final double BUTTER_RECIPE = 1.0;  // Cups of butter
      final double FLOUR_RECIPE  = 2.75; // Cups of flour
      
      // Variables for the adjusted recipe.
      int cookies;   // To hold the adjusted number of cookies
      double sugar;  // The adjusted cups of sugar
      double butter; // The adjusted cups of butter
      double flour;  // The adjusted cups of flour

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the adjusted number of cookies.
      System.out.print("Enter the number of cookies: ");
      cookies = keyboard.nextInt();
      
      // Calculate the adjusted cups of sugar.
      sugar = (cookies * SUGAR_RECIPE) / COOKIES_RECIPE;
      
      // Calculate the adjusted cups of butter.
      butter = (cookies * BUTTER_RECIPE) / COOKIES_RECIPE;
      
      // Calculate the adjusted cups of flour.
      flour = (cookies * FLOUR_RECIPE) / COOKIES_RECIPE;
      
      // Display the adjusted amounts.
      System.out.println("To make " + cookies + " cookies, you will need:"); 
      System.out.println(sugar + " cups of sugar");
      System.out.println(butter + " cups of butter");
      System.out.println(flour + " cups of flour");
   }
}