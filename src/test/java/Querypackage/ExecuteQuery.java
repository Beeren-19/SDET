package Querypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {

	public static void main(String[] args) throws SQLException {
		
		//step1: register the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		//step2: establish connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
		
		//step3:issue create statement
		Statement stat = con.createStatement();
		
		//step4: execute any query
		ResultSet result = stat.executeQuery("select * from customer;");
		
		while(result.next())
		{
			System.out.println(result.getString(1)+"\t"+result.getString(2));
		}
		
		//step5:close database connection
		con.close();
	}
}
