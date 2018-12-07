import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
   This is the controller class for the
   Celisus and Fahrenheit Temperature
   Converter programming challege.
 */

public class TemperatureConverterController
{
   @FXML
   private Button fahrenheitButton;

   @FXML
   private Button celsiusButton;

   @FXML
   private TextField temperatureTextField;

   @FXML
   private Label temperaturePromptLabel;

   @FXML
   private Label outputLabel;

   // Event listener for the FahrenheitButton
   public void fahrenheitButtonListener()
   {
      // Get the temperature from the TextField.
      String strTemperature = temperatureTextField.getText();

      // Calculate the temperature in Fahrenheit.
      double celsius = Double.parseDouble(strTemperature);
      double fahrenheit = 1.8 * celsius + 32.0;

      // Display the Fahrenheit temperature in the Label.
      outputLabel.setText(String.format(
                          "The Fahrenheit temperature " +
                          "is %,.2f degrees.",
                          fahrenheit));
   }

   // Event listener for the celsiusButton
   public void celsiusButtonListener()
   {
      // Get the temperature from the TextField.
      String strTemperature = temperatureTextField.getText();

      // Calculate the temperature in Celsius.
      double fahrenheit = Double.parseDouble(strTemperature);
      double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);

      // Display the Celsius temperature in the Label.
      outputLabel.setText(String.format(
                          "The Celsius temperature " +
                          "is %,.2f degrees.",
                          celsius));
   }
}