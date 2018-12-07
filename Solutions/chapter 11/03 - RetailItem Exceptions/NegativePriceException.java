/**
	NegativePriceExceptions are thrown by
	RetailItem objects when a negative number is
	given for the item price for the RetailItem 
	Exceptions programming challenge.
*/

public class NegativePriceException extends Exception
{
	/**
		No-arg constructor
	*/
		
	public NegativePriceException()
	{
		super("Negative number given for item price.");
	}
	
	/**
		This constructor reports the price that caused
		the exception to be thrown.
		@param price The invalid price.
	*/
	
	public NegativePriceException(double price)
	{
		super("Negative number given for price: " + price);
	}
}
