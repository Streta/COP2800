import java.sql.*;   // Needed for JDBC classes

/**
   This program demonstrates a solution to the
   Personnel Database Creator programming challenge.
*/
 
public class CreatePersonnel
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      final String DB_URL = "jdbc:derby:Personnel;create=true";
      
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);
                
         // If the DB already exists, drop the tables.
         dropTables(conn);
         
         // Build the Employee table.
         buildEmployeeTable(conn);

         // Close the connection.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
   
   /**
      The dropTables method drops any existing
      in case the database already exists.
      @param conn A connection to the database.
    */
   
   public static void dropTables(Connection conn)
   {
      System.out.println("Checking for existing tables.");
      
      try
      {
         // Get a Statement object.
         Statement stmt  = conn.createStatement();;

         try
         {
            // Drop the Employee table.
            stmt.execute("DROP TABLE Employee");
            System.out.println("Employee table dropped.");
         }
         catch(SQLException ex)
         {
            // No need to report an error.
            // The table simply did not exist.
         }
      }
      catch(SQLException ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
         ex.printStackTrace();
      }
   }
   
   /**
      The buildEmployeeTable method creates the
      Employee table and adds some rows to it.
      @param conn A connection to the database.
    */
   
   public static void buildEmployeeTable(Connection conn)
   {
      try
      {
         // Get a Statement object.
         Statement stmt = conn.createStatement();
         
         // Create the table.
         stmt.execute("CREATE TABLE Employee (" +
                      "EmployeeID CHAR(10) NOT NULL PRIMARY KEY, " +
                      "Name CHAR(25), " +
                      "Position CHAR(30), " +
                      "PayRate DOUBLE " +
                      ")");
                      
         // Insert row #1.
         stmt.execute("INSERT INTO Employee VALUES ( " +
                      "'13579', " +
                      "'Bill Jones', " +
                      "'Director', " +
                      "32.75 )" );

         // Insert row #2.
         stmt.execute("INSERT INTO Employee VALUES ( " +
                      "'02468', " +
                      "'Susan Peterson', " +
                      "'President', " +
                      "50.95 )" );

         // Insert row #3.
         stmt.execute("INSERT INTO Employee VALUES ( " +
                      "'00385', " +
                      "'Jean Jackson', " +
                      "'Chairman', " +
                      "35.65 )" );

         // Insert row #4.
         stmt.execute("INSERT INTO Employee VALUES ( " +
                      "'98680', " +
                      "'Geri Smith', " +
                      "'General Manager', " +
                      "30.60 )" );

         // Insert row #5.
         stmt.execute("INSERT INTO Employee VALUES ( " +
                      "'24759', " +
                      "'Greg Gomez', " +
                      "'Vice President', " +
                      "42.25 )" );
                      
         System.out.println("Employee table created.");
      }
      catch (SQLException ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}