import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   House Applet programming challenge.
*/

public class House extends JApplet
{
   private boolean leftWindowClosed = true;  // State of the left window
   private boolean rightWindowClosed = true; // State of the right window
   private boolean doorClosed = true;        // State of the door

   // Constants used in determining the sizes and locations of the house,
   // roof, windows, and door.
   private final int HOUSE_WIDTH = 200;
   private final int HOUSE_HEIGHT = 80;
   private final int HOUSE_X = 20;
   private final int HOUSE_Y = 30;
   private final int ROOF_TOP = 0;
   private final int WINDOW_WIDTH = 50;
   private final int WINDOW_HEIGHT = 30;
   private final int DOOR_WIDTH = 40;
   private final int DOOR_HEIGHT = 70;
   private final int DOOR_Y = 40;
   private final int DOOR_X = (((HOUSE_WIDTH/2)+HOUSE_X)-(DOOR_WIDTH/2));
   private final int LEFT_WINDOW_X = ((HOUSE_WIDTH/4)+HOUSE_X)-(WINDOW_WIDTH/2);
   private final int LEFT_WINDOW_Y = 40;
   private final int RIGHT_WINDOW_X = (((HOUSE_WIDTH/4)*3)+HOUSE_X)-(WINDOW_WIDTH/2);
   private final int RIGHT_WINDOW_Y = LEFT_WINDOW_Y;
   private final int KNOB_WIDTH = 10;
   private final int KNOB_HEIGHT = KNOB_WIDTH;
                   
   /**
      init method
   */
      
   public void init()
   {
      // Set the background color to white.
      getContentPane().setBackground(Color.white);
      
      // Add the mouse listener.
      addMouseListener(new MyMouseListener());
   }
   
   /**
      The paint method draws the house.
      @param g The applet's Graphics object.
   */
      
   public void paint(Graphics g)
   {
      // Call the base class paint method.
      super.paint(g);
      
      // Draw the outline of the house and roof.
      drawHouse(g);
      
      // Draw the correct windows and door.
      if (leftWindowClosed)
         drawClosedWindow(g, LEFT_WINDOW_X, LEFT_WINDOW_Y);
      else
         drawOpenWindow(g, LEFT_WINDOW_X, LEFT_WINDOW_Y);
      
      if (rightWindowClosed)
         drawClosedWindow(g, RIGHT_WINDOW_X, RIGHT_WINDOW_Y);
      else
         drawOpenWindow(g, RIGHT_WINDOW_X, RIGHT_WINDOW_Y);
         
      if (doorClosed)
         drawClosedDoor(g, DOOR_X, DOOR_Y);
      else
         drawOpenDoor(g, DOOR_X, DOOR_Y);
   }
   
   /**
      The drawHouse method draws the outline of the house.
      @param g The applet's Graphics object.
   */
   
   private void drawHouse(Graphics g)
   {
      // Draw a black unfilled rectangle.
      g.setColor(Color.black);
      g.drawRect(HOUSE_X, HOUSE_Y, HOUSE_WIDTH, HOUSE_HEIGHT);
      
      // Draw the roof.
      // First, the base line.
      g.drawLine((HOUSE_X-10), HOUSE_Y, (HOUSE_WIDTH+30), HOUSE_Y);
      // Next a line from the left corner to the top.
      g.drawLine((HOUSE_X-10), HOUSE_Y, ((HOUSE_WIDTH/2)+HOUSE_X), ROOF_TOP);
      // Next a line from the top to the right corner.
      g.drawLine(((HOUSE_WIDTH/2)+HOUSE_X), ROOF_TOP, (HOUSE_WIDTH+30), HOUSE_Y);
   }      
   
   /**
      The drawOpenWindow method draws an open window at
      the specified X,Y coordinates.
      @param g The applet's Graphics object.
      @param x The specified X coordinate.
      @param Y The specified Y coordinate.
   */
   
   private void drawOpenWindow(Graphics g, int x, int y)
   {
      // Set the drawing color and draw a filled window.
      g.setColor(Color.black);
      g.fillRect(x, y, WINDOW_WIDTH, WINDOW_HEIGHT);
   }

   /**
      The drawClosedWindow method draws a closed window at
      the specified X,Y coordinates.
      @param g The applet's Graphics object.
      @param x The specified X coordinate.
      @param Y The specified Y coordinate.
   */
   
   private void drawClosedWindow(Graphics g, int x, int y)
   {
      // Set the color and draw the outline.
      g.setColor(Color.black);
      g.drawRect(x, y, WINDOW_WIDTH, WINDOW_HEIGHT);
      // Draw a horizontal line.
      g.drawLine(x, (y+(WINDOW_HEIGHT/2)),
                 (x+WINDOW_WIDTH), (y+(WINDOW_HEIGHT/2)));
      // Draw a vertical line.
      g.drawLine((x+(WINDOW_WIDTH/2)), (y+WINDOW_HEIGHT),
                 (x+(WINDOW_WIDTH/2)), y);
   }


   /**
      The drawOpenDoor method draws an open door at the
      specified X,Y coordinates.
      @param g The applet's Graphics object.
      @param x The specified X coordinate.
      @param Y The specified Y coordinate.
   */
   
   private void drawOpenDoor(Graphics g, int x, int y)
   {
      // Set the drawing color and draw a filled door.
      g.setColor(Color.black);
      g.fillRect(x, y, DOOR_WIDTH, DOOR_HEIGHT);
   }

   /**
      The drawClosedDoor method draws a closed door at the
      specified X,Y coordinates.
      @param g The applet's Graphics object.
      @param x The specified X coordinate.
      @param Y The specified Y coordinate.
   */

   private void drawClosedDoor(Graphics g, int x, int y)
   {
      // Set the drawing color and draw the door outline.
      g.setColor(Color.black);
      g.drawRect(x, y, DOOR_WIDTH, DOOR_HEIGHT);
      
      // Draw the door knob.
      g.fillOval(((x+DOOR_WIDTH)-KNOB_WIDTH), (y+(DOOR_HEIGHT/2)),
                 KNOB_WIDTH, KNOB_HEIGHT);
   }

   /**
      MyMouseListener private inner class
   */
      
   private class MyMouseListener extends MouseAdapter
   {
      /**
         mouseClicked method
         @param e The MouseEvent object for this event.
      */
      
      public void mouseClicked(MouseEvent e)
      {
         // Determine whether the mouse is inside a
         // window or the door.
         if (isInLeftWindow(e.getX(), e.getY()))
            leftWindowClosed = !leftWindowClosed;
         else if (isInRightWindow(e.getX(), e.getY()))
            rightWindowClosed = !rightWindowClosed;
         else if (isInDoor(e.getX(), e.getY()))
            doorClosed = !doorClosed;
         
         // Force a repaint.
         repaint();
      }
      
      /**
         The isInLeftWindow method returns true if the point
         specified by x,y is inside the left window.
         @param x The specified X coordinate.
         @param Y The specified Y coordinate.
      */
      
      private boolean isInLeftWindow(int x, int y)
      {
         boolean status = false;
         
         if (x >= LEFT_WINDOW_X && x < (LEFT_WINDOW_X + WINDOW_WIDTH) &&
             y >= LEFT_WINDOW_Y && y < (LEFT_WINDOW_Y + WINDOW_HEIGHT))
             status = true;
         
         return status;
      }
   
      /**
         The isInRightWindow method returns true if the point
         specified by x,y is inside the right window.
         @param x The specified X coordinate.
         @param Y The specified Y coordinate.
      */
      
      private boolean isInRightWindow(int x, int y)
      {
         boolean status = false;
         
         if (x >= RIGHT_WINDOW_X && x < (RIGHT_WINDOW_X + WINDOW_WIDTH) &&
             y >= RIGHT_WINDOW_Y && y < (RIGHT_WINDOW_Y + WINDOW_HEIGHT))
            status = true;
         
         return status;
      }
      
      /**
         The isInDoor method returns true if the point
         specified by x,y is inside the door.
         @param x The specified X coordinate.
         @param Y The specified Y coordinate.
      */
      
      private boolean isInDoor(int x, int y)
      {
         boolean status = false;
         
         if ((x >= DOOR_X) && (x < (DOOR_X + DOOR_WIDTH)) &&
             (y >= DOOR_Y) && (y < (DOOR_Y + DOOR_HEIGHT)))
            status = true;
         
         return status;
      }
   } // End of inner class
}
