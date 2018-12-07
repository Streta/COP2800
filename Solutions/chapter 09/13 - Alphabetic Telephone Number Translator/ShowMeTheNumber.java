import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Alphabetic Telephone Number Translator 
   programming challenge.
*/

public class ShowMeTheNumber
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read
      // keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a phone number.
      System.out.print("Enter a phone number containing " +
                       "alphabetic characters: ");
      String phone = keyboard.nextLine();
      
      // Create an instance of the PhoneTranslator class.
      PhoneTranslator pt = new PhoneTranslator(phone);
      
      // Display the numeric version of the number.
      System.out.println("The numeric version of that number is " +
                         pt.getTranslated());
   }
}