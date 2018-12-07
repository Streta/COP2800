/**
   The VowelCons class stores data about a sentence
   for the Vowels and Consonants programming challenge.
*/

public class VowelCons
{
   // A list of the vowels
   private char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
   
   // A list of the consonants
   private char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H',
                                'J', 'K', 'L', 'M', 'N', 'P',
                                'Q', 'R', 'S', 'T', 'V', 'W',
                                'X', 'Y', 'Z' };
                                
   private int numVowels = 0; // Number of vowels found
   private int numCons = 0;   // Number of consonants found
   
   /**
      The constructor initializes an object with
      a string.
      @param str The string to initialize the object with.
   */

   public VowelCons(String str)
   {
      countVowelsAndCons(str);
   }
   
   /**
      getNumVowels method
      @return The number of vowels in the string.
   */
   
   public int getNumVowels()
   {
      return numVowels;
   }

   /**
      getNumConsonants method
      @return The number of consonants in the string.
   */
   
   public int getNumConsonants()
   {
      return numCons;
   }
   
   /**
      countVowelsAndCons is a private method that counts
      the number of vowels and consonants in a string.
      @param str The string to count vowels and consonants in.
   */
   
   private void countVowelsAndCons(String str)
   {
      boolean vowelFound;  // Flag
              
      // Step through the string counting vowels and
      // consonats.
      for (int i = 0; i < str.length(); i++)
      {
         vowelFound = false;
         
         // Determine whether the character at position i
         // is also found in the vowels array.
         for (int v = 0; v < vowels.length; v++)
         {
            if (Character.toUpperCase(str.charAt(i)) == vowels[v])
            {
               numVowels++;
               vowelFound = true;
            }
         }
         
         // If the character at position i is not a vowel,
         // determine whether it is a consonant. (We make this
         // check because it might be a punctuation character.
         
         if (!vowelFound)
         {
            // Determine whether the character at position i
            // is also found in the consonants array.
            for (int c = 0; c < consonants.length; c++)
            {
               if (Character.toUpperCase(str.charAt(i)) == consonants[c])
               {
                  numCons++;
               }
            }
         }
      }
   }  // end of countVowelsAndCons method
}
