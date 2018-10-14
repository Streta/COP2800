public class PayrollTest
{
  public static void main(String[] args)
  {
    Payroll one = new Payroll("Roosevelt Mendieta", 2726381, 10, 40);
    System.out.println(one.getName() + " " +
		       one.getId()   + " " +
		       one.getRate() + " " + 
		       one.getHours());
  }
}
