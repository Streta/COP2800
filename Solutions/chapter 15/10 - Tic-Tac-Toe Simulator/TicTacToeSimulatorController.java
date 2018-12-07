import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;    // Needed for Random class

/**
   This is the controller class for the
   Tic-Tac-Toe Simulator programming challenge.
 */

public class TicTacToeSimulatorController
{
   @FXML
   private Button newGameButton;

   @FXML
   private ImageView row1col1ImageView;

   @FXML
   private ImageView row1col2ImageView;

   @FXML
   private ImageView row1col3ImageView;

   @FXML
   private ImageView row2col1ImageView;

   @FXML
   private ImageView row2col2ImageView;

   @FXML
   private ImageView row2col3ImageView;

   @FXML
   private ImageView row3col1ImageView;

   @FXML
   private ImageView row3col2ImageView;

   @FXML
   private ImageView row3col3ImageView;

   @FXML
   private Label outputLabel;

   // Named constants for array sizes
   private final int ROWS = 3;   // Number of game board rows
   private final int COLS = 3;   // Number of game board columns
   private final int SIZE = 2;   // Number of Image objects

   // Private fields
   private Random rand;                   // A random number
   private Image xImage;                  // The X image
   private Image oImage;                  // The O image
   private int[][] gameBoardMemory;       // To hold the game board values
   private ImageView[][] gameBoardImages; // To hold the ImageView components
   private Image[] images;                // To hold the Image objects.

   // This method is called when the FXML file is loaded.
   public void initialize()
   {
      // Create a Random object.
      rand = new Random();

      // Load the images.
      xImage = new Image("X.png");
      oImage = new Image("O.png");

      // Create an array of Image objects.
      images = new Image[SIZE];

      // Store the Image objects in the images array.
      images[0] = oImage;
      images[1] = xImage;

      // Create a two-dimensional array of ints
      // to represent the game board in memory.
      gameBoardMemory = new int[ROWS][COLS];

      // Create a two-dimensional array of
      // ImageView components to represent
      // the visible game board.
      gameBoardImages = new ImageView[ROWS][COLS];

      // Fill the array with the ImageView components.
      gameBoardImages[0][0] = row1col1ImageView;
      gameBoardImages[0][1] = row1col2ImageView;
      gameBoardImages[0][2] = row1col3ImageView;
      gameBoardImages[1][0] = row2col1ImageView;
      gameBoardImages[1][1] = row2col2ImageView;
      gameBoardImages[1][2] = row2col3ImageView;
      gameBoardImages[2][0] = row3col1ImageView;
      gameBoardImages[2][1] = row3col2ImageView;
      gameBoardImages[2][2] = row3col3ImageView;

      // Display the instructions.
      outputLabel.setText("Click the New Game button to play.");
   }

   // Event listener for the newGameButton
   public void newGameButtonListener()
   {
      // Display a new game board.
      displayGameBoard();

      // Determine the winner.
      determineWinner();
   }

   // The displayGameBoard method displays the game board.
   private void displayGameBoard()
   {
      // Create a random game board.
      for (int row = 0; row < ROWS; row++)
      {
         for (int col = 0; col < COLS; col++)
         {
            // Generate a random number.
            int val = rand.nextInt(SIZE);

            // Set the game board value in memory.
            gameBoardMemory[row][col] = val;

            // Set the game board image to display.
            gameBoardImages[row][col].setImage(images[val]);
         }
      }
   }

   // The determineWinner method determines the winner.
   private void determineWinner()
   {
      // Determine if player X wins.
      if ((gameBoardMemory[0][0] == 1 &&  // Check the first row.
           gameBoardMemory[0][1] == 1 &&
           gameBoardMemory[0][2] == 1)
           ||
          (gameBoardMemory[1][0] == 1 &&  // Check the second row.
           gameBoardMemory[1][1] == 1 &&
           gameBoardMemory[1][2] == 1)
           ||
          (gameBoardMemory[2][0] == 1 &&  // Check the third row.
           gameBoardMemory[2][1] == 1 &&
           gameBoardMemory[2][2] == 1)
           ||
          (gameBoardMemory[0][0] == 1 &&  // Check the first column.
           gameBoardMemory[1][0] == 1 &&
           gameBoardMemory[2][0] == 1)
           ||
          (gameBoardMemory[0][1] == 1 &&  // Check the second column.
           gameBoardMemory[1][1] == 1 &&
           gameBoardMemory[2][1] == 1)
           ||
          (gameBoardMemory[0][2] == 1 &&  // Check the third column.
           gameBoardMemory[1][2] == 1 &&
           gameBoardMemory[2][2] == 1)
           ||
          (gameBoardMemory[0][0] == 1 &&  // Check diagonally from
           gameBoardMemory[1][1] == 1 &&  // top-left to bottom-right.
           gameBoardMemory[2][2] == 1)
           ||
          (gameBoardMemory[0][2] == 1 &&  // Check diagonally from
           gameBoardMemory[1][1] == 1 &&  // top-right to bottom-left.
           gameBoardMemory[2][0] == 1))
      {
         // Display a message indicating that player X is the winner.
         outputLabel.setText("X wins!");
      }

      // Determine if player Y wins.
      else if ((gameBoardMemory[0][0] == 0 &&  // Check the first row.
                gameBoardMemory[0][1] == 0 &&
                gameBoardMemory[0][2] == 0)
                ||
               (gameBoardMemory[1][0] == 0 &&  // Check the second row.
                gameBoardMemory[1][1] == 0 &&
                gameBoardMemory[1][2] == 0)
                ||
               (gameBoardMemory[2][0] == 0 &&  // Check the third row.
                gameBoardMemory[2][1] == 0 &&
                gameBoardMemory[2][2] == 0)
                ||
               (gameBoardMemory[0][0] == 0 &&  // Check the first column.
                gameBoardMemory[1][0] == 0 &&
                gameBoardMemory[2][0] == 0)
                ||
               (gameBoardMemory[0][1] == 0 &&  // Check the second column.
                gameBoardMemory[1][1] == 0 &&
                gameBoardMemory[2][1] == 0)
                ||
               (gameBoardMemory[0][2] == 0 &&  // Check the third column.
                gameBoardMemory[1][2] == 0 &&
                gameBoardMemory[2][2] == 0)
                ||
               (gameBoardMemory[0][0] == 0 &&  // Check diagonally from
                gameBoardMemory[1][1] == 0 &&  // top-left to bottom-right.
                gameBoardMemory[2][2] == 0)
                ||
               (gameBoardMemory[0][2] == 0 &&  // Check diagonally from
                gameBoardMemory[1][1] == 0 &&  // top-right to bottom-left.
                gameBoardMemory[2][0] == 0))
      {
         // Display a message indicating that Player Y is the winner.
         outputLabel.setText("Y wins!");
      }

      // The game was a tie.
      else
      {
         // Display a message indicating that the game was a tie.
         outputLabel.setText("The game was a tie.");
      }
   }
}