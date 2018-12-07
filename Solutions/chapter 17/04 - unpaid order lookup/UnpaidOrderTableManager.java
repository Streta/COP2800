import java.sql.*;

/**
   The UnpaidOrderTableManager class class performs 
   operations on the UnpaidOrder table of the CoffeeDB 
   database for the Unpaid Order Lookup programming 
   challenge.
*/

public class UnpaidOrderTableManager
{
   // Create a named constant for the URL.
   // NOTE: This value is specific for Java DB
   public final String DB_URL = "jdbc:derby:CoffeeDB";
   
   private Connection conn;      // Database connection

   /**
      Constructor
    */
   
   public UnpaidOrderTableManager() throws SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
   }
   
   /**
      The getCustomerNumbers method returns an array
      of Strings containing all the customer numbers.
      @return An array of strings containing the 
              customer numbers.
    */
   
   public String[] getCustomerNumbers() throws SQLException
   { 
      // Build the query.
      String query = "SELECT DISTINCT CustomerNumber " +
                     "FROM UnpaidOrder " +
                     "ORDER BY CustomerNumber ASC";
      
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

      // Create an array for the customer numbers.
      String[] listData = new String[numRows];
      
      // Populate the array with customer numbers.
      for (int index = 0; index < numRows; index++)
      {
         // Store the customer number in the array.
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
      The getCustomerNames method returns an array
      of Strings containing all the customer names.
      @return An array of strings containing the 
              customer names.    
    */
   
   public String[] getCustomerNames() throws SQLException
   { 
      // Build the query.
      String query = "SELECT DISTINCT Customer.Name " +
                     "FROM Customer, UnpaidOrder " +
                     "WHERE Customer.CustomerNumber = " +
                     "UnpaidOrder.CustomerNumber";
      
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

      // Create an array for the customer numbers.
      String[] listData = new String[numRows];
      
      // Populate the array with customer numbers.
      for (int index = 0; index < numRows; index++)
      {
         // Store the customer number in the array.
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
      The getCustomerNumber method returns 
      a specific customer's number.
      @param name The name of a customer
      @return The customer number
    */
    
    public String getCustomerNumber(String name) 
                                    throws SQLException
    {
      String customerNumber = "";   // To hold the customer number
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
      
      // Create a statement object for the query.
      Statement stmt = conn.createStatement();
      
      // Build the query.
      String query = "SELECT CustomerNumber " +
                     "FROM Customer " +
                     "WHERE Name = '" + name + "'";
                     
      // Execute the query and store the result.
      ResultSet resultSet = stmt.executeQuery(query);
      
      if (resultSet.next())
         customerNumber = resultSet.getString(1);
         
      // Close the connection and statement objects.
      conn.close();
      stmt.close();
      
      return customerNumber;
    }
}