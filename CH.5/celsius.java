import java.util.Scanner;
import java.text.DecimalFormat;

public class celsius
{
  public static void main(String[] args)
  {
    DecimalFormat df = new DecimalFormat("0.00");

    for(int i = 20; i <= 40; i++)
    {
      System.out.println(df.format(temperature(i)));
    }
  }
  
  public static double temperature(double tempGiven)
  {
    double convert = ((5.0/9.0) * (tempGiven - 32));
    return convert;
  }
}
