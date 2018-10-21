public class firstLast 
{
  public static void main(String[] args)
  {
    int[] numbers = new int[]{ 1,2,3,4,5,6 };
    boolean found;
    if (6 == numbers[0])
    {
      found = true;
    }
    else if (6 == numbers[numbers.length - 1])
    {
      found = true;
    }
    else 
    {
      found = false;
    }
    System.out.println(found);
  }
}
