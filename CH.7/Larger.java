import java.util.Scanner;

public class Larger 
{ 
  public static void main(String[] args)
  {
    int[] arrayList = { 1,2,3,4,5,6,7,8,9,10 };
    int userNum;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter a num: ");
    userNum = keyboard.nextInt();
    searchGreater(userNum, arrayList);
  }

  public static void searchGreater(int numGiven, int[] userArray)
  {
    for(int i = 0; i < userArray.length; i++)
    {
      if(userArray[i] > numGiven)
      {
        System.out.println(userArray[i]);
      }
    }
  }
}
