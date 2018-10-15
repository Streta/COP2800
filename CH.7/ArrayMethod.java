public class ArrayMethod
{
  public static void main(String[] args)
  {
    int[] numbers = {5,10,15,20,25,30,35,40};
    
    for(int i = 0; i < numbers.length; i++)
    {
      showValue(numbers[i]);
    }
  }

  public static void showValue(int n)
  {
    System.out.print(n + " ");
  }
}
