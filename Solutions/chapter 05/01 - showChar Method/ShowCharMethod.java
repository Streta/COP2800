/**
   This program demonstrates a solution to the
   showChar Method programming challenge.
*/

public class ShowCharMethod
{
   public static void main(String[] args)
   {
      String testString = "New York";
      
      showChar(testString, 2);
   }
   
   /**
      The showChar method displays the character at
      a specified position in a string.
      @param str A string.
      @param pos The position of a character in str.
   */
   
   public static void showChar(String str, int pos)
   {
      System.out.println(str.charAt(pos));
   }
}