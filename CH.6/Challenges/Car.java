public class Car
{
  private int yearModel,
	      speed;
  private String make;

  public Car(String makeGiven, int yearModelGiven)
  {
    make = makeGiven;
    yearModel = yearModelGiven;
    speed          = 0;
  }
  
  public String getMake()
  {
    return make;
  }
  
  public int getModel()
  {
    return yearModel;
  }
  
  public int getSpeed()
  {
    return speed;
  }
  
  public void accelerate()
  {
    speed += 5;
  }

  public void brake()
  {
    speed -= 5;
  }
}
