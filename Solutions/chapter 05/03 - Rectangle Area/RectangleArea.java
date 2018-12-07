import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Rectangle Area programming challenge.
*/

public class RectangleArea
{
   public static void main(String[] args)
   {
      double length;    // The rectangle's length
      double width;     // The rectangle's width
      double area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
      
      System.exit(0);
   }
   
   /**
      The getLength method prompts the user for the rectangle's
      length.
      @return The value entered by the user.
   */
   
   public static double getLength()
   {
      String input;        // To hold keyboard input
      
      input = JOptionPane.showInputDialog(
                 "Enter the rectangle's length.");
      return Double.parseDouble(input);
   }
   
   /**
      The getWidth method prompts the user for the rectangle's
      width.
      @return The value entered by the user.
   */
   
   public static double getWidth()
   {
      String input;        // To hold keyboard input
      
      input = JOptionPane.showInputDialog(
                     "Enter the rectangle's width.");
      return Double.parseDouble(input);
   }

   /**
      The getArea method calculates a rectangle's area.
      @param length The rectangle's length.
      @param width The rectangle's width.
      @return The area of the rectangle.
   */
   
   public static double getArea(double length, double width)
   {
      return length * width;
   }

   /**
      The displayData displays a rectanlge's length, width,
      and area.
      @param length The rectangle's length.
      @param width The rectangle's width.
      @param area The rectangle's area.
   */
   
   public static void displayData(double length, double width,
                                  double area)
   {
      JOptionPane.showMessageDialog(null, "Length  = " + length + 
                                          "\nWidth = " + width + 
                                          "\nArea  = " + area);
   }
}

