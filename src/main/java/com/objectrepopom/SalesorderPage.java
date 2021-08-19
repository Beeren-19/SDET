package com.objectrepopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesorderPage {

	public SalesorderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Sales Order...']")
	private WebElement salesorderimg;

	public WebElement getSalesorderimg() {
		return salesorderimg;
	}
	
	public void clickonsalesorderimg()
	{
		salesorderimg.click();
	}
	
	@FindBy(xpath="//img[@title='Search in Sales Order...']")
	private WebElement searchimg;

	public WebElement getSearchimg() {
		return searchimg;
	}
	
	public void clickonsearchimg()
	{
		searchimg.click();
	}
}
