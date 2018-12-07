import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

/**
   This program demonstrates a solution to the
   Slideshow Application programming challenge.
*/

public class SlideShow extends JFrame
{
     private final int MAX_IMAGES = 10;   // The maximum number of images
     private JPanel imagePanel;           // A panel to hold an image label
     private JPanel buttonPanel;          // A panel to hold a button
     private JLabel imageLabel;           // A label to hold an image
     private JButton imageButton;         // A button to get an image
     private JButton delayButton;         // A button to set the time delay
     private JButton startButton;         // A button to start the slide show
     private JButton stopButton;          // A button to stop the slide show
     private JFileChooser fileChooser;    // For the open dialog box
     private Timer timer;                 // To reference a Timer object
     private int timeDelay = 1000;        // Time delay
     private ImageIcon[] images;          // Array of images
     private int numImages = 0;           // The number of images selected
     private int currentImage = 0;        // The current image in the slide show

     /**
        Constructor
     */
   
     public SlideShow()
     {
          // Set the title.
          setTitle("Slide Show");

          // Specify what happens when the close button is clicked.
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          // Create a BorderLayout manager for the content pane.
          setLayout(new BorderLayout());

          // Build the panels.
          buildImagePanel();
          buildButtonPanel();

          // Add the panels to the content pane.
          add(imagePanel, BorderLayout.CENTER);
          add(buttonPanel, BorderLayout.SOUTH);

          // Create a file chooser.
          fileChooser = new JFileChooser(".");
          
          // Create a timer.
          timer = new Timer(timeDelay, new TimerListener());
          
          // Create an array to hold the images.
          images = new ImageIcon[MAX_IMAGES];

          // Pack and display the window.
          pack();
          setVisible(true);
     }

     /**
         The buildImagePanel method adds an empty label
         to a panel.
     */

     private void buildImagePanel()
     {
          // Create a panel.
          imagePanel = new JPanel();

          // Create a label.
          imageLabel = new JLabel();

          // Add the label to the panel.
          imagePanel.add(imageLabel);
     }

     /**
         The buildButtonPanel method adds a button
         to a panel.
     */

     private void buildButtonPanel()
     {
          // Create a panel.
          buttonPanel = new JPanel();

          // Create an image button.
          imageButton = new JButton("Add Image");
          imageButton.setMnemonic(KeyEvent.VK_A);
          imageButton.setToolTipText("Click here to add an image.");
          
          // Create a delay button.
          delayButton = new JButton("Set Time Delay");
          delayButton.setMnemonic(KeyEvent.VK_T);
          delayButton.setToolTipText("Click here to set the time delay.");

          // Create a start button.
          startButton = new JButton("Start");
          startButton.setMnemonic(KeyEvent.VK_S);
          startButton.setToolTipText("Click here to start the slide show.");
   
          // Create a stop button.
          stopButton = new JButton("Stop");
          stopButton.setMnemonic(KeyEvent.VK_P);
          stopButton.setToolTipText("Click here to stop the slide show.");

          // Register action listeners with the buttons.
          imageButton.addActionListener(new ImageButtonListener());
          delayButton.addActionListener(new DelayButtonListener());
          startButton.addActionListener(new StartButtonListener());
          stopButton.addActionListener(new StopButtonListener());
          
          // Add the buttons to the panel.
          buttonPanel.add(imageButton);
          buttonPanel.add(delayButton);
          buttonPanel.add(startButton);
          buttonPanel.add(stopButton);
     }

     /**
         Private inner class that handles the event when
         the user clicks the image button.
     */

     private class ImageButtonListener implements ActionListener
     {
          /**
            actionPerformed method
            @param e An ActionEvent object.
          */

          public void actionPerformed(ActionEvent e)
          {
               File selectedFile;     // To reference the selected image file
               ImageIcon thisImage;   // To read the image from the file
               String filename;       // To hold the name and path of the file
               int fileChooserStatus; // Indicates status of the open dialog box
               
               if (numImages >= MAX_IMAGES)
                  JOptionPane.showMessageDialog(null, "The maximum number of images " +
                                                      "have been selected.");
               else
               {              
                  // Display an open dialog box.
                  fileChooserStatus = fileChooser.showOpenDialog(SlideShow.this);

                                                               
                  if (fileChooserStatus == JFileChooser.APPROVE_OPTION)
                  {
                    // Get a reference to the selected file.
                    selectedFile = fileChooser.getSelectedFile();

                    // Get the path of the selected file.
                    filename = selectedFile.getPath();

                    // Read the image from the file.
                    thisImage = new ImageIcon(filename);

                    // Store the image in the images array.
                    images[numImages] = thisImage;
                    numImages++;
                  }
               }
          }
     }

   /**
      Private inner class that handles the event when
      the user clicks the delay button.
   */

   private class DelayButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         String input = JOptionPane.showInputDialog("Enter the time delay (in seconds).");
         timeDelay = Integer.parseInt(input) * 1000;
         timer.setDelay(timeDelay);
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
         setTitle("Image " + String.valueOf(currentImage+1));
         // Store the image in the label.
         imageLabel.setIcon(images[currentImage]);

         // Pack the frame again to accomodate the 
         // new size of the label.
         pack();

         // Update the current image number.
         if (currentImage < (numImages - 1))
            currentImage++;
         else
            currentImage = 0;
      }
   }

   /**
      The main method creates an instance of the SlideShow
      class, causing it to display its window.
   */
   public static void main(String[] args)
   {
      SlideShow ss = new SlideShow();
   }
}
