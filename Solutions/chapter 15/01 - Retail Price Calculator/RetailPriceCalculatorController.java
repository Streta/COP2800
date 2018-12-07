import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
   This is the controller class for the
   Retail Price Calculator programming challege.
 */

public class RetailPriceCalculatorController
{
   @FXML
   private Button retailButton;

   @FXML
   private TextField wholesaleTextField;

   @FXML
   private TextField markupTextField;

   @FXML
   private Label wholesalePromptLabel;

   @FXML
   private Label markupPromptLabel;

   @FXML
   private Label outputLabel;

   // Event listener for the retailButton
   public void retailButtonListener()
   {
      // Get the wholesale cost from the TextField.
      String strWholesale = wholesaleTextField.getText();

      // Get the markup percentage from the TextField.
      String strMarkup = markupTextField.getText();

      // Calculate the retail price.
      double wholesale = Double.parseDouble(strWholesale);
      double markup = Double.parseDouble(strMarkup);
      double retail = wholesale + (wholesale * (markup / 100));

      // Display the retail price in the Label.
      outputLabel.setText(String.format(
                          "The retail price is $%,.2f.",
                          retail));
   }
}