import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Theater Revenue programming challenge.
*/

public class TheaterRevenue extends JFrame
{
   private DataPanel dataPanel;                    // A panel to hold labels and text fields
   private JPanel buttonPanel;                     // A panel for the buttons
   private JButton calcButton;                     // Calculates everything
   private JButton resetButton;                    // Resets everything
   private final double MOVIE_CO_PERCENTAGE = 0.2; // Percentage to pay movie co.

   /**
      Constructor
   */

   public TheaterRevenue()
   {
      // Display a title.
      setTitle("Theater Revenue");

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a DataPanel object.
      dataPanel = new DataPanel();

      // Build the panel that contains the buttons.
      buildButtonPanel();

      // Add the panel to the content pane.
      add(dataPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildButtonPanel method creates a panel
      containing buttons.
   */

   private void buildButtonPanel()
   {
      // Create a button to calculate the expenses & reimbursement.
      calcButton = new JButton("Calculate Revenue");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a button to reset everything.
      resetButton = new JButton("Reset");

      // Add an action listener to the button.
      resetButton.addActionListener(new ResetButtonListener());

      // Put the buttons in their own panel.
      buttonPanel = new JPanel();
      buttonPanel.add(resetButton);
      buttonPanel.add(calcButton);
   }

   /**
      CalcButtonListener is an action listener class for the
      calcButton component.
   */

   private class CalcButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         double grossAdult;   // Gross adult ticket revenue
         double netAdult;     // Net adult ticket revenue
         double grossChild;   // Gross child ticket revenue
         double netChild;     // Net child ticket revenu
         double totalGross;   // Total gross revenue
         double totalNet;     // Total net revenue
         String msg;          // To hold a message

         // Calculate gross and net adult ticket revenue.
         grossAdult = dataPanel.getAdultPrice() * dataPanel.getAdultSold();
         netAdult = grossAdult - (grossAdult * MOVIE_CO_PERCENTAGE);

         // Calculate gross and net child ticket revenue.
         grossChild = dataPanel.getChildPrice() * dataPanel.getChildSold();
         netChild = grossChild - (grossChild * MOVIE_CO_PERCENTAGE);

         // Calculate the total gross revenue.
         totalGross = grossAdult + grossChild;

         // Calculate the total net revenue.
         totalNet = netAdult + netChild;

         // Create the message to display.
         msg = String.format(
               "Gross revenue for adult tickets sold: $%,.2f\n" +
               "Net revenue for adult tickets sold $%,.2f\n" +
               "Gross revenue for child tickets sold: $%,.2f\n" +
               "Net revenue for child tickets sold $%,.2f\n" +
               "Total gross revenue: $%,.2f\n" +
               "Total net revenue: $%,.2f",
               grossAdult, netAdult, grossChild,
               netChild, totalGross, totalNet);

         // Display the message.
         JOptionPane.showMessageDialog(null, msg);
      }
   } // End of inner class

   /**
      ResetButtonListener is an action listener class for the
      resetButton component.
   */

   private class ResetButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         dataPanel.reset();
      }
   } // End of inner class

   /**
      The main method creates an instance of the TheaterRevenue
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      TheaterRevenue tr = new TheaterRevenue();
   }
}