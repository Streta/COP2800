import java.util.Scanner;
import java.util.ArrayList;

/**
   This program demonstrates a solution to the
   Phone Book ArrayList programming challenge.
*/

public class PhoneBookDemo
{
   public static void main(String args[])
   {
      // Constant for the numer of entries.
      final int NUM_ENTRIES = 5;

      // Create an ArrayList to hold PhoneBookEntry objects.
      ArrayList<PhoneBookEntry> list = new ArrayList<>();
         
      // Tell the user what's about to happen.
      System.out.println("I'm going to ask you to enter " +
                         NUM_ENTRIES + " names and phone numbers.");
      System.out.println();
      
      // Store PhoneBookEntry objects in the ArrayList.
      for (int i = 0; i < NUM_ENTRIES; i++)
      {
         list.add( getEntry() );
         System.out.println();
      }
      
      System.out.println("Here's the data you entered:");
      
      // Display the data stored in the ArrayList.
      for (int i = 0; i < list.size(); i++)
      {
         displayEntry(list.get(i));
      }
   }
   
   /**
      The getEntry method creates a PhoneBookEntry object
      populated with data entered by the user.
      @return A reference to the object.
   */
   public static PhoneBookEntry getEntry()
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Variables to hold a person's name and
      // phone number.
      String name;
      String phoneNumber;
      
      // Get the data.
      System.out.print("Enter a person's name: ");
      name = keyboard.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = keyboard.nextLine();
      
      // Create a PhoneBookEntry object.
      PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);
      
      // Return a reference to the object.
      return entry;
   }
   
   /**
      The displayEntry method displays the data stored
      in a PhoneBookEntry object.
      @param entry The entry to display.
   */
   public static void displayEntry(PhoneBookEntry entry)
   {
      System.out.println("------------------------------");
      System.out.println("Name: " + entry.getName());
      System.out.println("Phone number: " + entry.getPhoneNumber());
   }
}