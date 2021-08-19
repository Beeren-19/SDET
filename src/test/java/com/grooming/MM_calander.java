package com.grooming;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MM_calander {

	public static void main(String[] args) throws InterruptedException {
		
		
		   Date dateobj=new Date();
		   System.out.println(dateobj);
			 
			 //  Fri Aug 06 08:32:36 IST 2021 
			 //   0   1   2     3     4    5
			   
			//  Fri Aug 06 2021
			   
			   String currentdate = dateobj.toString();
			   
			   String[] arr = currentdate.split(" ");
			   
			   String day = arr[0];
			   String month = arr[1];
			   String todaysdate = arr[2];
			   String year = arr[5];
			   
			   String MMT_Date = day+" "+month+" "+todaysdate+" "+year;
			   
			   System.out.println(MMT_Date);
			
			   WebDriver driver=new FirefoxDriver();
			   driver.get("https://www.makemytrip.com/");
			   
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   
			   Actions act=new Actions(driver);
			   act.moveByOffset(10, 10).click().perform();
			   
			   driver.findElement(By.id("fromCity")).sendKeys("BOM");
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.id("toCity")).sendKeys("PNQ");
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//p[.='Pune, India']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//div[@aria-label="+MMT_Date+"]")).click();
			   
			   
	}
}
