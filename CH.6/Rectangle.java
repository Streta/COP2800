public class Rectangle
{
  private double length, 
	         width;
	
  public void setWidth(double wid)
  {
    width = wid;
  }

  public void setLength(double len)
  {
    length = len;
  }

  public double getWidth()
  {
    return width;
  }

  public double getLength()
  {
    return length;
  }

  public double getArea()
  {
    return length * width;
  }
}
