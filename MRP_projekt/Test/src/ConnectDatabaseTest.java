import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ConnectDatabaseTest {
	
	
	 Connection con = null;

	@Test
	public void testConnection() {
	
		 try {
	         
	         Class.forName("org.hsqldb.jdbcDriver");

	         con = DriverManager.getConnection("jdbc:hsqldb:mem:.", "SA", "");
	         if (con!= null){
	            System.out.println("Connection created successfully");
	            
	         }else{
	            System.out.println("Problem with creating connection");
	         }
	      
	      }  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	   }
		
		
		
		
		
	}


