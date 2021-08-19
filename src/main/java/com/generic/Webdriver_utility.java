package com.generic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Dell
 * This CLASS is going to define all the webdriver utilities
 * @param element
 * @param index
 */
public class Webdriver_utility implements AutoContstants{

	/**
	 * @author Dell
	 * this method is going to select the drop down by index
	 * @param element
	 * @param index
	 */
	public void select_DD(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * @author Dell
	 * this method is going to select the drop down by value
	 * @param element
	 * @param value
	 */
	
	public void select_DD(WebElement element, String value)
	{
		Select sel=new Select(element);
				sel.selectByValue(value);
	}
	
	/**
	 * @author Dell
	 * this method is going to select the drop down by visible text
	 * @param text
	 * @param element
	 */
	
	public void select_DD(String text,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * @author Dell
	 * this method is going to switch the frame by using name or ID
	 * @param driver
	 * @param nameorID
	 */
	
	public void switchframe(WebDriver driver,String nameorID)
	{
		driver.switchTo().frame(nameorID);
	}
	
	/**
	 * @author Dell
	 * this method is  going to switch the frame by using ID
	 * @param driver
	 * @param id
	 */
	
	public void switchframe(WebDriver driver,int id)
	{
		driver.switchTo().frame(id);
	}
	
	/**
	 * @author Dell
	 * this method is going to switch the frame by using element address
	 * @param driver
	 * @param element
	 */
	
	public void switchframe(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * @author Dell
	 * this method is going to wait by using implicitlywait
	 * @param driver
	 */
	
	public void impicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(timeforimplicitwait, TimeUnit.SECONDS);
	}
	
	/**
	 * @author Dell
	 * this method is going to wait by using explicitwait until click
	 * @param driver
	 * @param element
	 */
	
	public void explicitwait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, timeforexplicitwait);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	/**
	 * @author Dell
	 * this method is going to perform mouse hover actions
	 * @param driver
	 * @param element
	 */
	
	public void movetoelements(WebDriver driver,WebElement element)
	{
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * @author Dell
	 * this method is going to perform right click action
	 * @param driver
	 * @param element
	 */
	
	public void rightclick(WebDriver driver,WebElement element)
	{
		
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * @author Dell
	 * this method is going to perform double click action
	 * @param driver
	 * @param element
	 */
	
	public void doubleclick(WebDriver driver,WebElement element)
	{
		
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * @author Dell
	 * this method is going to perform drag and drop action
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void draganddrop(WebDriver driver,WebElement source,WebElement target)
	{
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	
	/**
	 * @author Dell
	 * this method is going to switch the windows
	 * @param driver
	 * @param title
	 */
	
	
	public void switchwindow(WebDriver driver, String title)
	{
		Set<String> windowsID = driver.getWindowHandles();
		Iterator<String> it = windowsID.iterator();
		while(it.hasNext())
		{
			String window = it.next();
			String currenttitle = driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title))
			{
				break;
			}
		}
	}
			
}

