/**
   The Circle class stores data about a circle
   for the Circle Class programming challenge.
*/

public class Circle
{
   private final double PI = 3.14159;  // Constant for pi
   private double radius;              // The circle's radius

   /**
      This constructor initializes the object with
      a radius of 0.0.
   */

   public Circle()
   {
      radius = 0.0;
   }


   /**
      The constructor initializes the object with
      a specified radius.
      @param r The circle's radius.
   */

   public Circle(double r)
   {
      radius = r;
   }

   /**
      The setRadius method sets the circle's radius.
      @param r The radius.
   */

   public void setRadius(double r)
   {
      radius = r;
   }

   /**
      The getRadius method returns the circle's radius.
      @return The radius.
   */

   public double getRadius()
   {
      return radius;
   }

   /**
      The getArea method returns the circle's area.
      @return The area of the circle.
   */

   public double getArea()
   {
      return PI * radius * radius;
   }

   /**
      The getDiameter method returns the circle's diameter.
      @return The diamter of the circle.
   */

   public double getDiameter()
   {
      return radius * 2;
   }

   /**
      The getCircumference method returns the 
      circle's circumference.
      @return The circumference of the circle.
   */

   public double getCircumference()
   {
      return 2 * PI * radius;
   }
}
