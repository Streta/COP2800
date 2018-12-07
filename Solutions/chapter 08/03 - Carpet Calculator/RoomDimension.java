/**
   The RoomDimension class stores data about a room
   for the Carpet Calculator programming challenge.
*/

public class RoomDimension
{
   private double length;     // Room length
   private double width;      // Room width

   /**
      Constructor
      @param len The room's length.
      @param w The room's width.
   */
   
   public RoomDimension(double len, double w)
   {
      length = len;
      width = w;
   }
   
   /**
      getLength method
      @return The room's length.
   */

   public double getLength()
   {
      return length;
   }

   /**
      getWidth method
      @return The room's width.
   */

   public double getWidth()
   {
      return width;
   }

   /**
      getArea method
      @return The room's area.
   */

   public double getArea()
   {
      return length * width;
   }

   /**
      toString method
      @return A string reporting the room's length,
              width, and area.
   */

   public String toString()
   {
      String str = String.format("Length: %,.2f\n" +
                                 "Width: %,.2f\n" +
                                 "Area: %,.2f\n",
                                 length, width, getArea());
      return str;
   }
}