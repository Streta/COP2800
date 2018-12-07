import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Morse Code Converter programming challenge.
*/

public class MorseCodeConverter
{
   public static void main(String[] args)
   {
      // String to hold the user's input.
      String input;
      
      // Create a Scanner object for keyboard inpout.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a string from the user.
      System.out.println("Enter a string and I will convert it " +
                         "to Morse code.");
      System.out.print("> ");
      input = keyboard.nextLine();
      
      // Create a Morse object.
      Morse mcoder = new Morse(input);
      
      // Display the Morse code.
      System.out.println(mcoder.getMorseCode());
   }
}