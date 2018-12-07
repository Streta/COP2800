/**
   The WordSeparator class stores data about an string
   for the Word Separator programming challenge.
*/

public class WordSeparator
{
   private String original;   // The original string
   private String formatted;  // The formatted string
   
   /**
      Constructor
      @param input The string to be formatted.
   */
   public WordSeparator(String input)
   {
      // Keep the input string.
      original = input;
      
      // Create a StringBuilder object, initialized
      // with a copy of the original string.
      StringBuilder sb = new StringBuilder(original);
      
      // Step through each character in the StringBuilder
      // starting at the 2nd character
      for (int i = 1; i < sb.length(); i++)
      {
         // If this character is uppercase, then change it
         // to lower case and insert a space before it.
         if (Character.isUpperCase(sb.charAt(i)))
         {
            // Change character i to lowercase.
            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            
            // Insert a space before character i.
            sb.insert(i, " ");
         }
      }
      
      // Assign the formatted string to formatted.
      formatted = sb.toString();
   }
   
   /**
      getFormatted method
      @return The formatted string.
   */
   public String getFormatted()
   {
      return formatted;
   }
}