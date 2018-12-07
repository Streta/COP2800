import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   MPG Calculator programming challenge.
*/

public class MPGCalculator extends JFrame
{
   // Components
   private JPanel panel;
   private JTextField gallonsInput;
   private JTextField milesInput;
   private JButton calcButton;

   // Constants for the window size
   private final int WINDOW_WIDTH = 360;
   private final int WINDOW_HEIGHT = 130;

   /**
      Constructor
   */
   public MPGCalculator()
   {
      // Set the title.
      setTitle("Miles Per Gallon Calculator");

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
               new JLabel("Total number of gallons:");
      JLabel message2 =
               new JLabel("Number of miles driven:");

      // Create text fields for the gallons and miles.
      gallonsInput = new JTextField(10);
      milesInput = new JTextField(10);

      // Create a button to click.
      calcButton = new JButton("Calculate MPG");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a panel.
      panel = new JPanel();

      // Add the labels, text fields, and button to the panel.
      panel.add(message1);
      panel.add(gallonsInput);
      panel.add(message2);
      panel.add(milesInput);
      panel.add(calcButton);
   }

   /**
      CalcButtonListener is an action listener class for the
      calcButton component.
   */

   private class CalcButtonListener implements ActionListener
   {
      /**
         actionPerformed method
      */

      public void actionPerformed(ActionEvent e)
      {
         double gallons, miles, mpg;

         // Get the number of gallons.
         gallons = Double.parseDouble(gallonsInput.getText());

         // Get the miles driven.
         miles = Double.parseDouble(milesInput.getText());

         // Calculate the MPG.
         mpg = miles / gallons;

         // Display the result.
         JOptionPane.showMessageDialog(null, String.format(
                                       "You got %,.2f miles per gallon.",
                                       mpg));
      }
   }

   /**
      The main method creates an instance of the MPGCalculator
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      new MPGCalculator();
   }

}