import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
   This is the controller class for the
   Distance Traveled programming challenge.
 */

public class DistanceTraveledController
{
   @FXML
   private Button distance5Button;

   @FXML
   private Button distance8Button;

   @FXML
   private Button distance12Button;

   @FXML
   private TextField speedTextField;

   @FXML
   private Label speedPromptLabel;

   @FXML
   private Label outputLabel;

   // Event listener for the distance5Button
   public void distance5ButtonListener()
   {
      // Named constant for the time.
      final double TIME = 5.0;

      // Get the speed from the TextField.
      String strSpeed = speedTextField.getText();

      // Calculate the distance.
      double speed = Double.parseDouble(strSpeed);
      double distance = speed * TIME;

      // Display the distance traveled in the Label.
      outputLabel.setText(String.format(
                          "The car will travel %,.2f miles.", 
                          distance));
   }

   // Event listener for the distance8Button
   public void distance8ButtonListener()
   {
      // Named constant for the time.
      final double TIME = 8.0;

      // Get the speed from the TextField.
      String strSpeed = speedTextField.getText();

      // Calculate the distance.
      double speed = Double.parseDouble(strSpeed);
      double distance = speed * TIME;

      // Display the distance traveled in the Label.
      outputLabel.setText(String.format(
                          "The car will travel %,.2f miles.", 
                          distance));
   }

   // Event listener for the distance12Button
   public void distance12ButtonListener()
   {
      // Named constant for the time.
      final double TIME = 12.0;

      // Get the speed from the TextField.
      String strSpeed = speedTextField.getText();

      // Calculate the distance.
      double speed = Double.parseDouble(strSpeed);
      double distance = speed * TIME;

      // Display the distance traveled in the Label.
      outputLabel.setText(String.format(
                          "The car will travel %,.2f miles.", 
                          distance));
   }
}