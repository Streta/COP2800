/**
   The Roulette Wheel Colors class represents
   a roulette wheel pocket.
 */

public class RoulettePocket
{
   // Fields
   int number;    // The pocket number
   String color;  // The pocket color

   /**
      The class constructor accepts an integer value
      for the pocket number as an argument.
      @param n The pocket number.
    */

   public RoulettePocket(int n)
   {
      // Set the number field.
      number = n;

      // For pockets 1 through 10, the odd-numbered pockets
      // are red and the even-numbered pockets are black.
      if (number >= 1 && number <= 10)
      {
         if (number % 2 == 0)
         {
            color = "Black";  // Even
         }
         else
         {
            color = "Red";    // Odd
         }
      }
      // For pockets 11 through 18, the odd-numbered pockets
      // are black and the even-numbered pockets are red.
      else if (number >= 11 && number <= 18)
      {
         if (number % 2 == 0)
         {
            color = "Red";    // Even
         }
         else
         {
            color = "Black";  // Odd
         }
      }
      // For pockets 19 through 28, the odd-numbered pockets
      // are red and the even-numbered pockets are black.
      else if (number >= 19 && number <= 28)
      {
         if (number % 2 == 0)
         {
            color = "Black";  // Even
         }
         else
         {
            color = "Red";    // Odd
         }
      }
      // For pockets 29 through 36, the odd-numbered pockets
      // are black and the even-numbered pockets are red.
      else if (number >= 29 && number <= 36)
      {
         if (number % 2 == 0)
         {
            color = "Red";    // Even
         }
         else
         {
            color = "Black";  // Odd
         }
      }
      // Pocket 0 is green.
      else
      {
         color = "Green"; // Zero
      }
   }

   /**
      The getPocketColor method returns the pocket's color,
      as a string.
      @return The pocket color.
    */

   public String getPocketColor()
   {
      // Return the value of the color field.
      return color;
   }
}