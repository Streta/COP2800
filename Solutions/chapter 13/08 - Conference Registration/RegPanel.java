import java.awt.*;
import javax.swing.*;

/**
   The RegPanel class stores data about conference registration
   for the Conference Registration System programming challenge.
*/

public class RegPanel extends JPanel
{
   // Constants
   private final double GEN_REG = 895.0;  // Cost of general registration
   private final double STU_REG = 495.0;  // Cost of student registration
   private final double KEYNOTE = 30.0;   // Cost of dinner and keynote
   
   private JRadioButton general;    // General registration
   private JRadioButton student;    // Student registration
   
   private JCheckBox keynote;       // Dinner and keynote address
   private JPanel radioPanel;       // Panel to hold radio buttons
   private JPanel checkboxPanel;    // Panel to hold the check box
   
   /**
      Constructor
   */
   
   public RegPanel()
   {
      // Build panels for registration info.
      buildRadioPanel();
      buildCheckboxPanel();
      
      // Create a grid layout manager with 2 rows
      // and 1 column.
      setLayout(new GridLayout(2, 1));
      
      // Add the panels to this panel.
      add(radioPanel);
      add(checkboxPanel);
   }

   /**
      The buildRadioPanel method creates a panel containing
      radio buttons for registration type.
   */
   
   private void buildRadioPanel()
   {
      // Create the radio buttons for the registration types.
      general = new JRadioButton("General Registration");
      student = new JRadioButton("Student Registration");
      
      // Create a ButtonGroup for the radio buttons.
      ButtonGroup group = new ButtonGroup();
      
      // Add the radio buttons to the ButtonGroup.
      group.add(general);
      group.add(student);

      // Create a panel.
      radioPanel = new JPanel();

      // Add the radio buttons to the panel.    
      radioPanel.add(general);
      radioPanel.add(student);
      
      // Put a titled border around the panel.
      radioPanel.setBorder(
           BorderFactory.createTitledBorder("Registration Type"));
   }

   /**
      The buildCheckboxPanel method creates a panel containing
      a check box to select dinner and keynote speech.
   */
      
   private void buildCheckboxPanel()
   {
      keynote = new JCheckBox("Dinner and Keynote Speech");
      checkboxPanel = new JPanel();
      checkboxPanel.add(keynote);
   }

   /**
      The getRegistrationCost method returns the cost
      of registration.
      @return The cost of registration.
   */
   
   public double getRegistrationCost()
   {
      double total = 0.0;
      
      if (general.isSelected())
         total = GEN_REG;     // General registration
      else
         total = STU_REG;     // Student registration
      
      if (keynote.isSelected())
         total += KEYNOTE;    // Add dinner & keynote

      return total;
   }
}
