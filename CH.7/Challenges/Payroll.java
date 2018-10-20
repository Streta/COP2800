public class Payroll
{
  private int [] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
  private final int NUM_0F_EMPLOYEES = employeeId.length;
  private int [] hours;
  private double [] payRate;
  private double [] wages;

  public void calculateWages()
  {
    for(int employeeIndex = 0; employeeIndex < NUM_OF_EMPLOYEES; employeeIndex++)
    {
      wages[employeeIndex] = hours[employeeIndex] * payRate[employeeIndex];
    } 
  }

  public double getWagesById(int employeeIdGiven)
  {
    for(int employeeIndex = 0; employeeIndex < NUM_OF_EMPLOYEES; employeeIndex++)
    {
      if(employeeId[employeeIndex] == employeeIdGiven)
      {
        return wages[employeeIndex];
      }
    }
    return -1;
  }
  
  public int [] getAllEmployeeIds()
  {
    return employeeId;
  }

  public int [] getAllEmployeeHours()
  {
    return hours;
  }

  public double [] getAllEmployeePayRates()
  {
    return payRate;
  }
  
  public double [] getAllEmployeeWages()
  {
    return wages;
  }

  public Payroll()
  {
    hours   = new int [NUM_OF_EMPLOYEES];
    payRate = new double[NUM_OF_EMPLOYEES];
    wages   = new double[NUM_OF_EMPLOYEES];
  }
}
