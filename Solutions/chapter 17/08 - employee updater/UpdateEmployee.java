import java.sql.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Employee Updater programming challenge.
*/

public class UpdateEmployee extends JFrame
{
   JPanel employeeIDPanel;          // Panel for employee IDs
   JPanel employeeInfoPanel;        // Panel for employee information
   JPanel buttonPanel;              // Panel for buttons
   JList employeeIDList;            // List for employee IDs
   JTextField nameTextField;        // Text Field for employee name
   JTextField positionTextField;    // Text Field for employee position
   JTextField payRateTextField;     // Text Field for employee pay rate

   /**
      Constructor
    */

   public UpdateEmployee()
   {
      // Set the window title.
      setTitle("Update Employee");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the EmployeeIDPanel object.
      buildEmployeeIDPanel();

      // Build the EmployeeInfoPanel object.
      buildEmployeeInfoPanel();

      // Build the ButtonPanel object.
      buildButtonPanel();

      // create a BorderLayout manager.
      setLayout(new BorderLayout());

      // Add the panels to the content pane.
      add(employeeIDPanel, BorderLayout.NORTH);
      add(employeeInfoPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildEmployeeIDPanel method builds
      a panel for the employee ID List.
    */

   public void buildEmployeeIDPanel()
   {
      try
      {
         // Create the JPanel.
         employeeIDPanel = new JPanel();

         String[] employeeIDs = null; // To hold employee IDs.

         // Create an EmployeeTableManager object.
         EmployeeTableManager etManager = new EmployeeTableManager();

         // Get a list of employee IDs as a String array.
         employeeIDs = etManager.getEmployeeIDs();

         // Create a JList object to hold the employee
         // IDs and add a list selection listener.
         employeeIDList = new JList(employeeIDs);
         employeeIDList.addListSelectionListener(new ListListener());

         // Set the number of visible rows.
         employeeIDList.setVisibleRowCount(5);

         // Put the JList object in a scroll pane.
         JScrollPane scrollPane = new JScrollPane(employeeIDList);

         // Add the scroll pane to the panel.
         employeeIDPanel.add(scrollPane);

         // Add a titled border around the panel.
         employeeIDPanel.setBorder
            (BorderFactory.createTitledBorder
               ("Select an Employee ID"));
      }
      catch (SQLException ex)
      {
         ex.printStackTrace();
         System.exit(0);
      }
   }

   /**
      The buildEmployeeInfoPanel method builds a panel for
      the employee information Labels and Text Fields.
    */

   public void buildEmployeeInfoPanel()
   {
      // Create the JPanel.
      employeeInfoPanel = new JPanel();

      // Create labels and text fields
      // for the customer information.
      JLabel namePrompt = new JLabel("Name");
      nameTextField = new JTextField(25);

      JLabel positionPrompt = new JLabel("Position");
      positionTextField = new JTextField(30);

      JLabel payRatePrompt = new JLabel("Hourly Pay Rate");
      payRateTextField = new JTextField(12);

      // Create a grid layout manager
      // with 6 rows and 1 column.
      employeeInfoPanel.setLayout
         (new GridLayout(6, 1));

      // Add a titled border around the panel.
      employeeInfoPanel.setBorder
         (BorderFactory.createTitledBorder
         ("Update Values"));

      // Add the labels and text fields
      // to the panel.
      employeeInfoPanel.add(namePrompt);
      employeeInfoPanel.add(nameTextField);

      employeeInfoPanel.add(positionPrompt);
      employeeInfoPanel.add(positionTextField);

      employeeInfoPanel.add(payRatePrompt);
      employeeInfoPanel.add(payRateTextField);
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
            // Get the selected employee ID.
            String empID = (String) employeeIDList.getSelectedValue();

            // Create a new EmployeeTableManager object.
            EmployeeTableManager etManager = new EmployeeTableManager();

            // Get the employee information from the Employee
            // table using the selected employeeID.
            String name = etManager.getName(empID);
            String position = etManager.getPosition(empID);
            String payRate = Double.toString(etManager.getPayRate(empID));

            // Display the employee information in
            // the text fields.
            nameTextField.setText(name);
            positionTextField.setText(position);
            payRateTextField.setText(payRate);;
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
            // Get the selected employee ID.
            String empID = (String) employeeIDList.getSelectedValue();

            // Get the employee information values from the text fields.
            String name = nameTextField.getText();
            String position = positionTextField.getText();
            double payRate = Double.parseDouble(payRateTextField.getText());

            // Create a new EmployeeTableManager object.
            EmployeeTableManager etManager = new EmployeeTableManager();

            // Update the customer information.
            etManager.updateName(empID, name);
            etManager.updatePosition(empID, position);
            etManager.updatePayRate(empID, payRate);
         }
         catch (SQLException ex)
         {
            ex.printStackTrace();
            System.exit(0);
         }

         // Clear the list selection and text fields.
         employeeIDList.clearSelection();
         nameTextField.setText("");
         positionTextField.setText("");
         payRateTextField.setText("");

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
      // Create an instance of the UpdateEmployee class.
      UpdateEmployee updateEmployee = new UpdateEmployee();
   }
}