import javax.swing.*;      // For Swing classes
import java.sql.*;         // For JDBC classes
import java.awt.*;         // For layout manager classes
import java.awt.event.*;   // For ActionListener interface

/**
   This program demonstrates a solution to the
   Employee Inserter programming challenge.
*/
 
public class InsertEmployee extends JFrame
{
   // Components
   private JTextField empIdField;      // Employee ID
   private JTextField nameField;       // Name
   private JTextField positionField;   // Price
   private JTextField payRateField;    // Pay Rate
   
   private EmployeeInserter employeeInserter;
   
   /**
      Constructor
    */
   
   public InsertEmployee()
   {
      // Display a title.
      super("Insert Employee");
      
      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Build the input panel.
      buildInputPanel();
      
      // Build the button panel.
      buildButtonPanel();
      
      // Pack and display.
      pack();
      setVisible(true);
      
      try
      {
         employeeInserter = new EmployeeInserter();
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null, "Error: " +
                                       e.getMessage());
         System.exit(0);
      }
   }
   
   /**
      buildInputPanels method
    */
   
   private void buildInputPanel()
   {
      JPanel inputPanel = new JPanel();
      
      // Create prompts for the column values.
      JLabel empIdPrompt = new JLabel("Employee ID");
      JLabel namePrompt = new JLabel("Name");
      JLabel positionPrompt = new JLabel("Position");
      JLabel payRatePrompt = new JLabel("Pay Rate");
      
      // Create text fields for the column values.
      empIdField = new JTextField(10);
      nameField = new JTextField(25);
      positionField = new JTextField(30);
      payRateField = new JTextField(6);
      
      // Add the components to the inputPanel.
      inputPanel.add(empIdPrompt);
      inputPanel.add(empIdField);
      inputPanel.add(namePrompt);
      inputPanel.add(nameField);
      inputPanel.add(positionPrompt);
      inputPanel.add(positionField);
      inputPanel.add(payRatePrompt);
      inputPanel.add(payRateField);
      
      // Set the grid layout with 8 rows and 1 column.
      inputPanel.setLayout(new GridLayout(8, 1));
      
      // Add a titled border around the panel.
      inputPanel.setBorder
         (BorderFactory.createTitledBorder
         ("Enter Employee Information"));
      
      // Add the input panel to the content pane.
      add(inputPanel, BorderLayout.CENTER);
   }

   /**
      buildButtonPanel method
    */
   
   private void buildButtonPanel()
   {
      // Create a panel for the buttons.
      JPanel buttonPanel = new JPanel();
      
      // Create a Submit button.
      JButton submitButton = new JButton("Submit");
      
      // Create an Exit button.
      JButton exitButton = new JButton("Exit");
      
      // Register an action listener for th Submit button.
      submitButton.addActionListener(new SubmitButtonListener());

      // Register an action listener for the Exit button.
      exitButton.addActionListener(new ExitButtonListener());
      
      // Add the buttons to the panel.
      buttonPanel.add(submitButton);
      buttonPanel.add(exitButton);
      
      // Add the buttonPanel to the content pane.
      add(buttonPanel, BorderLayout.SOUTH);
   }
   
   /**
      SubmitButtonListener inner class
    */
   
   private class SubmitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Get information from the text fields.
         String empId = empIdField.getText();
         String name = nameField.getText();
         String position = positionField.getText();
         double payRate = Double.parseDouble(payRateField.getText());
         
         try
         {
            // Insert the information into the Employee table.
            employeeInserter.insert(empId, name, position, payRate);
         }
         catch (SQLException ex)
         {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
         
         // Clear the text fields.
         empIdField.setText("");
         nameField.setText("");
         positionField.setText("");
         payRateField.setText("");
      }
   }
   
   /**
      ExitButtonListener inner class
    */
   
   private class ExitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Close the database connection.
            employeeInserter.close();
         }
         catch (SQLException ex)
         {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
         
         // Exit the application.
         System.exit(0);
      }
   }
   
   /**
      The main method
    */
   
   public static void main(String[] args)
   {
      InsertEmployee insertemployee = new InsertEmployee();
   }
}