import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
   This is the controller class for the
   Tip, Tax, and Total programming challenge.
 */

public class TipTaxAndTotalController
{
   @FXML
   private Button calculateButton;

   @FXML
   private TextField chargeTextField;

   @FXML
   private Label chargePromptLabel;

   @FXML
   private Label outputTipLabel;

   @FXML
   private Label outputTaxLabel;

   @FXML
   private Label outputTotalLabel;

   // This method is called when the FXML file is loaded
   public void initialize()
   {
      // Perform any necessary initialization here.
   }

   // Event listener for the calculateButton
   public void calculateButtonListener()
   {
      // Named constants for tip and tax
      final double TIP = 0.18;
      final double TAX = 0.07;
      
      // Get the charge from the TextField.
      String strCharge = chargeTextField.getText();

      // Calculate the tax, tip, and total.
      double charge = Double.parseDouble(strCharge);
      double tipAmount = charge * TIP;
      double taxAmount = charge * TAX;
      double totalAmount = tipAmount + taxAmount + charge;

      // Display the tip amount in the outputTipLabel.
      outputTipLabel.setText(String.format("Tip: $%,.2f", tipAmount));

      // Display the tax amount in the outputTaxLabel.
      outputTaxLabel.setText(String.format("Tax: $%,.2f", taxAmount));

      // Display the total amount in the outputTotalLabel.
      outputTotalLabel.setText(String.format("Total: $%,.2f", totalAmount));
   }
}