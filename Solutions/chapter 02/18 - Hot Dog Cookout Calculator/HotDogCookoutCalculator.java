import java.util.Scanner;  // Needed for the Scanner class

/**
   This program demonstrates a solution to the
   Hot Dog Cookout Calculator programming challenge.
*/

public class HotDogCookoutCalculator
{
   public static void main(String[] args)
   {
      // Named constants
      final int HOT_DOGS = 10;   // The number of hot dogs per package
      final int BUNS     =  8;   // The number of buns per package

      // Variable declarations
      int numAttending;          // To hold the number of people attending
      int numPerPerson;          // To hold the number of hot dogs and buns per person

      int total;                 // The total number of hot dogs and buns needed

      int minDogs;               // The minimum number of packages of hot dogs
      int minBuns;               // The minimum number of packages of hot dog buns

      int dogsLeft;              // The number of hot dogs left over from a package
      int bunsLeft;              // The number of hot dog buns left over from a package

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the number of people attending the cookout from the user.
      System.out.print("Enter the number of people attending the cookout: ");
      numAttending = keyboard.nextInt();

      // Get the number of hot dogs per person from the user.
      System.out.print("Enter the number of hot dogs for each person: ");
      numPerPerson = keyboard.nextInt();

      // Calculate the total number of hot dogs and buns needed.
      total = numAttending * numPerPerson;

      /**
         Here we subract the remainder of hotdogs from the
         number of hot dogs in a package, and we determine
         the left over hot dogs from the number of hot dogs remaining.
      */

      // Determine the number of left over hot dogs.
      dogsLeft = (HOT_DOGS - total % HOT_DOGS) % HOT_DOGS;

      /**
         If no hot dogs are left, we raise zero to the zeroth power, which is one.
         Then we use this result to raise zero to the 1st power, which is zero.
         In this case, we add zero to the minimum number of packages of hot dogs.

         If hot dogs are left, we raise zero to the number of hot dogs left, which is zero.
         Then we use this result to raise zero to the zeroth power, which is one.
         In this case, we add one to the minimum number of packages of hot dogs.
      */

      // Calculate the minimum number of packages of hot dogs needed.
      minDogs = total / HOT_DOGS + (int)Math.pow(0.0, Math.pow(0.0, (double)dogsLeft));

      /**
         Here we subract the remainder of buns from the
         number of hot dog buns in a package, and we determine
         the left over buns from the number of buns remaining.
      */

      // Calculate the number of hot dog buns left over.
      bunsLeft = (BUNS - total % BUNS) % BUNS;

      /**
         If no buns are left, we raise zero to the zeroth power, which is one.
         Then we use this result to raise zero to the 1st power, which is zero.
         In this case, we add zero to the minimum number of packages of hot dog buns.

         If buns are left, we raise zero to the number of hot buns left, which is zero.
         Then we use this result to raise zero to the zeroth power, which is one.
         In this case, we add one to the minimum number of packages of hot dog buns.
      */

      // Calculate the minimum number of packages of hot dog buns needed.
      minBuns = total / BUNS + (int)Math.pow(0.0, Math.pow(0.0, (double)bunsLeft));

      // Display the minimum packages of hot dogs needed.
      System.out.println("Minimum packages of hot dogs needed: " + minDogs);

      // Display the minimum packages of buns needed.
      System.out.println("Minimum packages of hot dog buns needed: " + minBuns);

      // Display the number of hot dogs left over.
      System.out.println("Hot dogs left over: " + dogsLeft);

      // Display the number of hot dog buns left over.
      System.out.println("Hot dog buns left over: " + bunsLeft);
   }
}