public class EmployeeTest
{
 public static void main(String[] args)
 {
   Employee employee1 = new Employee();
   Employee employee2 = new Employee("Mark Jones",39119);
   Employee employee3 = new Employee("Joy Rogers","Manufacturing","Engineer",87424);
   
   employee1.setName("Susan Meyers");

   System.out.println("Name\t\t ID Number\t\tDepartment\t\tPosition");
   System.out.println(employee1.getName()       + 
                      employee1.getDepartment() + employee1.getPosition());
   
   System.out.println(employee2.getName()       + employee2.getNumber() +
                      employee2.getDepartment() + employee2.getPosition()); 

   System.out.println(employee3.getName()       + employee3.getNumber() +
                      employee3.getDepartment() + employee3.getPosition()); 
 }
}
