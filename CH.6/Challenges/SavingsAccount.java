
public class SavingsAccount
{
  private double ANNUAL_INT;
  private double balance;

  public void withdraw( double userTotal )
  {
    balance -= userTotal;
  }
  
  public void deposit( double userTotal)
  {
    balance += userTotal;
  }

  public double getBalance()
  {
    return balance;
  }
  
  public double interest()
  {
    double monthInt  = ((ANNUAL_INT / 12) * balance);
    balance += monthInt;
    return monthInt;
  }

  public void setInterest(double intRate)
  {
    ANNUAL_INT = intRate/100;
  }

  public SavingsAccount(double startBalance)
  {
    balance = startBalance;
    ANNUAL_INT = 0;
  }
}
