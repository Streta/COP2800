/**
   This program demonstrates a solution to the
   Person and Customer Classes programming challenge.
*/

public class CustomerClassDemo
{
   public static void main(String[] args)
   {
      // Create a Customer object for Julie James.
      Customer myCustomer = new Customer("Julie James",
            "123 Main Street", "555-1212", "147-A049", true);
                              
      // Display the object's data.
      System.out.println("Name: " + myCustomer.getName());
      System.out.println("Address: " + myCustomer.getAddress());
      System.out.println("Telephone: " + myCustomer.getPhone());
      System.out.println("Customer Number: " + myCustomer.getCustomerNumber());
      if (myCustomer.getMailingList())
         System.out.println("Mailing List: YES");
      else
         System.out.println("Mailing List: NO");
   }
}