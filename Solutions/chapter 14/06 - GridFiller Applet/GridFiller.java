import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   GridFiller Applet programming challenge.
*/

public class GridFiller extends JApplet
{
   // Constants for the cell X and Y coordinates
   private final int CELL_1_X = 0;
   private final int CELL_1_Y = 0;
                     
   private final int CELL_2_X = 100;
   private final int CELL_2_Y = 0;
                     
   private final int CELL_3_X = 0;
   private final int CELL_3_Y = 100;
                     
   private final int CELL_4_X = 100;
   private final int CELL_4_Y = 100;

   // Constants for the cell width and height                     
   private final int CELL_WIDTH = 100;
   private final int CELL_HEIGHT = 100;

   // Constants for the grid's upper left X and Y coord
   private final int GRID_X = 0;
   private final int GRID_Y = 0;
   
   // Constants for the grid's width and height
   private final int GRID_WIDTH = 200;
   private final int GRID_HEIGHT = 200;

   // Flags for highlighted cells
   private boolean cell1Highlighted = false;    // Flag for cell 1
   private boolean cell2Highlighted = false;    // Flag for cell 2
   private boolean cell3Highlighted = false;    // Flag for cell 3
   private boolean cell4Highlighted = false;    // Flag for cell 4
                     
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
      The paint method draws the grid.
      @param g The applet's Graphics object.
   */
      
   public void paint(Graphics g)
   {
      // Call the base class paint method.
      super.paint(g);
      
      // Set the color to red for the selected cells.
      g.setColor(Color.red);

      // Draw any selected cells.
      if (cell1Highlighted)
         g.fillRect(CELL_1_X, CELL_1_Y, CELL_WIDTH, CELL_HEIGHT);
      if (cell2Highlighted)
         g.fillRect(CELL_2_X, CELL_2_Y, CELL_WIDTH, CELL_HEIGHT);
      if (cell3Highlighted)
         g.fillRect(CELL_3_X, CELL_3_Y, CELL_WIDTH, CELL_HEIGHT);
      if (cell4Highlighted)
         g.fillRect(CELL_4_X, CELL_4_Y, CELL_WIDTH, CELL_HEIGHT);

      // Set the color to black for the outline.
      g.setColor(Color.black);
      
      // Draw the grid outline.
      g.drawRect(GRID_X, GRID_Y, GRID_WIDTH, GRID_HEIGHT);
      
      // Draw the inner cell borders.
      g.drawLine(CELL_2_X, CELL_2_Y, CELL_4_X, CELL_4_Y + CELL_HEIGHT);
      g.drawLine(CELL_3_X, CELL_3_Y, CELL_4_X + CELL_WIDTH, CELL_4_Y);
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
         int selected = cellSelected(e.getX(), e.getY());
         if (selected == 1)
            cell1Highlighted = !cell1Highlighted;
         else if (selected == 2)
            cell2Highlighted = !cell2Highlighted;
         else if (selected == 3)
            cell3Highlighted = !cell3Highlighted;
         else if (selected == 4)
            cell4Highlighted = !cell4Highlighted;
         
         repaint();
      }
      
     /**
         cellSelected method
         @return The number of the selected cell. 0 if none.
     */

      public int cellSelected(int x, int y)
      {
         int cellNum = 0;
         
         if (x >= CELL_1_X && x < CELL_2_X && y >= CELL_1_Y && y < CELL_3_Y)
            cellNum = 1;
         else if (x >= CELL_2_X && x < (CELL_2_X + CELL_WIDTH) && 
                  y >= CELL_2_Y && y < CELL_4_Y)
            cellNum = 2;
         else if (x >= CELL_3_X && x < CELL_4_X && y >= CELL_3_Y && y < (CELL_3_Y + CELL_HEIGHT))
            cellNum = 3;
         else if (x >= CELL_4_X && x < (CELL_4_X + CELL_WIDTH) && 
                  y >= CELL_4_Y && y < (CELL_4_Y + CELL_HEIGHT))
            cellNum = 4;
         
         return cellNum;
      }
   }
}
