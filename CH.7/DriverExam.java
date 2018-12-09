public class DriverExam
{
  private char[] correct = { 'B', 'D', 'A', 'A','C', 'A', 'B', 'A', 
	                     'C', 'D', 'B', 'C','D', 'A', 'D', 'C','C', 'B', 'D', 'A' };
  
  private int totalCorrect   = 0;
  private int totalIncorrect = 0; 
  
  public DriverExam(char[] s)
  {
    
  }
  
  public int totalCorrect(char[] studentAnswers)
  {
    for(int i = 0; i < studentAnswers.length; i++)
    {
      if (studentAnswers[i] == correct[i])
      {
        totalCorrect++;
      }
    }
    return totalCorrect;
  }
  
  public int totalIncorrect(char[] studentAnswers)
  {
    for(int i = 0; i < studentAnswers.length; i++)
    {
      if (studentAnswers[i] != correct[i])
      {
        totalIncorrect++;
      }
    }
    return totalIncorrect;
  }
  
  public boolean passed()
  {
    boolean validation;
    if (totalCorrect >= 15)
    {
      validation = true;
    }
    else
    {
      validation = false;
    }
    return validation;
  }
}
