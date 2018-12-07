import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import java.util.Random;    // Needed for Random class
import java.util.ArrayList; // Needed for ArrayList class

/**
   This is the controller class for the
   Dice Simulator programming challenge.
 */

public class DiceSimulatorController
{
   @FXML
   private Button rollButton;

   @FXML
   private ImageView dieImage1;

   @FXML
   private ImageView dieImage2;

   // Private fields for the Image,
   // ArrayList, and Random objects.
   private Random rand;
   private ArrayList<Image> imageList;
   private Image oneDieImage;
   private Image twoDieImage;
   private Image threeDieImage;
   private Image fourDieImage;
   private Image fiveDieImage;
   private Image sixDieImage;

   // This method is called when the FXML file is loaded
   public void initialize()
   {
      // Create a Random object.
      rand = new Random();

      // Load the images.
      oneDieImage   = new Image("1Die.png");
      twoDieImage   = new Image("2Die.png");
      threeDieImage = new Image("3Die.png");
      fourDieImage  = new Image("4Die.png");
      fiveDieImage  = new Image("5Die.png");
      sixDieImage   = new Image("6Die.png");

      // Create an ArrayList object.
      imageList = new ArrayList<Image>();

      // Add the images to the list.
      imageList.add(oneDieImage);
      imageList.add(twoDieImage);
      imageList.add(threeDieImage);
      imageList.add(fourDieImage);
      imageList.add(fiveDieImage);
      imageList.add(sixDieImage);
   }

   // Event listener for the tossButton
   public void tossButtonListener()
   {
      // Set die1 to a random image.
      dieImage1.setImage(getRandomImage());

      // Set die2 to a random image.
      dieImage2.setImage(getRandomImage());
   }

   private Image getRandomImage()
   {
      // Get a random index value.
      int value = rand.nextInt(imageList.size());

      // Return a random image.
      return imageList.get(value);
   }
}