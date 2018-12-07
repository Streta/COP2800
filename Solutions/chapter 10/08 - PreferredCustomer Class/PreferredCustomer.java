/**
   The PreferredCustomer class stores data about
   a person who is a customer that can earn 
   discounts for the Person and Customer 
   Classes programming challenge.
*/

public class PreferredCustomer extends Customer
{
   private double purchases;        // Amount of purchases
   private double discountLevel;    // Discount level

   /**
      The no-arg constructor initializes the object with
      empty strings for name, address, phone, and
      customerNumber. The mailingList field is set
      to false. The purchases and discountLevel fields
      are set to 0.0.
   */
   
   public PreferredCustomer()
   {
      super();
      purchases = 0.0;
      discountLevel = 0.0;
   }

   /**
      This constructor initializes the object with
      a name, address, a phone number, a customer
      number, mailing list status, and amount of
      purchases
      @param n The name.
      @param a The address.
      @param p The phone number.
      @param c The customer number.
      @param m Mailing list status (true = yes, false = no).
      @param pur Amount of purchases.
   */
   
   public PreferredCustomer(String n, String a, String p, 
                   String c, boolean m, double pur)
   {
      super(n, a, p, c, m);
      setPurchases(pur);
   }

   /**
      The setPurchases method sets the amount of purchases.
      The discount level is also determined.
      @param p The amount of purchases.
   */
   
   public void setPurchases(double p)
   {
      purchases = p;
      if (purchases >= 2000)
         discountLevel = 0.1;    // 10% discount
      else if (purchases >= 1500)
         discountLevel = 0.07;   // 7% discount
      else if (purchases >= 1000)
         discountLevel = 0.06;   // 6% discount
      else if (purchases >= 500)
         discountLevel = 0.05;   // 5% discount
      else
         discountLevel = 0;      // 0% discount
   }

   /**
      The getPurchases method returns the amount of purchases.
      @return The amount of purchases.
   */
   
   public double getPurchases()
   {
      return purchases;
   }

   /**
      The getDiscountLevel method returns the discount
      level.
      @return The customer's discount level.
   */
   
   public double getDiscountLevel()
   {
      return discountLevel;
   }
}
