import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   opwatch Applet programming challenge.
*/

public class StopWatch extends JApplet
{
   private final int TIME_DELAY = 1000;   // One second time delay
   private int numSeconds = 0;            // To count the seconds
   private JTextField seconds;            // To display the seconds
   private JButton startButton;           // To start the timer
   private JButton stopButton;            // To stop the timer
   private JPanel secondsPanel;           // To hold the seconds text field
   private JPanel buttonPanel;            // To hold the start adn stop buttons
   private Timer timer;                   // To refernce a Timer object

   /**
      init method
   */
      
   public void init()
   {
      // Build the button panel.
      buildButtonPanel();
      
      // Build the seconds panel.
      buildSecondsPanel();
      
      // Add the panels and banner to the content pane.
      add(buttonPanel, BorderLayout.SOUTH);
      add(secondsPanel, BorderLayout.CENTER);
      
      // Create a timer object.
      timer = new Timer(TIME_DELAY, new TimerListener());
   }

   
   /**
      The buildButtonPanel method creates a panel containing
      the start and stop buttons.
   */
   
   private void buildButtonPanel()
   {
      // Create a panel.
      buttonPanel = new JPanel();
      
      // Create the buttons.
      startButton = new JButton("Start");
      stopButton = new JButton("Stop");
      
      // Add action listeners
      startButton.addActionListener(new StartButtonListener());
      stopButton.addActionListener(new StopButtonListener());
      
      // Add the buttons to the panel.
      buttonPanel.add(startButton);
      buttonPanel.add(stopButton);
   }

   /**
      The buildSecondsPanel method creates a panel for displaying
      the seconds.
   */
   
   private void buildSecondsPanel()
   {
      // Create a panel.
      secondsPanel = new JPanel();
      
      // Create the text field.
      seconds = new JTextField(10);
      seconds.setEditable(false);
      seconds.setFont(new Font("SansSerif", Font.BOLD, 18));
      seconds.setText("0");
            
      // Add the text field to the panel.
      secondsPanel.add(seconds);
   }

   /**
      TimerListener class
      An inner class for handling timer events
   */
   
   private class TimerListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */
   
      public void actionPerformed(ActionEvent e)
      {
         numSeconds++;
         seconds.setText(String.valueOf(numSeconds));
      }
   }

   /**
      StartButtonListener class
      An inner class for handling start button clicks
   */
   
   private class StartButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */
   
      public void actionPerformed(ActionEvent e)
      {
         timer.start();
      }
   }
   
   /**
      StopButtonListener class
      An inner class for handling stop button clicks
   */
   
   private class StopButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */
         
      public void actionPerformed(ActionEvent e)
      {
         timer.stop();
      }
   }
}
