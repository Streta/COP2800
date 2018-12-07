import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   The SkateboardPartsPanel class stores data about skateboard
    parts for the Skateboard Designer programming challenge.
*/

public class SkateboardPartsPanel extends JPanel
{
   // Strings to populate our list components
   private String[] decks =  {"The Master Thrasher $60",
                              "The Dictator        $45",
                              "The Street King     $50" };
                              
   private String[] trucks = {"7.75 inch axle  $35",
                              "8 inch axle     $40",
                              "8.5 inch axle   $45" };
                              
   private String[] wheels = {"51mm  $20",
                              "55mm  $22",
                              "58mm  $24",
                              "61mm  $28" };
                              
   private String[] misc = {"Grip Tape        $10",
                            "Bearings         $30",
                            "Riser Pads       $2",
                            "Nuts & Bolts Kit $3" };
   
   // We will need some other nested panels to place
   // the list components.
   private JPanel deckPanel;
   private JPanel truckPanel;
   private JPanel wheelPanel;
   private JPanel miscPanel;
   
   // List components
   private JList deckList;    // To display decks
   private JList truckList;   // To display trucks
   private JList wheelList;   // To display wheels
   private JList miscList;    // To display misc parts
   
   /**
      Constructor
   */
   
   public SkateboardPartsPanel()
   {
      // Build the deck panel.
      buildDeckPanel();
      
      // Build the truck panel.
      buildTruckPanel();

      // Build the wheel panel.
      buildWheelPanel();

      // Build the misc panel.
      buildMiscPanel();
      
      // Make a layout manager for this panel.
      setLayout(new GridLayout(1, 4));
      
      // Add the panels to this panel.
      add(deckPanel);
      add(truckPanel);
      add(wheelPanel);
      add(miscPanel);
   }
   
   /**
      The buildDeckPanel method builds a panel allowing the user
      to select a deck from a list.
   */
      
   private void buildDeckPanel()
   {
      // Create a label prompting the user to select a deck.
      JLabel deckMsg = new JLabel("Select a Deck.");
      
      // Create the deck list component.
      deckList = new JList(decks);
      
      // Put a border around the list.
      deckList.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      // Create the deck panel.
      deckPanel = new JPanel();

      // Create a GridLayout manager.
      deckPanel.setLayout(new BorderLayout());
      
      // Put the components in the panel.
      deckPanel.add(deckMsg, BorderLayout.NORTH);
      deckPanel.add(deckList, BorderLayout.CENTER);
      
      // Draw a border around the panel.
      deckPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
   }

   /**
      The buildTruckPanel method builds a panel allowing the user
      to select a set of skateboard trucks from a list.
   */
   
   private void buildTruckPanel()
   {
      // Create a label prompting the user to select
      // a truck assembly.
      JLabel truckMsg = new JLabel("Select a truck assembly.");
      
      // Create the truck list component.
      truckList = new JList(trucks);

      // Put a border around the list.
      truckList.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      // Create the truck panel.
      truckPanel = new JPanel();

      // Create a GridLayout manager.
      truckPanel.setLayout(new BorderLayout());
      
      // Put the components in the panel.
      truckPanel.add(truckMsg, BorderLayout.NORTH);
      truckPanel.add(truckList, BorderLayout.CENTER);
   
      // Draw a border around the panel.
      truckPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
   }
   
   /**
      The buildWheelPanel method builds a panel allowing the user
      to select a set of wheels from a list.
   */
   
   private void buildWheelPanel()
   {
      // Create a label prompting the user to select
      // wheels.
      JLabel wheelMsg = new JLabel("Select wheels.");
      
      // Create the wheel list component.
      wheelList = new JList(wheels);

      // Put a border around the list.
      wheelList.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      // Create the wheel panel.
      wheelPanel = new JPanel();

      // Create a GridLayout manager.
      wheelPanel.setLayout(new BorderLayout());
      
      // Put the components in the panel.
      wheelPanel.add(wheelMsg, BorderLayout.NORTH);
      wheelPanel.add(wheelList, BorderLayout.CENTER);
      
      // Draw a border around the panel.
      wheelPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
   }

   /**
      The buildMiscPanel method builds a panel allowing the user
      to select miscellaneous parts.
   */
   
   private void buildMiscPanel()
   {
      // Create a label identifying the list component.
      JLabel miscMsg = new JLabel("Miscellaneous.");
      
      // Create the misc list component.
      miscList = new JList(misc);
      
      // Put a border around the list.
      miscList.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      // This list must use multiple interval selection mode.
      miscList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

      // Create the misc panel.
      miscPanel = new JPanel();

      // Create a GridLayout manager.
      miscPanel.setLayout(new BorderLayout());
      
      // Put the components in the panel.
      miscPanel.add(miscMsg, BorderLayout.NORTH);
      miscPanel.add(miscList, BorderLayout.CENTER);
      
      // Draw a border around the panel.
      miscPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));

   }

   /**
      The getDeckPrice method returns the price of the
      selected deck.
      @return The selected deck price.
   */
   
   public double getDeckPrice()
   {
      String selectedDeck = (String) deckList.getSelectedValue();
      double deckPrice = 0.0;
      
      if (selectedDeck == null)
         deckPrice = 0.0;
      else if (selectedDeck.equals("The Master Thrasher $60"))
         deckPrice = 60.0;
      else if (selectedDeck.equals("The Dictator        $45"))
         deckPrice = 45.0;
      else if (selectedDeck.equals("The Street King     $50"))
         deckPrice = 50.0;

      return deckPrice;
   }

   /**
      The getWheelPrice method returns the price of the
      selected wheels.
      @return The selected wheel price.
   */
      
   public double getWheelPrice()
   {
      String selectedWheel = (String) wheelList.getSelectedValue();
      double wheelPrice = 0.0;
      
      if (selectedWheel == null)
         wheelPrice = 0.0;
      else if (selectedWheel.equals("51mm  $20"))
         wheelPrice = 20.0;
      else if (selectedWheel.equals("55mm  $22"))
         wheelPrice = 22.0;
      else if (selectedWheel.equals("58mm  $24"))
         wheelPrice = 24.0;
      else if (selectedWheel.equals("61mm  $28"))
         wheelPrice = 28.0;

      return wheelPrice;
   }

   /**
      The getTruckPrice method returns the price of the
      selected trucks.
      @return The selected truck price.
   */
      
   public double getTruckPrice()
   {
      String selectedTruck = (String) truckList.getSelectedValue();
      double truckPrice = 0.0;
      
      if (selectedTruck == null)
         truckPrice = 0.0;
      else if (selectedTruck.equals("7.75 inch axle  $35"))
         truckPrice = 35.0;
      else if (selectedTruck.equals("8 inch axle     $40"))
         truckPrice = 40.0;
      else if (selectedTruck.equals("8.5 inch axle   $45"))
         truckPrice = 45.0;

      return truckPrice;
   }
   
   /**
      The getMiscPrice method returns the price of the
      selected miscellaneous parts.
      @return The selected miscellaneous part price.
   */
      
   public double getMiscPrice()
   {
      int[] indices = miscList.getSelectedIndices();
      double miscPrice = 0.0;
      
      for (int i = 0; i < indices.length; i++)
      {
         switch(indices[i])
         {
            case 0 : miscPrice += 10.0;
                     break;
            case 1 : miscPrice += 30.0;
                     break;
            case 2 : miscPrice += 2.0;
                     break;
            case 3 : miscPrice += 3.0;
         }
      }
      return miscPrice;
   }
}
