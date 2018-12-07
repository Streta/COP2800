import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Property Tax programming challenge.
*/

public class PropertyTax extends JFrame
{
   private JPanel panel;            // A panel to hold everything
   private JTextField propValue;    // To get the property value
   private JButton calcButton;      // Calculates everything

   // Constants for tax rates
   private final double ASSESSMENT_RATE = 0.6;
   private final double TAXES_PER_HUNDRED = 0.64;

   // Constants for window size
   private final int WINDOW_WIDTH = 360;
   private final int WINDOW_HEIGHT = 100;

   /**
      Constructor
   */

   public PropertyTax()
   {
      // Set the title.
      setTitle("Property Taxes");

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
      JLabel propValueMsg =
            new JLabel("Enter the actual property value:");

      // Create a text field for total sales.
      propValue = new JTextField(10);

      // Create a button to click.
      calcButton = new JButton("Calculate Property Tax");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a panel.
      panel = new JPanel();

      // Add the label, text field, and button to the panel.
      panel.add(propValueMsg);
      panel.add(propValue);
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
         double actualValue;
         double assessmentValue;
         double tax;

         // Get the actual property value.
         actualValue = Double.parseDouble(propValue.getText());

         // Calculate the assessment value.
         assessmentValue = actualValue * ASSESSMENT_RATE;

         // Calculate the property tax.
         tax = (assessmentValue / 100.0) * TAXES_PER_HUNDRED;

         // Display the results.
         JOptionPane.showMessageDialog(null, String.format(
                                       "Assessment Value: $%,.2f\n" +
                                       "Property Tax: $%,.2f",
                                       assessmentValue, tax));
      }
   }

   /**
      The main method creates an instance of the PropertyTax
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      PropertyTax pt = new PropertyTax();
   }
}
