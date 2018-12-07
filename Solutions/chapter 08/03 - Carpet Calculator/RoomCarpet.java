/**
   The RoomCarpet class stores data about a room's carpet
   for the Carpet Calculator programming challenge.
*/

public class RoomCarpet
{
   private RoomDimension size;   // The size of the room
   private double carpetCost;    // Carpet cost per square foot
   
   /**
      Constructor
      @param dim The room's dimensions.
      @param cost The carpet's cost per square foot.
   */

   public RoomCarpet(RoomDimension dim, double cost)
   {
      // Make size reference a copy of the object referenced
      // by the dim argument.
      size = new RoomDimension(dim.getLength(), dim.getWidth());
      
      // Assign the cost.
      carpetCost = cost;
   }
   
   /**
      getTotalCost method
      @return The total cost of the carpet.
   */
   
   public double getTotalCost()
   {
      // Return the total cost.
      return carpetCost * size.getArea();
   }

   /**
      toString method
      @return A string reporting the room's dimensions and
              the total cost of the carpet.
   */
   
   public String toString()
   {  
      // Create a String with the object state.
      String str = String.format("\nRoom dimensions:\n" +
                                 "%s\nCarpet cost: $%,.2f", 
                                 size, getTotalCost());
      
      // Return the String
      return str;
   }
}
