import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Payroll Class programming challenge.
*/

public class PayrollDemo
{
   public static void main(String[] args)
   {
      int hours;        // Hours worked
      double payRate;   // Hourly pay rate

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create a Payroll object.
      Payroll pr = new Payroll();

      // Get the hours and pay rate for each employee.
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         // Get the hours worked.
         System.out.print("Enter the hours worked by employee " +
                          "number " + pr.getEmployeeIdAt(i) +
                          ": ");
         hours = keyboard.nextInt();

         // Validate hours worked.
         while (hours < 0)
         {
            System.out.print("ERROR: Enter 0 or greater for hours: ");
            hours = keyboard.nextInt();
         }

         // Get the hourly pay rate.
         System.out.print("Enter the hourly pay rate for employee " +
                          "number " + pr.getEmployeeIdAt(i) +
                          ": ");
         payRate = keyboard.nextDouble();

         // Validate pay rate.
         while (payRate < 6.0)
         {
            System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
            payRate = keyboard.nextDouble();
         }

         // Store the data in the pr object.
         pr.setHoursAt(i, hours);
         pr.setPayRateAt(i, payRate);
      }

      // Display the payroll data for each employee.
      System.out.println("\nPAYROLL DATA");
      System.out.println("============");
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         System.out.println("Employee ID: " +
                            pr.getEmployeeIdAt(i));
         System.out.printf("Gross pay: $%,.2f\n",
                           pr.getGrossPay(i));
      }
   }
}

