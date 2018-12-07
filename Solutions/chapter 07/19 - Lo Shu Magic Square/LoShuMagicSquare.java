import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Lo Shu Magic Square programming challenge.
 */

public class LoShuMagicSquare
{
   public static void main(String[] args)
   {
      // Create a magic two-dimensional array.
      int[][] magicArray = { {4, 9, 2},
                             {3, 5, 7},
                             {8, 1, 6} };

      // Create a normal two-dimensional array.
      int[][] normalArray = { {1, 2, 3},
                              {4, 5, 6},
                              {7, 8, 8} };

      // Display the normal array.
      showArray(normalArray);

      // Test the normal array and display the result.
      showResult(normalArray);

      // Display the magic array.
      showArray(magicArray);

      // Test the magic array and display the result.
      showResult(magicArray);
   }

   /**
      The showResult method accepts a two-dimensional
      int array, tests to determine if it is a Lo Shu
      Magic Square, and displays the result.
      @param array The two-dimensional array reference.
    */

   private static void showResult(int[][] array)
   {
      // Determine if the array is a Lo Shu Magic Square.
      if (isMagicSquare(array))
      {
         System.out.println("This is a Lo Shu magic square.");
      }
      else
      {
         System.out.println("This is not a Lo Shu magic square.");
      }
   }

   /**
      The showArray method accepts a two-dimensional
      int array and displays its contents.
      @param array The two-dimensional array reference.
    */

   private static void showArray(int[][] array)
   {
      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
         {
            System.out.print(array[row][col] + " ");
         }

         System.out.println();
      }
   }

   /**
      The isMagicSquare method accepts a two-dimensional
      int array as an argument, and returns true if the
      array meets all the requirements of a magic square.
      Otherwise it returns false.
      @param array The two-dimensional array reference.
      @return True if the array meets the requirements.
    */

   private static boolean isMagicSquare(int[][] array)
   {
      // Initialize the status to false.
      boolean status = false;

      // Call the methods to check the array and
      // store their return values.
      boolean isInRange = checkRange(array);
      boolean isUnique = checkUnique(array);
      boolean isEqualRows = checkRowSum(array);
      boolean isEqualCols = checkColSum(array);
      boolean isEqualDiag = checkDiagSum(array);

      // Determine if the array meets all the requirments.
      if (isInRange && isUnique && isEqualRows &&
          isEqualCols && isEqualDiag)
      {
         // If so, set the status to true.
         status = true;
      }

      // Return the status.
      return status;
   }

   /**
      The checkRange method accepts a two-dimensional int
      array as an argument, and returns true if the values
      in the list are within the specified range. Otherwise,
      it returns false.
      @param array The two-dimensional array reference.
      @return True if values are within range.
    */

   private static boolean checkRange(int[][] array)
   {
      final int MIN = 1;   // The value of the smallest number
      final int MAX = 9;   // The value of the largest number

      // Initialize status to true.
      boolean status = true;

      // Step through all the values in the array.
      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
         {
            // Determine if the current value is out of range.
            if (array[row][col] < MIN || array[row][col] > MAX)
            {
               // If so, set status to false.
               status = false;
            }
         }
      }

      // Return the status.
      return status;
   }

   /**
      The checkUnique method accepts a two-dimensional int
      array as an argument, and returns true if the values
      in the array are unique. Otherwise, it returns false.
      @param array The two-dimensional array reference.
      @return True if values are unique.
    */

   private static boolean checkUnique(int[][] array)
   {
      final int MIN = 1;   // The value of the smallest number
      final int MAX = 9;   // The value of the largest number

      boolean status = true;  // Initialize status to true.
      int searchValue = MIN;  // Initialize the search value.
      int count = 0;          // Initialize the counter to zero.

      // Perform the search while the maximum value has not been
      // reached, and the values are unique.
      while (searchValue <= MAX && status == true)
      {
         // Step through all the values in the array.
         for (int row = 0; row < array.length; row++)
         {
            for (int col = 0; col < array[row].length; col++)
            {
               // Determine if the current value equals
               // the search value.
               if (array[row][col] == searchValue)
               {
                  // If so, increment the counter.
                  count++;
               }

               // Determine if the counter is greater than one.
               if (count > 1)
               {
                  // If so, the values are not unique.
                  // Set the status to false.
                  status = false;
               }
            }
         }

         // Increment the search value.
         searchValue++;

         // Reset the counter variable.
         count = 0;
      }

      // Return the status.
      return status;
   }

   /**
      The checkRowSum method accepts a two-dimensional int
      array as an argument, and returns true if the sum
      of the values in each of the array's rows are equal.
      Otherwise, it returns false.
      @param array The two-dimensional array reference.
      @return True if the sum of values in each row are equal.
    */

   private static boolean checkRowSum(int[][] array)
   {
      // Initialize status to true.
      boolean status = true;

      // Calculate the sum of the values in the first row.
      int sumRowA = array[0][0] + array[0][1] + array[0][2];

      // Calculate the sum of the values in the second row.
      int sumRowB = array[1][0] + array[1][1] + array[1][2];

      // Calculate the sum of the values in the third row.
      int sumRowC = array[2][0] + array[2][1] + array[2][2];

      // Determine if the sum of any of the rows is not equal.
      if ((sumRowA != sumRowB) || (sumRowA != sumRowC) ||
          (sumRowB != sumRowC))
      {
         // If so, set the status to false.
         status = false;
      }

      // Return the status.
      return status;
   }

   /**
      The checkColSum method accepts a two-dimensional int
      array as an argument, and returns true if the sum of
      the values in each of the array's columns are equal.
      Otherwise, it returns false.
      @param array The two-dimensional array reference.
      @return True if the sum of values in each column are equal.
    */

   private static boolean checkColSum(int[][] array)
   {
      // Initialize status to true.
      boolean status = true;

      // Calculate the sum of the values in the first column.
      int sumColA = array[0][0] + array[1][0] + array[2][0];

      // Calculate the sum of the values in the second column.
      int sumColB = array[0][1] + array[1][1] + array[2][1];

      // Calculate the sum of the values in the third column.
      int sumColC = array[0][2] + array[1][2] + array[2][2];

      // Determine if the sum of any of the columns is not equal.
      if ((sumColA != sumColB) || (sumColA != sumColC) ||
          (sumColB != sumColC))
      {
         // If so, set the status to false.
         status = false;
      }

      // Return the status.
      return status;
   }

   /**
      The checkDiagSum method accepts a two-dimensional int
      array as an argument, and returns true if the sum of
      the values in each of the array's diagonals are equal.
      Otherwise, it returns false.
      @param array The two-dimensional array reference.
      @return True if the sum of values in each diagonal are equal.
    */

   private static boolean checkDiagSum(int[][] array)
   {
      // Initialize status to true.
      boolean status = true;

      // Calculate the sum of the values in the first diagonal.
      int sumDiagA = array[0][0] + array[1][1] + array[2][2];

      // Calculate the sum of the values in the second diagonal.
      int sumDiagB = array[2][0] + array[1][1] + array[0][2];

      // Determine if the sum of any of the columns is not equal.
      if (sumDiagA != sumDiagB)
      {
         status = false;
      }

      // Return the status.
      return status;
   }
}