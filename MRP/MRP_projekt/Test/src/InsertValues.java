
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.Statement;  

public class InsertValues {
   public static void insert(String[] args) { 
      Connection con = null; 
      Statement stmt = null; 
      int result = 0; 
      try { 
         Class.forName("org.hsqldb.jdbcDriver"); 
         con = DriverManager.getConnection( "jdbc:hsqldb:mem:.", "SA", ""); 
         stmt = con.createStatement(); 
         
         
         result = stmt.executeUpdate("INSERT INTO User VALUES (1,'Smieszek99', 'Jamlasica14', NOW())"); 
         result = stmt.executeUpdate("INSERT INTO User VALUES (2,'Psingwin', 'Jamnik11', NOW())"); 
         result = stmt.executeUpdate("INSERT INTO User VALUES (3,'Lord_Vader', 'iamyourfather49', NOW())"); 
         result = stmt.executeUpdate("INSERT INTO User VALUES (4,'GraczpRoPC', 'Uberpcracer43', NOW())"); 
         result = stmt.executeUpdate("INSERT INTO User VALUES (5,'Kebab70', 'mniammniam22', NOW())"); 
         con.commit(); 
      }catch (Exception e) { 
         e.printStackTrace(System.out); 
      } 
     
      
   } 
} 