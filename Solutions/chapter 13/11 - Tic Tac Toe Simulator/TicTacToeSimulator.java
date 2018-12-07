import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
   This program demonstrates a solution to the
   Tic Tac Toe Simulator programming challenge.
*/

public class TicTacToeSimulator extends JFrame
{
   private final int WINDOW_WIDTH = 220;  // Window width
   private final int WINDOW_HEIGHT = 380; // Window height
   
   private final int ROWS = 3;            // Number of rows
   private final int COLS = 3;            // Number of columns
   private final int SIZE = ROWS * COLS;  // Array size
 
   int gameGrid[];
   
   private JPanel labelPanel;             // A panel to hold the labels
   private JPanel buttonPanel;            // A panel to hold the buttons
   private JLabel[] labels;               // An array of labels
   private JButton newGameButton;         // A button to create a new game
   private JButton exitButton;            // A button to exit the application 
   

   /**
      Constructor
   */
   
   public TicTacToeSimulator()
   {
      // Set the title.
      setTitle("Tic Tac Toe");
   
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create a GridLayout manager for the content pane.
      setLayout(new BorderLayout());

      // Build the panels.
      buildLabelPanel();
      buildButtonPanel();

      // Add the panels to the content pane.
      add(labelPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
      // Display the window.
      setVisible(true);
   }

   /**
      The buildLabelPanel method adds the labels
      to a panel that will display the tic tac toe
      grid.
   */

   private void buildLabelPanel()
   {
      // Create a panel.
      labelPanel = new JPanel();

      // Create an array to hold the labels.
      labels = new JLabel[SIZE];

      // Add the labels to the panel.
      for(int i = 0; i < SIZE; i++)
      {
         labels[i] = new JLabel();
         labels[i].setFont(new Font("Sans Serif", Font.BOLD, 72));
         labelPanel.add(labels[i]);
      }
   }
  
   /**
      The buildButtonPanel method adds buttons
      to a panel.
   */

   private void buildButtonPanel()
   {
      // Create a panel.
      buttonPanel = new JPanel();
   
      // Create a button.
      newGameButton = new JButton("New Game");
      newGameButton.setMnemonic(KeyEvent.VK_N);
      newGameButton.setToolTipText("Click here create a new game.");
      
      // Create a button.
      exitButton = new JButton("Exit");
      exitButton.setMnemonic(KeyEvent.VK_X);
      exitButton.setToolTipText("Click here to exit.");
            
      // Register an action listener with the button.
      newGameButton.addActionListener(new NewGameButtonListener());
      exitButton.addActionListener(new ExitButtonListener());     
      
      // Add the button to the panel.
      buttonPanel.add(newGameButton);
      buttonPanel.add(exitButton);     
   }

   /**
      The generateGameGrid method fills the game
      grid array with 1s for Xs and 0s for Os.
   */

   private void generateGameGrid()
   {
      // Create a reference to a Random object.
      Random rand = new Random();
      
		// Create the game grid array.
      gameGrid = new int[SIZE];
		
		String letter;		// To hold X or O.
      
      // Fill the gameGrid array with random values.
      for(int i = 0; i < SIZE; i++)
      {
         gameGrid[i] = rand.nextInt(2);
         
			// Determine the letter to display.
         if (gameGrid[i] == 1)
            letter = "X";
         else
            letter = "O";
         
			// Display the letter in the label.
         labels[i].setText(letter);
      }     
   }

   /**
      The displayResults method displays a message
      indicatingwhether player X won, player Y won, 
      or the game was a tie.
   */

   private void displayResults()
   {
      // Determine if Player 0 wins and display a message.
      if(gameGrid[0] == 0 && gameGrid[1] == 0 && gameGrid[2] == 0 ||
         gameGrid[3] == 0 && gameGrid[4] == 0 && gameGrid[5] == 0 ||
         gameGrid[6] == 0 && gameGrid[7] == 0 && gameGrid[8] == 0 ||
         gameGrid[0] == 0 && gameGrid[3] == 0 && gameGrid[6] == 0 ||
         gameGrid[1] == 0 && gameGrid[4] == 0 && gameGrid[7] == 0 ||
         gameGrid[2] == 0 && gameGrid[5] == 0 && gameGrid[8] == 0 ||
         gameGrid[0] == 0 && gameGrid[4] == 0 && gameGrid[8] == 0 ||
         gameGrid[2] == 0 && gameGrid[4] == 0 && gameGrid[6] == 0)
         JOptionPane.showMessageDialog(null, "O wins!");
         
      // Determine if Player X wins display a message.
      else if(gameGrid[0] == 1 && gameGrid[1] == 1 && gameGrid[2] == 1 ||
              gameGrid[3] == 1 && gameGrid[4] == 1 && gameGrid[5] == 1 ||
              gameGrid[6] == 1 && gameGrid[7] == 1 && gameGrid[8] == 1 ||
              gameGrid[0] == 1 && gameGrid[3] == 1 && gameGrid[6] == 1 ||
              gameGrid[1] == 1 && gameGrid[4] == 1 && gameGrid[7] == 1 ||
              gameGrid[2] == 1 && gameGrid[5] == 1 && gameGrid[8] == 1 ||
              gameGrid[0] == 1 && gameGrid[4] == 1 && gameGrid[8] == 1 ||
              gameGrid[2] == 1 && gameGrid[4] == 1 && gameGrid[6] == 1)
         JOptionPane.showMessageDialog(null, "X wins!");
         
      // Display a message indicating that the game was a tie.
      else
         JOptionPane.showMessageDialog(null, "The game was a tie!");
   }

   /**
      Private inner class that handles the event when
      the user clicks the New Game button.
   */
   
   private class NewGameButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Generate a new game.
         generateGameGrid();
         displayResults();
      }
   }
   
   /**
      Private inner class that handles the event when
      the user clicks the Exit button.
   */
   
   private class ExitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Exit the application.
         System.exit(0);
      }
   }  

   /**
      The main method creates an instance of the TicTacToeSimulator
      class, causing it to display its window.
   */
     
   public static void main(String[] args)
   {
      TicTacToeSimulator ttts = new TicTacToeSimulator();
   }
}
