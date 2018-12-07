/**
   The PasswordVerifier class stores data about a password
   for the Password Verifier programming challenge.
*/

public class PasswordVerifier
{
   // Minimum password length
   private static final int MIN_PASSWORD_LENGTH = 6;
   
   /**
      The isValid method determines whether a password is
      valid or not.
      @param str A string to test as a password.
      @return true if the string contains a valid password,
              false otherwise.
   */
   
   public static boolean isValid(String str)
   {
      boolean status;   // Flag
      
      if (str.length() >= MIN_PASSWORD_LENGTH && hasUpperCase(str) && 
          hasLowerCase(str) && hasDigit(str))
         status = true;
      else
         status = false;
         
      return status;
   }

   /**
      The hasUpperCase method determines whether a string
      has at least one uppercase character.
      @param str A string to test.
      @return true if the string contains an uppercase character,
              false otherwise.
   */
      
   private static boolean hasUpperCase(String str)
   {
      boolean status = false; // Flag
      
      for (int i = 0; i < str.length(); i++)
      {
         if (Character.isUpperCase(str.charAt(i)))
            status = true;
      }
      
      return status;
   }

   /**
      The hasLowerCase method determines whether a string
      has at least one lowercase character.
      @param str A string to test.
      @return true if the string contains an lowercase character,
              false otherwise.
   */
   
   private static boolean hasLowerCase(String str)
   {
      boolean status = false;
      
      for (int i = 0; i < str.length(); i++)
      {
         if (Character.isLowerCase(str.charAt(i)))
            status = true;
      }
      
      return status;
   }

   /**
      The hasDigit method determines whether a string
      has at least one numeric digit.
      @param str A string to test.
      @return true if the string contains a numeric digit,
              false otherwise.
   */
         
   private static boolean hasDigit(String str)
   {
      boolean status = false;
      
      for (int i = 0; i < str.length(); i++)
      {
         if (Character.isDigit(str.charAt(i)))
            status = true;
      }
      
      return status;
   }
}
