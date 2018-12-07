/**
   The PhoneTranslator class translates 
   telephone characters to digits for the 
   Alphabetic  Telephone Number Translator  
   programming challenge.
*/

public class PhoneTranslator
{
   private StringBuilder translated;
   
   /**
      Constructor
      @param phone A phone number that may contain alpahabetic
                   characters.
   */
   
   public PhoneTranslator(String phone)
   {
      // Create a StringBuilder to hold the translated number.
      translated = new StringBuilder("");
      
      // Translate each character in the number.
      for (int index = 0; index < phone.length(); index++)
      {
         char ch = CharacterTranslator.getPhoneDigit(phone.charAt(index));
         translated.append(ch);
      }
   }
   
   /**
      The getTranslated method returns the
      numeric version of the phone number.
      @return The translated numeric phone number.
   */
   
   public String getTranslated()
   {
      return translated.toString();
   }
}