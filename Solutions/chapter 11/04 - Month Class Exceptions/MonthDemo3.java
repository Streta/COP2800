/**
   This program demonstrates a solution to the
   Month Class Exceptions programming challenge.
*/

public class MonthDemo3
{
	public static void main(String[] args)
	{
		// Use the 3rd constructor to create two objects.
		// The first one is valid.
		try
		{
			Month m1 = new Month("March");
			System.out.println("Month " + m1.getMonthNumber() +
		                      " is " + m1);
		}
		catch (InvalidMonthNameException e)
		{
			System.out.println("Error - " + e.getMessage());
		}
		
		// The second one is invalid.
		try
		{
			Month m2 = new Month("Septober");
			System.out.println("Month " + m2.getMonthNumber() +
		                      " is " + m2);
		}
		catch (InvalidMonthNameException e)
		{
			System.out.println("Error - " + e.getMessage());
		}
	}
}
