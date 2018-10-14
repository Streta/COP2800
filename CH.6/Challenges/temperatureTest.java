import java.util.Scanner;

public class temperatureTest
{
  public static void main(String[] args)
  {
    double x;

    Scanner keyboard   = new Scanner(System.in);
    temperature degree = new temperature();

    System.out.println("Enter temp to be converted: ");
    x = keyboard.nextDouble();
    degree.setFahrenheit(x);

    System.out.println(degree.getFahrenheit() + " " + 
		       degree.getCelsius()    + " " + 
		       degree.getKelvin());
  }
}
