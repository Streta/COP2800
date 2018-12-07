import java.sql.*;         // Needed for JDBC classes
import javax.swing.*;      // Needed for Swing classes
import java.awt.*;         // Needed for the BorderLayout class
import java.awt.event.*;   // Needed for event listener interface

/**
   This program demonstrates a solution to the
   PhoneBook Database programming challenge.
*/

public class PhoneBookDemo extends JFrame
{
   PhoneBookManager pbManager;// A connection to the database
   JList nameList;            // A list to hold the names
   JScrollPane scrollPane;    // A scroll pane to hold the list
   JPanel listPanel;          // A panel to hold the scroll pane
   JPanel buttonPanel;        // A panel to hold the buttons
   JButton newButton;         // A button to add a new entry
   JButton deleteButton;      // A button to delete an entry
   JButton viewButton;        // A button to view an entry
   JButton editButton;        // A button to edit an entry
   JButton exitButton;        // A button to exit the program

   /**
      Constructor
   */
   
   public PhoneBookDemo()
   {
      // Set the window title.
      setTitle("Phone Book Database");
      
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Build the list panel.
      buildListPanel();
      
      // Build the button panel.
      buildButtonPanel();
      
      // Add the button panel.
      add(listPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
      // Pack and display.
      pack();
      setVisible(true);   
   }
   
   /**
      The buildListPanel method builds a panel to hold the
      list of names that will be displayed to the user.
   */

   private void buildListPanel()
   {
      try
      {
         // Create a panel.
         listPanel = new JPanel();
         
         // Add a titled border to the panel.
         listPanel.setBorder(BorderFactory.
         createTitledBorder("Select a Name"));
         
         // Create an PhoneBookManager object.
         pbManager = new PhoneBookManager();
         
         // Create a JList object to hold the names.
         nameList = new JList(pbManager.getNames());
         
         // Set the number of visible rows.
         nameList.setVisibleRowCount(5);
         
         // Put the JList object in a scroll pane.
         scrollPane = new JScrollPane(nameList);
         
         // Add the scroll pane to the panel.
         listPanel.add(scrollPane);
      }
      catch(SQLException ex)
      {
         // If something goes wrong with the database, 
         // display a message to the user.
         JOptionPane.showMessageDialog(null, ex.toString());
      }
   }

   /**
      The buildButtonPanel method builds a panel
      to hold the buttons.
   */

   private void buildButtonPanel()
   {
      // Create a panel.
      buttonPanel = new JPanel();

      // Add a titled border to the panel.
      buttonPanel.setBorder(BorderFactory.
      createTitledBorder("Select an Action"));
         
      // Create the buttons.
      newButton = new JButton("New");
      viewButton = new JButton("View");
      deleteButton = new JButton("Delete");
      editButton = new JButton("Edit");
      exitButton = new JButton("Exit");
      
      // Register the action listeners for the buttons.
      newButton.addActionListener(new NewButtonListener());
      viewButton.addActionListener(new ViewButtonListener());
      deleteButton.addActionListener(new DeleteButtonListener());
      editButton.addActionListener(new EditButtonListener());
      exitButton.addActionListener(new ExitButtonListener());

      // Add the buttons to the panel.
      buttonPanel.add(newButton);
      buttonPanel.add(viewButton);
      buttonPanel.add(deleteButton);
      buttonPanel.add(editButton);
      buttonPanel.add(exitButton);
   }

   /**
      The NewButtonListener class is an action listener
      for the New button.
   */

   private class NewButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Get a new name from the user.
            String newName = 
                     JOptionPane.showInputDialog(null, 
                     "Enter a new name.");            
            
            // Determine that the name has a value.
            if(newName != null)
            {
               // Get a new phone number from the user.
               String newNumber = 
                     JOptionPane.showInputDialog(null, 
                     "Enter a new phone number.");
                     
               // Determine that the phone number has a value.
               if(newNumber != null)
               {
                  // Create a new PhoneBookManager object
                  // and perform the INSERT INTO operation.
                  pbManager = new PhoneBookManager();
                  pbManager.addEntry(newName, newNumber);
               
                  // Notify the user that the operation was a success.
                  JOptionPane.showMessageDialog(null, 
                  "Success!\nThe item was added to the database.");
            
                  // Create a new PhoneBookManager Object and
                  // update the name list with the names in the
                  // database.
                  pbManager = new PhoneBookManager();
                  nameList.setListData(pbManager.getNames());                    
               }           
            }
         }
         catch(SQLException ex)
         {  
            // If something goes wrong with the database, 
            // display a message to the user.
            JOptionPane.showMessageDialog(null, ex.toString());
         }           
      }
   }
   
   /**
      The ViewButtonListener class is an action listener
      for the View button.
   */

   private class ViewButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Get the selected value from the name list.
            String selectedName = (String) nameList.getSelectedValue();
            
            // Determine that the name has a value.
            if(selectedName != null)
            {  
               // Create a new PhoneBookManager object
               // and get the phone number from the 
               // database.            
               pbManager = new PhoneBookManager();
               String number = pbManager.getPhoneNumber(selectedName);
            
               // Display the information to the user.
               JOptionPane.showMessageDialog(null, 
               selectedName + "\n" + number);
            }
            else
               // Display a message indicating that a
               // name must be selected from the list.            
               JOptionPane.showMessageDialog(null, 
               "Select a name from the list.");
         }
         catch(SQLException ex)
         {
            // If something goes wrong with the database, 
            // display a message to the user.
            JOptionPane.showMessageDialog(null, ex.toString());
         }
      }
   }

   /**
      The DeleteButtonListener class is an action listener
      for the Delete button.
   */

   private class DeleteButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Get the selected value from the name list.
            String selectedName = (String) nameList.getSelectedValue();
            
            // Determine that the name has a value.
            if(selectedName != null)
            {
               // Create a new PhoneBookManager object
               // and perform the DELETE FROM operation.
               pbManager = new PhoneBookManager();
               pbManager.deleteEntry(selectedName);
               
               // Notify the user that the operation was a success.
               JOptionPane.showMessageDialog(null, 
               "Success!\nThe item was removed from " +
               " the database.");
               
               // Create a new PhoneBookManager Object and
               // update the name list with the names in the
               // database.
               pbManager = new PhoneBookManager();
               nameList.setListData(pbManager.getNames());  
            }
            else
               // Display a message indicating that a
               // name must be selected from the list.
               JOptionPane.showMessageDialog(null, 
               "Select a name from the list.");
         }
         catch(SQLException ex)
         {
            // If something goes wrong with the database, 
            // display a message to the user.
            JOptionPane.showMessageDialog(null, ex.toString());
         }
      }
   }

   /**
      The EditButtonListener class is an action listener
      for the edit button.
   */

   private class EditButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Get the selected value from the name list.
            String selectedName = (String) nameList.getSelectedValue();
            
            // Create a new PhoneBookManager Object and
            // connect to the database.
            pbManager = new PhoneBookManager();
            
            // Determine that the name has a value.
            if(selectedName != null)
            {
               // Display the existing information in the database
               // and get a new phone number from the user.
               String newNumber = 
                     JOptionPane.showInputDialog(null,
                     selectedName + "\n" +
                     pbManager.getPhoneNumber(selectedName) + 
                     "\nEnter a new phone number.");
               
               // Determine that the new phone number has a value.
               if(newNumber != null)
               {
                  // Perform the UPDATE operation.
                  pbManager.setPhoneNumber(selectedName, newNumber);
               
                  // Notify the user that the operation was a success.
                  JOptionPane.showMessageDialog(null, 
                  "Success!\nThe item was updated in the database.");
               }     
            }
            else
               // Display a message indicating that a
               // name must be selected from the list.
               JOptionPane.showMessageDialog(null, 
               "Select a name from the list.");
         }
         catch(SQLException ex)
         {
            // If something goes wrong with the database, 
            // display a message to the user.
            JOptionPane.showMessageDialog(null, ex.toString());
         }
      }
   }

   /**
      The ExitButtonListener class is an action listener
      for the Exit button.
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
      The main method
   */

   public static void main(String[] args)
   {
      // Instantiate the class anonymously.
      new PhoneBookDemo();
   }
}