import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   The ThermoPanel class stores data about a thermometer
   for the Thermometer Applet programming challenge.
*/

public class ThermoPanel extends JPanel
{
   // Various constants for the size of the
   // thermometer.
   private final int BULB_X = 125;
   private final int BULB_Y = 250;
   private final int BULB_WIDTH = 50;
   private final int BULB_HEIGHT = 50;
   private final int TUBE_X = 135;
   private final int TUBE_Y = 10;
   private final int TUBE_WIDTH = 30;
   private final int TUBE_HEIGHT = 250;
   private final int MARKER_SPACING = 50;
   private final int MAX_TEMP = 250;
   private final int INCREMENT = 10;
   private final int TEXT_SPACE = 5;
   private final int BLOCK_WIDTH = 30;
   private final int BLOCK_HEIGHT = 9;
   private final int PANEL_WIDTH = 300;
   private final int PANEL_HEIGHT = 310;
                     
   private int temperature = 0;  // Current temperature
   
   /**
      Constructor
   */
      
   public ThermoPanel()
   {
      // Set the background color to white.
      setBackground(Color.white);
      
      // Set the preferred size.
      setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }
   
   /**
      The setTemperature method sets the thermometer's
      temperature.
      @param t The temperature.
   */
   
   public void setTemperature(int t)
   {
      if (t > 250)
         temperature = 250;
      else if (t < 0)
         temperature = 0;
      else
         temperature = t;
         
      repaint();
   }

   /**
      The paintComponent method draws the panel.
      @param g The panel's Graphics object.
   */
      
   public void paintComponent(Graphics g)
   {
      // Call the base class paintComponent method.
      super.paintComponent(g);
      
      // Draw the temperature blocks.
      drawTemperature(g);
      
      // Now draw the outline of the thermometer.
      drawThermometer(g);
   }
   
   /**
      The drawThermometer method draws the thermometer.
      @param g The panel's Graphics object.
   */
      
   private void drawThermometer(Graphics g)
   {
      // Draw the tube.
      g.setColor(Color.black);
      g.drawRect(TUBE_X, TUBE_Y, TUBE_WIDTH, TUBE_HEIGHT);
      
      // Draw the temp markers.
      for (int i = (TUBE_Y + TUBE_HEIGHT), temp = 0;
               i > TUBE_Y - 1;
               i -= INCREMENT, temp += INCREMENT)
      {
         g.drawLine(TUBE_X, i, (TUBE_X + TUBE_WIDTH), i);
         g.drawString(String.valueOf(temp), (TUBE_X + TUBE_WIDTH + TEXT_SPACE), i);
      }

      // Draw the bulb at the bottom of the thermometer.
      g.setColor(Color.red);
      g.fillOval(BULB_X, BULB_Y, BULB_WIDTH, BULB_HEIGHT);
      g.setColor(Color.black);
      g.drawOval(BULB_X, BULB_Y, BULB_WIDTH, BULB_HEIGHT);

      // Draw the first bit of mercury showing in the tube.
      g.setColor(Color.red);
      g.fillRect(TUBE_X, (TUBE_Y+(TUBE_HEIGHT-BLOCK_HEIGHT)),
                 BLOCK_WIDTH, BLOCK_HEIGHT);
   }
   
   /**
      The drawTemperature method fills in the thermometer with
      the necessary amount of red.
      @param g The panel's Graphics object.
   */
      
   private void drawTemperature(Graphics g)
   {
      // Draw the white space first.
      g.setColor(Color.white);
      g.fillRect(TUBE_X, TUBE_Y, TUBE_WIDTH, TUBE_HEIGHT);
      
      // Now draw the red space.
      if (temperature > 0)
      {
         g.setColor(Color.red);
         g.fillRect(TUBE_X, getTempY(), TUBE_WIDTH, getTempHeight());
      }
   }
   
   /**
      The getTempy method returns the upper Y coordinate
      of the red filled-in portion of the thermometer.
      @return The Y coordinate of the top of the red filled-in
              part of the thermometer.
   */

   private int getTempY()
   {
      return ((MAX_TEMP - temperature) + TUBE_Y);
   }
   
   /**
      The getTempHeight method returns the height
      of the filled-in part of the thermometer.
      @return The height of the filled-in part of the
              thermometer.
   */

   private int getTempHeight()
   {
      return temperature;
   }
}