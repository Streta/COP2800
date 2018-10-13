public class CarTest
{
  public static void main(String[] args)
  {
    Car myCar = new Car("Toyota", 2015);
    
    System.out.println("Car Make:\tCar Year: ");
    System.out.println(myCar.getMake() + "\t\t" +  myCar.getModel());

    myCar.accelerate();
    myCar.accelerate();
    myCar.accelerate();
    myCar.accelerate();
    myCar.accelerate();

    System.out.println(myCar.getSpeed());

    myCar.brake();
    myCar.brake();
    myCar.brake();
    myCar.brake();

    System.out.println(myCar.getSpeed());
  }
}
