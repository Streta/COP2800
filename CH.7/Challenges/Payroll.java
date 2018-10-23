public class Payroll
{
  private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
  private final int NUMBER_OF_EMPLOYEES = employeeId.length;
  private int[] hours;
  private double[] payRate;
  private double[] wages;
  
  public void calculateWages()
  {
    for(int i = 0; i < NUMBER_OF_EMPLOYEES; i++)
    {
      wages[i] = hours[i] * payRate[i];
    }
  }
  
  public double getWagesById(int employeeIdGiven)
  {
    for(int i = 0; i < NUMBER_OF_EMPLOYEES; i++)
    {
      if(employeeId[i] == employeeIdGiven)
      {
        return wages[i];
      }
    }
    return -1;
  }
   
  public Payroll()
  {
    hours   = new int[NUMBER_OF_EMPLOYEES];
    payRate = new double[NUMBER_OF_EMPLOYEES];
    wages   = new double[NUMBER_OF_EMPLOYEES];
  }

  public int[] getEmployeeIds()
  {
    return employeeId;
  }

  public int[] getEmployeeHours()
  {
    return hours;
  }

  public double[] getEmployeePay()
  {
    return payRate;
  }

  public double[] getEmployeeWages()
  {
    return wages;
  }
  
  public void setEmployeeHours(int employeeHours,int employeeIndex)
  {
    hours[employeeIndex] = employeeHours;
  }
  
  public void setEmployeePayRate(double employeePayRate,int employeeIndex)
  {
    payRate[employeeIndex] = employeePayRate;
  }
}
