import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

/**
   This program demonstrates a solution to the
   Image Viewer programming challenge.
*/

public class ImageViewer extends JFrame
{
     private JPanel imagePanel;        // A panel to hold an image label
     private JPanel buttonPanel;       // A panel to hold a button
     private JLabel imageLabel;        // A label to hold an image
     private JButton button;           // A button to get an image
     private JFileChooser fileChooser; // For the open dialog box
     private Container contentPane;    // To reference the content pane


    /**
        Constructor
    */

     public ImageViewer()
     {
          // Set the title.
          setTitle("Image Viewer");

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
          imageLabel = new JLabel("Click the button to get an image.");

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

          // Create a button.
          button = new JButton("Get Image");
          button.setMnemonic(KeyEvent.VK_G);
          button.setToolTipText("Click here to load an image.");

          // Register an action listener with the button.
          button.addActionListener(new ButtonListener());

          // Add the button to the panel.
          buttonPanel.add(button);
     }

     /**
         Private inner class that handles the event when
         the user clicks the button.
     */

     private class ButtonListener implements ActionListener
     {
          public void actionPerformed(ActionEvent e)
          {
               File selectedFile;     // To reference the selected image file
               ImageIcon image;       // To read the image from the file
               String filename;       // To hold the name and path of the file
               int fileChooserStatus; // Indicates status of the open dialog box

               // Display an open dialog box.
               fileChooserStatus = fileChooser.showOpenDialog(ImageViewer.this);

               if (fileChooserStatus == JFileChooser.APPROVE_OPTION)
               {
                    // Get a reference to the selected file.
                    selectedFile = fileChooser.getSelectedFile();

                    // Get the path of the selected file.
                    filename = selectedFile.getPath();

                    // Read the image from the file.
                    image = new ImageIcon(filename);

                    // Store the image in the label.
                    imageLabel.setIcon(image);

                    // If the label displays text, remove it.
                    imageLabel.setText(null);

                    // Pack the frame again to accomodate the 
                    // new size of the label.
                    pack();
               }
          }
     }

     /**
        The main method creates an instance of the ImageViewer
        class, causing it to display its window.
     */
        
     public static void main(String[] args)
     {
          ImageViewer iv = new ImageViewer();
     }
}
