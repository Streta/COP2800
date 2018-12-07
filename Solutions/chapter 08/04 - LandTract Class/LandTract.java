/**
   The LandTract class stores data about a tract of land
   for the LandTract Class programming challenge.
*/

public class LandTract
{
   private double length;     // Length of the tract
   private double width;      // Width of the tract
   
   /**
      Constructor
      @param len The length of the land tract.
      @param w The width of the land tract.
   */

   public LandTract(double len, double w)
   {
      length = len;
      width = w;
   }

   /**
      getArea method
      @return The area of the land tract in square feet.
   */
   
   public double getArea()
   {
      return length * width;
   }
   
   /**
      The equals method compares two LandTract objects.
      @param tract2 A reference to a LandTract object.
      @return true if the two tracts are the same size,
              false otherwise.
   */
      
   public boolean equals(LandTract tract2)
   {
      boolean status;   // Comparison status
      
      // If the 2nd tract's length and width are the
      // same as this tract's length and width, then
      // the two objects are equal.
      if (tract2.length == this.length &&
          tract2.width == this.width)
            status = true;
      else  // Otherwise, not equal
            status = false;
      
      // Return the comparison status
      return status;
   }
   
   /**
      toString method
      @return A string indicating the land tract's length,
              width, and area.
   */
   
   public String toString()
   {
      String str = String.format("Length = %,.2f\n" + 
                                 "Width = %,.2f\n" +
                                 "Area = %,.2f\n",
                                 length, width, getArea());
      return str;
   }
}