/**
   The ShiftSupervisor class stores data about 
   an employee who is a shift supervisor for the 
   ShiftSupervisor Class programming challenge.
*/

public class ShiftSupervisor extends Employee
{
   private double salary;  // Annual salary
   private double bonus;   // Annual bonus

   /**
      This constructor initializes an object with a name,
      employee number, hire date, salary, and bonus.
      @param n The employee's name.
      @param num The employee's number.
      @param date The employee's hire date.
      @param sal The employee's annual salary.
      @param b The employee's annual bonus.
   */
      
   public ShiftSupervisor(String n, String num, String date,
                           double sal, double b)
   {
      super(n, num, date);
      salary = sal;
      bonus = b;
   }

   /**
      The no-arg constructor initializes an object with
      null strings for name, employee number, and hire
      date. The salary and bonus fields are set to 0.0.
   */
      
   public ShiftSupervisor()
   {
      super();
      salary = 0.0;
      bonus = 0.0;
   }
   
   /**
      The setSalary method sets the employee's annual
      salary.
      @param s The employee's annual salary.
   */
   
   public void setSalary(double s)
   {
      salary = s;
   }

   /**
      The setBonus method sets the employee's annual
      bonus.
      @param b The employee's annual bonus.
   */
   
   public void setBonus(double b)
   {
      bonus = b;
   }

   /**
      The getSalary method returns the employee's annual
      salary.
      @return The employee's annual salary.
   */
   
   public double getSalary()
   {
      return salary;
   }

   /**
      The getBonus method returns the employee's annual
      bonus.
      @return The employee's annual bonus.
   */
   
   public double getBonus()
   {
      return bonus;
   }
   
   /**
      toString method
      @return A reference to a String representation of
              the object.
   */
   
   @Override
   public String toString()
   {
      String str = super.toString();
      
      str += String.format("\nAnnual Salary: $%,.2f", salary);
      str += String.format("\nProduction Bonus: $%,.2f", bonus);
             
      return str;
   }
}
