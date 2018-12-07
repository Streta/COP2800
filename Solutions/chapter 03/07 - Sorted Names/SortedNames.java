import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Sorted Names programming challenge.
*/

public class SortedNames
{
   public static void main(String[] args)
   {
      String name1,     // The first name
             name2,     // The second name
             name3;     // The third name
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the three names.
      System.out.print("Enter the first name: ");
      name1 = keyboard.nextLine();
      System.out.print("Enter the second name: ");
      name2 = keyboard.nextLine();
      System.out.print("Enter the third name: ");
      name3 = keyboard.nextLine();

      // Display the sorted list.
      
      // First, check to see whether name1 is the least.
      if (name1.compareToIgnoreCase(name2) <= 0 &&
          name1.compareToIgnoreCase(name3) <= 0)
      {
         // Display name1 first because it is less than
         // or equal to the other two names.
         System.out.println(name1);
         
         // If name2 is less than or equal to name3, display
         // it next, then display name3.
         if (name2.compareToIgnoreCase(name3) <= 0)
         {
            System.out.println(name2);
            System.out.println(name3);
         }
         // Otherwise, display name3, then name2.
         else
         {
            System.out.println(name3);
            System.out.println(name2);
         }
         // We're done.
      }
      // Okay, now check to see whether name2 is the least.
      else if (name2.compareToIgnoreCase(name1) <= 0 &&
          name2.compareToIgnoreCase(name3) <= 0)
      {
         // Display name2 first because it is less than
         // or equal to the other two names.
         System.out.println(name2);
         
         // If name1 is less than or equal to name3, display
         // it next, then display name3.
         if (name1.compareToIgnoreCase(name3) <= 0)
         {
            System.out.println(name1);
            System.out.println(name3);
         }
         // Otherwise, display name3, then name1.
         else
         {
            System.out.println(name3);
            System.out.println(name1);
         }
         // We're done.
      }
      // Okay, now check to see whether name3 is the least.    
      else if (name3.compareToIgnoreCase(name2) <= 0 &&
          name3.compareToIgnoreCase(name3) <= 0)
      {
         // Display name3 first because it is less than
         // or equal to the other two names.
         System.out.println(name3);
         
         // If name1 is less than or equal to name2, display
         // it next, then display name3.
         if (name1.compareToIgnoreCase(name2) <= 0)
         {
            System.out.println(name1);
            System.out.println(name2);
         }
         // Otherwise, display name2, then name1.
         else
         {
            System.out.println(name2);
            System.out.println(name1);
         }
         // We're done.
      }
   }
}
