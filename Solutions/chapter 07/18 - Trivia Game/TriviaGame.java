import java.util.Scanner;
import java.io.*;

/**
   This program demonstrates a solution to the
   Trivia Game programming challenge.
*/

public class TriviaGame
{
   public static void main(String args[]) throws IOException
   {
      // Constants
      final int NUM_QUESTIONS = 10;
      final int NUM_PLAYERS = 2;
      
      // Variables
      int playerTurn = 1;    // The current player
      int questionNum;       // The current question number
      int playerAnswer;      // The player's chosen answer
      int player1points = 0; // Player 1's points
      int player2points = 0; // Player 2's points
      
      // Create an array of Player objects for
      // player #1 and player #2.
      Player[] players = new Player[NUM_PLAYERS];
      for (int i = 0; i < NUM_PLAYERS; i++)
      {
         players[i] = new Player(i+1);
      }
      
      // Create an array to hold Question objects.
      Question[] questions = new Question[NUM_QUESTIONS];
      
      // Initialize the array with data.
      initQuestions(questions);
      
      // Play the game.
      for (int i = 0; i < NUM_QUESTIONS; i++)
      {
         // Display the question.
         displayQuestion(questions[i], playerTurn);
         
         // Get the player's answer.
         players[playerTurn-1].chooseAnswer();
         
         // See if the correct answer was chosen.
         if (players[playerTurn-1].getCurrentAnswer() == questions[i].getCorrectAnswerNumber())
         {
            // The player's chosen answer is correct.
            System.out.println("Correct!\n");
            players[playerTurn-1].incrementPoints();
         }
         else
         {
            // The player chose the wrong answer.
            System.out.println("Sorry, that is incorrect. The correct " +
                               "answer is " + 
                               questions[i].getCorrectAnswerNumber() +
                               ".\n");
         }
         
         // Switch players for the next iteration.
         if (playerTurn == 1)
            playerTurn = 2;
         else
            playerTurn = 1;
      }
      
      // Show the game results.
      showGameResults(players);
   }
   
   /**
      The initQuestions method uses the contents of the
      trivia.txt file to populate the qArray parameter
      with Question objects.
      @param qArray A Question array
   */
   public static void initQuestions(Question qArray[]) throws IOException
   {
      // Open the trivia.txt file.
      File file = new File("trivia.txt");
      Scanner inputFile = new Scanner(file);
      
      // Populate the qArray with data from
      // the file.
      for (int i = 0; i < qArray.length; i++)
      {
         // Create a Question object in the array.
         qArray[i] = new Question();
         
         // Get the question text from the file.
         qArray[i].setQuestion(inputFile.nextLine());
         
         // Get the possible answers.
         for (int j = 1; j <= 4; j++)
         {
            qArray[i].setPossibleAnswer(inputFile.nextLine(), j);
         }
         
         // Get the correct answer.
         qArray[i].setCorrectAnswerNumber(Integer.parseInt(inputFile.nextLine()));
      }
   }
   
   /**
      The displayQuestion method displays a question.
      @param q The question to display.
      @param playerNum The current player number.
   */
   
   public static void displayQuestion(Question q, int playerNum)
   {
      // Display the player number.
      System.out.println("Question for player #" + playerNum);
      System.out.println("------------------------");
      
      // Display the question.
      System.out.println(q.getQuestionText());
      for (int i = 1; i <= 4; i++)
      {
         System.out.println(i + ". " + q.getPossibleAnswer(i));
      }
   }
   
   /**
      The showGameResults method shows the game results.
      @param players The array of Player objects.
   */
   public static void showGameResults(Player[] players)
   {
      // Display the stats.
      System.out.println("Game Over!");
      System.out.println("---------------------");
      System.out.println("Player 1's points: " +
                         players[0].getPoints());
      System.out.println("Player 2's points: " +
                         players[1].getPoints());
      
      // Declare the winner.
      if (players[0].getPoints() > players[1].getPoints())
         System.out.println("Player 1 wins!");
      else if (players[1].getPoints() > players[0].getPoints())
         System.out.println("Player 2 wins!");
      else
         System.out.println("It's a TIE!");
   }
}