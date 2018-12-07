import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   isPrime Method programming challenge.
*/

public class IsPrimeMethod
{
   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      String message;      // Message to display
      int number;          // Number to check for prime
      
      // Get the number.
      input = JOptionPane.showInputDialog("Enter a number.");
      number = Integer.parseInt(input);

      // Determine whether it is prime or not.
      if (isPrime(number))
         message = "That is a prime number.";
      else
         message = "That is not a prime number.";
   
      // Display a message.
      JOptionPane.showMessageDialog(null, message);
                      
      System.exit(0);
   }
   
   /**
      The isPrime method determines whether a number is prime.
      @param num The number to check.
      @return true if the number is prime, false otherwise.
   */
   public static boolean isPrime(int num)
   {
      boolean divisorFound = false;
      int div = 2;
      
      while(div < num && !divisorFound)
      {
         if ((num % div) == 0)
            divisorFound = true;
         div++;
      }
      
      return !divisorFound;
   }
}