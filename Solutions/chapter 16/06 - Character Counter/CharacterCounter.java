/**
   This program demonstrates a solution to the
   Character Counter programming challenge.
*/

public class CharacterCounter
{
   public static void main(String[] args)
   {
      // Create an array of chars to test.
      // The character 'a appears 6 times.
      char[] test = {'a', 'b', 'a', 'c', 'd', 'a', 'e',
                     'a', 'f', 'g', 'h', 'a', 'i', 'a'};

      System.out.println("The character 'a' appears " +
                         charCount(test, 0, 'a') + " times.");
   }
   
   /**
      The charCount method counts the number of
      times a specified character appears in the
      portion of an array starting at a specified
      subscript.
      @param array The array being searched.
      @param start The starting subscript of the
             part of the array being searched.
      @param ch The character to search for.
      @return The number of times the character
              appears in the specified part of
              the array.
      */
   
   public static int charCount(char[] array, int start, char ch)
   {
      int numChars = 0;
      
      if (start == (array.length))
         return 0;
      else
      {
         if (array[start] == ch)
            numChars = 1;
         return numChars + charCount(array, start + 1, ch);
      }
   }
}