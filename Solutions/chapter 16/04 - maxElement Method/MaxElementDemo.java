/**
   This program demonstrates a solution to the
   maxElement Method programming challenge.
*/

public class MaxElementDemo
{
   public static void main(String[] args)
   {
      // Create an array to test the method.
      int[] numbers = { 2, 12, 1999, 99, 100, 4, 7, 300 };
      
      // Display the largest value in the array.
      System.out.println("The largest value in the array is " +
                         maxElement(numbers, 0)); 
   }

   /**
      The maxElement method searches for the largest value
      in an array, starting at a specified subscript.
      @param array The array to search.
      @param start The subscript to start searching at.
      @return The largest value in the part of the array
              being searched.
   */

   public static int maxElement(int[] array, int start)
   {
      int maxRemaining;
      
      // Is the specified subscript the last element?
      // If so, return that element's value.
      if (start == (array.length - 1))
         return array[start];
      else
      {
         // Otherwise reduce the problem.
         // Recursively search from array[start + 1]
         // to the end of the array for the largest
         // value in that part of the array. Store
         // the result in maxRemaining.
         maxRemaining = maxElement(array, start + 1);
         
         // If the element at array[start] is greater
         // than maxRemaining, then array[start] is the
         // largest value in the array. Otherwise,
         // maxRemaining is the largest value.
         if (array[start] > maxRemaining)
            return array[start];
         else
            return maxRemaining;
      }
   }
}