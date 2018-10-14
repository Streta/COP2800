public class RetailItem
{
  private String description;
  private int unitsOnHand;
  private double price;

  public RetailItem(String descripGiven, int unitsGiven, double priceGiven)
  {
    description = descripGiven;
    unitsOnHand = unitsGiven;
    price       = priceGiven;
  }
 
  public void setDesc(String userDescription)
  {
    description = userDescription;
  }
  
  public void setUnits(int userUnitsOnHand)
  {
    unitsOnHand = userUnitsOnHand;
  }
  
  public void setPrice(double userPrice)
  {
    price = userPrice;
  }
  
  public String getDesc()
  {
    return description;
  }

  public int getUnits()
  {
    return unitsOnHand;
  }
  
  public double getPrice()
  {
    return price;
  }
}
