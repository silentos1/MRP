import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectdata {
   
   public static void select(String[] args) {
      Connection con = null;
      Statement stmt = null;
      ResultSet result = null;
      int result1 = 0;
      
      try {
         Class.forName("org.hsqldb.jdbcDriver");
         con = DriverManager.getConnection("jdbc:hsqldb:mem:.", "SA", "");
         stmt = con.createStatement();
        
         result = stmt.executeQuery("SELECT id, username, password, submission_date FROM User");
         
         while(result.next()){
            System.out.println(result.getInt("id")+" | "+
               result.getString("username")+" | "+
               result.getString("password")+" | "+
               result.getString("submission_date") );
         }
      } catch (Exception e) {
         e.printStackTrace(System.out);
      }
   }
}