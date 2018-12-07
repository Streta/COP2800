import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Retail Price Calculator programming challenge.
*/

public class RetailPriceCalculator extends JFrame
{
   // Components
   private JPanel panel;
   private JTextField wholesale;
   private JTextField markupPercent;
   private JButton calcButton;

   // Constants for the window size
   private final int WINDOW_WIDTH = 360;
   private final int WINDOW_HEIGHT = 130;

   /**
      Constructor
   */

   public RetailPriceCalculator()
   {
      // Set the title.
      setTitle("Retail Price Calculator");

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
      // Create labels to display instructions.
      JLabel message1 =
               new JLabel("Enter the wholesale cost:");
      JLabel message2 =
               new JLabel("Enter the markup percentage:");

      // Create text fields for the wholesale cost and
      // the markup percentage.
      wholesale = new JTextField(10);
      markupPercent = new JTextField(10);

      // Create a button to click.
      calcButton = new JButton("Calculate Retail Price");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a panel.
      panel = new JPanel();

      // Add the labels, text fields, and button to the panel.
      panel.add(message1);
      panel.add(wholesale);
      panel.add(message2);
      panel.add(markupPercent);
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
      */

      public void actionPerformed(ActionEvent e)
      {
         double wholesaleCost, markupPct, retail;

         // Get the wholesale cost.
         wholesaleCost = Double.parseDouble(wholesale.getText());

         // Get the markup percentage.
         markupPct = Double.parseDouble(markupPercent.getText());

         // Calculate the retail price.
         retail = wholesaleCost + (wholesaleCost * markupPct);

         // Display the result.
         JOptionPane.showMessageDialog(null, String.format(
                                       "The retail price is $%,.2f",
                                       retail));
      }
   }

   /**
      The main method creates an instance of the RetailPriceCalculator
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      RetailPriceCalculator rpc = new RetailPriceCalculator();
   }
}
