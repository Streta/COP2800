import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
   This is the main application class for the
   Retail Price Calculator programming challege.
 */
 
public class RetailPriceCalculator extends Application
{
   public void start(Stage stage) throws Exception
   {
      // Load the FXML file.
      Parent parent = FXMLLoader.load(
      getClass().getResource("RetailPriceCalculator.fxml"));
      
      // Build the scene graph.
      Scene scene = new Scene(parent);
      
      // Display our window, using the scene graph.
      stage.setTitle("Retail Price Calculator");
      stage.setScene(scene);
      stage.show();
      
   }
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
}