import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program demonstrates a solution to the
   Conference Registration System programming challenge.
*/

public class ConferenceReg extends JFrame
{
   private JLabel banner;                 // To display a banner
   private RegPanel regPanel;             // To select type of registration
   private WorkshopPanel workshopPanel;   // To select workshops
   private JPanel bannerPanel;            // To hold a banner
   private JPanel buttonPanel;            // To hold the buttons
   private JButton calcButton;            // To calculate total charges
   private JButton exitButton;            // To exit the application

   /**
      Constructor
   */

   public ConferenceReg()
   {
      // Display a title.
      setTitle("Conference Registration System");

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the banner on a panel.
      bannerPanel = new JPanel();
      bannerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
      banner = new JLabel("Select Registration Options");
      banner.setFont(new Font("SanSerif", Font.BOLD, 18));
      bannerPanel.add(banner);

      // Create a RegPanel.
      regPanel = new RegPanel();

      // Create a WorkshopPanel.
      workshopPanel = new WorkshopPanel();

      // Build the button panel.
      buildButtonPanel();

      // Add the panels to the content pane.
      add(bannerPanel, BorderLayout.NORTH);
      add(regPanel, BorderLayout.WEST);
      add(workshopPanel, BorderLayout.EAST);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildButtonPanel method creates a panel containing
      calculate and exit buttons.
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
         double totalCharges; // Total charges

         // Get the total charges
         totalCharges = regPanel.getRegistrationCost() +
                         workshopPanel.getWorkshopCost();

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
      The main method creates an instance of the ConferenceReg
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      ConferenceReg crw = new ConferenceReg();
   }
}



