import java.util.Scanner;

public class letter
{
 public static void main(String[] args)
 {
   Scanner keyboard = new Scanner(System.in);
   
   String word;
   char letter;
   int count = 0;

   System.out.printf("Enter string: ");
   word = keyboard.nextLine();

   System.out.printf("Enter letter: ");
   letter = keyboard.nextLine().charAt(0);
   
   for (int i = 0; i < word.length(); i++)
   {
     if(word.charAt(i) == letter)
     {
       count += 1;
     }
   }
   System.out.println("The char appears " + count + " times");
 }
}
