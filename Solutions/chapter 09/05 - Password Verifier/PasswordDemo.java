import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Password Verifier programming challenge.
*/

public class PasswordDemo
{
   public static void main(String[] args)
   {
      String input;  // To hold keyboard input
      
      // Get a password string.
      input = JOptionPane.showInputDialog("Enter a password.");
      
      // Determine whether the password is valid or not.
      if (!PasswordVerifier.isValid(input))
         JOptionPane.showMessageDialog(null, "Invalid password.");
      else
         JOptionPane.showMessageDialog(null, "Valid password.");

      // Exit the applicaton.
      System.exit(0);
   }
}