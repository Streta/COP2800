public class temperature
{
  private double ftemp;

  public temperature()
  {
    ftemp = 00.00;
  }

  public void setFahrenheit(double temp)
  {
    ftemp = temp;
  }

  public double getFahrenheit()
  {
    return ftemp;
  }

  public double getCelsius()
  {
    ftemp = ((5.0/9.0) * (ftemp - 32.0));
    return ftemp;
  }

  public double getKelvin()
  {
    ftemp = ((5.0/9.0) * (ftemp - 32.0)) + 273.15;
    return ftemp;
  }

}
