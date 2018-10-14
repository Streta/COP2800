public class Circle
{
  private double radius,
	         area,
		 diameter,
		 circumference, 
	         PI = 3.14159;
 
  public Circle(double radiusGiven)
  {
    radius = radiusGiven;
  }

  public Circle()
  {
    radius = 0.0;
  }

  public void setRadius(double userRadius)
  {
    radius = userRadius;
  }

  public double getRadius()
  {
    return radius;
  }

  public double getArea()
  {
    return area = PI * (radius * radius);
  }

  public double getDiameter()
  {
    return diameter = radius * 2;
  }

  public double getCircumference()
  {
    return circumference = 2 * (PI * radius);
  }
}

