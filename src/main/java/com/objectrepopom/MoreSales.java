package com.objectrepopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoreSales {

	public MoreSales(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Sales Order']")
	private WebElement salesorder;

	public WebElement getSalesorder() {
		return salesorder;
	}
	
	public void clickonsalesorder()
	{
		salesorder.click();
	}
}
