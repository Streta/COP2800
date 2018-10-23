public class Larger
{
  public static int[] greaterNumbers(int[] integerArray, int number)
  {
    int[] greaterNums = new int[integerArray.length];
    int greaterNumsIndex = 0;
    for(int i = 0; i < integerArray.length; i++)
    {
      if(integerArray[i] > number)
      {
        greaterNums[greaterNumsIndex] = integerArray[i];
        greaterNumsIndex++;
      }
    }
    return greaterNums;
  }

  public static void main(String[] args)
  {
    int[] testArray = {1,2,3,4,5,6,7,8};
    int testNum = 2;
    int[] returnedNums = greaterNumbers(testArray,testNum);
    for(int i = 0; i < returnedNums.length; i++)
    {
      if(returnedNums[i] != 0)
      {
        System.out.print(returnedNums[i] + " ");
      }
    }
  }
}
