package Querypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
    public static void main(String[] args) throws SQLException {
		
    	Driver driverref=new Driver();
    	DriverManager.registerDriver(driverref);
    	
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
    	
    	Statement stat = con.createStatement();
    	
    	int result = stat.executeUpdate("insert into customer values('2','Beerendra','GK','Japan');");
    	if(result==1)
    	{
    		System.out.println("customer is successfully created");
    	}
    	else
    	{
    		System.out.println("query failed");
    	}
    	
    	con.close();
	}
}

