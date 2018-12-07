import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program demonstrates a solution to the
   Dorm and Meal Plan Calculator programming challenge.
*/

public class DormAndMealPlanCalc extends JFrame
{
   // Array with dorm names
   private String[] dormNames = { "Allen Hall",
                                  "Pike Hall",
                                  "Farthing Hall",
                                  "University Suites" };

   // Array with meal plan descriptions
   private String[] mealPlans = { "7 meals per week",
                                  "14 meals per week",
                                  "Unlimited meals per week" };

   private JComboBox dormCombo;  // Combo box to display dorms
   private JComboBox mealCombo;  // Combo box to display meal plans

   private JButton calcButton;   // To calculate prices
   private JButton exitButton;   // To exit the application

   private JPanel dormPanel;     // Panel for dorm combo box
   private JPanel mealPanel;     // Panel for meal combo box
   private JPanel buttonPanel;   // Panel for the buttons

   /**
      Constructor
   */

   public DormAndMealPlanCalc()
   {
      // Display a title.
      setTitle("Dorm and Meal Plan Calculator");

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the dorm panel.
      buildDormPanel();

      // Build the meal plan panel.
      buildMealPanel();

      // Build the button panel.
      buildButtonPanel();

      // Add the panels to the content pane.
      add(dormPanel, BorderLayout.NORTH);
      add(mealPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildDormPanel method builds a panel allowing the user
      to select a dorm from a combo box.
   */

   private void buildDormPanel()
   {
      // Create a label prompting the user to select a dorm.
      JLabel dormMsg = new JLabel("Select a Dorm.");

      // Create the dorm combo box.
      dormCombo = new JComboBox(dormNames);

      // Put the components in a panel.
      dormPanel = new JPanel();
      dormPanel.add(dormMsg);
      dormPanel.add(dormCombo);
   }

   /**
      The buildMealPanel method builds a panel allowing the user
      to select a meal plan from a combo box.
   */

   private void buildMealPanel()
   {
      // Create a label prompting the user to select a meal plan.
      JLabel mealMsg = new JLabel("Select a Meal Plan.");

      // Create the meal plan combo box.
      mealCombo = new JComboBox(mealPlans);

      // Put the components in a panel.
      mealPanel = new JPanel();
      mealPanel.add(mealMsg);
      mealPanel.add(mealCombo);
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
         String selectedDorm;       // To hold the selected dorm
         String selectedMealPlan;   // To hold the selected meal plan
         double dormCharges;        // Dorm charges
         double mealCharges;        // Meal plan charges
         double totalCharges;       // Total charges

         // Get the dorm charge.
         selectedDorm = dormNames[dormCombo.getSelectedIndex()];
         if (selectedDorm.equals("Allen Hall"))
            dormCharges = 1500.0;
         else if (selectedDorm.equals("Pike Hall"))
            dormCharges = 1600.0;
         else if (selectedDorm.equals("Farthing Hall"))
            dormCharges = 1200.0;
         else if (selectedDorm.equals("University Suites"))
            dormCharges = 1800.0;
         else
            dormCharges = 0.0;

         // Get the meal plan charge.
         selectedMealPlan = mealPlans[mealCombo.getSelectedIndex()];
         if (selectedMealPlan.equals("7 meals per week"))
            mealCharges = 560.0;
         else if (selectedMealPlan.equals("14 meals per week"))
            mealCharges = 1095.0;
         else if (selectedMealPlan.equals("Unlimited meals per week"))
            mealCharges = 1500.0;
         else
            mealCharges = 0.0;

         // Get the total charges
         totalCharges = dormCharges + mealCharges;

         // Display the message.
         JOptionPane.showMessageDialog(null, String.format(
                                       "Total Charges per Semester: $%,.2f",
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
      The main method creates an instance of the DormAndMealPlanCalc
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      DormAndMealPlanCalc dmp = new DormAndMealPlanCalc();
   }
}
