/**
   This program demonstrates a solution to the
   PreferredCustomer Class programming challenge.
*/

public class PreferredCustomerDemo
{
   public static void main(String[] args)
   {
      // Create a PreferredCustomer object for Julie James.
      // She has $1750.00 in purchases. That entitles her
      // to a 7% discount on future purchases.
      PreferredCustomer myCustomer =
          new PreferredCustomer("Julie James", "123 Main Street",
                                "555-1212", "147-A049",
                                true, 1750.00);

      // Display the object's data.
      System.out.println("Name: " + myCustomer.getName());
      System.out.println("Address: " + myCustomer.getAddress());
      System.out.println("Telephone: " + myCustomer.getPhone());
      System.out.println("Customer Number: " +
                                 myCustomer.getCustomerNumber());

      if (myCustomer.getMailingList())
         System.out.println("Mailing List: YES");
      else
         System.out.println("Mailing List: NO");

      System.out.printf("Purchases: $%,.2f\n",
                        myCustomer.getPurchases());
      System.out.println("Discount level: " +
                         myCustomer.getDiscountLevel());
   }
}