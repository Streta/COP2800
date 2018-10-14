public class CircleTest
{
  public static void main(String[] args)
  {
    Circle mac = new Circle();

    mac.setRadius(5.0);

    System.out.println(mac.getRadius()   + " " +
		       mac.getArea()     + " " +
		       mac.getDiameter() + " " + 
		       mac.getCircumference());
  }
}
