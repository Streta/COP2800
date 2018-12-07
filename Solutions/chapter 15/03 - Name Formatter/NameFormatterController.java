import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
   This is the controller class for the
   Name Formatter programming challenge.
 */

public class NameFormatterController
{
   @FXML
   private Button format1Button;

   @FXML
   private Button format2Button;

   @FXML
   private Button format3Button;

   @FXML
   private Button format4Button;

   @FXML
   private Button format5Button;

   @FXML
   private Button format6Button;

   @FXML
   private TextField firstNameTextField;

   @FXML
   private TextField middleNameTextField;

   @FXML
   private TextField lastNameTextField;

   @FXML
   private TextField titleTextField;

   @FXML
   private Label firstNamePromptLabel;

   @FXML
   private Label middleNamePromptLabel;

   @FXML
   private Label lastNamePromptLabel;

   @FXML
   private Label titlePromptLabel;

   @FXML
   private Label outputLabel;

   // Event listener for the format1Button
   public void format1ButtonListener()
   {
      // Get the values from the TextFields.
      String title = titleTextField.getText();
      String first = firstNameTextField.getText();
      String middle = middleNameTextField.getText();
      String last = lastNameTextField.getText();

      // Display the user's name using format 1.
      outputLabel.setText(title + " " + first + " " +
                          middle + " " + last);
   }

   // Event listener for the format2Button
   public void format2ButtonListener()
   {
      // Get the values from the TextFields.
      String first = firstNameTextField.getText();
      String middle = middleNameTextField.getText();
      String last = lastNameTextField.getText();

      // Display the user's name using format 2.
      outputLabel.setText(first + " " + middle +
                          " " + last);
   }

   // Event listener for the format3Button
   public void format3ButtonListener()
   {
      // Get the values from the TextFields.
      String first = firstNameTextField.getText();
      String last = lastNameTextField.getText();

      // Display the user's name using format 3.
      outputLabel.setText(first + " " + last);
   }

   // Event listener for the format4Button
   public void format4ButtonListener()
   {
      // Get the values from the TextFields.
      String title = titleTextField.getText();
      String first = firstNameTextField.getText();
      String middle = middleNameTextField.getText();
      String last = lastNameTextField.getText();

      // Display the user's name using format 4.
      outputLabel.setText(last + ", " + first + " " +
                          middle + ", " + title);
   }

   // Event listener for the format5Button
   public void format5ButtonListener()
   {
      // Get the values from the TextFields.
      String first = firstNameTextField.getText();
      String middle = middleNameTextField.getText();
      String last = lastNameTextField.getText();

      // Display the user's name using format 5.
      outputLabel.setText(last + ", " + first +
                          " " + middle);
   }

   // Event listener for the format6Button
   public void format6ButtonListener()
   {
      // Get the values from the TextFields.
      String first = firstNameTextField.getText();
      String last = lastNameTextField.getText();

      // Display the user's name using format 6.
      outputLabel.setText(last + ", " + first);
   }
}