import java.sql.*;   // Needed for JDBC classes

/**
   This program demonstrates a solution to the
   Unpaid Order Sum programming challenge.
*/

 public class UnpaidOrderSum
 {
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      final String DB_URL = "jdbc:derby:CoffeeDB";

      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);

         // Create a Statement object.
         Statement stmt = conn.createStatement();

         // Create the query.
         String query = "SELECT SUM(Cost) FROM UnpaidOrder";

         // Send the query to the DBMS and store the result.
         ResultSet result = stmt.executeQuery(query);

         // Move to the first row.
         result.next();

         // Get the sum of unpaid orders.
         double unpaid = result.getDouble(1);

         // Close the statement and the connection.
         stmt.close();
         conn.close();

         // Display the sum of unpaid orders.
         System.out.printf("Total amount owed in unpaid orders: $%,.2f\n",
                           unpaid);
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
 }