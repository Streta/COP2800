import java.util.Random;   // Needed for Random class

/**
   The Die class stores data about a six-sided die
   for the A Game of Twenty One programming challenge.
*/

public class Die
{
   private final int SIDES = 6;  // The number of sides
   private int value;            // The value of the die
   
   /**
      The constructor calls the roll method to set
      the intitial value of the die to a random
      number.
    */
   
   Die()
   {
      // Call the roll method to randomly 
      // set the value of the die.
      roll();
   }
   
   
   /**
      The roll method sets the value of the die
      to a random number.
    */
   
   public void roll()
   {
      // Create a random object.
      Random randomValue = new Random();
      
      // Set the value to a random number.
      value = randomValue.nextInt(SIDES) + 1;
   }
   
   /**
      The getValue method returns the value
      of the die.
    */
   
   public int getValue()
   {
      return value;
   }
}