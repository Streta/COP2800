/**
   This program demonstrates a solution to the
   Miscellaneous String Operations programming 
   challenge.
*/

public class StringOperationsDemo
{
   public static void main(String[] args)
   {
      String str = "the dog jumped over the fence";
      char[] array = {'H', 'o', 'w', ' ', 'n', 'o', 'w',
                      ' ', 'b', 'r', 'o', 'w', 'n', ' ',
                      'c', 'o', 'w' };
      
      // Display the number of words in the string.
      System.out.println("Number of words in \"" + str + "\" is " +
                         StringOperations.wordCount(str));
                         
      // Display the most frequently occurring character.
      System.out.println("Most frequently occuring character: " +
                         StringOperations.mostFrequent(str));
                         
      // Replace "the" with "that".
      System.out.println(StringOperations.replaceSubString(str, "the", "that"));
      
      // Convert an array to a string and display it.
      String str2 = StringOperations.arrayToString(array);
      System.out.println(str2);
   }
}

