public class Payroll
{
  private String employeeName;
  private int idNumber, 
	      hourlyRate,
	      workedHours;

  public Payroll(String employeeNameGiven, int idNumberGiven, int hourlyRateGiven, int workedHoursGiven)
  {
    employeeName = employeeNameGiven;
    idNumber     = idNumberGiven;
    hourlyRate   = hourlyRateGiven;
    workedHours  = workedHoursGiven;
  }
  
  public String getName()
  {
    return employeeName;
  }  

  public int getId()
  {
    return idNumber;
  }

  public int getRate()
  {
    return hourlyRate;
  }

  public int getHours()
  {
    return workedHours;
  }
}
