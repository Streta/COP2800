public class Contain
{
  public static void main(String[] args)
  {
    int[] arr = new int[]{ 5,4,9,1,7 };
    boolean found = false;
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == 2 || arr[i] == 3)
      {
        found = true;
      }
      else 
      {
        found = false;
      }
    }
    System.out.println(found);
  }
}
