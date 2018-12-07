import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   The ConfigPanel class stores data about a shades
   for the Shade Designer programming challenge.
*/

public class ConfigPanel extends JPanel
{
   // Strings to populate our list components
   private String[] styles = {"Regular Shades: Add $ 0.00",
                              "Folding Shades: Add $10.00",
                              "Roman Shades:   Add $15.00" };
   private String[] sizes =  {"25 Inches Wide: Add $ 0.00",
                              "27 Inches Wide: Add $ 2.00",
                              "32 Inches Wide: Add $ 4.00",
                              "40 Inches Wide: Add $ 6.00" };
   private String[] colors = {"Natural: Add $ 5.00",
                              "Blue:    Add $ 0.00",
                              "Teal:    Add $ 0.00",
                              "Red:     Add $ 0.00",
                              "Green:   Add $ 0.00" };
   
   // We will need some other nested panels to place
   // the list components.
   private JPanel stylePanel;
   private JPanel sizePanel;
   private JPanel colorPanel;
   
   // List components
   private JList styleList;   // To display styles
   private JList sizeList;    // To display sizes
   private JList colorList;   // To display colors

   /**
      Constructor
   */
      
   public ConfigPanel()
   {
      // Build the style panel.
      buildStylePanel();
      
      // Build the size panel.
      buildSizePanel();

      // Build the color panel.
      buildColorPanel();

      // Make a layout manager for this panel.
      setLayout(new GridLayout(1, 3));
      
      // Add the panels to this panel.
      add(stylePanel);
      add(sizePanel);
      add(colorPanel);
   }

   /**
      The buildStylePanel method creates a panel allowing the
      user to select a style from a list.
   */
      
   private void buildStylePanel()
   {
      // Create a label prompting the user to select a style.
      JLabel styleMsg = new JLabel("Select a Style.");
      
      // Create the style list component.
      styleList = new JList(styles);
      
      // Put a border around the list.
      styleList.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      // Create the style panel.
      stylePanel = new JPanel();

      // Create a GridLayout manager.
      stylePanel.setLayout(new BorderLayout());
      
      // Put the components in the panel.
      stylePanel.add(styleMsg, BorderLayout.NORTH);
      stylePanel.add(styleList, BorderLayout.CENTER);
      
      // Draw a border around the panel.
      stylePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
   }

   /**
      The buildSizePanel method creates a panel allowing the
      user to select a size from a list.
   */
      
   private void buildSizePanel()
   {
      // Create a label prompting the user to select a size.
      JLabel sizeMsg = new JLabel("Select a Size.");
      
      // Create the size list component.
      sizeList = new JList(sizes);
      
      // Put a border around the list.
      sizeList.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      // Create the size panel.
      sizePanel = new JPanel();

      // Create a GridLayout manager.
      sizePanel.setLayout(new BorderLayout());
      
      // Put the components in the panel.
      sizePanel.add(sizeMsg, BorderLayout.NORTH);
      sizePanel.add(sizeList, BorderLayout.CENTER);
      
      // Draw a border around the panel.
      sizePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
   }
   
   /**
      The buildColorPanel method creates a panel allowing the
      user to select a color from a list.
   */
   
   private void buildColorPanel()
   {
      // Create a label prompting the user to select a color.
      JLabel colorMsg = new JLabel("Select a Color.");
      
      // Create the color list component.
      colorList = new JList(colors);
      
      // Put a border around the list.
      colorList.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      // Create the color panel.
      colorPanel = new JPanel();

      // Create a GridLayout manager.
      colorPanel.setLayout(new BorderLayout());
      
      // Put the components in the panel.
      colorPanel.add(colorMsg, BorderLayout.NORTH);
      colorPanel.add(colorList, BorderLayout.CENTER);
      
      // Draw a border around the panel.
      colorPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
   }
   
   /**
      The getStylePrice method returns the additional cost charged
      because of the selected style.
      @return Additional style charges. 
   */
   
   public double getStylePrice()
   {
      String selectedStyle = (String) styleList.getSelectedValue();
      double stylePrice = 0.0;
      
      if (selectedStyle == null)
         stylePrice = 0.0;
      else if (selectedStyle.equals("Regular Shades: Add $ 0.00"))
         stylePrice = 0.0;
      else if (selectedStyle.equals("Folding Shades: Add $10.00"))
         stylePrice = 10.0;
      else if (selectedStyle.equals("Roman Shades:   Add $15.00"))
         stylePrice = 15.0;

      return stylePrice;
   }

   /**
      The getSizePrice method returns the additional cost charged
      because of the selected size.
      @return Additional size charges. 
   */
   
   public double getSizePrice()
   {
      String selectedSize = (String) sizeList.getSelectedValue();
      double sizePrice = 0.0;
      
      if (selectedSize == null)
         sizePrice = 0.0;
      else if (selectedSize.equals("25 Inches Wide: Add $ 0.00"))
         sizePrice = 0.0;
      else if (selectedSize.equals("27 Inches Wide: Add $ 2.00"))
         sizePrice = 2.0;
      else if (selectedSize.equals("32 Inches Wide: Add $ 4.00"))
         sizePrice = 4.0;
      else if (selectedSize.equals("40 Inches Wide: Add $ 6.00"))
         sizePrice = 6.0;

      return sizePrice;
   }

   /**
      The getColorPrice method returns the additional cost charged
      because of the selected color.
      @return Additional color charges. 
   */
   
   public double getColorPrice()
   {
      String selectedColor = (String) colorList.getSelectedValue();
      double colorPrice = 0.0;
      
      if (selectedColor != null &&
          selectedColor.equals("Natural: Add $ 5.00"))
         colorPrice = 5.0;

      return colorPrice;
   }
}
