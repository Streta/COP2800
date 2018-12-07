/**
   The Geometry class provides methods for calculating
   the areas of a circle, rectangle, and triangle
   for the Geometry Calculator programming challenge.
*/

public class Geometry
{
   /**
      The circleArea method calculates the area
      of a circle.
      @param r The radius of the circle.
      @return The area of the circle.
   */
   
   public static double circleArea(double r)
   {
      return Math.PI * r * r;
   }

   /**
      The rectangleArea method calculates the area
      of a rectangle.
      @param len The length of the rectangle.
      @param w The width of the rectangle.
      @return The area of the rectangle.
   */
   
   public static double rectangleArea(double len, double w)
   {
      return len * w;
   }
   
   /**
      The triangleArea method calculates the area
      of a triangle.
      @param base The base of the triangle.
      @param h The height of the triangle.
      @return The area of the triangle.
   */
      
   public static double triangleArea(double base, double h)
   {
      return base * h * 0.5;
   }
}
