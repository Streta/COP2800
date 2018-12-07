import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Monthly Sales Tax programming challenge.
*/

public class SalesTax extends JFrame
{
   private JPanel panel;            // A panel to hold everything
   private JTextField totalSales;   // To get total sales
   private JButton calcButton;      // Calculates everything

   // Constants for tax rates
   private final double COUNTY_RATE = 0.02;
   private final double STATE_RATE = 0.04;

   // Constants for window size
   private final int WINDOW_WIDTH = 360;
   private final int WINDOW_HEIGHT = 100;

   /**
      Constructor
   */

   public SalesTax()
   {
      // Set the title.
      setTitle("Monthly Sales Tax Reporter");

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel that contains the other components.
      buildPanel();

      // Add the panel to the content pane.
      add(panel);

      // Size and display the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setVisible(true);
   }

   /**
      The buildPanel method creates a panel containing
      other components.
   */

   private void buildPanel()
   {
      // Create a label prompting for the total sales.
      JLabel totalSalesMsg =
                new JLabel("Enter the total sales:");

      // Create a text field for total sales.
      totalSales = new JTextField(10);

      // Create a button to click.
      calcButton = new JButton("Calculate Sales Tax");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a panel.
      panel = new JPanel();

      // Add the label, text field, and button to the panel.
      panel.add(totalSalesMsg);
      panel.add(totalSales);
      panel.add(calcButton);

   }

   /**
      CalcButtonListener is an action listener class for the
      calcbutton component.
   */

   private class CalcButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         double totalSalesAmount,
                countyTaxAmount,
                stateTaxAmount,
                totalTaxAmount;

         // Get the total sales.
         totalSalesAmount = Double.parseDouble(totalSales.getText());

         // Calculate the county tax.
         countyTaxAmount = totalSalesAmount * COUNTY_RATE;

         // Calculate the state tax.
         stateTaxAmount = totalSalesAmount * STATE_RATE;

         // Calculate the total sales.
         totalTaxAmount = countyTaxAmount + stateTaxAmount;

         // Display the results.
         JOptionPane.showMessageDialog(null, String.format(
                                       "County Sales Tax: $%,.2f\n" +
                                       "State Sales Tax: $%,.2f\n" +
                                       "Total Sales Tax: $%,.2f",
                                       countyTaxAmount,stateTaxAmount,
                                       totalTaxAmount));
      }
   }

   /**
      The main method creates an instance of the SalesTax
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      SalesTax stw = new SalesTax();
   }
}
