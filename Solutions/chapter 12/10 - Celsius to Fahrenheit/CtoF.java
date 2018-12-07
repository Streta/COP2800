import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Celsius to Fahrenheit programming challenge.
*/

public class CtoF extends JFrame
{
   private JPanel panel;            // A panel to hold everything
   private JTextField celsiusInput; // To get the Celsius temperature
   private JButton calcButton;      // Calculates everything

   // Constants for window size
   private final int WINDOW_WIDTH = 360;
   private final int WINDOW_HEIGHT = 100;

   /**
      Constructor
   */

   public CtoF()
   {
      // Set the title.
      setTitle("Celsius to Fahrenheit");

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
      JLabel celsiusMsg =
            new JLabel("Enter the Celsius temperature:");

      // Create a text field for total sales.
      celsiusInput = new JTextField(10);

      // Create a button to click.
      calcButton = new JButton("Calculate Fahrenheit");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a panel.
      panel = new JPanel();

      // Add the label, text field, and button to the panel.
      panel.add(celsiusMsg);
      panel.add(celsiusInput);
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
         double celsius;
         double fahrenheit;

         // Get the Celsius temperature
         celsius = Double.parseDouble(celsiusInput.getText());

         // Calculate the Fahrenheit temperature.
         fahrenheit = (9.0 / 5.0) * celsius + 32;

         // Display the results.
         JOptionPane.showMessageDialog(null, String.format(
                                       "Fahrenheit: %,.1f degrees",
                                       fahrenheit));
      }
   }

   /**
      The main method creates an instance of the CtoF
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      new CtoF();
   }
}
