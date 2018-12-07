import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Carpet Calculator programming challenge.
*/

public class CarpetCalculator
{
   public static void main(String[] args)
   {
      final double CARPET_PRICE = 8.0; // Price per square foot
      double length;                   // To input room length
      double width;                    // To input room width
      RoomDimension dimensions;        // To hold room dimensions
      RoomCarpet room;                 // To determine cost

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Display intro.
      System.out.println("This program will display price to " +
                         "carpet a room. \nYou must input the " +
                         "room's dimensions in feet.");
      
      // Get the length of the room.
      System.out.print("Enter the length first: ");
      length = keyboard.nextDouble();
      
      // Get the width of the room.
      System.out.print("Now enter the width: ");
      width = keyboard.nextDouble();
      
      // Create RoomDimension and RoomCarpet objects.
      dimensions = new RoomDimension(length, width);
      room = new RoomCarpet(dimensions, CARPET_PRICE);
      
      // Display the dimensions and cost.
      System.out.println(room);
   }
}