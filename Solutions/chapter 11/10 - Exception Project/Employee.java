/**
   The Employee class stores data about an employee
   for the Exception Project programming challenge.
*/

public class Employee
{
   private String name;             // Employee name
   private String employeeNumber;   // Employee number
   private String hireDate;         // Employee hire date
   
   /**
      This constructor initializes an object with a name,
      employee number, and hire date.
      @param n The employee's name.
      @param num The employee's number.
      @param date The employee's hire date.
   */
      
   public Employee(String n, String num, String date )throws InvalidEmployeeNumber
   {
      name = n;
      setEmployeeNumber(num);
      hireDate = date;
   }

   /**
      The no-arg constructor initializes an object with
      null strings for name, employee number, and hire
      date.
   */
      
   public Employee()
   {
      name = "";
      employeeNumber = "0";
      hireDate = "";
   }
   
   /**
      The setName method sets the employee's name.
      @param n The employee's name.
   */

   public void setName(String n)
   {
      name = n;
   }

   /**
      The setEmployeeNumber method sets the employee's
      number.
      @param e The employee's number.
      @exception 
   */

   public void setEmployeeNumber(String e) throws InvalidEmployeeNumber
   {
      if (isValidEmpNum(e))
         employeeNumber = e;
      else
         throw new InvalidEmployeeNumber();
   }

   /**
      The setHireDate method sets the employee's
      hire date.
      @param h The employee's hire date.
   */

   public void setHireDate(String h)
   {
      hireDate = h;
   }

   /**
      The getName method returns the employee's name.
      @return The employee's name.
   */

   public String getName()
   {
      return name;
   }

   /**
      The getEmployeeNumber method returns the
      employee's number.
      @return The employee's number.
   */

   public String getEmployeeNumber()
   {
      return employeeNumber;
   }

   /**
      The getHireDate method returns the
      employee's hire date.
      @return The employee's hire date.
   */
   
   public String getHireDate()
   {
      return hireDate;
   }

   /**
      isValidEmpNum is a private method that
      determines whether a string is a valid
      employee number.
      @param e The string containing an employee
             number.
      @return true if e references a valid ID number,
              false otherwise.
   */

   private boolean isValidEmpNum(String e)
   {
      boolean status = true;
      int num = 0;
      
      // First, try to convert e to an integer.
      try
      {
         num = Integer.parseInt(e);
      }
      catch (IllegalArgumentException ex)
      {
         status = false;
      }
      
      // If e is an integer, determine whether it is
      // in the range of 0 through 9,999.
      if (status == true)
      {
         if (num < 0 || num > 9999)
         {
            status = false;
         }
      }
      
      // Return the status.
      return status;
   }

   /**
      toString method
      @return A reference to a String representation of
              the object.
   */
   
   public String toString()
   {
      String str = "Name: " + name + "\nEmployee Number: ";
      
      if (employeeNumber == "")
         str += "INVALID EMPLOYEE NUMBER";
      else
         str += employeeNumber;
         
      str += ("\nHire Date: " + hireDate);
      return str;
   }
}
