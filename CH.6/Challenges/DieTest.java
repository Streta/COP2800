public class DieTest
{
  public static void main(String[] args)
  {
    int compWins  = 0, 
	userWins  = 0, 
	compTotal = 0, 
	userTotal = 0;
	  
    Die compDie = new Die(6);
    Die userDie = new Die(6);

    for(int i = 1; i <= 10; i++)
    {
      compDie.roll();
      userDie.roll();

      compTotal += compDie.getValue();
      userTotal += userDie.getValue();

      if (compTotal > userTotal)
      {
        compWins++;
      }
      else if (compTotal == userTotal)
      {
        continue;
      }
      else
      {
        userWins++;
      }
    }
    
    System.out.println("PC Total: " + compTotal);
    System.out.println("User total: "+ userTotal);

    System.out.println("PC Wins: "   + compWins);
    System.out.println("User Wins: " + userWins);
    
    if (compWins > userWins)
    {
      System.out.println("Grand Winner: PC");
    }
    else
    { 
      System.out.println("Grand Winner: Human");
    }
  }
}
