import java.awt.*;
import javax.swing.*;

/**
   The WorkshopPanel class stores data about conference workshops
   for the Conference Registration System programming challenge.
*/

public class WorkshopPanel extends JPanel
{
   private final double ECOMM = 295.0;    // Cost of e-commerce workshop
   private final double WEB = 295.0;      // Cost of web workshop
   private final double JAVA = 395.0;     // Cost of Java workshop
   private final double SECURITY = 395.0; // Cost of security workshop
   
   // Workshop Names
   private String[] wsNames = { "Introduction to E-commerce",
                                "The Future of the Web",
                                "Advanced Java Programming",
                                "Network Security" };
                                
   private JList workshops;      // List box to hold workshop names
   
   /**
      Constructor
   */
   
   public WorkshopPanel()
   {
      // Create a list box.
      workshops = new JList(wsNames);
      
      // Use multiple interval selection mode.
      workshops.setSelectionMode(
            ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      
      // Add the list box to this panel.
      add(workshops);
      
      // Add a border to this panel.
      setBorder(BorderFactory.createTitledBorder("Workshops"));
   }

   /**
      The getWorkshopCost method returns the cost of
      the selected workshops.
      @return The cost of the selected workshops.
   */
   
   public double getWorkshopCost()
   {
      double total = 0.0;
      Object[] selections = workshops.getSelectedValues();
      
      if (selections != null)
      {
         for (int i = 0; i < selections.length; i++)
         {
            if (selections[i].equals("Introduction to E-commerce"))
               total += ECOMM;
            else if (selections[i].equals("The Future of the Web"))
               total += WEB;
            else if (selections[i].equals("Advanced Java Programming"))
               total += JAVA;
            else if (selections[i].equals("Network Security"))
               total += SECURITY;
         }
      }
      
      return total;
   }
}
