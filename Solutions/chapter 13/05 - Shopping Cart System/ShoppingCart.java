import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Shopping Cart System programming challenge.
*/

public class ShoppingCart extends JFrame
{
   private String[] bookTitles;     // To hold the book titles
   private String[] cartTitles;     // Titles in the shopping cart
   private double[] prices;         // To hold the book prices
   
   private JLabel banner;           // To display a banner
   private JPanel bannerPanel;      // To hold the banner
   private JPanel bookPanel;        // To hold the book list
   private JPanel cartPanel;        // To hold the shopping cart
   private JPanel buttonPanel;      // To hold the buttons
   
   private JList bookList;          // To show a list of books
   private JList cartList;          // Shopping cart list
   
   private JButton addButton;       // To add an item to the cart
   private JButton removeButton;    // To remove an item from the cart
   private JButton checkOutButton;  // To check out
   
   private double subtotal = 0.0;   // Selection subtotal
   private double tax = 0.0;        // Sales tax
   private double total = 0.0;      // Sale total
   
   // Constants
   private final int LIST_ROWS = 5; // Number of rows to display in lists
   private final double TAX_RATE = 0.06;  // Sales tax rate
                   
   /**
      Constructor
   */
   
   public ShoppingCart() throws IOException
   {
      // Display a title.
      setTitle("Book Store Shopping Cart");
      
      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Read the book titles and prices from the file.
      readBookFile();
      
      // Create the banner on a panel and add it to the North region.
      buildBannerPanel();
      add(bannerPanel, BorderLayout.NORTH);
            
      // Create a list component to show the books and add it
      // to the West region.
      buildBookPanel();
      add(bookPanel, BorderLayout.WEST);
      
      // Create a list component for the shopping cart and
      // add it to the East region.
      buildCartPanel();
      add(cartPanel, BorderLayout.EAST);
      
      // Build the button panel and add it to the center region.
      buildButtonPanel();
      add(buttonPanel, BorderLayout.CENTER);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The readBookFile method reads the contents of the 
      BookPrices.txt file and populates the BookTitles
      and Prices arrays.
      @exception IOException When an IO error occurs.
   */
   
   private void readBookFile() throws IOException
   {
      String input;  // To hold a line from the file
      int i = 0;     // To use as an array index
      
      // Get the number of books;
      int numBooks = countBooks();
      
      // Create the arrays.
      bookTitles = new String[numBooks];
      prices = new double[numBooks];
      
      // Open the file.
      File file = new File("BookPrices.txt");
      Scanner inFile = new Scanner(file);
      
      // Read the file.
      while (inFile.hasNext())
      {
         // Read a line from the file.
         input = inFile.nextLine();
         
         // Trim leading and trailing whitespace.
         input.trim();

         // Tokenize the string using the comma as a delimiter.
         String[] tokens = input.split(",");
         
         // Get the book title.
         bookTitles[i] = tokens[0];
         
         // Get the book price.
         prices[i] = Double.parseDouble(tokens[1]);

         // Update the index.
         i++;
      }
      
      // Close the file.
      inFile.close();
   }
      
   /**
      The countBooks method counts the number of books
      in the BookPrices.txt file.
      @return The number of books in the file.
   */
   
   private int countBooks() throws IOException
   {
      int count = 0;
      
      // Open the file.
      FileReader fr = new FileReader("BookPrices.txt");
      BufferedReader inFile = new BufferedReader(fr);
      
      while (inFile.readLine() != null)
         count++;
      
      inFile.close();
      return count;
   }

   /**
      The buildBannerPanel method builds a panel with a banner on it.
   */
      
   private void buildBannerPanel()
   {
      bannerPanel = new JPanel();
      bannerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
      banner = new JLabel("Welcome to the Book Store!");
      banner.setFont(new Font("SanSerif", Font.BOLD, 24));
      bannerPanel.add(banner);
   }

   /**
      The buildBookPanel method builds a panel with a list of
      books on it.
   */
   
   private void buildBookPanel()
   {
      JLabel bookMsg = new JLabel("Available Books");
      bookPanel = new JPanel();
      bookPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      bookList = new JList(bookTitles);
      bookList.setVisibleRowCount(LIST_ROWS);
      JScrollPane bookScrollPane = new JScrollPane(bookList);
      bookPanel.setLayout(new BorderLayout());
      bookPanel.add(bookMsg, BorderLayout.NORTH);
      bookPanel.add(bookScrollPane, BorderLayout.CENTER);
   }

   /**
      The buildCartPanel method builds a panel to show a list of
      selected books.
   */
      
   private void buildCartPanel()
   {
      JLabel cartMsg = new JLabel("Shopping Cart");
      cartPanel = new JPanel();
      cartPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      cartList = new JList();
      cartList.setVisibleRowCount(LIST_ROWS);
      JScrollPane cartScrollPane = new JScrollPane(cartList);
      cartPanel.setLayout(new BorderLayout());
      cartPanel.add(cartMsg, BorderLayout.NORTH);
      cartPanel.add(cartScrollPane, BorderLayout.CENTER);
   }


   /**
      The buildButtonPanel method creates a panel containing
      buttons.
   */
      
   private void buildButtonPanel()
   {
      // Create a button to add items to the shopping cart.
      addButton = new JButton("Add Selected Item");
      
      // Add an action listener to the button.
      addButton.addActionListener(new AddButtonListener());
      
      // Create a button to remove an item from the shopping cart.
      removeButton = new JButton("Remove Selected Item");
      
      // Add an action listener to the button.
      removeButton.addActionListener(new RemoveButtonListener());

      // Create a button to check out.
      checkOutButton = new JButton("Check Out");
      
      // Add an action listener to the button.
      checkOutButton.addActionListener(new CheckOutButtonListener());

      // Put the buttons in their own panel.
      buttonPanel = new JPanel();
      buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 5));
      buttonPanel.setLayout(new GridLayout(3, 1));
      buttonPanel.add(addButton);
      buttonPanel.add(removeButton);
      buttonPanel.add(checkOutButton);
   }
   
   /**
      The addToCart method adds a book to the shopping cart.
      @param str The book info.
   */
      
   private void addToCart(String str)
   {
      String[] temp;
      
      if (cartTitles == null)
         temp = new String[1];
      else
      {
         // Make a copy of the cartTitles array.
         temp = new String[cartTitles.length + 1];
         for (int i = 0; i < cartTitles.length; i++)
            temp[i] = cartTitles[i];
      }
      
      // Add the argument to the end of the temp array.
      temp[temp.length - 1] = str;
      
      // Replace the cartTitles array with the temp array.
      cartTitles = temp;
      
      // Update the cartList component.
      cartList.setListData(cartTitles);
      
      // Find the book's price and update the subtotal.
      boolean found = false;
      int index = 0;
      while (!found && index < bookTitles.length)
      {
         if (str.equals(bookTitles[index]))
         {
            subtotal += prices[index];
            found = true;
         }
         index++;
      }
   }

   /**
      The removeFromCart method removes a book from the shopping cart.
      @param elementToDelete The element of the cartTitles array
             containing the element to delete.
      @param str The title of the book to delete.
   */
      
   private void removeFromCart(int elementToDelete, String str)
   {
      String[] temp = null;
      
      if (cartTitles != null && cartTitles.length > 0)
      {
         // Make temp 1 element smaller than cartTitles.
         temp = new String[cartTitles.length - 1];
         
         // Copy the items to keep.
         for (int tempIndex = 0, cartIndex = 0; tempIndex < temp.length; cartIndex++)
         {
            if (cartIndex != elementToDelete)
            {
               temp[tempIndex] = cartTitles[cartIndex];
               tempIndex++;
            }
         }
      }
      
      // Replace the cartTitles array with the temp array.
      cartTitles = temp;
      
      // Update the cartList component.
      cartList.setListData(cartTitles);
      
      // Use the book's title (str) to find the book's
      // price and update the subtotal.
      boolean found = false;
      int index = 0;
      while (!found && index < bookTitles.length)
      {
         if (str.equals(bookTitles[index]))
         {
            subtotal -= prices[index];
            found = true;
         }
         index++;
      }
   }

   /**
      AddButtonListener is an action listener class for the
      addButton component.
   */
   
   private class AddButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */
      
      public void actionPerformed(ActionEvent e)
      {
         if (bookList.getSelectedValue() != null)
         {
            String selected = (String) bookList.getSelectedValue();
            addToCart(selected);
         }
      }
   } // End of inner class 

   /**
      RemoveButtonListener is an action listener class for the
      removeButton component.
   */
   
   private class RemoveButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */
            
      public void actionPerformed(ActionEvent e)
      {
         int selectedIndex = cartList.getSelectedIndex();
         String str = (String) cartList.getSelectedValue();
         if (selectedIndex > -1)
         {
            removeFromCart(selectedIndex, str);
         }
      }
   } // End of inner class 

   /**
      CheckOutButtonListener is an action listener class for the
      checkOutButton component.
   */
   
   private class CheckOutButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */
            
      public void actionPerformed(ActionEvent e)
      {
         // Compute the sales tax and total.
         tax = TAX_RATE * subtotal;
         total = subtotal + tax;
         
         // Display the total.
         JOptionPane.showMessageDialog(null, String.format(
                                       "Subtotal: $%,.2f\n" +
                                       "Tax: $%,.2f\n" +
                                       "Total: $%,.2f", 
                                       subtotal, tax, total));
      }
   } // End of inner class

   /**
      The main method creates an instance of the ShoppingCart
      class, causing it to display its window.
   */

   public static void main(String[] args) throws IOException
   {
      ShoppingCart sc = new ShoppingCart();
   }
}