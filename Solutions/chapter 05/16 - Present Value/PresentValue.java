import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Present Value programming challenge.
*/

public class PresentValue
{
   public static void main(String[] args)
   {
      // Variables
      double future;  // Desired future value
      double rate;    // Annual interest rate
      int years;      // Number of years
      double present; // The needed present value

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the desired future value.
      System.out.print("What is the desired future value? ");
      future = keyboard.nextDouble();

      // Get the annual interest rate.
      System.out.print("What is annual interest rate? ");
      rate = keyboard.nextDouble();

      // Get the number of years that the investment
      // will draw interest.
      System.out.print("For how many years? ");
      years = keyboard.nextInt();

      // Get the needed present value.
      present = presentValue(future, rate, years);

      // Display the result.
      System.out.printf("You need to invest $%,.2f\n", present);
   }

   /**
      The presentValue method calculates the present value
      needed for an investment that you want to grow to a
      specified future value.
      @param f The desired future value.
      @param r The annual interest rate.
      @param n The number of years of the investment.
      @return The needed present value.
   */

   public static double presentValue(double f, double r, int n)
   {
      double p;

      // Calculate the present value.
      p = f / Math.pow((1 + r), n);

      // Return the present value.
      return p;
   }
}