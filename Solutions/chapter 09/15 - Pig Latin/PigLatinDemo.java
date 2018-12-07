import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Pig Latin programming challenge.
*/
public class PigLatinDemo
{
   public static void main(String[] args)
   {
      // String to hold input.
      String input;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a string to convert.
      System.out.println("Enter a string and I will convert it to Pig Latin.");
      System.out.print("> ");
      input = keyboard.nextLine();
      
      // Convert it to uppercase, for consistency.
      input = input.toUpperCase();
      
      // Create a PigLatinator object.
      PigLatinator p = new PigLatinator(input);
      
      // Display the Pig Latin translation.
      System.out.println(p.getPigLatin());
   }
}