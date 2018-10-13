public class Employee
{
  private String name, department, position;
  private int idNumber;  
  
  public Employee(String nameGiven, String departmentGiven, String positionGiven, int idGiven)
  {
    name       = nameGiven;
    department = departmentGiven;
    position   = positionGiven;
    idNumber   = idGiven;
  }
  
  public Employee(String nameGiven, int idGiven)
  {
    name       = nameGiven;
    idNumber   = idGiven;
    department = "";
    position   = "";
  }
  
  public Employee()
  {
    name       = "";
    idNumber   = 0;
    department = "";
    position   = "";
  }

  public void setName(String nameGiven)
  {
    name = nameGiven;
  }

  public void setDepartment(String departmentGiven)
  {
    department = departmentGiven;
  }

  public void setPosition(String positionGiven)
  {
    position = positionGiven;
  }
  
  public void setNumber(String numberGiven)
  {
    idNumber = Integer.parseInt(numberGiven);
  }
  
  public String getName()
  {
    return name;
  }

  public String getDepartment()
  {
    return department;
  }
  
  public String getPosition()
  {
    return position;
  }

  public int getNumber()
  {
    return idNumber;
  }
}
