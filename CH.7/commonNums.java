public class commonNums
{
  public static void main(String[] args)
  {
    int[] array1 = new int[]{ 1,2,3,4,5 };
    int[] array2 = new int[]{ 1,9,8,6,5 };
    boolean found;
    if(array1[0] == array2[0] && array1[array1.length -1] == array2[array2.length -1])
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
