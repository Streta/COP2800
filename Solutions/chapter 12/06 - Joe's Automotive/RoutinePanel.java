import java.awt.*;
import javax.swing.*;

/**
  The RoutinePanel class for use with
  the Joe's Automotive programming challenge.
*/

public class RoutinePanel extends JPanel
{
   // Named constants for charges
   private final double OIL_CHANGE_CHARGE = 26.0;
   private final double LUBE_JOB_CHARGE = 18.0;
   private final double RADIATOR_FLUSH_CHARGE = 30.0;
   private final double TRANS_FLUSH_CHARGE = 80.0;
   private final double INSPECTION_CHARGE = 15.0;
   private final double MUFFLER_CHARGE = 100.0;
   private final double TIRE_ROTATION_CHARGE = 20.0;

   private JCheckBox oilChange;     // Check box for oil change
   private JCheckBox lubeJob;       // Check box for lube job
   private JCheckBox radiatorFlush; // Check box for radiator flush
   private JCheckBox transFlush;    // Check box for transmission flush
   private JCheckBox inspection;    // Check box for inspection
   private JCheckBox muffler;       // Check box for muffler replacement
   private JCheckBox tireRotation;  // Check box for tire rotation

   /**
      Constructor
   */

   public RoutinePanel()
   {
      // Create the check boxes.
      oilChange = new JCheckBox(String.format(
                                "Oil Change ($%,.2f)",
                                OIL_CHANGE_CHARGE));

      lubeJob = new JCheckBox(String.format(
                              "Lube Job ($%,.2f)",
                              LUBE_JOB_CHARGE));

      radiatorFlush = new JCheckBox(String.format(
                                    "Radiator Flush ($%,.2f)",
                                    RADIATOR_FLUSH_CHARGE));

      transFlush = new JCheckBox(String.format(
                                 "Transmission Flush ($%,.2f)",
                                 TRANS_FLUSH_CHARGE));

      inspection = new JCheckBox(String.format(
                                 "Inspection ($%,.2f)",
                                 INSPECTION_CHARGE));

      muffler = new JCheckBox(String.format(
                              "Muffler Replacement ($%,.2f)",
                              MUFFLER_CHARGE));

      tireRotation = new JCheckBox(String.format(
                                   "Tire Rotation ($%,.2f)",
                                   TIRE_ROTATION_CHARGE));

      // Create a GridLayout manager.
      setLayout(new GridLayout(7, 1));

      // Create a border.
      setBorder(BorderFactory.createTitledBorder("Routine Services"));

      // Add the check boxes to this panel.
      add(oilChange);
      add(lubeJob);
      add(radiatorFlush);
      add(transFlush);
      add(inspection);
      add(muffler);
      add(tireRotation);
   }

   /**
      The getCharges method calculates the routine charges.
      @return The amount of routine charges.
   */

   public double getCharges()
   {
      double charges = 0;

      if (oilChange.isSelected())
         charges += OIL_CHANGE_CHARGE;
      if (lubeJob.isSelected())
         charges += LUBE_JOB_CHARGE;
      if (radiatorFlush.isSelected())
         charges += RADIATOR_FLUSH_CHARGE;
      if (transFlush.isSelected())
         charges += TRANS_FLUSH_CHARGE;
      if (inspection.isSelected())
         charges += INSPECTION_CHARGE;
      if (muffler.isSelected())
         charges += MUFFLER_CHARGE;
      if (tireRotation.isSelected())
         charges += TIRE_ROTATION_CHARGE;

      return charges;
   }
}
