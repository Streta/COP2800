import java.util.Scanner;

public class PayrollTest
{
  public static void assignEmployeeInfo(Payroll payrollObject)
  {
    Scanner keyboard = new Scanner(System.in);
    int employeeHours; 
    double employeePayrate;
    
    for(int i = 0; i < payrollObject.getEmployeeIds().length; i++)
    {
      System.out.println("Enter hours for employee: " + payrollObject.getEmployeeIds()[i]);
      employeeHours = keyboard.nextInt();
      payrollObject.setEmployeeHours(employeeHours,i);
      
      System.out.println("Enter payRate for employee: " + payrollObject.getEmployeeIds()[i]);
      employeePayrate = keyboard.nextDouble();
      payrollObject.setEmployeePayRate(employeePayrate,i);
    }
  }
  
  public static void displayEmployeeWages(Payroll payrollObject)
  {
    for(int i = 0; i < payrollObject.getEmployeeIds().length; i++)
    {
      System.out.println("The employee with id number: " + payrollObject.getEmployeeIds()[i] +
		         " worked for " + payrollObject.getEmployeeHours()[i] +
			 " and earned " + payrollObject.getEmployeeWages()[i]);
    }
  }

  public static void main(String[] args)
  {
    Payroll employeeOneInfo = new Payroll();
    assignEmployeeInfo(employeeOneInfo);
    employeeOneInfo.calculateWages();
    displayEmployeeWages(employeeOneInfo);
  }
}
