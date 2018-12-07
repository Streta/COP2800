/**
   The StringOperations class provides several methods that 
   work with strings for the Miscellaneous String Operations
   programming challenge.
*/

public class StringOperations
{
   /**
      The wordCount method counts the number of words in
      a string.
      @param str The string to count.
      @return The number of words.
   */
      
   public static int wordCount(String str)
   {
      // Get the tokens, using a space delimiter.
      String[] tokens = str.split(" ");;

      // Return the number of tokens.
      return tokens.length;
   }

   /**
      The arrayToString method converts a char array
      to a String.
      @param array The array to be converted.
      @return A reference to the String.
   */
   
   public static String arrayToString(char[] array)
   {
      String newString = String.valueOf(array);
      return newString;
   }

   /**
      The mostFrequent method determines which character
      appears with the most frequencey in a string.
      @param str The string to check.
      @return The character that appears most frequently
              in the String.
   */
   
   public static char mostFrequent(String str)
   {
      int indexOfMostFreq;
      
      // Convert the String to an array.
      char[] cArray = str.toCharArray();
      
      // Create an int array to hold the frequencies
      // of the characters in cArray.
      int[] frequencies = new int[cArray.length];
      
      // Initialize each element of the frequencies array
      // to 0.
      for (int i = 0; i < frequencies.length; i++)
         frequencies[i] = 0;
      
      // Calculate the frequencies of each character.
      for (int i = 0; i < cArray.length; i++)
      {
         for (int f = 0; f < cArray.length; f++)
         {
            if (cArray[f] == cArray[i])
               frequencies[i]++;
         }
      }
      
      // Find the most frequent character.
      indexOfMostFreq = 0;
      for (int i = 1; i < frequencies.length; i++)
      {
         if (frequencies[i] > frequencies[indexOfMostFreq])
            indexOfMostFreq = i;
      }
      
      // Return the most frequent character.
      return cArray[indexOfMostFreq];
   }


   /**
      The replaceSubstring method accepts three Strings as
      arguments. It returns a String that is a copy of 
      string1, where all occurrences of string2 have been
      replaced by string3.
      @param string1 The first string.
      @param string2 The second string.
      @param string3 The third string.
      @return The resultant string.
   */

   public static String replaceSubString(String string1,
                          String string2, String string3)
   {
      // First, make sure string2 and string3 aren't the same.
      if (string2.equals(string3))
         return string1;
   
      // Make a StringBuffer object for string1.
      StringBuffer strbuff = new StringBuffer(string1);
      
      // Find the first occurrence of string3.
      int index = strbuff.indexOf(string2);
      
      while (index != -1)
      {
         // Replace this occurrence of the substring.
         strbuff.replace(index, (index + string2.length()), string3);
         
         // Find the next occurrence of string3.
         index = strbuff.indexOf(string2);
      }
      
      // Return the modified string.
      return strbuff.toString();
   }
}
