import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;    // Needed for Random class
import java.util.ArrayList; // Needed for ArrayList class

/**
   This is the controller class for the 
   Rock, Paper, Scissors Game programming 
   challenge.
 */
 
public class RockPaperScissorsGameController
{
   @FXML
   private Button rockButton;

   @FXML
   private Button paperButton;

   @FXML
   private Button scissorsButton;
   
   @FXML
   private Button newGameButton;
   
   @FXML
   private ImageView computerImageView;

   @FXML
   private ImageView playerImageView;

   @FXML
   private Label playerLabel;

   @FXML
   private Label computerLabel;

   @FXML
   private Label messageLabel;

   @FXML
   private Label outputLabel;
         
   // Private fields for the Image,
   // ArrayList, and Random objects.
   private Random rand;
   private ArrayList<Image> imageList;
   private Image rockImage;
   private Image paperImage;
   private Image scissorsImage;

   // Private fields for the computer
   // and player choice.
   private int computerChoice;
   private int playerChoice;
   
   // Named constants for the choices.
   private final int ROCK     =  0;
   private final int PAPER    =  1;
   private final int SCISSORS =  2;

   // This method is called when the FXML file is loaded
   public void initialize()
   {
      // Create a Random object.
      rand = new Random();

      // Load the images.
      rockImage     = new Image("Rock.png");
      paperImage    = new Image("Paper.png");
      scissorsImage = new Image("Scissors.png");

      // Create an ArrayList object.
      imageList = new ArrayList<Image>();
      
      // Add the images to the list.
      imageList.add(rockImage);
      imageList.add(paperImage);
      imageList.add(scissorsImage);

      // Reset the game.
      reset();
   }

   // Event listener for the rockButton
   public void rockButtonListener()
   {
      // Reset the game.
      reset();
      
      // Set the player's choice to rock.
      playerChoice = ROCK;
      
      // Play the game.
      play();
   }

   // Event listener for the paperButton
   public void paperButtonListener()
   {
      // Reset the game.
      reset();
      
      // Set the player's choice to paper.
      playerChoice = PAPER;
      
      // Play the game.
      play();
   }

   // Event listener for the scissorsButton
   public void scissorsButtonListener()
   {
      // Reset the game.
      reset();
      
      // Set the player's choice to scissors.
      playerChoice = SCISSORS;
      
      // Play the game.
      play();
   }
   
   // Event listener for the newGameButton
   public void newGameButtonListener()
   {
      // Reset the game.
      reset();
   }
   
   // The reset method resets the game.
   private void reset()
   {
      // Remove the images.
      computerImageView.setImage(null);
      playerImageView.setImage(null);
      
      // Get a random choice for the computer.
      computerChoice = rand.nextInt(imageList.size());
      
      // Display the new game messages.
      messageLabel.setText("Let's play!");
      outputLabel.setText("Rock, Paper, Scissors");
      playerLabel.setText(null);
      computerLabel.setText(null);
   }

   // The play method plays a round of the game.
   private void play()
   {
      // Display the computer's choice.
      computerImageView.setImage(imageList.get(computerChoice));
      
      // Display the player's choice.
      playerImageView.setImage(imageList.get(playerChoice));

      // Determine the winner.
      determineWinner();
   }
   
   // The determineWinner method determines the winner.
   private void determineWinner()
   {
      // Player chooses rock.
      if (playerChoice == ROCK)
      {
         // The computer chooses paper.
         if (computerChoice == PAPER)
         {
            // The computer wins.
            outputLabel.setText("The computer wins!");
            messageLabel.setText("Paper wraps rock.");
            computerLabel.setText("WINNER");
            playerLabel.setText("LOSER");
         }
         
         // The computer chooses scissors.
         else if (computerChoice == SCISSORS)
         {
            // The player wins.
            outputLabel.setText("The player wins!");
            messageLabel.setText("Rock smashes scissors.");
            computerLabel.setText("LOSER");
            playerLabel.setText("WINNER");            
         }
         
         // The computer chooses rock.
         else
         {
            // The game is a tie.
            outputLabel.setText("The game is a tie!");
            messageLabel.setText("Go again!");
            computerLabel.setText("TIED");
            playerLabel.setText("TIED");            
         }
      }
      
      // The player chooses paper.
      else if (playerChoice == PAPER)
      {
         // The computer chooses scissors.
         if (computerChoice == SCISSORS)
         {
            // The computer wins.
            outputLabel.setText("The computer wins!");
            messageLabel.setText("Scissors cut paper.");
            computerLabel.setText("WINNER");
            playerLabel.setText("LOSER");            
         }
         
         // The computer chooses rock.
         else if (computerChoice == ROCK)
         {
            // The player wins.
            outputLabel.setText("The player wins!");
            messageLabel.setText("Paper wraps rock.");
            computerLabel.setText("LOSER");
            playerLabel.setText("WINNER");             
         }
         
         // The computer chooses paper.
         else
         {
            // The game is a tie.
            outputLabel.setText("The game is a tie!");
            messageLabel.setText("Go again!");
            computerLabel.setText("TIED");
            playerLabel.setText("TIED");              
         }
      }
      
      // The player chooses scissors.
      else
      {
         // The computer chooses rock.
         if (computerChoice == ROCK)
         {
            // The computer wins.
            outputLabel.setText("The computer wins!");
            messageLabel.setText("Rock smashes scissors.");
            computerLabel.setText("WINNER");
            playerLabel.setText("LOSER");             
         }
         
         // The computer chooses paper.
         else if (computerChoice == PAPER)
         {
            // The player wins.
            outputLabel.setText("The player wins!");
            messageLabel.setText("Scissors cut paper."); 
            computerLabel.setText("LOSER");
            playerLabel.setText("WINNER");            
         }
         
         // The computer chooses scissors.
         else
         {
            // The game is a tie.
            outputLabel.setText("The game is a tie!");
            messageLabel.setText("Go again!");
            computerLabel.setText("TIED");
            playerLabel.setText("TIED");                         
         }
      }
   }   
}