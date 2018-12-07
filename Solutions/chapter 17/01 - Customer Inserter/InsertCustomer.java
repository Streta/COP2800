import javax.swing.*;      // For Swing classes
import java.sql.*;         // For JDBC classes
import java.awt.*;         // For layout manager classes
import java.awt.event.*;   // For ActionListener interface

/**
   This program demonstrates a solution to the
   Customer Inserter programming challenge.
*/
 
public class InsertCustomer extends JFrame
{
   CustomerInfoPanel customerInfoPanel;   // Panel for customer information
   JPanel buttonPanel;                    // Panel for buttons
   
   /**
    * Constructor
    */
   
   public InsertCustomer()
   {
      // Set the window title.
      setTitle("Add Customer");
      
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create a CustomerInfoPanel object.
      customerInfoPanel = new CustomerInfoPanel();
      
      // Build the buttonPanel object.
      buildButtonPanel();
      
      // create a BorderLayout manager.
      setLayout(new BorderLayout());
      
      // Add the panels to the content pane.
      add(customerInfoPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
      // Pack and display the window.
      pack();
      setVisible(true);
   }
   
   /**
      buildButtonPanel method
    */
   
   private void buildButtonPanel()
   {
      // Create a panel for the buttons.
      buttonPanel = new JPanel();
      
      // Create a Submit button and add an action listener.
      JButton submitButton = new JButton("Submit");
      submitButton.addActionListener(new SubmitButtonListener());
      
      // Create an Exit button.
      JButton exitButton = new JButton("Exit");
      exitButton.addActionListener(new ExitButtonListener());
      
      // Add the buttons to the panel.
      buttonPanel.add(submitButton);
      buttonPanel.add(exitButton);
   }
   
   /**
      Private inner class that handles Submit button events.
    */
   
   private class SubmitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Get the customer information from the text fields.
            String custNum = customerInfoPanel.getCustNum();
            String name = customerInfoPanel.getName();
            String address = customerInfoPanel.getAddress();
            String city = customerInfoPanel.getCity();
            String state = customerInfoPanel.getState();
            String zip = customerInfoPanel.getZip();
            
            // Create a CustomerTableManager object.
            CustomerTableManager ctManager = new CustomerTableManager();
            
            // Insert the record.
            ctManager.insert(custNum, name, address, city, state, zip);
            
            // Clear the text fields.
            customerInfoPanel.clear();
            
            // Let the user know the record was added.
            JOptionPane.showMessageDialog(null, "Record Added");
         }
         catch (SQLException ex)
         {
            ex.printStackTrace();
            System.exit(0);
         }
      }
   }
   
   /**
      Private inner class that handles Exit button events.
    */
   
   private class ExitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Exit the application.
         System.exit(0);
      }
   }
   
   /**
      main method
    */
   
   public static void main(String[] args)
   {
      InsertCustomer insertCustomer = new InsertCustomer();
   }
}