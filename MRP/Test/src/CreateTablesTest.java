import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

public class CreateTablesTest {

	@Test
	public void test() {
		
		 Connection con = null;
	      Statement stmt = null;
	      int result = 0;
	      try {
	          Class.forName("org.hsqldb.jdbcDriver");
	          con = DriverManager.getConnection("jdbc:hsqldb:mem:.", "SA", "");
	          stmt = con.createStatement();
	          
	          result = stmt.executeUpdate("CREATE TABLE User (id INT NOT NULL, username VARCHAR(50) NOT NULL, password VARCHAR(20) NOT NULL, submission_date DATE, PRIMARY KEY (id)); ");

	          con.commit(); 
	          
	       }  catch (Exception e) {
	          e.printStackTrace(System.out);
	       }
	      System.out.println("Table created successfully");
		     
	      
	    }
		
		
	}


