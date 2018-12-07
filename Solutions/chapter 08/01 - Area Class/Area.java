/**
   The Area class provides methods for calcuating 
   the areas of circles, triangles, and cylinders 
   for the Area Class programming challenge.
*/

public class Area
{
   /**
      This getArea method returns the area of a
      circle.
      @param radius The circle's radius.
      @return The area of the circle.
   */
   
   public static double getArea(double radius)
   {
      return Math.PI * radius * radius;
   }
   
   /**
      This getArea method returns the area of a
      rectangle.
      @param length The rectangle's length.
      @param width The rectangle's width.
      @return The area of the rectangle.
   */
   
   public static double getArea(int length, int width)
   {
      return length * width;
   }
   
   /**
      This getArea method returns the area of a
      cylinder.
      @param radius The cylinder's radius.
      @param height The cylinder's height.
      @return The area of the cylinder.
   */

   public static double getArea(double radius, double height)
   {
      return Math.PI * radius * radius * height;
   }
}
