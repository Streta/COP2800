import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
   This program demonstrates a solution to the
   Card Dealer programming challenge.
*/

public class CardDealer extends JFrame
{
   private final int WINDOW_WIDTH = 380;  // Window width
   private final int WINDOW_HEIGHT = 320; // Window height
   
   private JPanel deckPanel;        // A panel to hold a label
   private JPanel cardPanel;        // A panel to hold a label
   private JPanel buttonPanel;      // A panel to hold a button
   private JLabel deckLabel;        // A label to hold an image
   private JLabel cardLabel;        // A label to hold an image
   private ImageIcon deckImage;     // To hold a deck image
   private ImageIcon cardImage;     // To hold a card image
   private JButton button;          // A button to get a card from the deck
   private Container contentPane;   // To reference the content pane
   
   private ArrayList<ImageIcon> cardImageList;  // To hold the card images.

   /**
      Constructor
   */
   
   public CardDealer()
   {
      // Set the title.
      setTitle("Card Dealer");
   
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create a BorderLayout manager for the content pane.
      setLayout(new BorderLayout());
       
      // Build the cardImageList
      buildCardImageList();

      // Build the panels.
      buildDeckPanel();
      buildButtonPanel();
      buildCardPanel();

      // Add the panels to the content pane.
      add(deckPanel, BorderLayout.WEST);
      add(cardPanel, BorderLayout.EAST);
      add(buttonPanel, BorderLayout.SOUTH);

      // Display the window.
      setVisible(true);
   }

   /**
      The buildDeckPanel method adds a label
      to a panel that displays an image of 
      a deck of cards.
   */

   private void buildDeckPanel()
   {
      // Create a panel.
      deckPanel = new JPanel();

      // Create an image icon to represent the deck of cards.
      deckImage = new ImageIcon("Cards\\Backface_Blue.jpg");

      // Create a label using the image for the deck of cards.
      deckLabel = new JLabel(deckImage);

      // Add the label to the panel.
      deckPanel.add(deckLabel);
   }

   /**
      The buildCardPanel method adds an empty label
      to a panel initially, but this label will be
      used to display a card from the deck once the
      user clicks the button.
   */

   private void buildCardPanel()
   {
      // Create a panel.
      cardPanel = new JPanel();

      // Create a label.
      cardLabel = new JLabel();

      // Add the label to the panel.
      cardPanel.add(cardLabel);
   }
  
   /**
      The buildButtonPanel method adds a button
      to a panel.
   */

   private void buildButtonPanel()
   {
      // Create a panel.
      buttonPanel = new JPanel();
   
      // Create a button.
      button = new JButton("Deal a Card");
      button.setMnemonic(KeyEvent.VK_D);
      button.setToolTipText("Click here to deal a card.");
      
      // Register an action listener with the button.
      button.addActionListener(new ButtonListener());
      
      // Add the button to the panel.
      buttonPanel.add(button);
   }


   /**
      The buildCardImageList method fills the 
      ArrayList with images of a deck of 
      poker cards.
   */

   private void buildCardImageList()
   {
      // Create the cardImageList ArrayList 
      // to hold the ImageIcon objects.
      cardImageList = new ArrayList<>();
      
      // Add the ImageIcon objects to the cardImageList ArrayList
      cardImageList.add(new ImageIcon("Cards\\2_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\2_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\2_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\2_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\3_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\3_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\3_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\3_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\4_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\4_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\4_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\4_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\5_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\5_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\5_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\5_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\6_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\6_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\6_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\6_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\7_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\7_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\7_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\7_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\8_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\8_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\8_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\8_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\9_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\9_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\9_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\9_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\10_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\10_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\10_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\10_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\Jack_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Jack_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Jack_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Jack_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\Queen_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Queen_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Queen_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Queen_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\King_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\King_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\King_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\King_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\Ace_Clubs.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Ace_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Ace_Hearts.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Ace_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("Cards\\Joker_Black.jpg"));
      cardImageList.add(new ImageIcon("Cards\\Joker_Red.jpg"));                                                      
   }
  
   /**
      Private inner class that handles the event when
      the user clicks the button.
   */
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Determine if there are still card 
         // images left in the array list.
         if(cardImageList.size() != 0)
         {  
            // Create a reference to a Random object.
            Random rand = new Random();
   
            // Generate a random number between 0 and the 
            // number of card images left in the array list,
            // and store the value in the index variable.
            int index = rand.nextInt(cardImageList.size());
   
            // Get a card image from the array list using
            // the index value that was generated randomly.
            cardImage = cardImageList.get(index);
            
            // Display the card image.
            cardLabel.setIcon(cardImage);
   
            // Remove the card image from the array list.
            cardImageList.remove(index);
         }
         else
         {
            // Remove the card image representing the deck of cards.
            deckLabel.setIcon(null);
            
            // Display a message indicating that there are no more 
            // cards left in the deck.
            JOptionPane.showMessageDialog(null, "There are " + 
                        "no more cards are left in the deck.");
         }
      }
   }

   /**
      The main method creates an instance of the CardDealer
      class, causing it to display its window.
   */
     
   public static void main(String[] args)
   {
      CardDealer cd = new CardDealer();
   }
}
