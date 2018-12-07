import java.io.*;

/**
   This program demonstrates a solution to the
   TestScores Modification for Serialization 
   programming challenge.
*/

public class ReadTestScores
{
   public static void main(String[] args)
   {
      TestScores[] ts = new TestScores[5];
      
      try
      {
         // Create the file objects.
         FileInputStream inStream = new FileInputStream("Objects.dat");
         ObjectInputStream objectFile = new ObjectInputStream(inStream);

         // Deserialize the objects and display them.
         for (int i = 0; i < ts.length; i++)
         {
            ts[i] = (TestScores) objectFile.readObject();
            System.out.println(ts[i]);
         }
         
         // Close the file.
         objectFile.close();
      }
      catch (Exception e)
      {
         System.out.println("Error - " + e.getMessage());
      }
   }
}
