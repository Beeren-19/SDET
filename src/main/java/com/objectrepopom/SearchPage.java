package com.objectrepopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Webdriver_utility;

public class SearchPage {

	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='viewname']")
	private WebElement filter;

	public WebElement getFilter() {
		return filter;
	}
	
	public void selectfilter()
	{
		Webdriver_utility wdu=new Webdriver_utility();
		wdu.select_DD("All", filter);
	}
}
