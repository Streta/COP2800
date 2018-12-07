import javax.swing.JOptionPane;  // For JOptionPane

/**
   This program demonstrates a solution to the
   Shipping Charges programming challenge.
*/

public class ShippingCharges
{
   public static void main(String[] args)
   {
      double weight,    // Weight
             distance,  // Distance to ship
             rate,      // Rate per 500 miles
             charges;   // The shipping charges
      int num500chunks; // Number of 500 mile chunks
      String input;     // To hold user input
      String output;    // To hold the output
      
      // Get the weight.
      input = JOptionPane.showInputDialog("Enter the " +
                                "weight, in pounds.");
      weight = Double.parseDouble(input);

      // Get the distance.
      input = JOptionPane.showInputDialog("Enter the " +
                          "distance to ship, in miles.");
      distance = Double.parseDouble(input);
      
      // Get the number of 500 mile chunks.
      num500chunks = (int)(distance / 500);
      
      // Get the shipping rate.
      if (weight > 10)
         rate = 4.80;
      else if (weight > 6)
         rate = 3.70;
      else if (weight > 2)
         rate = 2.20;
      else
         rate = 1.10;
      
      // Calculate the charges.
      charges = rate * num500chunks;
            
      // Format and display the charges.
      output = String.format("The shipping charges are $%,.2f", charges);
      JOptionPane.showMessageDialog(null, output);

      System.exit(0);
   }
}
