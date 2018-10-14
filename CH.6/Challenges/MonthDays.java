public class MonthDays
{
  private int month, year;

  public MonthDays(int monthGiven, int yearGiven)
  {
    month = monthGiven;
    year  = yearGiven;
  }

  public int getNumberOfDays()
  {
    int numberOfDays = 0;
    switch (month)
    {
      case 1: numberOfDays = 31;
	      break;
      case 2: numberOfDays = 28;
	      break;
      case 3: numberOfDays = 31;
	      break;
      case 4: numberOfDays = 30;
	      break;
      case 5: numberOfDays = 31;
	      break;
      case 6: numberOfDays = 30;
	      break;
      case 7: numberOfDays = 31;
	      break;
      case 8: numberOfDays = 31;
	      break;
      case 9: numberOfDays = 30;
	      break;
      case 10: numberOfDays = 31;
	      break;
      case 11: numberOfDays = 29;
	      break;
      case 12: numberOfDays = 31;
	      break;
    }
    return numberOfDays;
  }
  
  public void determineLeapYear()
  {
    if (year % 100 == 0)
    {
      if (year % 400 == 0)
      {
        System.out.println("Leap year");
      }
      else if ( year % 4 == 0)
      {
        System.out.println("Leap year");
      }
      else 
      {
        System.out.println("Not a leap year");
      }
    } 
    else
    {
      if (year % 400 == 0)
      {
        System.out.println("Leap year");
      }
      else if ( year % 4 == 0)
      {
        System.out.println("Leap year");
      }
      else 
      {
        System.out.println("Not a leap year");
      }
    }
  }
}
