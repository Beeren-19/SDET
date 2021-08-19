package Querypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class finallyblock {
   public static void main(String[] args) throws SQLException {
	 Connection con = null;
	try{
		
	   Driver driverref=new Driver();
	   DriverManager.registerDriver(driverref);
	   
	   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
   	
   	Statement stat = con.createStatement();
   	
   	int result = stat.executeUpdate("insert into customer values('2','Beerendra','GK','Japan')");
   	if(result==1)
   	{
   		System.out.println("customer is successfully created");
   	}
   	else
   	{
   		System.out.println("query failed");
   	}
	}
	catch(Exception e)
	{
		
	}
	finally{
		con.close();
		System.out.println("connection closed");
	}
}
}
