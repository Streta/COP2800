import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   DrinkMachine Applet programming challenge.
*/

public class DrinkMachine extends JApplet
{
   private final int STARTING_INVENTORY = 20;            // Starting inventory
   private final double PRICE = 0.75;                    // Drink price
   private int colaInventory = STARTING_INVENTORY;       // Cola inventory
   private int lemonLimeInventory = STARTING_INVENTORY;  // Lemon lime inventory
   private int grapeInventory = STARTING_INVENTORY;      // Grape soda inventory
   private int rootBeerInventory = STARTING_INVENTORY;   // Root beer inventory
   private int waterInventory = STARTING_INVENTORY;      // Water inventory

   private JPanel buttonPanel;   // A panel to hold the soda buttons
   private JPanel moneyPanel;    // A panel to hold the text field for amount tendered

   private JButton colaButton;         // A button to select cola
   private JButton lemonLimeButton;    // A button to select lemon lime
   private JButton grapeButton;        // A button to select grape soda
   private JButton rootBeerButton;     // A button to select root beer
   private JButton waterButton;        // A button to select water

   private JTextField amountTendered;  // The amount tendered
   private JLabel banner;              // To hold a banner
   private Container contentPane;      // To reference the content pane

   /**
      init method
   */

   public void init()
   {
      // Build the button panel.
      buildButtonPanel();

      // Build the money panel.
      buildMoneyPanel();

      // Create a label with an banner.
      banner = new JLabel("Soft Drinks .75 Each");
      banner.setFont(new Font("SansSerif", Font.BOLD, 24));

      // Add the panels and banner to the content pane.
      add(buttonPanel, BorderLayout.EAST);
      add(moneyPanel, BorderLayout.SOUTH);
      add(banner, BorderLayout.CENTER);
   }

   /**
      The buildButtonPanel method creates a panel containing
      the buttons for the different type of drinks.
   */

   private void buildButtonPanel()
   {
      // Create a panel.
      buttonPanel = new JPanel();

      // Create the buttons.
      colaButton = new JButton("Cola");
      lemonLimeButton = new JButton("Lemon Lime Soda");
      grapeButton = new JButton("Grape Soda");
      rootBeerButton = new JButton("Root Beer");
      waterButton = new JButton("Bottled Water");

      // Add action listeners
      colaButton.addActionListener(new ButtonListener());
      lemonLimeButton.addActionListener(new ButtonListener());
      grapeButton.addActionListener(new ButtonListener());
      rootBeerButton.addActionListener(new ButtonListener());
      waterButton.addActionListener(new ButtonListener());

      // Create a layout manager for the panel.
      buttonPanel.setLayout(new GridLayout(5, 1));

      // Add the buttons to the panel.
      buttonPanel.add(colaButton);
      buttonPanel.add(lemonLimeButton);
      buttonPanel.add(grapeButton);
      buttonPanel.add(rootBeerButton);
      buttonPanel.add(waterButton);
   }

   /**
      The buildPanel method creates a panel that allows the user
      to enter the amount of money tendered.
   */

   private void buildMoneyPanel()
   {
      // Create a panel.
      moneyPanel = new JPanel();

      // Create a label prompting the user
      // to enter the amount tendered.

      JLabel moneyMsg = new JLabel("Enter amount tendered:");

      // Create the text field.
      amountTendered = new JTextField(10);
      amountTendered.setText("0.00");

      // Add the components to the panel.
      moneyPanel.add(moneyMsg);
      moneyPanel.add(amountTendered);
   }

   /**
      ButtonListener class
      An inner class for handling button clicks
   */

   private class ButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         double amount = getAmountTendered();

         if (amount == 0.0 || amount < PRICE)
         {
            // Insufficient funds entered.
            JOptionPane.showMessageDialog(null, "Enter a sufficent amount of money.");
         }
         else
         {
            // Determine which button was pressed and dispense
            // the correct type of drink.
            if (e.getSource() == colaButton)
               dispenseCola(amount);
            else if (e.getSource() == lemonLimeButton)
               dispenseLemonLime(amount);
            else if (e.getSource() == grapeButton)
               dispenseGrape(amount);
            else if (e.getSource() == rootBeerButton)
               dispenseRootBeer(amount);
            else
               dispenseWater(amount);

            amountTendered.setText("0.00");
         }
      }

      /**
         The getAmountTendered method returns the amount
         of money entered.
         @return The anoung of money entered.
      */

      private double getAmountTendered()
      {
         double amount;

         if (amountTendered.getText().length() == 0)
         {
            amount = 0.0;
            amountTendered.setText("0.00");
         }
         else
         {
             try
             {
               amount = Double.parseDouble(amountTendered.getText());
             }
             catch (Exception e)
             {
               amount = 0.0;
               amountTendered.setText("0.00");
             }
         }

         return amount;
      }

      /**
         The dispenseCola method dispenses a can of cola.
         @param amount The amount of money entered,
      */

      private void dispenseCola(double amount)
      {
         double change;

         if (colaInventory > 0)
         {
            change = amount - PRICE;
            colaInventory--;
            JOptionPane.showMessageDialog(null, String.format(
                                          "1 can of cola dispensed.\n" +
                                          "$%,.2f in change given back.",
                                          change));
         }
         else
         {
            JOptionPane.showMessageDialog(null, "OUT OF STOCK!");
         }
      }

      /**
         The dispenseLemonLime method  dispenses a can of lemon lime soda.
         @param amount The amount of money entered,
      */

      private void dispenseLemonLime(double amount)
      {
         double change;

         if (lemonLimeInventory > 0)
         {
            change = amount - PRICE;
            lemonLimeInventory--;
            JOptionPane.showMessageDialog(null, String.format(
                                          "1 can of lemon lime soda dispensed.\n" +
                                          "$%,.2f in change given back.",
                                          change));
         }
         else
         {
            JOptionPane.showMessageDialog(null, "OUT OF STOCK!");
         }
      }

      /**
         The dispenseGrape method  dispenses a can of grape soda.
         @param amount The amount of money entered,
      */

      private void dispenseGrape(double amount)
      {
         double change;

         if (grapeInventory > 0)
         {
            change = amount - PRICE;
            grapeInventory--;
            JOptionPane.showMessageDialog(null, String.format(
                                          "1 can of grape soda dispensed.\n" +
                                          "$%,.2f in change given back.",
                                          change));
         }
         else
         {
            JOptionPane.showMessageDialog(null, "OUT OF STOCK!");
         }
      }

      /**
         The dispenseRootBeer method dispenses a can of root beer.
         @param amount The amount of money entered,
      */

      private void dispenseRootBeer(double amount)
      {
         double change;

         if (rootBeerInventory > 0)
         {
            change = amount - PRICE;
            rootBeerInventory--;
            JOptionPane.showMessageDialog(null, String.format(
                                          "1 can of root beer dispensed.\n" +
                                          "$%,.2f in change given back.",
                                          change));
         }
         else
         {
            JOptionPane.showMessageDialog(null, "OUT OF STOCK!");
         }
      }

      /**
         The dispenseWater method dispenses a bottle of water
         @param amount The amount of money entered,
      */

      private void dispenseWater(double amount)
      {
         double change;

         if (waterInventory > 0)
         {
            change = amount - PRICE;
            waterInventory--;
            JOptionPane.showMessageDialog(null, String.format(
                                          "1 can of bottled water dispensed.\n" +
                                          "$%,.2f in change given back.",
                                          change));
         }
         else
         {
            JOptionPane.showMessageDialog(null, "OUT OF STOCK!");
         }
      }
   }
}
