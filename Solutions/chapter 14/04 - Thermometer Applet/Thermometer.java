import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/**
   This program demonstrates a solution to the
   Thermometer Applet programming challenge.
*/

public class Thermometer extends JApplet
{
   private final int MIN_TEMP = 0;
   private final int MAX_TEMP = 250;
   private final int INITIAL_TEMP = 0;
   private final int TICK_SPACING = 50;
                     
   private ThermoPanel thermoPanel;
   private JPanel sliderPanel;
   private JSlider slider;
   
   /**
      init method
   */
   
   public void init()
   {
      // Create the ThermoPanel object.
      thermoPanel = new ThermoPanel();
      
      // Build the slider panel.
      buildSliderPanel();
      
      // Add the ThermoPanel to the center region of the
      // content pane.
      add(thermoPanel, BorderLayout.CENTER);
      
      // Add the slider panel to the south region of the
      // content pane.
      add(sliderPanel, BorderLayout.SOUTH);
   }
   
   /**
      The buildSliderPanel method builds a panel for the
      slider.
   */
   
   private void buildSliderPanel()
   {
      // Create the slider panel.
      sliderPanel = new JPanel();
      
      // Create and configure the slider.
      slider = new JSlider(JSlider.HORIZONTAL, MIN_TEMP,
                           MAX_TEMP, INITIAL_TEMP);
      slider.setMajorTickSpacing(TICK_SPACING);
      slider.setPaintTicks(true);
      slider.setPaintLabels(true);
      slider.addChangeListener(new SliderListener());
      
      // Add the slider to the panel.
      sliderPanel.add(slider);
      
      // Put a line border around the panel.
      sliderPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
   }

   /**
      Inner class to handle the slider's change events
   */
   
   private class SliderListener implements ChangeListener
   {
      /**
         stateChanged method
         @param e A ChangeEvent object.
      */
      
      public void stateChanged(ChangeEvent e)
      {
         int t = slider.getValue();
         thermoPanel.setTemperature(t);
      }
   }
}