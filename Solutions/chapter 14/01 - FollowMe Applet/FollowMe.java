import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   FollowMe Applet programming challenge.
*/

public class FollowMe extends JApplet
{
   private int xCoord = 100, yCoord = 100;
   
   /**
      init method
   */
      
   public void init()
   {
      getContentPane().setBackground(Color.white);
      addMouseMotionListener(new MyMouseMotionListener());
   }
   
   /**
      The paint method draws the "Hello" string.
      @param g The applet's Graphics object.
   */

   public void paint(Graphics g)
   {
      // Call the base class paint method.
      super.paint(g);
      
      // Draw the string at the current mouse location.
      g.drawString("Hello", xCoord, yCoord);
   }
   
   /**
      Private inner class that handles mouse
      motion events.
   */
   
   private class MyMouseMotionListener implements MouseMotionListener
   {
      /**
         mouseMoved method
         @param e The MouseEvent object for this event.
      */
   
      public void mouseMoved(MouseEvent e)
      {
         // Get the mouse pointer's X and Y coordinates.
         xCoord = e.getX();
         yCoord = e.getY();
         
         // Force the paint method to execute.
         repaint();
      }

      /**
         Unused mouseDragged method
      */

      public void mouseDragged(MouseEvent e)
      {
      }
   }
}
