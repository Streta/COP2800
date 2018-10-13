import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class RPS
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    
    int num = rand.nextInt(3) + 1;
    int userNum;
    
    String compChoice = "", 
	   userChoice = "";
    
    switch (num) 
    {
      case 1: compChoice = "Rock";
	      break;
      case 2: compChoice = "Paper";
	      break;
      case 3: compChoice = "Scissors";
	      break;
    }

    userNum = enterChoice();
    switch (userNum)
    {
      case 1: userChoice = "Rock";
	      break;
      case 2: userChoice = "Paper";
	      break;
      case 3: userChoice = "Scissors";
	      break;
    }
    
    if (compChoice == "Rock" && userChoice == "Scissors")
    {
      System.out.println("PC WINS");
    }
    else if (compChoice == "Rock" && userChoice == "Paper")
    {
      System.out.println("Human wins");
    }
    else if (compChoice == "Paper" && userChoice == "Rock")
    {
      System.out.println("PC WINS");
    }
    else if (compChoice == "Paper" && userChoice == "Scissors")
    {
      System.out.println("Human wins");
    }
    else if (compChoice == "Scissors" && userChoice == "Rock")
    {
      System.out.println("Human wins");
    }
    else if (compChoice == "Scissors" && userChoice == "Paper")
    {
      System.out.println("PC WINS");
    }
    else if (compChoice == userChoice)
    {
      System.out.println("It's a draw");
    }

    System.out.println("PC chose: " + compChoice);
    System.out.println("Human chose: " + userChoice);
  }

  public static int enterChoice()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter a number 1-3: ");
    int num = keyboard.nextInt();
    return num;
  }
}
