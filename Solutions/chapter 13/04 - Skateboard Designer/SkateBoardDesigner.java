import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program demonstrates a solution to the
   Skateboard Designer programming challenge.
*/

public class SkateBoardDesigner extends JFrame
{
   private JLabel banner;                    // To display a banner
   private SkateboardPartsPanel partsPanel;  // To hold various list components
   private JPanel bannerPanel, buttonPanel;  // To hold the banner and buttons
   private JButton calcButton;               // To calculate total charges
   private JButton exitButton;               // To exit the application

   public SkateBoardDesigner()
   {
      // Display a title.
      setTitle("Skateboard Designer");

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the banner on a panel.
      bannerPanel = new JPanel();
      bannerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
      banner = new JLabel("Skateboard Designer");
      banner.setFont(new Font("SanSerif", Font.BOLD, 24));
      bannerPanel.add(banner);

      // Create a parts panel.
      partsPanel = new SkateboardPartsPanel();

      // Build the button panel.
      buildButtonPanel();

      // Add the banner and panels to the content pane.
      add(bannerPanel, BorderLayout.NORTH);
      add(partsPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildButtonPanel method builds a panel with calculate
      and exit buttons.
   */

   private void buildButtonPanel()
   {
      // Create a button to calculate the charges.
      calcButton = new JButton("Calculate Charges");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a button to exit the application.
      exitButton = new JButton("Exit");

      // Add an action listener to the button.
      exitButton.addActionListener(new ExitButtonListener());

      // Put the buttons in their own panel.
      buttonPanel = new JPanel();
      buttonPanel.add(calcButton);
      buttonPanel.add(exitButton);
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
         double totalCharges;       // Total charges

         // Get the total charges.
         totalCharges = partsPanel.getDeckPrice() + partsPanel.getWheelPrice() +
                        partsPanel.getTruckPrice() + partsPanel.getMiscPrice();

         // Display the message.
         JOptionPane.showMessageDialog(null, String.format(
                                       "Total Charges: $%,.2f",
                                       totalCharges));
      }
   } // End of inner class

   /**
      ExitButtonListener is an action listener class for the
      exitButton component.
   */

   private class ExitButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   } // End of inner class

   /**
      The main method creates an instance of the SkateBoardDesigner
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      SkateBoardDesigner sd = new SkateBoardDesigner();
   }
}
