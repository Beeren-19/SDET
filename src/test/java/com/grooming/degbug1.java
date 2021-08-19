package com.grooming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class degbug1 {
    public static void main(String[] args) throws InterruptedException 
    {
    	WebDriver driver=new ChromeDriver();
		driver.get("https://www.filpkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("bags");
        Thread.sleep(2000);
        List<WebElement> sugg = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
      
        for(int i=0;i<sugg.size();i++)
        {
        	String option = sugg.get(i).getText();
        	System.out.println(option);
        	if(option.contains("bags men sky bag traveling"))
        	{
        		System.out.println("present");
        		break;
        	}
        	else
        	{
        		System.out.println("not present");
        	}
        	
        }
	}
}
