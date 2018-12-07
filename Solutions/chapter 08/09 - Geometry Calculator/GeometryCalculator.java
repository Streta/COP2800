import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Geometry Calculator programming challenge.
*/
public class GeometryCalculator
{
   public static void main(String[] args)
   {
      char again;       // Indicates whether to run again
      int choice;       // The user's menu choice

      do
      {
         // Get the user's menu choice.
         choice = getMenuChoice();
         
         // Do what the user requested.
         switch(choice)
         {
            case 1 : circle();
                     break;
            case 2 : rectangle();
                     break;
            case 3 : triangle();
                     break;
            case 4 : System.out.println("Goodbye!");
         }
      } while (choice != 4);
   }

   /**
      The getMenuChoice method displays a menu
      of choices for the user.
   */
   
   public static int getMenuChoice()
   {
      int choice;    // The user's choice.

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Display the menu.
      System.out.println("Geometry Calculator\n");
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      System.out.println("4. Quit\n");
      System.out.print("Enter your choice (1-4) : ");
      
      // Get the user's selection.
      choice = keyboard.nextInt();
      
      // Validate the selection.
      while (choice < 1 || choice > 4)
      {
         System.out.print("Error: Enter 1, 2, 3, or 4: ");
         choice = keyboard.nextInt();
      }
      
      return choice;
   }
   
   /**
      The circle method determines the area of a circle.
   */
   
   public static void circle()
   {
      double rad;          // The radius of the circle

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the circle's radius.
      System.out.print("What is the circle's radius? ");
      rad = keyboard.nextDouble();
      
      // Display the circle's area.
      System.out.println("The circle's area is " +
                         Geometry.circleArea(rad));
   }

   /**
      The rectangle method determines the area of a rectangle.
   */
   
   public static void rectangle()
   {
      double len;          // The length of the rectangle
      double width;        // The width of the rectangle

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the rectangle's length.
      System.out.print("What is the rectanlge's length? ");
      len = keyboard.nextDouble();
      
      // Get the rectangle's width.
      System.out.print("What is the rectanlge's width? ");
      width = keyboard.nextDouble();
      
      // Display the rectangle's area.
      System.out.println("The rectangle's area is " +
                         Geometry.rectangleArea(len, width));
   }

   /**
      The triangle method determines the area of a triangle.
   */
   
   public static void triangle()
   {
      double base;         // The triangle's base
      double height;       // The triangle's height

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the base of the trianlge.
      System.out.print("What is the length of the triangle's base? ");
      base = keyboard.nextDouble();
      
      // Get the height of the triangle.
      System.out.print("What is the triangle's height? ");
      height = keyboard.nextDouble();
      
      // Display the triangle's area.
      System.out.println("The triangle's area is " +
                         Geometry.triangleArea(base, height));
   }
}
