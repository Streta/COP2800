import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Latin Translator programming challenge.
*/

public class LatinTranslator extends JFrame
{
   private JPanel topPanel;         // Top panel
   private JPanel bottomPanel;      // Bottom panel
   private JLabel englishLabel;     // To hold the English word
   private JLabel messageLabel;     // To display a message
   private JButton sinisterButton;  // Displays translation of Sinister
   private JButton dexterButton;    // Displays translation of Dexter
   private JButton mediumButton;    // Displays translation of Medium
   
   // Constants for window size
   private final int WINDOW_WIDTH = 300;
   private final int WINDOW_HEIGHT = 120;
   
   /**
      Constructor
   */
   
   public LatinTranslator()
   {
      // Set the title.
      setTitle("Latin Translator");
      
      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Build the panels that contains the other components.
      buildPanels();
      
      // Add a layout manager.
      setLayout(new GridLayout(2, 1));
      
      // Add the panels to the content pane.
      add(topPanel);
      add(bottomPanel);
      
      // Size and display the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setVisible(true);
   }
   
   /**
      The buildPanels method builds the panels that contain
      other components.
   */
   
   private void buildPanels()
   {
      // Create a label to display a message.
      messageLabel = new JLabel("English Translation:");
      
      // Create a label to hold the English translation.
      englishLabel = new JLabel("");
      
      // Create the top panel.
      topPanel = new JPanel();
      
      // Add the labels to the top panel.
      topPanel.add(messageLabel);
      topPanel.add(englishLabel);
      
      // Create the buttons.
      sinisterButton = new JButton("Sinister");
      dexterButton = new JButton("Dexter");
      mediumButton = new JButton("Medium");
      
      // Add an action listener to each button.
      sinisterButton.addActionListener(new ButtonListener());
      dexterButton.addActionListener(new ButtonListener());
      mediumButton.addActionListener(new ButtonListener());
      
      // Create the bottom panel.
      bottomPanel = new JPanel();
      
      // Add the buttons to the bottom panel.
      bottomPanel.add(sinisterButton);
      bottomPanel.add(dexterButton);
      bottomPanel.add(mediumButton);
   }

   /**
      ButtonListener is an action listener class for the
      button components.
   */
   
   private class ButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */
      
      public void actionPerformed(ActionEvent e)
      {
         // Get the action command.
         String actionCommand = e.getActionCommand();
         
         // Translate the selected word.
         if (actionCommand.equals("Sinister"))
            englishLabel.setText("Left");
         else if (actionCommand.equals("Dexter"))
            englishLabel.setText("Right");
         else
            englishLabel.setText("Center");
      }
   }

   /**
      The main method creates an instance of the LatinTranslator
      class, causing it to display its window.
   */
   
   public static void main(String[] args)
   {
      new LatinTranslator();
   }
}