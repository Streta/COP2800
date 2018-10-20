import java.util.Scanner;

public class PayrollTest
{
  public static void assignEmployeeHoursAndPayrate(Payroll payrollObject)
  {
    Scanner keyboard = new Scanner(System.in);
    for(int employeeIndex = 0; employeeIndex < payrollObject.getAllEmployeeIds().length; employeeIndex++)
    {
      System.out.println("Please enter the hours for employee " + payrollObject.getAllEmployeeIds());
    }
  }
  
  public static void main(String[] args)
  {
    Payroll employeeInfo = new Payroll();
    
    
  }
}
