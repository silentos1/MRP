import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
	      
	      Connection con = null;
	      Statement stmt = null;
	      int result = 0;
	      
	      try {
	         Class.forName("org.hsqldb.jdbcDriver");
	         con = DriverManager.getConnection("jdbc:hsqldb:mem:.", "SA", "");
	         stmt = con.createStatement();
	      
	         
	         CreateTables.tables(args);
	         InsertValues.insert(args);
	         System.out.println("id|  username | password | last login date"); 
	         Selectdata.select(args);
	         
	      }  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	    
	   }
}
