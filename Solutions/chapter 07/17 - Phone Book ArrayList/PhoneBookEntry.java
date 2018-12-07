/**
   The PhoneBookEntry class stores data about an phone book entry
   for the Phone Book ArrayList programming challenge.
*/

public class PhoneBookEntry
{
   private String name;         // Person's name
   private String phoneNumber;  // Person's phone number

   /**
      Constructor
   */
   public PhoneBookEntry(String n, String pn)
   {
      name = n;
      phoneNumber = pn;
   }
   
   /**
      setName method
      @param n The person's name.
   */
   public void setName(String n)
   {
      name = n;
   }
   
   /**
      setPhoneNumber method
      @param pn The person's phone number.
   */
   public void setPhoneNumber(String pn)
   {
      phoneNumber = pn;
   }
   
   /**
      getName method
      @return The person's name.
   */
   public String getName()
   {
      return name;
   }
   
   /**
      getPhoneNumber method
      @return The person's phone number.
   */
   public String getPhoneNumber()
   {
      return phoneNumber;
   }
}
