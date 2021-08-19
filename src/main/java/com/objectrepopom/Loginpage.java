package com.objectrepopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernametxtfield;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement pwdtxtfield;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginbtn;

	public WebElement getUsernametxtfield() {
		return usernametxtfield;
	}

	public WebElement getPwdtxtfield() {
		return pwdtxtfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void loginintoapp()
	{
		usernametxtfield.sendKeys("admin");
		pwdtxtfield.sendKeys("admin");
		loginbtn.click();
	}
	
	public void loginintoapp(String username,String password)
	{
		usernametxtfield.sendKeys(username);
		pwdtxtfield.sendKeys(password);
		loginbtn.click();
	}
	
}
