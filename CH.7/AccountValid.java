public class AccountValid
{
  private int[] arrayList = { 5658845, 8080152, 1005231, 4520125, 4562555, 6545231, 7895122, 5552012, 3852085,
  			      8777541, 5050552, 7576651, 8451277, 7825877, 7881200, 1302850, 1250255, 4581002 };
  private boolean valid = false;

  public boolean searchArray(int intGiven)
  {
    for(int i = 0; i < arrayList.length; i++)
    {
      if(arrayList[i] == intGiven)
      {
        valid = true;
      }
    }
   return valid;
  }

}