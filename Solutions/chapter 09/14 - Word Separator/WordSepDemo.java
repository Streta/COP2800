import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Word Separator programming challenge.
*/

public class WordSepDemo
{
   public static void main(String[] args)
   {
      // String to hold input.
      String input;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a string from the user.
      System.out.println("Enter a sentence with no spaces between the words");
      System.out.println("and the first letter of each word capitalized.");
      System.out.println("Example: StopAndSmellTheRoses");
      System.out.print("> ");
      input = keyboard.nextLine();
      
      // Create a WordSeparator object.
      WordSeparator wordSep = new WordSeparator(input);
      
      // Display the formatted text.
      System.out.println(wordSep.getFormatted());
   }
}