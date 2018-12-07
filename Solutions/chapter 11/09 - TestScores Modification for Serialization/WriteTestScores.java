import java.util.Random;
import java.io.*;

/**
   This program demonstrates a solution to the
   TestScores Modification for Serialization 
   programming challenge.
*/

public class WriteTestScores
{
   public static void main(String[] args)
   {
      double[] randomScores;                 // Random test scores
      TestScores[] ts = new TestScores[5];   // Array to hold TestScore objects
      
      try
      {
         // Create objects, store them in the array, and 
         // display them.
         for (int i = 0; i < ts.length; i++)
         {
            randomScores = getRandomScores();
            ts[i] = new TestScores(randomScores);
            System.out.println(ts[i]);
         }
         
         // Serialize the objects.
         FileOutputStream outStream = new FileOutputStream("Objects.dat");
         ObjectOutputStream objectFile = new ObjectOutputStream(outStream);
         
         for (int i = 0; i < ts.length; i++)
         {
            System.out.println("Serializing object #" + i);
            objectFile.writeObject(ts[i]);
         }
         
         // Close the file.
         objectFile.close();
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("Invalid score found.\n" + e.getMessage());
      }
      catch (IOException e)
      {
         System.out.println("Error - " + e.getMessage());
      }
   }
   
   /**
      The getRandomScores method returns an array with
      random numbers stored in it.
      @return An array holding random test scores.
   */
   
   public static double[] getRandomScores()
   {
      // Create a Random object for random number generation.
      Random rand = new Random();

      double[] array = new double[5];
      for (int i = 0; i < array.length; i++)
      {
         array[i] = rand.nextDouble() * 100;
      }
      
      return array;
   }
}
