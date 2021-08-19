package com.grooming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Futuredata_calender {

	
	public static void main(String[] args) throws InterruptedException {
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
		   int count=0;
		   
		  while(count<11)
		  {
		   try {
			   driver.findElement(By.xpath("//div[@aria-label='Thu Nov 11 2021']")).click();
		}
		   
		   catch (Exception e) {
			   driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			   count++;
		}
		  }
		   
//		   driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		   
//		   driver.findElement(By.xpath("//div[@aria-label='Thu Nov 11 2021']")).click();
	}
}
