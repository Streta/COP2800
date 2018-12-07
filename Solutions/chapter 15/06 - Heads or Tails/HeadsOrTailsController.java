import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import java.util.Random;

/**
   This is the controller class for the
   Heads or Tails programming challenge.
 */

public class HeadsOrTailsController
{
   @FXML
   private Button tossButton;

   @FXML
   private ImageView coinImage;

   // Private fields for the heads and tails images
   private Image headsImage;
   private Image tailsImage;

   // This method is called when the FXML file is loaded
   public void initialize()
   {
      // Load the heads and tails images
      headsImage = new Image("Heads1.png");
      tailsImage = new Image("Tails1.png");
   }

   // Event listener for the tossButton
   public void tossButtonListener()
   {
      // Create a Random object.
      Random rand = new Random();

      // Get a random value, 0 or 1.
      int value = rand.nextInt(2);

      // Set the coin image.
      // 0 = "heads" or 1 = "tails"
      if (value == 0)
         coinImage.setImage(headsImage);
      else
         coinImage.setImage(tailsImage);
   }
}