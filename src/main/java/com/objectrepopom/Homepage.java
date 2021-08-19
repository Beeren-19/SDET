package com.objectrepopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Webdriver_utility;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// For Organization

	@FindBy(xpath="(//a[.='Organizations'])[1]")
	private WebElement orglink;

	public WebElement getOrglink() {
		return orglink;
	}

	//	@FindBy(xpath="//img[@title='Create Organization...']")
	//	private WebElement createimg;
	//
	//	public WebElement getCreateimg() {
	//		return createimg;
	//	}

	/**
	 * @author Dell
	 * this method is going to click on organization
	 */
	public void clickonOrg()
	{
		orglink.click();

	}

	// For Signout

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutlogo;

	public WebElement getSignoutlogo() {
		return signoutlogo;
	}



	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	public WebElement getSignout() {
		return signout;
	}

	/**
	 * @author Dell
	 * This method is going to signout from the application
	 * @param driver
	 */
	public void logoutapp(WebDriver driver)
	{
		Webdriver_utility wdu=new Webdriver_utility();

		signoutlogo.click();
		wdu.movetoelements(driver, signout);

		signout.click();
	}



	// For contacts 

	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactlink;

	public WebElement getContactlink() {
		return contactlink;
	}

	//	@FindBy(xpath="//img[@title='Create Contact...']")
	//	private WebElement contactimg;
	//
	//	public WebElement getContactimg() {
	//		return contactimg;
	//	}

	/**
	 * @author Dell
	 * this method is going to click on contacts
	 */
	public void clickcontact()
	{
		contactlink.click();

	}

	@FindBy(xpath="//a[text()='More']")
	private WebElement clickmore;

	public WebElement getClickmore() {
		return clickmore;
	}

	public void clickonmore()
	{
		clickmore.click();
	}


}
