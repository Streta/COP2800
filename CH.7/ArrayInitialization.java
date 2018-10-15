public class ArrayInitialization
{
  public static void main(String[] args)
  {
    int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
    for(int i = 0; i < 12; i++)
    {
      System.out.println("Month " + i + " has " + days[i] + " days.");
    }
  }
}
