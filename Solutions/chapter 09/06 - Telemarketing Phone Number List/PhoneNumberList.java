import javax.swing.JOptionPane;

/**
   This program demonstrates a solution to the
   Telemarketing Phone Number List programming challenge.
*/

public class PhoneNumberList
{
   public static void main(String[] args)
   {
      // An array with a list of names.
      String[] names = {"Harrison, Rose", "James, Jean",
                        "Smith, William", "Smith, Brad" };
                        
      // An array with a list of phone numbers.
      String[] phones = {"555-2234", "555-9098", 
                         "555-1785", "555-9224"};

      String search; // String to search for
      int index = 0; // Index into the arrays
      
      // Get all or part of a name to search for.
      search = JOptionPane.showInputDialog("Enter all or part of " +
                                       "a last name to search for.");
      
      while(index < names.length)
      {
         if (names[index].startsWith(search))
            JOptionPane.showMessageDialog(null, names[index] + 
                                        ": " + phones[index]);
         index++;
      }

      // Exit the applicaton.
      System.exit(0);
   }
}