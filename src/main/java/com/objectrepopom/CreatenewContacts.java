package com.objectrepopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewContacts {

	public CreatenewContacts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnametxtfld;

	public WebElement getLastnametxtfld() {
		return lastnametxtfld;
	}
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebutton;

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void createcontact()
	{
		lastnametxtfld.sendKeys("zxcv");
		savebutton.click();
	}
	
	
}
