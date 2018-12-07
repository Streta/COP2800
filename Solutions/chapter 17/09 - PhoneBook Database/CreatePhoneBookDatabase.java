import java.sql.*;

/**
  This program creates the PhoneBook database for the
  PhoneBook Database programming challenge.
*/
 
public class CreatePhoneBookDatabase
{
   public static void main(String[] args) throws Exception
   {
      String sql;
      final String DB_URL =
            "jdbc:derby:PhoneBook;create=true";
            
      try
      {    
         // Create a connection to the database.
         Connection conn = 
                    DriverManager.getConnection(DB_URL);
            
         // Create a Statement object.
         Statement stmt = conn.createStatement();
            
         // Create the Entries table.
         System.out.println("Creating the Entries table...");
         
         stmt.execute("CREATE TABLE Entries" +
                      "(Name CHAR(25) NOT NULL PRIMARY KEY, " +
                      "PhoneNumber CHAR(15))");
                      
         // Add some rows to the new table.
         sql = "INSERT INTO Entries VALUES" +
               "('Jean', '555-2222')";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO Entries VALUES" +
               "('Tim', '555-1212')";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO Entries VALUES" +
               "('Matt', '555-9999')";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO Entries VALUES" +
               "('Rose', '555-4545')";
         stmt.executeUpdate(sql);   
         
         sql = "INSERT INTO Entries VALUES" +
               "('Geri', '555-5214')";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO Entries VALUES" +
               "('Shawn', '555-7821')";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO Entries VALUES" +
               "('Renee', '555-9640')";
         stmt.executeUpdate(sql);   
            
         sql = "INSERT INTO Entries VALUES" +
               "('Joe', '555-8657')";
         stmt.executeUpdate(sql);   

         // Close the resources.
         stmt.close();     
         conn.close();
         System.out.println("Done");
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   } 
}
