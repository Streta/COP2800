import java.awt.*;
import javax.swing.*;

/**
   The DataPanel class for use with the 
   Theater Revenue programming challenge
*/

public class DataPanel extends JPanel
{
   private JTextField adultPrice;   // Adult ticket price
   private JTextField adultSold;    // Adult tickets sold
   private JTextField childPrice;   // Child ticket price
   private JTextField childSold;    // Child tickets sold
   
   /**
      Constructor
   */
      
   public DataPanel()
   {
      // Create labels prompting for values.
      JLabel adultPriceMsg = 
         new JLabel("Enter the adult ticket price:");
      JLabel adultSoldMsg = 
         new JLabel("Enter the number of adult tickets sold:");
      JLabel childPriceMsg = 
         new JLabel("Enter the child ticket price:");
      JLabel childSoldMsg = 
         new JLabel("Enter the number of child tickets sold:");
      
      // Create the text fields.
      adultPrice = new JTextField(10);
      adultSold = new JTextField(10);
      childPrice = new JTextField(10);
      childSold = new JTextField(10);
      
      // Add a border to this panel.
      setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      
      // Create a layout manager for this panel.
      setLayout(new GridLayout(4, 2));
      
      // Add the labels and text fields to this panel.
      add(adultPriceMsg);
      add(adultPrice);
      add(adultSoldMsg);
      add(adultSold);
      add(childPriceMsg);
      add(childPrice);
      add(childSoldMsg);
      add(childSold);
   }
   
   /**
      The reset method reset the text fields.
   */ 
   
   public void reset()
   {
      adultPrice.setText("");
      adultSold.setText("");
      childPrice.setText("");
      childSold.setText("");  
   }
   
   /**
      The getAdultPrice method returns the price
      entered for an adult ticket.
      @return The adult ticket price.
   */
      
   public double getAdultPrice()
   {
      return Double.parseDouble(adultPrice.getText());
   }
   
   /**
      The getAdultSold method returns the number
      entered for adult tickes sold.
      @return The number of adult tickets sold.
   */
   
   public double getAdultSold()
   {
      return Double.parseDouble(adultSold.getText());
   }

   /**
      The getChildPrice method returns the price
      entered for a child ticket.
      @return The child ticket price.
   */
   
   public double getChildPrice()
   {
      return Double.parseDouble(childPrice.getText());
   }
   
   /**
      The getChildSold method returns the number
      entered for child tickes sold.
      @return The number of child tickets sold.
   */
      
   public double getChildSold()
   {
      return Double.parseDouble(childSold.getText());
   }  
}
