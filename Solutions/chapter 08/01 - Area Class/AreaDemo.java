/**
   This program demonstrates a solution to the
   Area Class programming challenge.
*/

public class AreaDemo
{
   public static void main(String[] args)
   {
      // Get the area of a circle with a radius of 20.0.
      System.out.printf("The area of a circle with a " +
                         "radius of 20.0 is %6.2f\n", 
                         Area.getArea(20.0));

      // Get the area of a rectangle with a length of 10
      // and a width of 20.
      System.out.printf("The area of a rectangle with a " +
                         "length of 10 and a width of 20 is %6.2f\n",
                         Area.getArea(10, 20));

      // Get the area of a cylinder with a radius of 10.0
      // and a height of 15.0.
      System.out.printf("The area of a cylinder with a " +
                         "radius of 10.0 and a height " +
                         "of 15.0 is %6.2f\n", 
                         Area.getArea(10.0, 15.0));
   }
}