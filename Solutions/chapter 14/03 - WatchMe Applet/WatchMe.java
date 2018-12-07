import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   WatchMe Applet programming challenge.
*/

public class WatchMe extends JApplet
{
   // Constants for the eye state.
   private final int EYES_AHEAD = 0;   // Eyes are looking ahead
   private final int EYES_UP = 1;      // Eyes are looking up
   private final int EYES_DOWN = 2;    // Eyes are looking down
   private final int EYES_LEFT = 3;    // Eyes are looking left
   private final int EYES_RIGHT = 4;   // Eyes are looking right
   
   // Constants which determine the eyes and pupils sizes
   // and locations.
   private final int LEFT_EYE_X = 50, LEFT_EYE_Y = 75;
   private final int RIGHT_EYE_X = 100, RIGHT_EYE_Y = 75;
   private final int EYE_WIDTH = 50, EYE_HEIGHT = 50;
                     
   // Left pupils looking ahead
   private final int LEFT_PUPIL_AHEAD_X = 65, LEFT_PUPIL_AHEAD_Y = 90;
                     
   // Right pupils looking ahead
   private final int RIGHT_PUPIL_AHEAD_X = 115, RIGHT_PUPIL_AHEAD_Y = 90;
                     
   // Left pupils looking down
   private final int LEFT_PUPIL_DOWN_X = 65, LEFT_PUPIL_DOWN_Y = 100;
                     
   // Right pupils looking down
   private final int RIGHT_PUPIL_DOWN_X = 115, RIGHT_PUPIL_DOWN_Y = 100;

   // Left pupils looking up
   private final int LEFT_PUPIL_UP_X = 65, LEFT_PUPIL_UP_Y = 80;
                     
   // Right pupils looking up
   private final int RIGHT_PUPIL_UP_X = 115, RIGHT_PUPIL_UP_Y = 80;

   // Left pupils looking right
   private final int LEFT_PUPIL_RIGHT_X = 75, LEFT_PUPIL_RIGHT_Y = 90;
                     
   // Right pupils looking right
   private final int RIGHT_PUPIL_RIGHT_X = 125, RIGHT_PUPIL_RIGHT_Y = 90;

   // Left pupils looking left
   private final int LEFT_PUPIL_LEFT_X = 55, LEFT_PUPIL_LEFT_Y = 90;
                     
   // Right pupils looking left
   private final int RIGHT_PUPIL_LEFT_X = 105, RIGHT_PUPIL_LEFT_Y = 90;
                     
   // Pupil width and height
   private final int PUPIL_WIDTH = 20, PUPIL_HEIGHT = 20;
                     
   private int eyeState = EYES_AHEAD;  // Current state of the eyes
                     
   /**
      init method
   */
      
   public void init()
   {
      // Set the background color to white.
      getContentPane().setBackground(Color.white);
      
      // Add the mouse motion listener.
      addMouseMotionListener(new MyMouseMotionListener());
   }
   
   /**
      The paint method draws the eyes in the correct position.
      @param g The applet's Graphics object.
   */
      
   public void paint(Graphics g)
   {
      // Call the base class paint method.
      super.paint(g);
      
      // Draw the outline of the eyes.
      drawEyes(g);
      
      // Draw the pupils in the correct position.
      if (eyeState == EYES_AHEAD)
         drawPupilsAhead(g);
      else if (eyeState == EYES_UP)
         drawPupilsUp(g);
      else if (eyeState == EYES_DOWN)
         drawPupilsDown(g);
      else if (eyeState == EYES_LEFT)
         drawPupilsLeft(g);
      else if (eyeState == EYES_RIGHT)
         drawPupilsRight(g);
      else
         drawPupilsAhead(g);
   }
   
   /**
      The drawEyes method draws the outline of the eyes.
      @param g The applet's Graphics object.
   */

   public void drawEyes(Graphics g)
   {
      // Draw the outline of the eyes.
      g.drawOval(LEFT_EYE_X, LEFT_EYE_Y, EYE_WIDTH, EYE_HEIGHT);
      g.drawOval(RIGHT_EYE_X, RIGHT_EYE_Y, EYE_WIDTH, EYE_HEIGHT);
   }

   /**
      The drawPupilsAhead method draws the eyes looking ahead.
      @param g The applet's Graphics object.
   */
   
   public void drawPupilsAhead(Graphics g)
   {
      g.fillOval(LEFT_PUPIL_AHEAD_X, LEFT_PUPIL_AHEAD_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
      g.fillOval(RIGHT_PUPIL_AHEAD_X, RIGHT_PUPIL_AHEAD_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
   }

   /**
      The drawPupilsDown method draws the eyes looking down.
      @param g The applet's Graphics object.
   */
   
   public void drawPupilsDown(Graphics g)
   {
      g.fillOval(LEFT_PUPIL_DOWN_X, LEFT_PUPIL_DOWN_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
      g.fillOval(RIGHT_PUPIL_DOWN_X, RIGHT_PUPIL_DOWN_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
   }

   /**
      The drawPupilsUp method draws the eyes looking up.
      @param g The applet's Graphics object.
   */
      
   public void drawPupilsUp(Graphics g)
   {
      g.fillOval(LEFT_PUPIL_UP_X, LEFT_PUPIL_UP_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
      g.fillOval(RIGHT_PUPIL_UP_X, RIGHT_PUPIL_UP_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
   }

   /**
      The drawPupilsRight method draws the eyes looking right.
      @param g The applet's Graphics object.
   */
      
   public void drawPupilsRight(Graphics g)
   {
      g.fillOval(LEFT_PUPIL_RIGHT_X, LEFT_PUPIL_RIGHT_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
      g.fillOval(RIGHT_PUPIL_RIGHT_X, RIGHT_PUPIL_RIGHT_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
   }

   /**
      The drawPupilsLeft method draws the eyes looking left.
      @param g The applet's Graphics object.
   */
      
   public void drawPupilsLeft(Graphics g)
   {
      g.fillOval(LEFT_PUPIL_LEFT_X, LEFT_PUPIL_LEFT_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
      g.fillOval(RIGHT_PUPIL_LEFT_X, RIGHT_PUPIL_LEFT_Y, PUPIL_WIDTH, PUPIL_HEIGHT);
   }
   
   /**
      MyMouseMotionListener private inner class
   */
      
   private class MyMouseMotionListener extends MouseMotionAdapter
   {
      /**
         mouseMoved method
         @param e The MouseEvent object for this event.
      */

      public void mouseMoved(MouseEvent e)
      {
         // Get the mouse pointer's X and Y coordinates.
         int x = e.getX(), y = e.getY();
         
         // Determine the correct eye state.
         if (y < RIGHT_EYE_Y)
            eyeState = EYES_UP;
         else if (y > (RIGHT_EYE_Y + EYE_HEIGHT))
            eyeState = EYES_DOWN;
         else if (x < LEFT_EYE_X)
            eyeState = EYES_LEFT;
         else if (x > (RIGHT_EYE_X + EYE_WIDTH))
            eyeState = EYES_RIGHT;
         
         // Force a repaint.
         repaint();
      }
   }
}
