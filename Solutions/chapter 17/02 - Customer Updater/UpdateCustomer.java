import java.sql.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Customer Updater programming challenge.
*/
 
public class UpdateCustomer extends JFrame
{
   JPanel customerNumberPanel;   // Panel for customer numbers
   JPanel customerInfoPanel;     // Panel for customer information
   JPanel buttonPanel;           // Panel for buttons
   JList customerNumberList;     // List for customer numbers
   JTextField nameTextField;     // Text Field for customer name
   JTextField addressTextField;  // Text Field for customer address
   JTextField cityTextField;     // Text Field for customer city
   JTextField stateTextField;    // Text Field for customer state
   JTextField zipTextField;      // Text Field for customer zip code 

   /**
      Constructor
    */
   
   public UpdateCustomer()
   {
      // Set the window title.
      setTitle("Update Customer");
      
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Build the CustomerNumberPanel object.
      buildCustomerNumberPanel();
      
      // Build the CustomerInfoPanel object.
      buildCustomerInfoPanel();
      
      // Build the ButtonPanel object.
      buildButtonPanel();
      
      // create a BorderLayout manager.
      setLayout(new BorderLayout());
      
      // Add the panels to the content pane.
      add(customerNumberPanel, BorderLayout.NORTH);
      add(customerInfoPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildCustomerNumberPanel method builds 
      a panel for the customer number List.
    */
    
   public void buildCustomerNumberPanel()
   {
      try
      {
         // Create the JPanel.
         customerNumberPanel = new JPanel();
      
         String[] customerNumbers; // To hold customer numbers
               
         // Create a CustomerTableManager object.
         CustomerTableManager ctManager = new CustomerTableManager();
               
         // Get a list of product numbers as a String array.
         customerNumbers = ctManager.getCustomerNumbers();

         // Create a JList object to hold the customer 
         // numbers and add a list selection listener.     
         customerNumberList = new JList(customerNumbers);
         customerNumberList.addListSelectionListener(new ListListener());
      
         // Set the number of visible rows.
         customerNumberList.setVisibleRowCount(5);
      
         // Put the JList object in a scroll pane.
         JScrollPane scrollPane = new JScrollPane(customerNumberList);
      
         // Add the scroll pane to the panel.
         customerNumberPanel.add(scrollPane);
      
         // Add a titled border around the panel.
         customerNumberPanel.setBorder
            (BorderFactory.createTitledBorder
               ("Select a Customer Number"));         
      }
      catch (SQLException ex)
      {
         ex.printStackTrace();
         System.exit(0);
      }
   }
   
   /**
      The buildCustomerInfoPanel method builds a panel for
      the customer information Labels and Text Fields.
    */
      
   public void buildCustomerInfoPanel()
   {  
      // Create the JPanel.
      customerInfoPanel = new JPanel();
      
      // Create labels and text fields
      // for the customer information.
      JLabel namePrompt = new JLabel("Name");
      nameTextField = new JTextField(25);
      JLabel addressPrompt = new JLabel("Address");
      addressTextField = new JTextField(25);
      JLabel cityPrompt = new JLabel("City");
      cityTextField = new JTextField(12);
      JLabel statePrompt = new JLabel("State");
      stateTextField = new JTextField(2);
      JLabel zipPrompt = new JLabel("Zip Code");
      zipTextField = new JTextField(5);
      
      // Create a grid layout manager 
      // with 10 rows and 1 column.
      customerInfoPanel.setLayout
         (new GridLayout(10, 1));
         
      // Add a titled border around the panel.
      customerInfoPanel.setBorder
         (BorderFactory.createTitledBorder
         ("Update Values"));
      
      // Add the labels and text fields
      // to the panel.
      customerInfoPanel.add(namePrompt);
      customerInfoPanel.add(nameTextField);
      customerInfoPanel.add(addressPrompt);
      customerInfoPanel.add(addressTextField);
      customerInfoPanel.add(cityPrompt);
      customerInfoPanel.add(cityTextField);
      customerInfoPanel.add(statePrompt);
      customerInfoPanel.add(stateTextField);
      customerInfoPanel.add(zipPrompt);
      customerInfoPanel.add(zipTextField);
   }
   
   /**
      The buildButtonPanel method builds a panel for
      the Submit and Exit buttons.
    */
   
   public void buildButtonPanel()
   {
      // Create a panel for the buttons.
      buttonPanel = new JPanel();
      
      // Create a Submit button and add an action listener.
      JButton submitButton = new JButton("Submit");
      submitButton.addActionListener(new SubmitButtonListener());
      
      // Create an Exit button and add an action listener.
      JButton exitButton = new JButton("Exit");
      exitButton.addActionListener(new ExitButtonListener());
      
      // Add the buttons to the panel.
      buttonPanel.add(submitButton);
      buttonPanel.add(exitButton);
   }
   
   /**
      Private inner class that handles value changed events.
    */
    
   private class ListListener implements ListSelectionListener
   {
      public void valueChanged(ListSelectionEvent e)
      {
         try
         {
            // Get the selected customer number.
            String custNum = (String) customerNumberList.getSelectedValue();
            
            // Create a new CustomerTableManager object.
            CustomerTableManager ctManager = new CustomerTableManager();
            
            // Get the customer information from the Customer  
            // table using the selected customer number.
            String name = ctManager.getName(custNum);
            String address = ctManager.getAddress(custNum);
            String city = ctManager.getCity(custNum);
            String state = ctManager.getState(custNum);
            String zip = ctManager.getZip(custNum);
            
            // Display the customer information in 
            // the text fields.
            nameTextField.setText(name);
            addressTextField.setText(address);
            cityTextField.setText(city);
            stateTextField.setText(state);
            zipTextField.setText(zip);             
         }
         catch (SQLException ex)
         {
            ex.printStackTrace();
            System.exit(0);
         }  
      }
   }
      
   /**
      Private inner class that handles submit button events.
    */
   
   private class SubmitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Update the customer record.
         try
         {
            // Get the selected customer number.
            String custNum = (String) customerNumberList.getSelectedValue();
            
            // Get the customer information values from the text fields.
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();
            String zip = zipTextField.getText();
            
            // Create a new CustomerTableManager object.
            CustomerTableManager ctManager = new CustomerTableManager();
               
            // Update the customer information.
            ctManager.updateName(custNum, name);
            ctManager.updateAddress(custNum, address);
            ctManager.updateCity(custNum, city);
            ctManager.updateState(custNum, state);
            ctManager.updateZip(custNum, zip);
         }
         catch (SQLException ex)
         {
            ex.printStackTrace();
            System.exit(0);
         }
         
         // Clear the list selection and text fields.
         customerNumberList.clearSelection();
         nameTextField.setText("");
         addressTextField.setText("");
         cityTextField.setText("");
         stateTextField.setText("");
         zipTextField.setText("");
         
         // Let the user know the record was updated.
         JOptionPane.showMessageDialog(null, "Update Complete.");
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
      // Create an instance of the UpdateCustomer class.
      UpdateCustomer updateCustomer = new UpdateCustomer();
   }
}