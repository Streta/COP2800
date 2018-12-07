import java.sql.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Unpaid Order Lookup programming challenge.
*/
 
public class UnpaidOrderLookup extends JFrame
{
   JPanel customerNamePanel;  // Panel for customer names
   JPanel buttonPanel;        // Panel for buttons
   JList customerNameList;    // List for customer names
   UnpaidOrderTable unpaidOrderTable;
   
   /**
      Constructor
    */
   
   public UnpaidOrderLookup()
   {
      // Set the window title.
      setTitle("Unpaid Order Lookup");
      
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Build the CustomerNamePanel object.
      buildCustomerNamePanel();
      
      // Build the ButtonPanel object.
      buildButtonPanel();
      
      // create a BorderLayout manager.
      setLayout(new BorderLayout());
      
      // Add the panels to the content pane.
      add(customerNamePanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildCustomerNamePanel method builds 
      a panel for the customer name List.
    */
    
   public void buildCustomerNamePanel()
   {
      try
      {
         // Create the JPanel.
         customerNamePanel = new JPanel();
      
         String[] customerNames = null; // To hold customer names
               
         // Create a UnpaidOrderTableManager object.
         UnpaidOrderTableManager uoManager = new UnpaidOrderTableManager();
               
         // Get a list of customer names as a String array.
         customerNames = uoManager.getCustomerNames();

         // Create a JList object to hold the customer 
         // names and add a list selection listener.     
         customerNameList = new JList(customerNames);
         customerNameList.addListSelectionListener(new ListListener());
      
         // Set the number of visible rows.
         customerNameList.setVisibleRowCount(5);
      
         // Put the JList object in a scroll pane.
         JScrollPane scrollPane = new JScrollPane(customerNameList);
      
         // Add the scroll pane to the panel.
         customerNamePanel.add(scrollPane);
      
         // Add a titled border around the panel.
         customerNamePanel.setBorder
            (BorderFactory.createTitledBorder
               ("Select a Customer"));       
      }
      catch (SQLException ex)
      {
         ex.printStackTrace();
         System.exit(0);
      }
   }

   /**
      The buildButtonPanel method builds a panel for
      the Exit button.
    */
   
   public void buildButtonPanel()
   {
      // Create a panel for the button.
      buttonPanel = new JPanel();
      
      // Create an Exit button and add an action listener.
      JButton exitButton = new JButton("Exit");
      exitButton.addActionListener(new ExitButtonListener());
      
      // Add the button to the panel.
      buttonPanel.add(exitButton);
   }
   
   /**
      The showSummary method displays a table
      containing the unpaid order summary for
      the selected customer in a new window.
    */   
   
   public void showSummary()
   {
      try
      {
         // Get the selected customer name.
         String name = (String) customerNameList.getSelectedValue();
      
         // Create a UnpaidOrderTableManager object.
         UnpaidOrderTableManager uoManager = new UnpaidOrderTableManager();
      
         // Get the customer number for the selected name.
         String custNum = uoManager.getCustomerNumber(name);
      
         // Build the query.
         String query = "SELECT * FROM UnpaidOrder " +
                        "WHERE CustomerNumber = " +
                        "'" + custNum + "'";
                     
         // Create a CoffeeDBQuery object.
         CoffeeDBQuery coffeeDBQuery = new CoffeeDBQuery(query);
      
         // Store the table data and column names.
         String[][] tableData = coffeeDBQuery.getTableData();
         String[] columnNames = coffeeDBQuery.getColumnNames();
         
         // Show the table in a new window.
         unpaidOrderTable = new UnpaidOrderTable(tableData, columnNames);
            
      }
      catch (SQLException ex)
      {
         ex.printStackTrace();
         System.exit(0);
      }
   }
   
   /**
      Private inner class that handles value changed events.
    */
    
   private class ListListener implements ListSelectionListener
   {
      public void valueChanged(ListSelectionEvent e)
      {
         // Show the unpaid order summary table 
         // for the selected customer in a new window.
         showSummary();
      }
   }
      
   /**
      Private inner class that handles exit button events.
    */
   
   private class ExitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   
   /**
      The main method
    */
      
   public static void main(String[] args)
   {
      // Create an instance of the UnpaidOrderLookup class.
      UnpaidOrderLookup unpaidOrderLookup = new UnpaidOrderLookup();
   }
}