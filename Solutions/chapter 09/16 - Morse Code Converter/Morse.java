/**
   The Morse class stores data about Morse code for
   the Morse Code Converter programming challenge.
*/

public class Morse
{
   // Constant for the number of characters
   final int NUM_CHARS = 40;
   
   // Variable fields
   private String original;  // Original string
   private String mcode;     // Morse code version

   private char[] regular = 
           { ' ', ',', '.', '?', '0', '1', '2', '3', '4', '5', 
             '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 
             'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
             'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' 
           };
           
   String []morse = 
           { " ", "--..--" , ".-.-.-" , "..--.." ,
             "-----", ".----", "..---", "...--",
             "....-", ".....", "-....", "--...",
             "---..", "----.", ".-", "-...",
             "-.-.", "-..", ".", "..-.",
             "--.", "....", "..", ".---",
             "-.-", ".-..", "--", "-.",
             "---", ".--.", "--.-", ".-.",
             "...", "-", "..-", "...-",
             ".--", "-..-", "-.--", "--.."
            };

   
   /**
      Constructor
      @param input The string to encode.
   */
   public Morse(String input)
   {
      // Assign input to original.
      original = input;
      
      // We will use indes to step through the input string.
      int index = 0;
      
      // Start mcode with an empty string.
      mcode = "";
      
      // Translate each character and display it.  
      while (index < input.length())
      {
         // Get the morse code for a character and append
         // it to mcode, followed by a newline.
         mcode = mcode + 
                 toMorse(Character.toUpperCase(input.charAt(index))) + 
                 "\n";
         
         // Increment index for the next character.
         index++;
      }
   }

   /**
      The toMorse function accepts a char argument and
      returns a string containing the morse code
      for that character.
      @param ch The character to conert.
      @return A string containing the Morse code for
              the character passed as an argument.
   */
   public String toMorse(char ch)
   {
       // Find the character in the array.
       int index = 0;
       while (index < NUM_CHARS && ch != regular[index])
       {
           index++;
       }
   
       String morseValue;  // To hold the morse code
   
       if (index >= NUM_CHARS)
           morseValue = "UNDEFINED";  // ch was not found
       else
           morseValue = morse[index]; // Get the morse code
   
       return morseValue;
   }
   
   /**
      getOriginal method
      @return The original string.
   */
   public String getOriginal()
   {
      return original;
   }
   
   /**
      getMorseCode method
      @return The Morse code version of the string.
   */
   public String getMorseCode()
   {
      return mcode;
   }
}