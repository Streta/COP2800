import javax.swing.*;
import java.awt.*;

/**
   The CustomerInfoPanel class builds a panel containing the 
   labels and text fields for inserting data into the Customer 
   table of the CoffeeDB database for the Customer Inserter 
   programming challenge.
*/

public class CustomerInfoPanel extends JPanel
{
   private JTextField custNumTextField;   // customer number
   private JTextField nameTextField;      // name
   private JTextField addressTextField;   // address
   private JTextField cityTextField;      // city
   private JTextField stateTextField;     // state
   private JTextField zipTextField;       // zip code 
   
   public CustomerInfoPanel()
   {
      // Create labels and text fields
      // for the customer data.
      JLabel custNumPrompt = new JLabel("Customer Number");
      custNumTextField = new JTextField(10);
      
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
      // with 12 rows and 1 column.
      setLayout(new GridLayout(12, 1));   
      setBorder(BorderFactory.createTitledBorder("Enter Customer Information"));
      
      // Add the labels and text fields
      // to the panel.
      add(custNumPrompt);
      add(custNumTextField);
      
      add(namePrompt);
      add(nameTextField);
      
      add(addressPrompt);
      add(addressTextField);
      
      add(cityPrompt);
      add(cityTextField);
      
      add(statePrompt);
      add(stateTextField);
      
      add(zipPrompt);
      add(zipTextField);
   }
   
   /**
      The getCustNum method returns the 
      customer number entered by the user.
      @return The customer number
    */
   
   public String getCustNum()
   {
      return custNumTextField.getText();
   }
   
   /**
      The getName method returns the 
      name entered by the user.
      @return The customer name
    */
   
   public String getName()
   {
      return nameTextField.getText();
   }
   /**
      The getAddress method returns the 
      address entered by the user.
      @return The address
    */
   
   public String getAddress()
   {
      return addressTextField.getText();
   }

   /**
      The getCity method returns the 
      city entered by the user.
      @return The city
    */
   
   public String getCity()
   {
      return cityTextField.getText();
   }
   
   /**
      The getState method returns the 
      state entered by the user.
      @return the state
    */
   
   public String getState()
   {
      return stateTextField.getText();
   }
   
   /**
      The getZip method returns the 
      zip code entered by the user.
      @return The zip code
    */
   
   public String getZip()
   {
      return zipTextField.getText();
   }
         
   /**
      The clear method sets each of the 
      text fields to an empty string.
    */
   
   public void clear()
   {
      custNumTextField.setText("");
      nameTextField.setText("");
      addressTextField.setText("");
      cityTextField.setText("");
      stateTextField.setText("");
      zipTextField.setText("");
   }
}