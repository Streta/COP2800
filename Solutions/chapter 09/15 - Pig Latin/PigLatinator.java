/**
   The PigLatinator class converts a string to pig 
   latin for the Pig Latin programming challenge.
*/

public class PigLatinator
{
   private String original; // Original string
   private String pigLatin; // Pig Latin version
   
   /**
      Constructor
      @param input The string to convert to Pig Latin.
   */
   public PigLatinator(String input)
   {
      // Variable to hold each word
      String word;
      
      // Save the input string.
      original = input;
      
      // Initialize pigLatin to an empty string.
      pigLatin = "";
      
      // Trim all leading and trailing whitespaces.
      StringBuilder sb = new StringBuilder(input.trim());
      
      while (sb.length() > 0)
      {
         // Remove the first word from sb and assign it to word.
         word = popWord(sb);
         
         // Convert the word to Pig Latin and add it to the
         // Pig Latin sentence.
         pigLatin = pigLatin + toPigLatin(word) + " ";
      }
   }
   
   /**
      The popWord method removes the first word from the
      StringBuilder argument.
      @param sb A StringBuilder containing a sentence.
      @return The first word of the sentence.
   */
   private String popWord(StringBuilder sb)
   {
      // Locate the first space, or the end of the string.
      int index = 0;
      while (index < sb.length() && sb.charAt(index) != ' ')
      {
         index++;
      }
      
      // Get the word from the beginning of sb.
      String word = sb.substring(0, index);
      
      // Delete the word from sb.
      sb.delete(0, index+1);
      
      // Return the extracted word.
      return word;
   }
   
   /**
      The toPigLatin method converts a word to Pig Latin.
      @param word The word to convert.
      @return The Pig Latin version of the word.
   */
   private String toPigLatin(String word)
   {
      // Create a StringBuilder.
      StringBuilder sb = new StringBuilder(word);
      
      // Get the first letter of the word.
      char first = sb.charAt(0);

      // Append the letter to the end of the word.
      sb.append(first);

      // Append "AY" to the word.
      sb.append("AY");

      // Delete the first letter.
      sb.deleteCharAt(0);

      // Return the word.
      return sb.toString();
   }
   
   /**
      getPigLatin method
      @return The Pig Latin version of the string.
   */
   public String getPigLatin()
   {
      return pigLatin;
   }
   
   /**
      getOriginal method
      @return The original string.
   */
   public String getOriginal()
   {
      return original;
   }
}