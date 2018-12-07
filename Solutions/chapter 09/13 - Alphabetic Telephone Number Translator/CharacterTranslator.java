/**
   The CharacterTranslator class stores data 
   about telephone digits for the Alphabetic 
   Telephone Number Translator programming 
   challenge.
*/

public class CharacterTranslator
{
   /**
      The getPhoneDigit method accepts a character
      that might be used in a telephone number. If
      character is alphabetic, the method returns
      the numeric digit that corresponds to it on
      the telephone keypad. Otherwise, the character
      that was passed as an argument is returned.
      @param c The character to translate.
      @return The corresponding numeric digit, or
              the original value of c.
   */
   
   public static char getPhoneDigit(char c)
   {
      // The digit variable will hold the digit
      // on a standard telephone keypad that
      // corresponds with the character.
      char digit;
      
      // Get the uppercase version of the character.
      c = Character.toUpperCase(c);

      // See if it is A, B, or C.
      if (c == 'A' || c == 'B' || c == 'C')
         digit = '2';
      // Otherwise, see if it is D, E, or F.
      else if (c == 'D' || c == 'E' || c == 'F')
         digit = '3';
      // Otherwise, see if it is G, H, or I.
      else if (c == 'G' || c == 'H' || c == 'I')
         digit = '4';
      // Otherwise, see if it is J, K, or L.
      else if (c == 'J' || c == 'K' || c == 'L')
         digit = '5';
      // Otherwise, see if it is M, N, or O.
      else if (c == 'M' || c == 'N' || c == 'O')
         digit = '6';
      // Otherwise, see if it is P, Q, R, or S.
      else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S')
         digit = '7';
      // Otherwise, see if it is T, U, or V.
      else if (c == 'T' || c == 'U' || c == 'V')
         digit = '8';
      // Otherwise, see if it is W, X, Y, or Z.
      else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z')
         digit = '9';
      // Otherwise, leave the character as it is.
      else
         digit = c;
      
      // Return the translated character.
      return digit;
   }
}