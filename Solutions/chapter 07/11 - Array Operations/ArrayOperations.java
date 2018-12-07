/**
   The ArrayOperations class performs operations on an array
   for the Array Operations programming challenge.
*/

public class ArrayOperations
{
   /**
      getTotal method.
      @param array An array of integers.
      @return The total of the values stored in the
              argument array.
   */
   
   public static int getTotal(int[] array)
   {
      int total = 0;
      
      for (int i = 0; i < array.length; i++)
         total += array[i];
      
      return total;
   }

   /**
      getTotal method.
      @param array An array of floats.
      @return The total of the values stored in the
              argument array.
   */
   
   public static float getTotal(float[] array)
   {
      float total = 0.0F;
      
      for (int i = 0; i < array.length; i++)
         total += array[i];
      
      return total;
   }

   /**
      getTotal method.
      @param array An array of doubles.
      @return The total of the values stored in the
              argument array.
   */
   
   public static double getTotal(double[] array)
   {
      double total = 0.0;
      
      for (int i = 0; i < array.length; i++)
         total += array[i];
      
      return total;
   }
   
   /**
      getTotal method.
      @param array An array of longs.
      @return The total of the values stored in the
              argument array.
   */
   
   public static long getTotal(long[] array)
   {
      long total = 0;
      
      for (int i = 0; i < array.length; i++)
         total += array[i];
      
      return total;
   }

   /**
      getAverage method
      @param array An array of integers.
      @return The average of the values stored in the
              argument array.
   */
   
   public static int getAverage(int[] array)
   {
      return getTotal(array) / array.length;
   }
   
   /**
      getAverage method
      @param array An array of floats.
      @return The average of the values stored in the
              argument array.
   */
   
   public static float getAverage(float[] array)
   {
      return getTotal(array) / array.length;
   }
   
   /**
      getAverage method
      @param array An array of doubles.
      @return The average of the values stored in the
              argument array.
   */
   
   public static double getAverage(double[] array)
   {
      return getTotal(array) / array.length;
   }

   /**
      getAverage method
      @param array An array of longs.
      @return The average of the values stored in the
              argument array.
   */
   
   public static long getAverage(long[] array)
   {
      return getTotal(array) / array.length;
   }

   /**
      getHighest method
      @param array An array of integers.
      @return The highest value in the argument array.
   */
   
   public static int getHighest(int[] array)
   {
      int highest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] > highest)
            highest = array[i];
      }
      
      return highest;
   }

   /**
      getHighest method
      @param array An array of floats.
      @return The highest value in the argument array.
   */
   
   public static float getHighest(float[] array)
   {
      float highest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] > highest)
            highest = array[i];
      }
      
      return highest;
   }

   /**
      getHighest method
      @param array An array of doubles.
      @return The highest value in the argument array.
   */
   
   public static double getHighest(double[] array)
   {
      double highest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] > highest)
            highest = array[i];
      }
      
      return highest;
   }

   /**
      getHighest method
      @param array An array of longs.
      @return The highest value in the argument array.
   */
   
   public static long getHighest(long[] array)
   {
      long highest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] > highest)
            highest = array[i];
      }
      
      return highest;
   }

   /**
      getLowest method
      @param array An array of integers.
      @return The lowest value in the argument array.
   */
   
   public static int getLowest(int[] array)
   {
      int lowest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] < lowest)
            lowest = array[i];
      }
      
      return lowest;
   }

   /**
      getLowest method
      @param array An array of floats.
      @return The lowest value in the argument array.
   */
   
   public static float getLowest(float[] array)
   {
      float lowest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] < lowest)
            lowest = array[i];
      }
      
      return lowest;
   }

   /**
      getLowest method
      @param array An array of doubles.
      @return The lowest value in the argument array.
   */
   
   public static double getLowest(double[] array)
   {
      double lowest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] < lowest)
            lowest = array[i];
      }
      
      return lowest;
   }

   /**
      getLowest method
      @param array An array of longs.
      @return The lowest value in the argument array.
   */
   
   public static long getLowest(long[] array)
   {
      long lowest = array[0];
      
      for (int i = 1; i < array.length; i++)
      {
         if (array[i] < lowest)
            lowest = array[i];
      }
      
      return lowest;
   }
}