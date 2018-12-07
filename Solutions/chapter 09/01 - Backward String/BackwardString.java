import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Backward String programming challenge.
*/

public class BackwardString
{
   public static void main(String[] args)
   {
      String input;  // Keyboard input

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
                  
      // Get a string.     
      System.out.print("Enter something: ");
      input = keyboard.nextLine();
      
      // Display it backward.
      backward(input);
   }
   
   /**
      The backward method displays a string backward.
      @param str The string to display backward.
   */
   
   public static void backward(String str)
   {
      for (int i = str.length() - 1; i >= 0; i--)
         System.out.print(str.charAt(i));
      System.out.println();
   }
}