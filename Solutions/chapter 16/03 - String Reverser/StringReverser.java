/**
   This program demonstrates a solution to the
   String Reverser programming challenge.
*/

public class StringReverser
{
   public static void main(String[] args)
   {
      String str = "Good Morning Java!";
      strReverse(str);
   }
   
   /**
      The strReverse method uses recursion to
      display a string backward.
      @param str The string to display backward.
   */

   public static void strReverse(String str)
   {
      if (str.length() == 0)  // Reached the end of the string
      {
         return;
      }
      else
      {
         System.out.print(str.charAt(str.length()-1));
         strReverse(str.substring(0, str.length()-1));
      }
   }
}