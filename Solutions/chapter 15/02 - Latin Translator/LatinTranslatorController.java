import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
   This is the controller class for the
   Latin Translator programming challenge.
 */
 
public class LatinTranslatorController
{
   @FXML
   private Button sinisterButton;

   @FXML
   private Button dexterButton;

   @FXML
   private Button mediumButton;

   @FXML
   private Label outputLabel;

   // Event listener for the sinisterButton
   public void sinisterButtonListener()
   {
      // Display the English translation in the Label.
      outputLabel.setText("left");
   }

   // Event listener for the dexterButton
   public void dexterButtonListener()
   {
      // Display the English translation in the Label.
      outputLabel.setText("right");
   }

   // Event listener for the mediumButton
   public void mediumButtonListener()
   {
      // Display the English translation in the Label.
      outputLabel.setText("center");
   }
}