import javax.swing.*;

/**
   This program demonstrates a solution to the
   Recursive Multiplication programming challenge.
*/

public class RecursiveMultiplier
{
   public static void main(String[] args)
   {
      double num1, num2;   // Two numbers to multiply
      String input;        // To hold keyboard input
      
      // Get the first number.
      input = JOptionPane.showInputDialog("Enter a number.");
      num1 = Double.parseDouble(input);
      
      // Get the second number.
      input = JOptionPane.showInputDialog("Okay, enter another number.");
      num2 = Double.parseDouble(input);
      
      // Show their product.
      JOptionPane.showMessageDialog(null, num1 + " times " + num2 + 
                                    " equals " + multiply(num1, num2));
                                    
      System.exit(0);
   }
   
   /**
      The multiply method uses recursion to multiply
      x by y. The multiplication is performed
      as repetitive addition.
      @param x A number to multiply.
      @param y Another number to multiply.
      @return The product of x times y.
   */

   public static double multiply(double x, double y)
   {
      if (x == 1)
         return y;
      else
         return y + multiply(x - 1, y);
   }
}