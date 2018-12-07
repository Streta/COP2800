import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a solution to the
   Word Game programming challenge.
*/

public class WordGame
{
   public static void main(String[] args)
   {
      String name;            // The user's name
      String age;             // The user's age
      String city;            // The name of a city
      String college;         // The name of a college
      String profession;      // A profession
      String animal;          // A type of animal
      String petName;         // A pet's name

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the user's name.
      System.out.print("Enter your name: ");
      name = keyboard.nextLine();
      
      // Get the user's age.
      System.out.print("Enter your age: ");
      age = keyboard.nextLine();
      
      // Get the name of a city.
      System.out.print("Enter the name of a city: ");
      city = keyboard.nextLine();
      
      // Get the name of a college.
      System.out.print("Enter the name of a college: ");
      college = keyboard.nextLine();
      
      // Get a profession.
      System.out.print("Enter profession: ");
      profession = keyboard.nextLine();

      // Get a type of animal.
      System.out.print("Enter a type of animal: ");
      animal = keyboard.nextLine();

      // Get a pet name.
      System.out.print("Enter a pet name: ");
      petName = keyboard.nextLine();

      // Display the "story."
      System.out.println("There once was a person named " + name +
                         " who lived in " + city + ". At the age of ");
      System.out.println(age + ", " + name + " went to college at " + 
                         college + ". " + name + " graduated and went to ");
      System.out.println("work as a " + profession + ". Then, " + name +
                         " adopted a(n) " + animal + " named " + petName);
      System.out.println("They both lived happily ever after!");
   }
}
