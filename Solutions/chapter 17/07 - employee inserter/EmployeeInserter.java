import java.sql.*;              // Needed for JDBC classes
import javax.swing.JOptionPane; // Needed for JOptionPane

/**
   The EmployeeInserter class provides methods for
   inserting a row into the Employee table of the
   Personnel database for the Employee Inserter 
   programming challenge.
*/

public class EmployeeInserter
{
   // Create a named constant for the URL.
   // NOTE: This value is specific for Java DB
   public final String DB_URL = "jdbc:derby:Personnel";
   
   // Field for the database connection
   private Connection conn;

   /**
      Constructor
    */
   
   public EmployeeInserter() throws ClassNotFoundException,
                                  SQLException
   {
      // Create a connection to the database.
      conn = DriverManager.getConnection(DB_URL);
   }
   
   public void insert(String empId, String name,
                      String position, double payRate) throws SQLException
   {
      String query = "INSERT INTO Employee " +
                     "(EmployeeID, Name, Position, PayRate)" +
                     "VALUES ('" + empId + "', '" + name + 
                     "', '" + position + "', " + payRate + ")";
                     
      // Create a Statement object.
      Statement stmt = conn.createStatement();
               
      // Send the statement to the DBMS.
      stmt.executeUpdate(query);
         
      // Close the statement.
      stmt.close();
   }
   
   public void close() throws SQLException
   {
      // Close the database connection.
      conn.close();
   }
}