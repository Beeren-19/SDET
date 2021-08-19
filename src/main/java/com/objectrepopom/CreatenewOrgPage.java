package com.objectrepopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Randomnumber;
import com.generic.Webdriver_utility;

public class CreatenewOrgPage {

	public CreatenewOrgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement Orgname;

	public WebElement getOrgname() {
		return Orgname;
	}
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industrydd;

	public WebElement getIndustrydd() {
		return industrydd;
	}
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement accounttypedd;

	public WebElement getAccounttypedd() {
		return accounttypedd;
	}
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement ratingdd;

	public WebElement getRatingdd() {
		return ratingdd;
	}
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement memberofimg;

	public WebElement getMemberofimg() {
		return memberofimg;
	}



	public void createOrg()
	{
		 Randomnumber r=new Randomnumber();
		  Object randomnum = r.createrandomNum();
		  System.out.println(randomnum);
		  String orgname = "TYSS"+randomnum;
		Orgname.sendKeys(orgname);
		
		Webdriver_utility wdu=new Webdriver_utility();
		wdu.select_DD(industrydd, 1);
		wdu.select_DD("Customer", accounttypedd);
		wdu.select_DD(ratingdd, "Active");
		savebtn.click();
	}
	
	
	
}
