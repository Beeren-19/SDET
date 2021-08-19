package com.generic;

import java.util.Date;
import java.util.Random;

public class Randomnumber {

	/**
	 * @author Dell
	 * this method is going to create random numbers
	 * @return
	 */
	public  int createrandomNum()
	{
		
		Random r=new Random();
		int num = r.nextInt(100);
		return num;
	}
	
	/**
	 * @author Dell
	 * this method is going to get date
	 * @return
	 */
	
	public Date getdate()
	{
		Date dateobj=new Date();
		return dateobj;
	}
	
	/**
	 * @author Dell
	 * this method is going to get day
	 * @return
	 */
	
	public String getday()
	{
		 Date dateobj=new Date();
		 String currentdate = dateobj.toString();
		   
		   String[] arr = currentdate.split(" ");
		   return arr[0];
	}
	
	/**
	 * @author Dell
	 * this method is going to get month
	 * @return
	 */
	
	public String getmonth()
	{
		 Date dateobj=new Date();
		 String currentdate = dateobj.toString();
		   
		   String[] arr = currentdate.split(" ");
		   return arr[1];
	}
	
	/**
	 * @author Dell
	 * This method is going to get the day,month,todaysdate,and year
	 * @param day
	 * @param month
	 * @param todaysdate
	 * @param year
	 * @return
	 */
	
	public String getmmtdate(String day,String month,String todaysdate,String year)
	{
		 Date dateobj=new Date();
		 String currentdate = dateobj.toString();
		   
		   String[] arr = currentdate.split(" ");
		   return  day+" "+month+" "+todaysdate+" "+year;
	}
	
	
//	 Date dateobj=new Date();
//	   System.out.println(dateobj);
//		 
//		  Fri Aug 06 08:32:36 IST 2021 
//		   0   1   2     3     4    5
//		   
//		  Fri Aug 06 2021
//		   
//		   String currentdate = dateobj.toString();
//		   
//		   String[] arr = currentdate.split(" ");
//		   
//		   String day = arr[0];
//		   String month = arr[1];
//		   String todaysdate = arr[2];
//		   String year = arr[5];
//		   
//		   String MMT_Date = day+" "+month+" "+todaysdate+" "+year;
//		   
}
