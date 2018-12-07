import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;      // Needed for Random class

/**
   This is the controller class for the
   Slot Machine Simulation programming
   challenge.
 */

public class SlotMachineSimulationController
{
   @FXML
   private Button spinButton;

   @FXML
   private ImageView row1col1ImageView;

   @FXML
   private ImageView row1col2ImageView;

   @FXML
   private ImageView row1col3ImageView;

   @FXML
   private TextField amountBetTextField;

   @FXML
   private Label amountBetPromptLabel;

   @FXML
   private Label amountWonDescriptionLabel;

   @FXML
   private Label totalWinningsDescriptionLabel;

   @FXML
   private Label outputAmountWonLabel;

   @FXML
   private Label outputTotalWinningsLabel;

   @FXML
   private Label displayInfoLabel;

   // Named constants
   private final int ROWS = 1;         // Number of rows
   private final int COLS = 3;         // Number of columns
   private final int SIZE = 10;        // Number of Image objects
   private final double ZERO = 0.0;    // Zero matches multiplier
   private final double DOUBLE = 2.0;  // Two matches multiplier
   private final double TRIPLE = 3.0;  // Three matches multiplier

   // Private fields
   private Random rand;                // A random number
   private Image appleImage;           // The apple image
   private Image bananaImage;          // The banana image
   private Image cherriesImage;        // The cherries image
   private Image grapesImage;          // The grapes image
   private Image lemonImage;           // The lemon image
   private Image limeImage;            // The lime image
   private Image orangeImage;          // The orange image
   private Image pearImage;            // The pear image
   private Image strawberryImage;      // The strawberry image
   private Image watermelonImage;      // The watermelon image
   private int[][] slotMemory;         // To hold the slot values
   private ImageView[][] slotImages;   // To hold the ImageView components
   private Image[] images;             // To hold the Image objects
   private double amountBet;           // To hold the amount bet
   private double amountWon;           // To hold the amount won
   private double totalWinnings;       // To hold the total winnings
   private boolean isValidBet;         // To hold the status of a bet

   // This method is called when the FXML file is loaded.
   public void initialize()
   {
      // Create a Random object.
      rand = new Random();

      // Load the images.
      appleImage      = new Image("Apple.png");
      bananaImage     = new Image("Banana.png");
      cherriesImage   = new Image("Cherries.png");
      grapesImage     = new Image("Grapes.png");
      lemonImage      = new Image("Lemon.png");
      limeImage       = new Image("Lime.png");
      orangeImage     = new Image("Orange.png");
      pearImage       = new Image("Pear.png");
      strawberryImage = new Image("Strawberry.png");
      watermelonImage = new Image("Watermelon.png");

      // Create an array of Image objects.
      images = new Image[SIZE];

      // Store the Image objects in the images array.
      images[0] = appleImage;
      images[1] = bananaImage;
      images[2] = cherriesImage;
      images[3] = grapesImage;
      images[4] = lemonImage;
      images[5] = limeImage;
      images[6] = orangeImage;
      images[7] = pearImage;
      images[8] = strawberryImage;
      images[9] = watermelonImage;

      // Create a two-dimensional array of ints
      // to represent the slot machine in memory.
      slotMemory = new int[ROWS][COLS];

      // Create a two-dimensional array of
      // ImageView components to represent
      // the visible slots.
      slotImages = new ImageView[ROWS][COLS];

      // Fill the array with the ImageView components.
      slotImages[0][0] = row1col1ImageView;
      slotImages[0][1] = row1col2ImageView;
      slotImages[0][2] = row1col3ImageView;

      // Set all amounts to zero.
      amountBet     = ZERO;
      amountWon     = ZERO;
      totalWinnings = ZERO;

      // Set the bet status to false.
      isValidBet = false;

      // Display the instructions.
      displayInfoLabel.setText("Insert an Amount to Play.");

      // Display the slots.
      displaySlots();
   }

   // Event listener for the spinButton
   public void spinButtonListener()
   {
      // Get the amount bet.
      getAmountBet();

      // Determine if the bet was valid.
      if (isValidBet)
      {
         // Display the slots.
         displaySlots();

         // Determine the winnings.
         determineWinnings();
      }
   }

   // The getAmountBet method converts the text to
   // a double and stores it in the amountBet field.
   private void getAmountBet()
   {
      // Create a String object to hold the input
      // from the TextField.
      String strAmountBet = amountBetTextField.getText();

      // Convert the String to a double and store it
      // in the amountBet field.
      try
      {
         amountBet = Double.parseDouble(strAmountBet);

         // Set the bet status to true.
         isValidBet = true;
      }
      catch (NullPointerException | NumberFormatException ex)
      {
         // Display the an error message.
         displayInfoLabel.setText("Error. Try a different amount.");

         // Set the bet status to false.
         isValidBet = false;
      }
   }

   // The displaySlots method displays the slots.
   private void displaySlots()
   {
      // Create random slots.
      for (int row = 0; row < ROWS; row++)
      {
         for (int col = 0; col < COLS; col++)
         {
            // Generate a random number.
            int val = rand.nextInt(SIZE);

            // Set the slot value in memory.
            slotMemory[row][col] = val;

            // Set the slot image to display.
            slotImages[row][col].setImage(images[val]);
         }
      }
   }

   // The determineWinnings method determines the winnings.
   private void determineWinnings()
   {
      // Determine the winnings.
      if (slotMemory[0][0] == slotMemory[0][1] &&
          slotMemory[0][0] == slotMemory[0][2])
      {
         // If three of the images match, the user has won
         // three times the amount entered.
         amountWon = amountBet * TRIPLE;

         // Display the instructions.
         displayInfoLabel.setText("Jackpot! TRIPLE WIN x 3!!");
      }
      else if (slotMemory[0][0] == slotMemory[0][1] ||
               slotMemory[0][0] == slotMemory[0][2] ||
               slotMemory[0][1] == slotMemory[0][2])
      {
         // If two of the images match, the user has won
         // two times the amount entered.
         amountWon = amountBet * DOUBLE;
         displayInfoLabel.setText("Sweet! DOUBLE WIN x 2!!");
      }
      else
      {
         // If none of the randomly displayed images match,
         // the user has won $0.
         amountWon = amountBet * ZERO;
         displayInfoLabel.setText("No Luck. Play again!");
      }

      // Keep a running total of the winnings.
      totalWinnings += amountWon;

      // Display the winnings.
      outputAmountWonLabel.setText(String.format(
                                   "%,.2f",
                                   amountWon));

      outputTotalWinningsLabel.setText(String.format(
                                   "%,.2f",
                                   totalWinnings));
   }
}