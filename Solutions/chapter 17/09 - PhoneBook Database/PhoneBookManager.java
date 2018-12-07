import java.sql.*;

/**
   The PhoneBookManager class performs operations on
   the PhoneBook database for the PhoneBook Database 
   programming challenge.
*/

public class PhoneBookManager
{
   // Constant for database URL.
   public final String DB_URL =
               "jdbc:derby:PhoneBook";

   // Field for the database connection
   private Connection conn;

   /**
      Constructor
   */

   public PhoneBookManager() throws SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
   }

   /**
       The getNames method returns an array
       of Strings containing all the names.
   */

   public String[] getNames()
                   throws SQLException
   {
      // Create a Statement object for the query.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);

      // Execute the query.
      ResultSet resultSet = stmt.executeQuery(
                       "SELECT Name FROM Entries");

      // Get the number of rows
      resultSet.last();                 // Move to last row
      int numRows = resultSet.getRow(); // Get row number
      resultSet.first();                // Move to first row

      // Create an array for the names.
      String[] listData = new String[numRows];

      // Populate the array with names.
      for (int index = 0; index < numRows; index++)
      {
         // Store the name in the array.
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
       The getPhoneNumber method returns a specific
       person's phone number.
       @param name The specified name.
   */

   public String getPhoneNumber(String name)
                            throws SQLException
   {
      String phoneNumber = ""; // Phone number

      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);

      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();

      // Execute the query.
      ResultSet resultSet = stmt.executeQuery(
                          "SELECT PhoneNumber " +
                          "FROM Entries " +
                          "WHERE Name = '" +
                          name + "'");

      // If the result set has a row, go to it
      // and retrieve the phone number.
      if (resultSet.next())
         phoneNumber = resultSet.getString(1);

      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();

      // Return the phone number.
      return phoneNumber;
   }

   /**
       The setPhoneNumber method sets a specific
       person's phone number.
       @param name The specified person's name.
       @param number The new value for the phone number.
   */

   public void setPhoneNumber(String name, String newNumber)
                            throws SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);

      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();

      // Execute the update.
      stmt.executeUpdate("UPDATE Entries " +
                         "SET PhoneNumber = '" +
                          newNumber +
                          "' WHERE Name = '" +
                          name + "'");

      // Close the Connection and Statement objects.
      conn.close();
      stmt.close();
   }
   
   /**
       The addEntry method adds a new entry to
       the Entries table in the PhoneBook database.
       @param name The person's name.
       @param phoneNumber The person's phone number.
   */

   public void addEntry(String name, String phoneNumber) 
                                          throws SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);

      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();

      // Execute the query.
      stmt.executeUpdate("INSERT INTO Entries VALUES ('" +
                         name + "', '" +
                         phoneNumber + "')");

      // Close the connection and statement objects.
      conn.close();
      stmt.close();
   }
   
   /**
       The deleteEntry method removes an existing entry
       from the Entries table in the PhoneBook database.
       @param name The person's name.
   */

   public void deleteEntry(String name)throws SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);

      // Create a Statement object for the query.
      Statement stmt = conn.createStatement();

      // Execute the query.
      stmt.executeUpdate("DELETE FROM Entries WHERE Name = '" +
                         name + "'");

      // Close the connection and statement objects.
      conn.close();
      stmt.close();
   }  
}