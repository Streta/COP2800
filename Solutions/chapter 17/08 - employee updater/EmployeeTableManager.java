import java.sql.*;   // Needed for JDBC classes

/**
   The EmployeeTableManager class performs operations 
   on the Employee table of the Personnel database
   for the Employee Updater programming challenge.
*/

public class EmployeeTableManager
{
   // Create a named constant for the URL.
   // NOTE: This value is specific for Java DB
   public final String DB_URL = "jdbc:derby:Personnel";
   
   // Field for the database connection
   private Connection conn;

   /**
      Constructor
    */
   
   public EmployeeTableManager() throws SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
   }
   
   /**
      The getEmployeeIDs method returns an array
      of Strings containing all the employee IDs.
      @return An array of string containing employee
              IDs.
    */
   
   public String[] getEmployeeIDs() throws SQLException
   { 
      // Build the query.
      String query = "SELECT EmployeeID FROM Employee";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
      
      // Create a Statement object for the query.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // Get the number of rows
      resultSet.last();                 // Move to last row
      int numRows = resultSet.getRow(); // Get row number
      resultSet.first();                // Move to first row

      // Create an array for the employee IDs.
      String[] listData = new String[numRows];
      
      // Populate the array with employee IDs.
      for (int index = 0; index < numRows; index++)
      {
         // Store the employee ID in the array.
         listData[index] = resultSet.getString(1);

         // Go to the next row in the result set.
         resultSet.next();
      }
      
      // Close the connection and statement objects.
      conn.close();
      stmt.close();

      // Return the listData array.
      return listData;
   }  
   
   /**
      The getName method returns the name of the 
      employee with the specified employee ID.
      @param empID The employee ID
      @return The employee name
    */
    
   public String getName(String empID) throws SQLException
   {
      String name = ""; // To hold the employee name.
      
      // Build the query.
      String query = "SELECT Name FROM Employee " + 
                     "WHERE EmployeeID = " + 
                     "'" + empID + "'";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // If the result set has a row, go to it
      // and retrieve the name.
      if (resultSet.next())
         name = resultSet.getString(1);
   
      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the name.
      return name;
   }  
   
   /**
      The getPosition method returns the position of 
      the employee with the specified employee ID.
      @param empID The employee ID
      @return The employee position
    */
    
   public String getPosition(String empID) throws SQLException
   {
      String position = ""; // To hold the position.
      
      // Build the query.
      String query = "SELECT Position FROM Employee " + 
                     "WHERE EmployeeID = " +
                     "'" + empID + "'";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // If the result set has a row, go to it
      // and retrieve the position.
      if (resultSet.next())
         position = resultSet.getString(1);
   
      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the position.
      return position;
   }     

   /**
      The getPayRate method returns the hourly pay rate
      of the employee with the specified employee ID.
      @param empID The employee ID
      @return The employee pay rate
    */
    
   public double getPayRate(String empID) throws SQLException
   {
      double payRate = 0.0;   // To hold the hourly pay rate.
      
      // Build the query.
      String query = "SELECT PayRate FROM Employee " + 
                     "WHERE EmployeeID = " + 
                     "'" + empID + "'";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // If the result set has a row, go to it
      // and retrieve the payRate.
      if (resultSet.next())
         payRate = resultSet.getDouble(1);
   
      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the hourly pay rate.
      return payRate;
   }      

   /**
      The updateName method updates the name of the 
      selected employee in the Employee table of the 
      Personnel database with the specified value.
      @param empID The employee ID
      @param name The employee name
    */
   
   public void updateName(String empID, 
                          String name) 
                          throws SQLException
   {
      // Build the query.
      String query = "UPDATE Employee SET Name = '" + 
                     name + "' WHERE EmployeeID = '" + 
                     empID + "'";
                     
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();           

      // Execute the query.
      stmt.executeUpdate(query);
               
      // Close the connection and statement objects.
      conn.close();
      stmt.close();
   } 

   /**
      The updatePosition method updates the name of the 
      selected employee in the Employee table of the 
      Personnel database with the specified value.
      @param empID The employee ID
      @param position The employee position
    */
   
   public void updatePosition(String empID, 
                              String position) 
                              throws SQLException
   {
      // Build the query.
      String query = "UPDATE Employee SET Position = '" + 
                     position + "' WHERE EmployeeID = '" + 
                     empID + "'";
                     
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();           

      // Execute the query.
      stmt.executeUpdate(query);
               
      // Close the connection and statement objects.
      conn.close();
      stmt.close();
   } 

   /**
      The updatePayRate method updates the hourly
      pay rate of the selected employee in the 
      Employee table of the Personnel database 
      with the specified value.
      @param empID The employee ID
      @param payRate The employee pay rate
    */
   
   public void updatePayRate(String empID, 
                             double payRate) 
                             throws SQLException
   {
      // Build the query.
      String query = "UPDATE Employee SET PayRate = " + 
                     payRate + " WHERE EmployeeID = '" + 
                     empID + "'";
                     
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();           

      // Execute the query.
      stmt.executeUpdate(query);
               
      // Close the connection and statement objects.
      conn.close();
      stmt.close();
   } 
}