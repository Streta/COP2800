import java.io.*;

/**
   This program demonstrates a solution to the
   File Decryption Filter programming challenge.

   This program decrypts the file "Encrypted.txt"
   The decrypted copy is stored in "MyLetters.txt".
*/

public class FileDecryptionFilter
{
   public static void main(String[] args)
   {
      System.out.println("Decrypting the contents of the file");
      System.out.println("Encrypted.txt. The encrypted file will");
      System.out.println("be stored as MyLetters.txt");

      try
      {     
         Crypto.decryptFile("Encrypted.txt", "MyLetters.txt");
         System.out.println("Done. Use Notepad to inspect the decrypted file.");
      }
      catch (IOException e)
      {
         System.out.println("Error - " + e.getMessage());
      }
   }
}
