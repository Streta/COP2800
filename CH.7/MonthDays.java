public class MonthDays
{
  public static void main(String[] args)
  {
    String[] months = {"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec" };
    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    for(int i = 0; i < months.length; i++)
    {
      System.out.println(months[i] + " has " + days[i] + " days.");
    }
  }
}
