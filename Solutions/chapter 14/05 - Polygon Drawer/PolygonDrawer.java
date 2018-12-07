import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Polygon Drawer programming challenge.
*/

public class PolygonDrawer extends JApplet
{
   private final int NUM_POINTS = 6;      // Number of points
   private int[] xPoints;                 // Array of X coordinates
   private int[] yPoints;                 // Array of Y coordinates
   private int pointsEntered = 0;         // Number of points entered

   /**
      init method
   */
      
   public void init()
   {
      // Create the arrays.
      xPoints = new int[NUM_POINTS];
      yPoints = new int[NUM_POINTS];
      
      // Set the background color to red.
      getContentPane().setBackground(Color.red);
      
      // Add the mouse listener.
      addMouseListener(new MyMouseListener());
   }
   
   /**
      The paint method draws the polygon, or prompts the
      user to enter another point.
      @param g The applet's Graphics object.
   */
      
   public void paint(Graphics g)
   {
      // Call the base class paint method.
      super.paint(g);
      
      // Display a message.
      if (pointsEntered < NUM_POINTS)
         g.drawString("Select point #" + String.valueOf(pointsEntered+1) + ".", 10, 199);

      if (pointsEntered == NUM_POINTS)
      {
         // Draw the polygon.
         g.drawPolygon(xPoints, yPoints, pointsEntered - 1);
         // Reset the point counter.
         pointsEntered = 0;
         // Display a message.
         g.drawString("Select point #" + String.valueOf(pointsEntered+1) + ".", 10, 199);       
      }
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
         // Get the X and Y coordinates.
         xPoints[pointsEntered] = e.getX();
         yPoints[pointsEntered] = e.getY();
         pointsEntered++;
         repaint();
      }
   }
}
