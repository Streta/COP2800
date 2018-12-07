/**
   This program demonstrates a solution to the
   Name, Age, and Annual Income programming challenge.
*/

public class NameAgeAnnualIncome
{
   public static void main(String[] args)
   {
      String name;         // To hold a name
      int age;             // To hold an age
      double annualPay;    // To hold annualPay
      
      // Store values in the String object and variables.
      name = "Joe Mahoney";
      age = 26;
      annualPay = 100000.0;
      
      // Display a message.
      System.out.println("My name is " + name +
                         ", my age is " + age +
                         " and I hope to earn $" +
                         annualPay + " per year.");
   }
}