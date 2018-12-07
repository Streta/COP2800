import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Circle Class programming challenge.
*/

public class CircleDemo
{
   public static void main(String[] args)
   {
      double radius;       // The radius of a circle

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the radius of a circle.
      System.out.print("Enter the radius of a circle: ");
      radius = keyboard.nextDouble();

      // Create a Circle object.
      Circle c = new Circle(radius);

      // Display geometric info about the circle.
      System.out.printf("The circle's area is %,.2f\n",
                        c.getArea());
      System.out.printf("The circle's diameter is %,.2f\n",
                        c.getDiameter());
      System.out.printf("The circle's circumference is %,.2f\n",
                        c.getCircumference());
   }
}
