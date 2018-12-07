/**
   This program demonstrates a solution to the
   Exception Project programming challenge.
*/

public class WorkerDemo
{
   public static void main(String[] args)
   {
      // Create a ProductionWorker object with valid data.
      createWorker("John Smith", "123", "11-15-2009",
                   ProductionWorker.DAY_SHIFT, 16.50);
      
      // Try to use an invalid employee number.
      System.out.println("Attempting an invalid employee number...");
      createWorker("John Smith", "10001", "11-15-2009",
                   ProductionWorker.DAY_SHIFT, 16.50);

      // Try to use an invalid shift number.
      System.out.println("Attempting an invalid shift number...");
      createWorker("John Smith", "123", "11-15-2009",
                   66, 16.50);

      // Try to use a negative pay rate.
      System.out.println("Attempting a negative pay rate...");
      createWorker("John Smith", "123", "11-15-2009",
                   ProductionWorker.DAY_SHIFT, -99.00);
   }
   
   /**
      createWorker method
      @param n The employee's name.
      @param num The employee number.
      @param date The employee's hire date.
      @param sh The employee's shift number.
      @param rate The employee's pay rate.
   */
   public static void createWorker(String n, String num, String date,
                                   int sh, double rate)
   {
      ProductionWorker pw;
      
      // Attempt to create an instance of the ProductionWorker
      // class, and catch any resulting exceptions.
      try
      {
         pw = new ProductionWorker(n, num, date, sh, rate);
         
         // If we make it to this point, the object was
         // successfully created.
         System.out.println("Object created.");
         System.out.println(pw);
      }
      catch (InvalidEmployeeNumber e)
      {
         System.out.println(e.getMessage());
      }
      catch (InvalidShift e)
      {
         System.out.println(e.getMessage());
      }
      catch (InvalidPayRate e)
      {
         System.out.println(e.getMessage());
      }
   }
}