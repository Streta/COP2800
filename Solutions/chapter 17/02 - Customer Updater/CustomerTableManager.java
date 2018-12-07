import java.sql.*;

/**
   The CustomerTableManager class performs operations 
   on the Customer table of the CoffeeDB database
   for the Customer Updater programming challenge.
*/

public class CustomerTableManager
{
   // Create a named constant for the URL.
   // NOTE: This value is specific for Java DB
   public final String DB_URL = "jdbc:derby:CoffeeDB";
   
   // Field for the database connection
   private Connection conn;

   /**
      Constructor
    */
   
   public CustomerTableManager() throws SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
   }
   
   /**
      The getCustomerNumbers method returns an array
      of Strings containing all the customer numbers.
      @ return The array containing the customer numbers
    */
   
   public String[] getCustomerNumbers() throws SQLException
   { 
      // Build the query.
      String query = "SELECT CustomerNumber FROM Customer";
      
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
      The getName method returns the name of a customer
      with the specified customer number
      @param custNum The customer number
      @return The name of a customer
    */
    
   public String getName(String custNum) throws SQLException
   {
      String name = ""; // To hold the customer name.
      
      // Build the query.
      String query = "SELECT Name FROM Customer " + 
                     "WHERE CustomerNumber = '" + 
                     custNum + "'";
      
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
      The getAddress method returns the address of
      a customer with the specified customer number.
      @param custNum The customer number
      @return The customer address
    */
    
   public String getAddress(String custNum) throws SQLException
   {
      String address = ""; // To hold the address.
      
      // Build the query.
      String query = "SELECT Address FROM Customer " + 
                     "WHERE CustomerNumber = '" + 
                     custNum + "'";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // If the result set has a row, go to it
      // and retrieve the address.
      if (resultSet.next())
         address = resultSet.getString(1);
   
      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the address.
      return address;
   }     

   /**
      The getCity method returns the city of
      a customer with the specified customer number.
      @param custNum The customer number
      @return The city
   */
    
   public String getCity(String custNum) throws SQLException
   {
      String city = ""; // To hold the city.
      
      // Build the query.
      String query = "SELECT City FROM Customer " + 
                     "WHERE CustomerNumber = '" + 
                     custNum + "'";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // If the result set has a row, go to it
      // and retrieve the city.
      if (resultSet.next())
         city = resultSet.getString(1);
   
      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the city.
      return city;
   }  
   
   /**
      The getState method returns the state of
      a customer with the specified customer number.
      @param custNum The customer number
      @return The state
    */
    
   public String getState(String custNum) throws SQLException
   {
      String state = ""; // To hold the state.
      
      // Build the query.
      String query = "SELECT State FROM Customer " + 
                     "WHERE CustomerNumber = '" + 
                     custNum + "'";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // If the result set has a row, go to it
      // and retrieve the state.
      if (resultSet.next())
         state = resultSet.getString(1);
   
      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the state.
      return state;
   }     
   
   /**
      The getZip method returns the zip code of
      a customer with the specified customer number.
      @param custNum The customer number
      @return The zip code
    */
    
   public String getZip(String custNum) throws SQLException
   {
      String zip = ""; // To hold the zip code.
      
      // Build the query.
      String query = "SELECT Zip FROM Customer " + 
                     "WHERE CustomerNumber = '" + 
                     custNum + "'";
      
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
               
      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();
            
      // Execute the query, storing the result set.
      ResultSet resultSet = stmt.executeQuery(query);
               
      // If the result set has a row, go to it
      // and retrieve the zip code.
      if (resultSet.next())
         zip = resultSet.getString(1);
   
      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the zip code.
      return zip;
   }     

   /**
      The updateName method updates the name of the 
      selected customer in the Customer table of the 
      CoffeeDB database with the specified value.
      @param custNum The customer number
      @param name The customer name
    */
   
   public void updateName(String custNum, 
                          String name) 
                          throws SQLException
   {
      // Build the query.
      String query = "UPDATE Customer SET Name = '" + 
                     name + "' WHERE CustomerNumber = '" + 
                     custNum + "'";
                     
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
      The updateAddress method updates the address 
      of the selected customer in the Customer 
      table of the CoffeeDB database with the 
      specified value.
      @param custNum The customer number
      @param address The customer address
    */
   
   public void updateAddress(String custNum, 
                             String address) 
                             throws SQLException
   {
      // Build the query.
      String query = "UPDATE Customer SET Address = '" + 
                     address + "' WHERE CustomerNumber = '" + 
                     custNum + "'";
                     
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
      The updateCity method updates the city of the 
      selected customer in the Customer table of the 
      CoffeeDB database with the specified value.
      @param custNum The customer number
      @param city The customer city
    */
   
   public void updateCity(String custNum, 
                          String city) 
                          throws SQLException
   {
      // Build the query.
      String query = "UPDATE Customer SET City = '" + 
                     city + "' WHERE CustomerNumber = '" + 
                     custNum + "'";
                     
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
      The updateState method updates the state of the 
      selected customer in the Customer table of the 
      CoffeeDB database with the specified value.
      @param custNum The customer number
      @param state The customer state
    */
   
   public void updateState(String custNum, 
                           String state) 
                           throws SQLException
   {
      // Build the query.
      String query = "UPDATE Customer SET State = '" + 
                     state + "' WHERE CustomerNumber = '" + 
                     custNum + "'";
                     
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
      The updateZip method updates the zip code 
      of the selected customer in the Customer 
      table of the CoffeeDB database with the 
      specified value.
      @param custNum The customer number
      @param zip The customer zip code
    */
   
   public void updateZip(String custNum, 
                         String zip) 
                         throws SQLException
   {
      // Build the query.
      String query = "UPDATE Customer SET Zip = '" + 
                     zip + "' WHERE CustomerNumber = '" + 
                     custNum + "'";
                     
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
      The insert method inserts a new record 
      into the Customer table.
      @param custNum The customer number
      @param name The customer name
      @param address The customer address
      @param city The customer city
      @param state The customer state
      @param zip The customer zip code
    */   
   
   public void insert(String custNum, String name,
                      String address, String city,
                      String state, String zip) 
                      throws SQLException
   {
      // Build the insert query.
      String query = "INSERT INTO Customer VALUES" +
                     "(" + 
                     "'" + custNum + 
                     "', " +
                     "'" + name + 
                     "', " +
                     "'" + address + 
                     "', " +
                     "'" + city + 
                     "', " +
                     "'" + state + 
                     "', " +
                     "'" + zip + "'" +
                     ")";
                     
      // Create a Statement object.
      Statement stmt = conn.createStatement();
               
      // Send the statement to the DBMS.
      stmt.executeUpdate(query);
         
      // Close the statement.
      conn.close();
      stmt.close();
   }
}