import javax.swing.*;
import java.awt.*;

/**
   The UnpaidOrderTable class stores data about the unpaid 
   order table for the Unpaid Order Lookup programming 
   challenge.
*/

public class UnpaidOrderTable extends JFrame
{
   /**
      Constructor
    */
   
   public UnpaidOrderTable(Object[][] data, Object[] colNames)
   {
      setTitle("Unpaid Order Summary");
      
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
      // Create a JTable with the results.
      JTable table = new JTable(data, colNames);
      
      // create a BorderLayout manager.
      setLayout(new BorderLayout());
      
      // Put the table in a scroll pane.
      JScrollPane scrollPane = new JScrollPane(table);

      // Add the table to the content pane.
      add(scrollPane, BorderLayout.NORTH);
      
      // Pack and display the window.
      pack();
      setVisible(true);
   }
}