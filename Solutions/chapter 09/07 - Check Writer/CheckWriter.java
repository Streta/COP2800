import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Check Writer programming challenge.
*/

public class CheckWriter
{
   public static void main(String[] args)
   {
      String date;      // Check date
      String name;      // Pay to the order of
      double amount;    // Amount of check
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the date.
      System.out.print("Enter the check date: ");
      date = keyboard.nextLine();
      
      // Get the name of the payee.
      System.out.print("Enter the name of the payee: ");
      name = keyboard.nextLine();
      
      // Get the amount of the check.
      System.out.print("Enter the amount of the check: ");
      amount = keyboard.nextDouble();
      
      // Validate the amount of the check.
      while (amount < 0 || amount > 10000)
      {
         System.out.print("ERROR: Enter at least 1 and no more " +
                          "than 10000: ");
         amount = keyboard.nextDouble();
      }
      
      // Display the simulated check.
      System.out.println("\t\t\t\t\t\tDate: " + date);
      System.out.print("Pay to the order of: " + name);
      System.out.printf("\t\t$%,.2f\n", amount);
      System.out.println(wordNumber(amount));
   }
   
   /**
      The wordNumber method converts a number to an English
      word.
      @param num The number to convert.
      @return A string containing an English word version of num.
   */
   
   public static String wordNumber(double num)
   {
      String[] onesWords = { "", "One", "Two", "Three", "Four", 
                             "Five", "Six", "Seven", "Eight", "Nine" };
      String[] teensWords = { "", "", "", "", "", "", "", "", "", "",
                              "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                              "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
      String[] tensWords = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", 
                             "Sixty", "Seventy", "Eighty", "Ninety" };
   
      int ks, huns, tens, teens, ones, cents;
      String fracString = "";
      String str = "";
      
      if (num == 10000)
      {
         str = "Ten Thousand and 0 cents";
      }
      else
      {
         // Get the thousands part.
         ks = (int)(num / 1000);
    
         if (ks > 0)
         {
            str += onesWords[ks];
            str += " thousand ";
            num -= (ks * 1000);
         }

         // Get the hundreds part.
         huns = (int)(num / 100);

         if (huns > 0)
         {
            str += onesWords[huns];
            str += " hundred ";
            num -= (huns * 100);
         }

         // Get the tens part.
         tens = (int)(num / 10);

         if (tens > 1)
         {
            str += tensWords[tens];
            str += " ";
            num -= (tens * 10);
         }
         else if (tens == 1)
         {
            teens = (int)(num);
            str += teensWords[teens];
            num -= (int)(num);
         }
         
         // Get the ones.
         ones = (int)(num);
            
         if (ones > 0)
         {
            str += onesWords[ones];
            num -= ones;
         }

         // Get the cents.
         str += " and ";
         cents = (int)( num * 100 );   // Convert fractional part to whole
         fracString = Integer.toString(cents);
         str += fracString;
         str += " cents";
      }
      
      return str;
   }
}